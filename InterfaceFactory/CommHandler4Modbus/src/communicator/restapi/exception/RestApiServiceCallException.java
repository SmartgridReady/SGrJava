package communicator.restapi.exception;

import org.apache.hc.core5.http.HttpResponse;

public class RestApiServiceCallException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private final HttpResponse httpResponse;
	
	public RestApiServiceCallException(HttpResponse httpResponse) {
		
		super(	"REST service call failed. HttpStatus: " 
				+ httpResponse.getCode() + " - reason: " 
				+ httpResponse.getReasonPhrase());
		
		this.httpResponse = httpResponse;	
	}

	public HttpResponse getHttpResponse() {
		return httpResponse;
	}	
}
