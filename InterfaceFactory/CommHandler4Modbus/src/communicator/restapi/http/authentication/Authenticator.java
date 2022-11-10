package communicator.restapi.http.authentication;

import java.io.IOException;

import org.apache.hc.client5.http.fluent.Request;

import com.smartgridready.ns.v0.SGrRestAPIDeviceFrame;

import communicator.restapi.exception.RestApiResponseParseException;
import communicator.restapi.exception.RestApiServiceCallException;
import communicator.restapi.http.client.RestServiceClientFactory;

public interface Authenticator {
	
	String getAuthorizationHeaderValue(SGrRestAPIDeviceFrame deviceDescription, RestServiceClientFactory restServiceClientFactory) throws IOException, RestApiServiceCallException, RestApiResponseParseException;
	
	default boolean isTokenRenewalSupported() { return false; };
	
	default void renewToken(SGrRestAPIDeviceFrame deviceDescription, RestServiceClientFactory restServiceClientFactory) throws IOException, RestApiServiceCallException, RestApiResponseParseException {};
	
}
