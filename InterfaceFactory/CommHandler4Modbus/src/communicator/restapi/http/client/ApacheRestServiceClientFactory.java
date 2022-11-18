package communicator.restapi.http.client;

import java.util.Properties;

import com.smartgridready.ns.v0.RestServiceCall;

public class ApacheRestServiceClientFactory implements RestServiceClientFactory {
		
	@Override
	public RestServiceClient create(String baseUri, RestServiceCall restServiceCall) {
		return new ApacheRestServiceClient(baseUri, restServiceCall);
	}
	
	public RestServiceClient create(String baseUri, RestServiceCall restServiceCall, Properties substitutions) {
		return new ApacheRestServiceClient(baseUri, restServiceCall, substitutions);
	}
}
