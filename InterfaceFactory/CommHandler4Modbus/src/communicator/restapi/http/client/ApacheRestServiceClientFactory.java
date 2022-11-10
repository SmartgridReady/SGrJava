package communicator.restapi.http.client;

import com.smartgridready.ns.v0.RestServiceCall;

public class ApacheRestServiceClientFactory implements RestServiceClientFactory {
		
	@Override
	public RestServiceClient create(String baseUri, RestServiceCall restServiceCall) {
		return new ApacheRestServiceClient(baseUri, restServiceCall);
	}
	
}
