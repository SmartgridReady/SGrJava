package communicator.restapi.http.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.hc.core5.http.HttpResponse;
import org.eclipse.emf.common.util.EList;

import com.smartgridready.ns.v0.HeaderEntry;
import com.smartgridready.ns.v0.HeaderList;
import com.smartgridready.ns.v0.RestServiceCall;

import io.vavr.control.Either;

public abstract class RestServiceClient {
	
	private final String baseUri;
	
	private final Map<String, String> httpHeaders;
	
	private final RestServiceCall restServiceCall;
	
	protected RestServiceClient(String baseUri, RestServiceCall serviceCall) {		
		this.baseUri = baseUri;
		this.restServiceCall = serviceCall;
		this.httpHeaders = convertHeaders(serviceCall.getRequestHeader());
	}	
		
	public RestServiceClient addHeader(String key, String value) {
		httpHeaders.put(key, value);
		return this;
	}

	public String getBaseUri() {
		return baseUri;
	}
	
	public Map<String, String> getHttpHeaders() {
		return httpHeaders;
	}
	
	public RestServiceCall getRestServiceCall() {
		return restServiceCall;
	}
	
	public abstract Either<HttpResponse, String> callService() throws IOException;
	
	private Map<String, String> convertHeaders( HeaderList httpHeaders ) {
		Map<String, String> headers = new HashMap<>();
		EList<HeaderEntry> entries = httpHeaders.getHeader();
		entries.forEach( headerEntry -> headers.put(headerEntry.getHeaderName(), headerEntry.getValue()) );
		return headers;		
	}
}
