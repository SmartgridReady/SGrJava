package communicator.restapi.http.client;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.EnumMap;
import java.util.function.Function;

import org.apache.commons.io.IOUtils;
import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.smartgridready.ns.v0.HttpMethod;
import com.smartgridready.ns.v0.RestServiceCall;

import io.vavr.control.Either;

public class ApacheRestServiceClient extends RestServiceClient {
	
	private static final Logger LOG = LoggerFactory.getLogger(ApacheRestServiceClient.class);
	
	private static final EnumMap<HttpMethod, Function<String, Request>> HTTP_METHOD_MAP = new EnumMap<>(HttpMethod.class);
	static {
		HTTP_METHOD_MAP.put(HttpMethod.GET, Request::get);
		HTTP_METHOD_MAP.put(HttpMethod.POST, Request::post);
		HTTP_METHOD_MAP.put(HttpMethod.PUT, Request::put);
		HTTP_METHOD_MAP.put(HttpMethod.PATCH, Request::patch);
		HTTP_METHOD_MAP.put(HttpMethod.DELETE, Request::delete);				
	}	

	protected ApacheRestServiceClient(String baseUri, RestServiceCall restServiceCall) {
		super(baseUri, restServiceCall);
	}

	@Override
	public Either<HttpResponse, String> callService() throws IOException {
		
		String uri = getBaseUri();
		if (getRestServiceCall().getRequestPath() != null) {
			uri = uri.concat(getRestServiceCall().getRequestPath());
		}
		
		Function<String, Request> requestFactoryFunct = HTTP_METHOD_MAP.get(getRestServiceCall().getRequestMethod());
		Request httpReq = requestFactoryFunct.apply(uri);
		getHttpHeaders().forEach(httpReq::addHeader);
		
		if (getRestServiceCall().getRequestBody() != null) {
			httpReq.bodyString(getRestServiceCall().getRequestBody(), ContentType.APPLICATION_JSON);
		}
		
		HttpResponse httpResp = httpReq.execute().returnResponse();
		if (httpResp.getCode() < HttpStatus.SC_CLIENT_ERROR) {						
			try ( InputStream is = ((ClassicHttpResponse)httpResp).getEntity().getContent() ) {					
				
				String jsonResp = IOUtils.toString(is, StandardCharsets.UTF_8);
				LOG.info("Server response: {}", jsonResp);
				return Either.right(jsonResp);
			}
		}
		return Either.left(httpResp);		
	}
}
