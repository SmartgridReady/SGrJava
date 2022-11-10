package communicator.restapi.http.client;

import com.smartgridready.ns.v0.RestServiceCall;

public interface RestServiceClientFactory {
	public RestServiceClient create(String baseUri, RestServiceCall serviceCall);
}
