/**
Copyright(c) 2022 Verein SmartGridready Switzerland

This Open Source Software is BSD 3 clause licensed:
Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in
the documentation and/or other materials provided with the distribution.
3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from
this software without specific prior written permission.
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package communicator.rest.http.client;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Properties;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.smartgridready.ns.v0.RestApiServiceCall;
import org.apache.commons.io.IOUtils;
import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.HttpStatus;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.smartgridready.ns.v0.HeaderEntry;
import com.smartgridready.ns.v0.HttpMethod;

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

	protected ApacheRestServiceClient(String baseUri, RestApiServiceCall restServiceCall) {
		super(baseUri, restServiceCall);
	}
	
	protected ApacheRestServiceClient(String baseUri, RestApiServiceCall restServiceCall, Properties substitutions) {
		super(baseUri, restServiceCall, substitutions);
	}

	@Override
	public Either<HttpResponse, String> callService() throws IOException {
		
		String uri = getBaseUri();
		if (getRestServiceCall().getRequestPath() != null) {
			uri = uri.concat(getRestServiceCall().getRequestPath());
		}
		
		Function<String, Request> requestFactoryFunct = HTTP_METHOD_MAP.get(getRestServiceCall().getRequestMethod());
		Request httpReq = requestFactoryFunct.apply(uri);
		
		String contentTypeHeader = null;

		if (getRestServiceCall().getRequestHeader() != null) {
			for (HeaderEntry headerEntry: getRestServiceCall().getRequestHeader().getHeader()) {
				httpReq.addHeader(headerEntry.getHeaderName(), headerEntry.getValue());
				if (headerEntry.getHeaderName().equalsIgnoreCase("Content-Type")) {
					contentTypeHeader = headerEntry.getValue();
				}
			}
		}
		
		if (getRestServiceCall().getRequestBody() != null) {
			String content = getRestServiceCall().getRequestBody();
			if (contentTypeHeader != null) {
				switch (contentTypeHeader) {
					case "application/json":
						LOG.debug("REST request JSON body = '{}'", content);
						httpReq.bodyString(content, ContentType.APPLICATION_JSON);
						break;

					case "application/x-www-form-urlencoded":
						httpReq.bodyForm(getFormParameters(content));
						break;

					default:
						LOG.debug("REST request plain body = '{}'", content);
						httpReq.bodyString(content, ContentType.TEXT_PLAIN);
						break;
				}
			} else {
				LOG.debug("REST request plain body = '{}'", content);
				httpReq.bodyString(content, ContentType.TEXT_PLAIN);
			}
		}
		
		HttpResponse httpResp = httpReq.execute().returnResponse();
		if (httpResp.getCode() < HttpStatus.SC_CLIENT_ERROR) {
			try ( InputStream is = ((ClassicHttpResponse)httpResp).getEntity().getContent() ) {
				
				String jsonResp = IOUtils.toString(is, StandardCharsets.UTF_8);
				return Either.right(jsonResp);
			}
		}
		return Either.left(httpResp);
	}

	private Iterable<NameValuePair> getFormParameters(String body) {
		if ((body == null) || body.isEmpty()) {
			return Collections.emptyList();
		}

		// TODO support multiple occurrences of '=', e.g. in values
		List<NameValuePair> formParams = new ArrayList<>();
		String[] pArr = body.split("&");
		for (String p: pArr) {
			String[] kv = p.split("=", 2);
			if (kv.length > 1) {
				formParams.add(new BasicNameValuePair(kv[0], kv[1]));
			} else if (kv.length > 0) {
				formParams.add(new BasicNameValuePair(kv[0], ""));
			}
		}

		return formParams;
	}
}
