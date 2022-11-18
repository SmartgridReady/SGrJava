package communicator.restapi.http.client;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.apache.hc.core5.http.HttpResponse;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.smartgridready.ns.v0.HeaderEntry;
import com.smartgridready.ns.v0.HeaderList;
import com.smartgridready.ns.v0.RestServiceCall;
import com.smartgridready.ns.v0.V0Factory;

import io.vavr.control.Either;

public abstract class RestServiceClient {
	
	private final String baseUri;	
	
	private final RestServiceCall restServiceCall;
	
	protected RestServiceClient(String baseUri, RestServiceCall serviceCall) {		
		this(baseUri, serviceCall, new Properties());
	}
	
	protected RestServiceClient(String baseUri, RestServiceCall serviceCall, Properties substitutions) {
		this.baseUri = replacePropertyPlaceholders(baseUri, substitutions);
		this.restServiceCall = cloneRestServiceCallWithSubstitutions(serviceCall, substitutions);
	}
	
		
	public RestServiceClient addHeader(String key, String value) {
		
		HeaderEntry headerEntry = V0Factory.eINSTANCE.createHeaderEntry();
		headerEntry.setHeaderName(key);
		headerEntry.setValue(value);		
		restServiceCall.getRequestHeader().getHeader().add(headerEntry);
		
		return this;
	}

	public String getBaseUri() {
		return getBaseUri(new Properties());
	}
	
	public String getBaseUri(Properties substitutions) {
		return replacePropertyPlaceholders(baseUri, substitutions);
	}
	
	public RestServiceCall getRestServiceCall() {
		return restServiceCall;
	}
	
	private RestServiceCall cloneRestServiceCallWithSubstitutions(RestServiceCall restServiceCall, Properties substitutions) {
		
		// handle substitutions, do this on a clone, do not modify the EI loaded from XML.
		RestServiceCall clone = EcoreUtil.copy(restServiceCall);
		clone.setRequestPath(replacePropertyPlaceholders(restServiceCall.getRequestPath(), substitutions));
		clone.setRequestBody(replacePropertyPlaceholders(restServiceCall.getRequestBody(), substitutions));	
		clone.getResponseQuery().setQuery(replacePropertyPlaceholders(restServiceCall.getResponseQuery().getQuery(), substitutions));
		
		HeaderList headers = clone.getRequestHeader();
		headers.getHeader().forEach( header -> {
			header.setValue(replacePropertyPlaceholders(header.getValue(), substitutions));
		});
		return clone;
	}
	
	public abstract Either<HttpResponse, String> callService() throws IOException;
	
	private static String replacePropertyPlaceholders(String template, Properties properties) {

		String convertedTemplate = template;		
		if (properties != null) {
			for (Map.Entry<Object, Object> entry : properties.entrySet()) {
				convertedTemplate = convertedTemplate.replaceAll("\\{\\{" + entry.getKey() + "\\}\\}", (String)entry.getValue());
			}
		}
		return convertedTemplate;
	}		 	
}
