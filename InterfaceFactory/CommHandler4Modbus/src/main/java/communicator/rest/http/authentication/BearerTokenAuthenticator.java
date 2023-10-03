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

package communicator.rest.http.authentication;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Optional;

import com.smartgridready.ns.v0.DeviceFrame;
import com.smartgridready.ns.v0.RestApiInterfaceDescription;
import org.apache.hc.core5.http.HttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import communicator.rest.exception.RestApiResponseParseException;
import communicator.rest.exception.RestApiServiceCallException;
import communicator.rest.http.client.RestServiceClient;
import communicator.rest.http.client.RestServiceClientFactory;
import communicator.rest.http.client.RestServiceClientUtils;
import io.burt.jmespath.Expression;
import io.burt.jmespath.JmesPath;
import io.burt.jmespath.jackson.JacksonRuntime;
import io.vavr.control.Either;

public class BearerTokenAuthenticator implements Authenticator {
	
	private static final Logger LOG = LoggerFactory.getLogger(BearerTokenAuthenticator.class);
	
	public static final int TOKEN_EXPIRY_THRESHOLD_MS = 60000; // one minute
	
	private Optional<String> bearerToken = Optional.empty();	
	
	@Override
	public String getAuthorizationHeaderValue(DeviceFrame deviceDescription, RestServiceClientFactory restServiceClientFactory)
			throws IOException, RestApiServiceCallException, RestApiResponseParseException {
		
		if (!bearerToken.isPresent() || isBearerTokenExpired()) {
			authenticate(deviceDescription, restServiceClientFactory);			
		}
		return "Bearer " + bearerToken.get();
	}	
	
	@Override
	public boolean isTokenRenewalSupported() {
		return true;
	}
	
	@Override
	public void renewToken(DeviceFrame deviceDescription, RestServiceClientFactory restServiceClientFactory) throws IOException, RestApiServiceCallException {
		bearerToken = Optional.empty();
		authenticate(deviceDescription, restServiceClientFactory);		
	}
	
	private void authenticate(DeviceFrame deviceDescription, RestServiceClientFactory restServiceClientFactory) throws IOException, RestApiServiceCallException {
		
		RestApiInterfaceDescription ifDescription =
				deviceDescription.getInterfaceList().getRestApiInterface().getRestApiInterfaceDescription();

		String host = ifDescription.getRestApiUri();
		
		RestServiceClient restServiceClient = restServiceClientFactory.create(host, ifDescription.getRestApiBearer().getRestApiServiceCall());
		requestBearerToken(restServiceClient);
	}
	
	private void requestBearerToken(RestServiceClient restServiceClient) throws IOException, RestApiServiceCallException {
		
		if (LOG.isInfoEnabled()) {
				LOG.debug("Calling REST service: {} - {}", 
							restServiceClient.getBaseUri(), 
							RestServiceClientUtils.printServiceCall(restServiceClient.getRestServiceCall()));
		}
		
		Either<HttpResponse, String> result = restServiceClient.callService();			
		if (result.isRight()) {
			LOG.info("Received response: {}", result.get());
			bearerToken = parseResponse(result.get(), restServiceClient.getRestServiceCall().getResponseQuery().getQuery());
			if (bearerToken.isPresent()) { 
				LOG.debug("Received bearer token={}", bearerToken.get());
			} else {
				LOG.error("Bearer token missing in response.");
			}
			
		} else {
			LOG.error("Authenticate failed with http status={}", result.getLeft().getCode());
			throw new RestApiServiceCallException(result.getLeft());
		}				
	}	
	
	private Optional<String> parseResponse(String jsonResp, String jmesPath) throws IOException {
		
		JmesPath<JsonNode> path = new JacksonRuntime();
		Expression<JsonNode> expression = path.compile(jmesPath);
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = mapper.readTree(jsonResp);		
		JsonNode res = expression.search(jsonNode);
		
		if (res != null) {
			return Optional.of(res.asText());
		}
		
		LOG.error("Unable to extract bearer token from http response.");
		return Optional.empty();		
	}
	
	private boolean isBearerTokenExpired() {
		
		try {
			String[] tokenParts = bearerToken.get().split("\\.");		
			if (tokenParts.length >= 2) {
				
				Decoder decoder = Base64.getDecoder();
				String jsonBody = new String(decoder.decode(tokenParts[1]), StandardCharsets.UTF_8);
				
				JmesPath<JsonNode> path = new JacksonRuntime();
				Expression<JsonNode> expression = path.compile("exp");
				
				ObjectMapper mapper = new ObjectMapper();
				JsonNode jsonNode;
				jsonNode = mapper.readTree(jsonBody);
				JsonNode res = expression.search(jsonNode);
				long expiryTimestamp = res.asLong(0);			
				long currentTimestamp = System.currentTimeMillis() / 1000l;				
				return (expiryTimestamp + TOKEN_EXPIRY_THRESHOLD_MS < currentTimestamp);
			}
		} catch (Exception e) {
			LOG.warn("Unable to extract expiration time from JWT token", e);
			return true;			
		}
		// Token invalid, treat as expired
		LOG.warn("Missing JWT token parts. Should at least have a HEADER and PAYLOAD part.");
		return true;
	}
}
