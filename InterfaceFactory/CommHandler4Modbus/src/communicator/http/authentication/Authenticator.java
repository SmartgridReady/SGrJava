package communicator.http.authentication;

import java.io.IOException;

import org.apache.hc.client5.http.fluent.Request;

import com.smartgridready.ns.v0.SGrRestAPIDeviceFrame;

public interface Authenticator {

	@Deprecated
	Request provideAuthenicationHeader (SGrRestAPIDeviceFrame deviceDescription, Request requestBuilder) throws IOException;
	
	String getAuthorizationHeaderValue(SGrRestAPIDeviceFrame deviceDescription) throws IOException;
	
	default boolean isTokenRenewalSupported() { return false; };
	
	default void renewToken(SGrRestAPIDeviceFrame deviceDescription) throws IOException {};
	
}
