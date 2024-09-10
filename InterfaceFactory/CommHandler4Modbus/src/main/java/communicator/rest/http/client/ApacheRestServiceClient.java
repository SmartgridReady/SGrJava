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
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Properties;
import java.util.function.Function;

import javax.net.ssl.SSLContext;

import org.apache.commons.io.IOUtils;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManagerBuilder;
import org.apache.hc.client5.http.io.HttpClientConnectionManager;
import org.apache.hc.client5.http.ssl.SSLConnectionSocketFactory;
import org.apache.hc.client5.http.ssl.TrustAllStrategy;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpHeaders;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.HttpStatus;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.apache.hc.core5.net.URIBuilder;
import org.apache.hc.core5.ssl.SSLContexts;
import org.apache.hc.core5.ssl.SSLInitializationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.smartgridready.ns.v0.RestApiServiceCall;

import communicator.common.client.NonValidatingHostnameVerifier;

import com.smartgridready.ns.v0.HeaderEntry;
import com.smartgridready.ns.v0.HttpMethod;

import io.vavr.control.Either;


public class ApacheRestServiceClient extends RestServiceClient {

	private static final Logger LOG = LoggerFactory.getLogger(ApacheRestServiceClient.class);
	
	private static final EnumMap<HttpMethod, Function<String, Request>> HTTP_METHOD_MAP = new EnumMap<>(HttpMethod.class);
	private static final Map<String, Function31<Request, String, ContentType, Request>> BODY_ENCODE_MAP = new HashMap<>();

	static {
		HTTP_METHOD_MAP.put(HttpMethod.GET, Request::get);
		HTTP_METHOD_MAP.put(HttpMethod.POST, Request::post);
		HTTP_METHOD_MAP.put(HttpMethod.PUT, Request::put);
		HTTP_METHOD_MAP.put(HttpMethod.PATCH, Request::patch);
		HTTP_METHOD_MAP.put(HttpMethod.DELETE, Request::delete);

		BODY_ENCODE_MAP.put(ContentType.TEXT_PLAIN.getMimeType(), ApacheRestServiceClient::encodeStringBody);
		BODY_ENCODE_MAP.put(ContentType.APPLICATION_JSON.getMimeType(), ApacheRestServiceClient::encodeStringBody);
	}	

	protected ApacheRestServiceClient(String baseUri, RestApiServiceCall restServiceCall) {
		super(baseUri, restServiceCall, true);
	}

	protected ApacheRestServiceClient(String baseUri, RestApiServiceCall restServiceCall, boolean verifyCertificate) {
		super(baseUri, restServiceCall, verifyCertificate);
	}
	
	protected ApacheRestServiceClient(String baseUri, RestApiServiceCall restServiceCall, Properties substitutions) {
		super(baseUri, restServiceCall, substitutions, true);
	}

	protected ApacheRestServiceClient(String baseUri, RestApiServiceCall restServiceCall, Properties substitutions, boolean verifyCertificate) {
		super(baseUri, restServiceCall, substitutions, verifyCertificate);
	}

	@Override
	public Either<HttpResponse, String> callService() throws IOException {

		RestApiServiceCall serviceCall = getRestServiceCall();

		Function<String, Request> requestFactoryFunct = HTTP_METHOD_MAP.get(serviceCall.getRequestMethod());
		if (requestFactoryFunct == null) {
			throw new IOException(String.format("invalid HTTP method '%s'", serviceCall.getRequestMethod()));
		}

		URI uri;
		try {
			uri = buildUri(serviceCall);
		} catch (URISyntaxException e) {
			throw new IOException("Cannot build request URI", e);
		}

		Request httpReq = requestFactoryFunct.apply(uri.toString());
		ContentType requestContentType = prepareHttpHeaders(serviceCall, httpReq);

		if (serviceCall.getRequestForm() != null) {
			// add url-encoded form parameters instead of body
			final List<NameValuePair> formParams = new ArrayList<>();
			serviceCall.getRequestForm().getParameter().forEach(p ->
				formParams.add(new BasicNameValuePair(p.getName(), p.getValue())));

			httpReq.body(new UrlEncodedFormEntity(formParams));
		} else if (serviceCall.getRequestBody() != null) {
			// add body based on MIME type of content-type header
			String content = serviceCall.getRequestBody();

			Function31<Request, String, ContentType, Request> bodyEncodeFunct = BODY_ENCODE_MAP.get(requestContentType.getMimeType());
			if (bodyEncodeFunct == null) {
				throw new IOException(String.format("Cannot encode request body of content type '%s'", requestContentType.getMimeType()));
			}
			
			bodyEncodeFunct.apply(httpReq, content, requestContentType);
		}
		
		try (CloseableHttpClient httpClient = buildHttpClient()) {
			HttpResponse httpResp = httpReq.execute(httpClient).returnResponse();
			if ((httpResp.getCode() >= HttpStatus.SC_OK) && (httpResp.getCode() < HttpStatus.SC_CLIENT_ERROR)) {
				try (InputStream is = ((ClassicHttpResponse)httpResp).getEntity().getContent()) {
					
					String contentTypeStr = ((ClassicHttpResponse)httpResp).getEntity().getContentType();
					ContentType contentType = (contentTypeStr != null) ? ContentType.parse(contentTypeStr) : ContentType.DEFAULT_TEXT;
					
					String content = IOUtils.toString(is, contentType.getCharset());
					return Either.right(content);
				}
			}
			return Either.left(httpResp);
		}
	}

