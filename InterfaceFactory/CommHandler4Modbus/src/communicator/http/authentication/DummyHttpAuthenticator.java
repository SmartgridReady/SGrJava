package communicator.http.authentication;

import java.io.IOException;

import org.apache.hc.client5.http.fluent.Request;

import com.smartgridready.ns.v0.SGrRestAPIDeviceFrame;

import communicator.http.client.RestServiceClientFactory;
import communicator.restapi.exception.RestApiResponseParseException;
import communicator.restapi.exception.RestApiServiceCallException;

public class DummyHttpAuthenticator implements Authenticator {	

	@Override
	public String getAuthorizationHeaderValue(SGrRestAPIDeviceFrame deviceDescription, RestServiceClientFactory restServiceClientFactory)
			throws IOException, RestApiServiceCallException, RestApiResponseParseException {
		return null;
	}

}
