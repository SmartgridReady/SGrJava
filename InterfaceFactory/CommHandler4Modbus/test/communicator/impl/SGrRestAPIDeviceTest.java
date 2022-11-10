package communicator.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.client5.http.fluent.Response;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.smartgridready.ns.v0.HttpMethod;
import com.smartgridready.ns.v0.SGrRestAPIAuthenticationEnumMethodType;
import com.smartgridready.ns.v0.SGrRestAPIDeviceFrame;

import communicator.helper.DeviceDescriptionLoader;
import communicator.http.authentication.AuthenticatorFactory;
import communicator.http.authentication.BearerTokenAuthenticator;
import communicator.http.client.ApacheRestServiceClient;
import communicator.http.client.RestServiceClientFactory;
import io.vavr.control.Either;

@ExtendWith(value = MockitoExtension.class)
class SGrRestAPIDeviceTest {
		
	@Mock
	BearerTokenAuthenticator authenticator;
	
	@Mock
	RestServiceClientFactory restServiceClientFactory;
	
	@Mock
	ApacheRestServiceClient restServiceClient;	
		
	@Mock
	Request request;
	
	@Mock
	Response response;	
	
	private static final String XML_BASE_DIR="../../../SGrSpecifications/XMLInstances/ExtInterfaces/";
	
	private static final String CLEMAP_JSON_RESP = "[{\"sensor_id\":\"63343431ecf2cf013a1e5a9f\",\"opm\":{\"value\":1,\"last_updt\":\"2022-11-07T15:19:54.560Z\"},\"ten_sec\":{\"p_l1\":0.003,\"p_l2\":0,\"p_l3\":0,\"q_l1\":-0.002,\"q_l2\":0,\"q_l3\":0,\"last_upd\":\"2022-11-07T15:21:50.000Z\"},\"one_min\":{\"p_l1\":0.003,\"p_l2\":0,\"p_l3\":0,\"q_l1\":-0.002,\"q_l2\":0,\"q_l3\":0,\"avg_energy_l1\":0,\"avg_energy_l2\":0,\"avg_energy_l3\":0,\"v_l1\":227.869,\"v_l2\":0,\"v_l3\":0,\"i_l1\":0.001,\"i_l2\":0,\"i_l3\":0,\"s_l1\":0.173,\"s_l2\":0,\"s_l3\":0,\"pf_l1\":0.085,\"pf_l2\":1,\"pf_l3\":1,\"last_update\":\"2022-11-07T15:19:47.579Z\"}}]";
	
	@Test
	void testSuccessWithBearerAuthentication() throws Exception {
						
		SGrRestAPIDeviceFrame deviceFrame = new DeviceDescriptionLoader<SGrRestAPIDeviceFrame>()
				.load(XML_BASE_DIR, "SGr_04_0018_CLEMAP_EIcloudEnergyMonitorV0.2.1.xml");
		
		// given	
		try (MockedStatic<AuthenticatorFactory> authFactory = Mockito.mockStatic(AuthenticatorFactory.class)) {
	        authFactory.when( () -> AuthenticatorFactory
	        		.getAuthenticator(SGrRestAPIAuthenticationEnumMethodType.BEARER_SECURITY_SCHEME)).thenReturn(authenticator);
	    }
		
		// when(restServiceClientFactory.create(any(String.class), any(HttpMethod.class))).thenReturn(restServiceClient);		
		when(restServiceClient.callService()).thenReturn(Either.right(CLEMAP_JSON_RESP));		

		SGrRestApiDevice device = new SGrRestApiDevice(deviceFrame, restServiceClientFactory);
		String res = device.getVal("ActivePowerAC", "ActivePowerACtot");
		
		assertEquals("0.003", res);
	}

}
