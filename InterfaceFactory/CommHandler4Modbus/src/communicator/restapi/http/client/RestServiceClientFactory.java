package communicator.restapi.http.client;

import java.util.Properties;

import com.smartgridready.ns.v0.RestServiceCall;

public interface RestServiceClientFactory {
	public RestServiceClient create(String baseUri, RestServiceCall serviceCall);
	public RestServiceClient create(String baseUri, RestServiceCall serviceCall, Properties substitutions);	
}
