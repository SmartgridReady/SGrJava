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
