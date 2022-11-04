package communicator.http.authentication;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.client5.http.fluent.Response;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpHeaders;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smartgridready.ns.v0.SGrRestAPIDeviceFrame;

import communicator.http.client.ApacheRestServiceClient;
import communicator.http.client.RestServiceClient.HttpMethod;
import io.burt.jmespath.Expression;
import io.burt.jmespath.JmesPath;
import io.burt.jmespath.jackson.JacksonRuntime;
import io.vavr.control.Either;

public class BearerTokenAuthenticator implements Authenticator {
	
	private static final Logger LOG = LoggerFactory.getLogger(BearerTokenAuthenticator.class);
	
	public static final int TOKEN_EXPIRY_THRESHOLD_MS = 60000; // one minute
	
	private Optional<String> bearerToken = Optional.empty();	
	
	@Override
	public String getAuthorizationHeaderValue(SGrRestAPIDeviceFrame deviceDescription)
			throws IOException {
		
		if (!bearerToken.isPresent() || isBearerTokenExpired()) {
			authenticate(deviceDescription);			
		}
		return "Bearer " + bearerToken.get();
	}
	
	@Override
	public Request provideAuthenicationHeader (
			SGrRestAPIDeviceFrame deviceDescription,
			Request requestBuilder) throws IOException {
		
		if (!bearerToken.isPresent() || isBearerTokenExpired()) {
			authenticate(deviceDescription);			
		}
		
		requestBuilder.addHeader(HttpHeaders.AUTHORIZATION, "Bearer " + bearerToken.get());
		return requestBuilder;		
	}
	
	
	@Override
	public boolean isTokenRenewalSupported() {
		return true;
	}
	
	@Override
	public void renewToken(SGrRestAPIDeviceFrame deviceDescription) throws IOException {
		bearerToken = Optional.empty();
		authenticate(deviceDescription);		
	}
	
	private int authenticate(SGrRestAPIDeviceFrame deviceDescription) throws IOException {
		
		String host = deviceDescription.getRestAPIInterfaceDesc().getTrspSrvRestURIoutOfBox(); 
		String jmesPath = deviceDescription.getRestAPIInterfaceDesc().getRestAPIBearer().getRestAPIJMESPath();
		String restApiEndpoint = deviceDescription.getRestAPIInterfaceDesc().getRestAPIBearer().getRestAPIEndPoint();				
		
		// Handles current (Clemap proprietary) format coding of the sgr:restAPIEndPoint element.		
		Pattern pattern = Pattern.compile("'(.*?)'");
		Matcher matcher = pattern.matcher(restApiEndpoint);
		if (matcher.find()) {	
			String authBody = matcher.group(1);
			authBody = authBody.replace("'", "");
			
			String authPath = "";
			pattern = Pattern.compile(">(.*?)$");			
			matcher = pattern.matcher(restApiEndpoint);
			if (matcher.find()) {
				authPath = matcher.group(1);
			}
			
			return requestBearerToken(host, authPath, authBody, jmesPath);			
		} else {
			throw new IllegalArgumentException("Invalid sgr:restAPIEndPoint: No authentication request defined.");
		}		
	}
	
	private int requestBearerToken(String host, String authPath, String body, String jmesPath) throws IOException {
		
		ApacheRestServiceClient serviceClient = new ApacheRestServiceClient("https://" + host, HttpMethod.POST);
		serviceClient.setRequestPath(authPath);
		serviceClient.setRequestBody(body, ContentType.APPLICATION_JSON);
		Either<HttpResponse, String> result = serviceClient.callService();
	
		if (result.isRight()) {
			bearerToken = parseResponse(result.get(), jmesPath);
			if (bearerToken.isPresent()) { 
				LOG.info("Received bearer token={}", bearerToken.get());
				return HttpStatus.SC_OK;
			} else {
				return HttpStatus.SC_NO_CONTENT;
			}
		} else {
			LOG.error("Authenticate failed with http status={}", result.getLeft().getCode());
			return result.getLeft().getCode();
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
