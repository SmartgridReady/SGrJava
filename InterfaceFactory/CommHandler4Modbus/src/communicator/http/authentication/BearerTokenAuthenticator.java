package communicator.http.authentication;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.client5.http.fluent.Response;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpHeaders;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smartgridready.ns.v0.SGrRestAPIDeviceFrame;

import io.burt.jmespath.Expression;
import io.burt.jmespath.JmesPath;
import io.burt.jmespath.jackson.JacksonRuntime;

public class BearerTokenAuthenticator implements Authenticator {
	
	private String bearerToken;	 	
	
	@Override
	public Request provideAuthenicationHeader (
			SGrRestAPIDeviceFrame deviceDescription,
			Request requestBuilder) throws IOException {
		
		if (bearerToken == null || isBearerTokenExpired()) {
			requestBearerToken(deviceDescription);
		}
		
		requestBuilder.addHeader(HttpHeaders.AUTHORIZATION, "Bearer " + bearerToken);
		return requestBuilder;		
	}
	
	private void requestBearerToken(SGrRestAPIDeviceFrame deviceDescription) throws IOException {
		
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
			
			authenticate(host, authPath, authBody, jmesPath);			
		} else {
			throw new IllegalArgumentException("Invalid sgr:restAPIEndPoint: No authentication request defined.");
		}		
	}
	
	
	private void authenticate(String host, String authPath, String body, String jmesPath) throws IOException {
				
		Response resp = Request.post("https://" + host + authPath).bodyString(body, ContentType.APPLICATION_JSON).execute();
		String jsonResp = resp.returnContent().asString(StandardCharsets.UTF_8);
		System.out.println("Authenticate returned: " + jsonResp);
		
		JmesPath<JsonNode> path = new JacksonRuntime();
		Expression<JsonNode> expression = path.compile(jmesPath);
						
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = mapper.readTree(jsonResp);		
		JsonNode res = expression.search(jsonNode);		
		
		bearerToken = res.asText();
	}
	
	private boolean isBearerTokenExpired() {
		
		String[] tokenParts = bearerToken.split("\\.");
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
				return (expiryTimestamp <= currentTimestamp);						

			} catch (IOException e) { 
				// Token invalid, treat as expired
				return true;
			}			
		}
		// Token invalid, treat as expired
		return true;
	}
}
