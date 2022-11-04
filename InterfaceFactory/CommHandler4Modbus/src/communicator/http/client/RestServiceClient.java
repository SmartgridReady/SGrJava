package communicator.http.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpResponse;

import io.vavr.control.Either;

public abstract class RestServiceClient {
	
	public enum HttpMethod {
		GET,
		POST,
		PUT,
		PATCH,
		DELETE;
	}

	private final String baseUri;
	
	private final HttpMethod httpMethod;
	
	private Map<String, String> httpHeaders = new HashMap<>();
	
	private String requestPath;
	
	private String requestBody;
	
	private ContentType requestBodyContentType;
	
	
	protected RestServiceClient(String baseUri, HttpMethod httpMethod) {
		this.baseUri = baseUri;
		this.httpMethod = httpMethod;
	}
		
	public RestServiceClient addHeader(String key, String value) {
		httpHeaders.put(key, value);
		return this;
	}

	public RestServiceClient setRequestPath(String requestPath) {
		this.requestPath = requestPath;
		return this;
	}

	public RestServiceClient setRequestBody(String requestBody, ContentType requestBodyContentType) {
		this.requestBody = requestBody;
		this.requestBodyContentType = requestBodyContentType;
		return this;
	}

	public String getBaseUri() {
		return baseUri;
	}

	public HttpMethod getHttpMethod() {
		return httpMethod;
	}
	
	public Map<String, String> getHttpHeaders() {
		return httpHeaders;
	}

	public String getRequestPath() {
		return requestPath;
	}

	public String getRequestBody() {
		return requestBody;
	}
	
	public ContentType getRequestBodyContentType() {
		return requestBodyContentType;
	}

	protected abstract Either<HttpResponse, String> callService() throws IOException;
}
