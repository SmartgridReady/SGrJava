/**
Copyright(c) 2022 Verein SmartGridready Switzerland

This Open Source Software is BSD 3 clause licensed:
Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in
the documentation and/or other materials provided with the distribution.
3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from
this software without specific prior written permission.
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
OF THE POSSIBILITY OF SUCH DAMAGE.
 */

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