	private URI buildUri(RestApiServiceCall serviceCall) throws URISyntaxException {
		URI uri;
		final URIBuilder uriBuilder = new URIBuilder(getBaseUri());

		// add request path
		if (serviceCall.getRequestPath() != null) {
			int startQueryPos = serviceCall.getRequestPath().indexOf('?');
			if (startQueryPos >= 0) {
				// split path and query (old style)
				String path = serviceCall.getRequestPath().substring(0, startQueryPos);
				String query = serviceCall.getRequestPath().substring(startQueryPos + 1);
				uriBuilder.appendPath(path);
				uriBuilder.setCustomQuery(query);
			} else {
				// just set path (new style)
				uriBuilder.appendPath(serviceCall.getRequestPath());
			}
		}

		// add query parameters
		if (serviceCall.getRequestQuery() != null) {
			serviceCall.getRequestQuery().getParameter().forEach(p ->
				uriBuilder.addParameter(p.getName(), p.getValue()));
		}

		uri = uriBuilder.build();
		return uri;
	}


	private CloseableHttpClient buildHttpClient() {

		try {
			final SSLContext sslContext = isVerifyCertificate()
				? SSLContexts.createSystemDefault()
				: SSLContexts.custom()
			        .loadTrustMaterial(TrustAllStrategy.INSTANCE)
			        .build();

			final SSLConnectionSocketFactory sslFactory = isVerifyCertificate()
				? new SSLConnectionSocketFactory(sslContext)
				: new SSLConnectionSocketFactory(sslContext, NonValidatingHostnameVerifier.getInstance());
	
			final HttpClientConnectionManager cm = PoolingHttpClientConnectionManagerBuilder
				.create()
				.setSSLSocketFactory(sslFactory)
				.build();
			
			return HttpClients
				.custom()
				.useSystemProperties()
				.setConnectionManager(cm)
				.build();
		} catch (SSLInitializationException | KeyManagementException | NoSuchAlgorithmException | KeyStoreException e) {
			LOG.error("SSL initialization error", e);
		}

		// fallback
		return HttpClients.createSystem();
	}


	private static ContentType prepareHttpHeaders(RestApiServiceCall serviceCall, Request httpReq) {
		ContentType requestContentType = ContentType.TEXT_PLAIN;

		if (serviceCall.getRequestHeader() != null) {
			for (HeaderEntry headerEntry: serviceCall.getRequestHeader().getHeader()) {
				if (headerEntry.getHeaderName().equalsIgnoreCase(HttpHeaders.CONTENT_TYPE)) {
					// content type header will be set later in body encode function
					requestContentType = ContentType.parse(headerEntry.getValue());
				} else {
					httpReq.addHeader(headerEntry.getHeaderName(), headerEntry.getValue());
				}
			}
		}
		return requestContentType;
	}


	static Request encodeStringBody(Request httpReq, String content, ContentType contentType) {
		return httpReq.body(new StringEntity(content, contentType));
	}


	@SuppressWarnings("UnusedReturnValue")
	@FunctionalInterface
	private interface Function31<A, B, C, R> {
		R apply(A a, B b, C c);
	}
}
