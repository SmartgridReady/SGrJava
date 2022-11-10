package communicator.restapi.exception;

public class RestApiResponseParseException extends Exception {

	private static final long serialVersionUID = 1L;

	public RestApiResponseParseException(String message, Throwable cause) {
		super(message, cause);
	}

	public RestApiResponseParseException(String message) {
		super(message);
	}
}
