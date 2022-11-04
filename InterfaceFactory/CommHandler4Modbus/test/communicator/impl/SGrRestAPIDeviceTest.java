package communicator.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.net.URI;

import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.client5.http.fluent.Response;
import org.apache.hc.core5.http.HttpHeaders;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.smartgridready.ns.v0.SGrRestAPIAuthenticationEnumMethodType;
import com.smartgridready.ns.v0.SGrRestAPIDeviceFrame;

import communicator.helper.DeviceDescriptionLoader;
import communicator.http.authentication.Authenticator;
import communicator.http.authentication.AuthenticatorFactory;

@ExtendWith(value = MockitoExtension.class)
class SGrRestAPIDeviceTest {
		
	@Mock
	Authenticator authenticator;
	
	@Mock
	Request request;
	
	@Mock
	Response response;
	
	private static final String XML_BASE_DIR="../../../SGrSpecifications/XMLInstances/ExtInterfaces/";
	
	@Test
	void testSuccessWithBearerAuthentication() throws Exception {
						
		SGrRestAPIDeviceFrame deviceFrame = new DeviceDescriptionLoader<SGrRestAPIDeviceFrame>()
				.load(XML_BASE_DIR, "SGr_04_0018_CLEMAP_EIcloudEnergyMonitorV0.2.1.xml");
		
		// given	
		try (MockedStatic<AuthenticatorFactory> authFactory = Mockito.mockStatic(AuthenticatorFactory.class)) {
	        authFactory.when( () -> AuthenticatorFactory
	        		.getAuthenticator(SGrRestAPIAuthenticationEnumMethodType.BEARER_SECURITY_SCHEME)).thenReturn(authenticator);
	    }
		
		when(authenticator.provideAuthenicationHeader(any(SGrRestAPIDeviceFrame.class), any(Request.class)))
			.thenAnswer(invocation -> {
				Request request = invocation.getArgument(1, Request.class);
				return request.addHeader(HttpHeaders.AUTHORIZATION, "Bearer <TOKEN>");
			});
		
		
		try (MockedStatic<Request> requestStatic = Mockito.mockStatic(Request.class)) {
			requestStatic.when( () -> Request.get(any(String.class))).thenReturn(request);			
		}
		
		when(request.execute()).thenReturn(response);
						
		SGrRestApiDevice device = new SGrRestApiDevice(deviceFrame);
		String res = device.getVal("ActivePowerAC", "ActivePowerACtot");
		
		assertEquals("0.2", res);
	}

}
