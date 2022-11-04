package communicator.http.authentication;

import java.io.IOException;

import org.apache.hc.client5.http.fluent.Request;

import com.smartgridready.ns.v0.SGrRestAPIDeviceFrame;

public class DummyHttpAuthenticator implements Authenticator {
	
	@Override
	public Request provideAuthenicationHeader(
			SGrRestAPIDeviceFrame deviceDescription,
			Request requestBuilder) throws IOException {
		return requestBuilder;
	}

	@Override
	public String getAuthorizationHeaderValue(SGrRestAPIDeviceFrame deviceDescription)
			throws IOException {
		return null;
	}

}
