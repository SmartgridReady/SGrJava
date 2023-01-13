package communicator.restapi.http.client;

import org.eclipse.emf.common.util.EList;

import com.smartgridready.ns.v0.HeaderEntry;
import com.smartgridready.ns.v0.RestServiceCall;

public class RestServiceClientUtils {
	
	private RestServiceClientUtils() { throw new IllegalAccessError("Utility class"); };
	
	public static String printServiceCall(RestServiceCall restServiceCall) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("%nRequest method: %s%n", restServiceCall.getRequestMethod().getName()));
		sb.append(String.format("Request path:   %s%n", restServiceCall.getRequestPath()));
		sb.append(String.format("Headers: %n%s", printHeaders(restServiceCall.getRequestHeader().getHeader())));
		sb.append(String.format("Request body:   %s%n", restServiceCall.getRequestBody()));
		
		return sb.toString();		
	}
	
	private static String printHeaders(EList<HeaderEntry> headers) {
		StringBuilder sb = new StringBuilder();
		headers.forEach( headerEntry -> {
			sb.append(String.format("\t%s : %s%n", headerEntry.getHeaderName(), headerEntry.getValue()));
		});		
		return sb.toString();
	}
}
