package communicator.restapi.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.LinkedList;
import java.util.List;

import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.message.BasicClassicHttpResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.smartgridready.ns.v0.RestServiceCall;
import com.smartgridready.ns.v0.SGrRestAPIDeviceFrame;

import communicator.helper.DeviceDescriptionLoader;
import communicator.restapi.http.authentication.BearerTokenAuthenticator;
import communicator.restapi.http.client.ApacheRestServiceClient;
import communicator.restapi.http.client.RestServiceClientFactory;
import io.vavr.control.Either;

@ExtendWith(value = MockitoExtension.class)
class SGrRestAPIDeviceTest {
		
	@Mock
	BearerTokenAuthenticator authenticator;
	
	@Mock
	RestServiceClientFactory restServiceClientFactory;
	
	@Mock
	ApacheRestServiceClient restServiceClientAuth;
	
	@Mock
	ApacheRestServiceClient restServiceClientReq;
	
	static SGrRestAPIDeviceFrame deviceFrame;
			
	private static final String XML_BASE_DIR="../../../SGrSpecifications/XMLInstances/ExtInterfaces/";
	
	private static final String CLEMAP_AUTH_RESP = "{\r\n"
			+ "    \"accessToken\": \"eyJhbGciOiJIUzI1NiIsInR5cCI6ImFjY2VzcyJ9.eyJ1c2VySWQiOiI2MzM0MzI5MWVjZjJjZjAxM2ExZTVhOWQiLCJpYXQiOjE2NjgwOTI1NzMsImV4cCI6MTY2ODE3ODk3MywiYXVkIjoiaHR0cHM6Ly95b3VyZG9tYWluLmNvbSIsImlzcyI6ImZlYXRoZXJzIiwic3ViIjoiNjMzNDMyOTFlY2YyY2YwMTNhMWU1YTlkIiwianRpIjoiNTU2NmU2M2QtNTVmOC00MDEyLWJlYTUtOTJjYWE0NDIwYzQ3In0.xVOrspfi1E61Jb0BXBt37wgqGcnkPueMcHh1_zI-xXM\",\r\n"
			+ "    \"user\": {\r\n"
			+ "        \"_id\": \"63343291ecf2cf013a1e5a9d\",\r\n"
			+ "        \"email\": \"hfurrer@ergonomics.ch\",\r\n"
			+ "        \"groups\": [\r\n"
			+ "            \"owner_smartgrid\",\r\n"
			+ "            \"owner_smartfactory\"\r\n"
			+ "        ],\r\n"
			+ "        \"roles\": [\r\n"
			+ "            \"default\"\r\n"
			+ "        ]\r\n"
			+ "    }\r\n"
			+ "}";
	
	private static final String CLEMAP_METER_RESP = "[{\"sensor_id\":\"63343431ecf2cf013a1e5a9f\",\"opm\":{\"value\":1,\"last_updt\":\"2022-11-07T15:19:54.560Z\"},\"ten_sec\":{\"p_l1\":1.5,\"p_l2\":2,\"p_l3\":4.0,\"q_l1\":2.3,\"q_l2\":0,\"q_l3\":4,\"last_upd\":\"2022-11-07T15:21:50.000Z\"},\"one_min\":{\"p_l1\":0.003,\"p_l2\":0,\"p_l3\":0,\"q_l1\":-0.002,\"q_l2\":0,\"q_l3\":0,\"avg_energy_l1\":0,\"avg_energy_l2\":0,\"avg_energy_l3\":0,\"v_l1\":227.869,\"v_l2\":0,\"v_l3\":0,\"i_l1\":0.001,\"i_l2\":0,\"i_l3\":0,\"s_l1\":0.173,\"s_l2\":0,\"s_l3\":0,\"pf_l1\":0.085,\"pf_l2\":1,\"pf_l3\":1,\"last_update\":\"2022-11-07T15:19:47.579Z\"}}]";
	
	@BeforeAll
	static void initDeviceFrame() {
		deviceFrame = new DeviceDescriptionLoader<SGrRestAPIDeviceFrame>()
				.load(XML_BASE_DIR, "SGr_04_0018_CLEMAP_EIcloudEnergyMonitorV0.2.1.xml");
	}
	
	
	@Test
	void testgetValSuccessWithBearerAuthentication() throws Exception {

		// given					
		when(restServiceClientFactory.create( any(String.class), any(RestServiceCall.class))).thenReturn(
				restServiceClientAuth, // fist call
				restServiceClientReq);  // second call

		when(restServiceClientAuth.getRestServiceCall()).thenReturn(deviceFrame.getRestAPIInterfaceDesc().getRestAPIBearer().getServiceCall());
		when(restServiceClientAuth.callService()).thenReturn(Either.right(CLEMAP_AUTH_RESP));
		
		when(restServiceClientReq.getRestServiceCall()).thenReturn(deviceFrame.getFpListElement().get(0).getDpListElement().get(0).getRestAPIDataPoint().get(0).getRestServiceCall());
		when(restServiceClientReq.callService()).thenReturn(Either.right(CLEMAP_METER_RESP));
		
		// when
		SGrRestApiDevice device = new SGrRestApiDevice(deviceFrame, restServiceClientFactory);
		device.authenticate();
		String res = device.getVal("ActivePowerAC", "ActivePowerACtot");
		
		// then		
		assertEquals("7.5", res);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	void testGetValSuccessWithTokenRenewal() throws Exception {
		
		// given					
		when(restServiceClientFactory.create( any(String.class), any(RestServiceCall.class))).thenReturn(
				restServiceClientAuth, // fist call
				restServiceClientReq,  // second call
				restServiceClientAuth, // third call 
				restServiceClientReq); // final call

		when(restServiceClientAuth.getRestServiceCall()).thenReturn(deviceFrame.getRestAPIInterfaceDesc().getRestAPIBearer().getServiceCall());
		when(restServiceClientAuth.callService()).thenReturn(Either.right(CLEMAP_AUTH_RESP));
		
		when(restServiceClientReq.getRestServiceCall()).thenReturn(deviceFrame.getFpListElement().get(0).getDpListElement().get(0).getRestAPIDataPoint().get(0).getRestServiceCall());	
		
		
		List<Either<HttpResponse, String>> responseSequence = new LinkedList<>();
		responseSequence.add(Either.left( new BasicClassicHttpResponse(401, "Needs token renewal.")));
		responseSequence.add(Either.right(CLEMAP_METER_RESP));					
		
		when(restServiceClientReq.callService()).thenReturn(Either.left( 
				new BasicClassicHttpResponse(401, "Needs token renewal.")),
				Either.right(CLEMAP_METER_RESP));
		
		// when
		SGrRestApiDevice device = new SGrRestApiDevice(deviceFrame, restServiceClientFactory);
		device.authenticate();
		String res = device.getVal("ActivePowerAC", "ActivePowerACtot");
		
		// then		
		assertEquals("7.5", res);
		
	}

}
