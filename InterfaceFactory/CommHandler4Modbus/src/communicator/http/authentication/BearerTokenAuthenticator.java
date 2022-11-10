package communicator.http.authentication;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Optional;

import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.core5.http.HttpHeaders;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smartgridready.ns.v0.SGrRestAPIDeviceFrame;
import com.smartgridready.ns.v0.SGrRestAPIInterfaceDescriptionType;

import communicator.http.client.RestServiceClient;
import communicator.http.client.RestServiceClientFactory;
import communicator.restapi.exception.RestApiResponseParseException;
import communicator.restapi.exception.RestApiServiceCallException;
import io.burt.jmespath.Expression;
import io.burt.jmespath.JmesPath;
import io.burt.jmespath.jackson.JacksonRuntime;
import io.vavr.control.Either;

public class BearerTokenAuthenticator implements Authenticator {
	
	private static final Logger LOG = LoggerFactory.getLogger(BearerTokenAuthenticator.class);
	
	public static final int TOKEN_EXPIRY_THRESHOLD_MS = 60000; // one minute
	
	private Optional<String> bearerToken = Optional.empty();	
	
	@Override
	public String getAuthorizationHeaderValue(SGrRestAPIDeviceFrame deviceDescription, RestServiceClientFactory restServiceClientFactory)
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
	public void renewToken(SGrRestAPIDeviceFrame deviceDescription, RestServiceClientFactory restServiceClientFactory) throws IOException, RestApiServiceCallException {
		bearerToken = Optional.empty();
		authenticate(deviceDescription, restServiceClientFactory);		
	}
	
	private void authenticate(SGrRestAPIDeviceFrame deviceDescription, RestServiceClientFactory restServiceClientFactory) throws IOException, RestApiServiceCallException {
		
		SGrRestAPIInterfaceDescriptionType ifDescription = deviceDescription.getRestAPIInterfaceDesc();		
		String host = ifDescription.getTrspSrvRestURIoutOfBox();
		
		RestServiceClient restServiceClient = restServiceClientFactory.create(host, ifDescription.getRestAPIBearer().getServiceCall());
		requestBearerToken(restServiceClient);
	}
	
	private void requestBearerToken(RestServiceClient restServiceClient) throws IOException, RestApiServiceCallException {
		
		Either<HttpResponse, String> result = restServiceClient.callService();			
		if (result.isRight()) {
			bearerToken = parseResponse(result.get(), restServiceClient.getRestServiceCall().getResponseQuery().getQuery());
			if (bearerToken.isPresent()) { 
				LOG.info("Received bearer token={}", bearerToken.get());
			} else {
				LOG.info("Bearer token missing in response.");
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
		
		String[] tokenParts = bearerToken.get().split("\\.");
		if (tokenParts.length >= 2) {
			
			Decoder decoder = Base64.getDecoder();
			String jsonBody = new String(decoder.decode(tokenParts[1]), StandardCharsets.UTF_8);
			
			JmesPath<JsonNode> path = new JacksonRuntime();
			Expression<JsonNode> expression = path.compile("exp");
			
			ObjectMapper mapper = new ObjectMapper();
			JsonNode jsonNode;
			try {
				jsonNode = mapper.readTree(jsonBody);
				JsonNode res = expression.search(jsonNode);
				long expiryTimestamp = res.asLong(0);			
				long currentTimestamp = System.currentTimeMillis() / 1000l;				
				return (expiryTimestamp + TOKEN_EXPIRY_THRESHOLD_MS < currentTimestamp);						
  
			} catch (IOException e) { 
				LOG.warn("Unable to extract expiration time from JWT token");
				return true;
			}			
		}
		// Token invalid, treat as expired
		LOG.warn("Missing JWT token parts. Should at least have a HEADER and PAYLOAD part.");
		return true;
	}
}
