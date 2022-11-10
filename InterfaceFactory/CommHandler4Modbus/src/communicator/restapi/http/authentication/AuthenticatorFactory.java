package communicator.restapi.http.authentication;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import com.smartgridready.ns.v0.SGrRestAPIAuthenticationEnumMethodType;

import communicator.restapi.exception.RestApiAuthenticationException;

public class AuthenticatorFactory {
	
	private AuthenticatorFactory() { /* Utility class */ };

	private static final Map<SGrRestAPIAuthenticationEnumMethodType, Class<? extends Authenticator>> AUTHENTICATOR_REGISTRY = new HashMap<>();
	static {
		AUTHENTICATOR_REGISTRY.put(SGrRestAPIAuthenticationEnumMethodType.BEARER_SECURITY_SCHEME, BearerTokenAuthenticator.class);
		AUTHENTICATOR_REGISTRY.put(SGrRestAPIAuthenticationEnumMethodType.NO_SECURITY_SCHEME, DummyHttpAuthenticator.class);
	}
	
	public static final Authenticator getAuthenticator(SGrRestAPIAuthenticationEnumMethodType authMethodType)
		throws RestApiAuthenticationException {
		Class<? extends Authenticator> authClass = AUTHENTICATOR_REGISTRY.get(authMethodType);
		if (authClass != null) {
			Constructor<? extends Authenticator> ctor;
			try {
				ctor = authClass.getDeclaredConstructor();
				return ctor.newInstance();
			} catch (ReflectiveOperationException e) {
				throw new RestApiAuthenticationException("Authenticator creation failed.", e);
			}
		}
		throw new RestApiAuthenticationException("Authentication method " +  authMethodType.getName() + " not supported yet.");		
	}	
}
