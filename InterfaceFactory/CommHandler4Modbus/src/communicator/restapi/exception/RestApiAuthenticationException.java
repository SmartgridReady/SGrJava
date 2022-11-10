package communicator.restapi.exception;

public class RestApiAuthenticationException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public RestApiAuthenticationException(String message, Throwable cause) {
		super(message, cause);
	}

	public RestApiAuthenticationException(String message) {
		super(message);
	}
}
