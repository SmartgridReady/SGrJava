package communicator.restapi.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

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
import communicator.restapi.http.authentication.Authenticator;
import communicator.restapi.http.client.RestServiceClient;
import communicator.restapi.http.client.RestServiceClientFactory;
import io.vavr.control.Either;

@ExtendWith(value = MockitoExtension.class)
class SGrRestAPIDeviceTest {
		
	@Mock
	Authenticator authenticator;
	
	@Mock
	RestServiceClientFactory restServiceClientFactory;
	
	@Mock
	RestServiceClient restServiceClientAuth;
	
	@Mock
	RestServiceClient restServiceClientReq;
	
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
	
	
	private static final String METER_GROUP_CONFIG_JSON = "{\r\n"
			+ "    \"name\": \"ErgoMeters\",\r\n"
			+ "    \"description\": \"Meter group for tests\",\r\n"
			+ "    \"address\": {},\r\n"
			+ "    \"coordinates\": {},\r\n"
			+ "    \"group_measuring_point\": false,\r\n"
			+ "    \"sensor_ids\": [],\r\n"
			+ "    \"user_ids\": [\"hfurrer@ergonomics.ch\"],\r\n"
			+ "    \"organization_ids\": [],\r\n"
			+ "    \"virtual_meter_point\": false\r\n"
			+ "}";
	
	private static final String METER_GROUP_CONFIG_RESP = " {\"name\":\"ErgoMeters\",\"description\":\"Meter group for tests\",\"address\":{},\"coordinates\":{},\"group_measuring_point\":false,\"sensor_ids\":[],\"user_ids\":[\"636e081e4195a677ca6190be\"],\"organization_ids\":[],\"virtual_meter_point\":false,\"_id\":\"6380bbd5200d8506be9b7c10\"}";
	
	
	@BeforeAll
	static void initDeviceFrame() {
		deviceFrame = new DeviceDescriptionLoader<SGrRestAPIDeviceFrame>()
				.load(XML_BASE_DIR, "SGr_04_0018_CLEMAP_EIcloudEnergyMonitorV0.2.1.xml");		
	}
	
	
	@Test
	void testgetValSuccessWithBearerAuthentication() throws Exception {

		// given
		when(restServiceClientFactory.create( any(String.class), any(RestServiceCall.class))).thenReturn(restServiceClientAuth);
		when(restServiceClientFactory.create( any(String.class), any(RestServiceCall.class), any(Properties.class))).thenReturn(restServiceClientReq);

		when(restServiceClientAuth.getRestServiceCall()).thenReturn(deviceFrame.getRestAPIInterfaceDesc().getRestAPIBearer().getServiceCall());
		when(restServiceClientAuth.callService()).thenReturn(Either.right(CLEMAP_AUTH_RESP));		
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
		when(restServiceClientFactory.create( any(String.class), any(RestServiceCall.class))).thenReturn(restServiceClientAuth);
		when(restServiceClientFactory.create( any(String.class), any(RestServiceCall.class), any(Properties.class))).thenReturn(restServiceClientReq);

		when(restServiceClientAuth.getRestServiceCall()).thenReturn(deviceFrame.getRestAPIInterfaceDesc().getRestAPIBearer().getServiceCall());
		when(restServiceClientAuth.callService()).thenReturn(Either.right(CLEMAP_AUTH_RESP));
		
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
	
	
	@Test
	void testSetVal() throws Exception {
		
		// given					
		when(restServiceClientFactory.create( any(String.class), any(RestServiceCall.class))).thenReturn(restServiceClientAuth);
		when(restServiceClientFactory.create( any(String.class), any(RestServiceCall.class), any(Properties.class))).thenReturn(restServiceClientReq);

		when(restServiceClientAuth.getRestServiceCall()).thenReturn(deviceFrame.getRestAPIInterfaceDesc().getRestAPIBearer().getServiceCall());
		when(restServiceClientAuth.callService()).thenReturn(Either.right(CLEMAP_AUTH_RESP));		
		when(restServiceClientReq.callService()).thenReturn(Either.right(METER_GROUP_CONFIG_RESP));
		
		// when
		SGrRestApiDevice device = new SGrRestApiDevice(deviceFrame, restServiceClientFactory);
		device.authenticate();
		String res = device.setVal("Configuration", "CreateMeterGroup", METER_GROUP_CONFIG_JSON);
		
		// then		
		assertEquals("6380bbd5200d8506be9b7c10", res);				
	}

}
