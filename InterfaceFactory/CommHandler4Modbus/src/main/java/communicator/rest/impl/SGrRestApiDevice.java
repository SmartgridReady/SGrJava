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

package communicator.rest.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smartgridready.ns.v0.RestServiceCall;
import com.smartgridready.ns.v0.SGrRestAPIAuthenticationEnumMethodType;
import com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType;
import com.smartgridready.ns.v0.SGrRestAPIDataPointType;
import com.smartgridready.ns.v0.SGrRestAPIDeviceFrame;
import com.smartgridready.ns.v0.SGrRestAPIFunctionalProfileType;
import communicator.common.impl.SGrDeviceBase;
import communicator.common.runtime.GenDriverException;
import communicator.rest.api.GenDeviceApi4Rest;
import communicator.rest.exception.RestApiAuthenticationException;
import communicator.rest.exception.RestApiResponseParseException;
import communicator.rest.exception.RestApiServiceCallException;
import communicator.rest.http.authentication.Authenticator;
import communicator.rest.http.authentication.AuthenticatorFactory;
import communicator.rest.http.authentication.DummyHttpAuthenticator;
import communicator.rest.http.client.RestServiceClient;
import communicator.rest.http.client.RestServiceClientFactory;
import communicator.rest.http.client.RestServiceClientUtils;
import io.burt.jmespath.Expression;
import io.burt.jmespath.JmesPath;
import io.burt.jmespath.jackson.JacksonRuntime;
import io.vavr.control.Either;
import org.apache.hc.core5.http.HttpHeaders;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Optional;
import java.util.Properties;

public class SGrRestApiDevice extends SGrDeviceBase<
		SGrRestAPIDeviceFrame,
		SGrRestAPIFunctionalProfileType,
		SGrRestAPIDataPointType> implements GenDeviceApi4Rest {
	
	private static final Logger LOG = LoggerFactory.getLogger(SGrRestApiDevice.class);
	
	private final SGrRestAPIDeviceFrame deviceDescription;
	private Authenticator httpAuthenticator;
	private final RestServiceClientFactory restServiceClientFactory;
	
	public SGrRestApiDevice(SGrRestAPIDeviceFrame deviceDescription, RestServiceClientFactory restServiceClientFactory) {
		super(deviceDescription);
		this.deviceDescription = deviceDescription;
		this.restServiceClientFactory = restServiceClientFactory;
		this.httpAuthenticator = new DummyHttpAuthenticator();
	}	
	
	public void authenticate() throws RestApiAuthenticationException, IOException, RestApiServiceCallException, RestApiResponseParseException {
		SGrRestAPIAuthenticationEnumMethodType authMethod = 
				deviceDescription.getRestAPIInterfaceDesc().getRestAPIAuthenticationMethod();
				httpAuthenticator = AuthenticatorFactory.getAuthenticator(authMethod);
				httpAuthenticator.getAuthorizationHeaderValue(deviceDescription, restServiceClientFactory);
	}
		
	@Override
	public String getVal(String profileName, String dataPointName)
			throws IOException, RestApiServiceCallException, RestApiResponseParseException, GenDriverException {
		return setVal(profileName, dataPointName, null);
	}

	@Override
	public String setVal(String profileName, String dataPointName, String value)
			throws IOException, RestApiServiceCallException, RestApiResponseParseException, GenDriverException {
		Optional<SGrRestAPIDataPointType> dataPointOpt = findProfileDataPoint(profileName, dataPointName);
		if (dataPointOpt.isPresent()) {
			return doReadWriteVal(dataPointOpt.get(), value);
		} else {
			return "Profile/access-point " + profileName + "/" + dataPointName + " not found!";
		}						
	}

	private String doReadWriteVal(SGrRestAPIDataPointType dataPoint, String value)
			throws IOException, RestApiServiceCallException, RestApiResponseParseException, GenDriverException {
		
		String host = deviceDescription.getRestAPIInterfaceDesc().getTrspSrvRestURIoutOfBox();
		
		Optional<SGrRestAPIDataPointDescriptionType> dpDescriptionOpt
				= Optional.ofNullable(dataPoint.getRestAPIDataPoint().get(0));

		Properties substitutions = new Properties();
		if (dpDescriptionOpt.isPresent()) {

			if (value != null) {
				checkOutOfRange(value, dataPoint);
				substitutions.put("value", value);
			}

			SGrRestAPIDataPointDescriptionType dpDescription = dpDescriptionOpt.get();
			RestServiceCall serviceCall = dpDescription.getRestServiceCall();
			RestServiceClient restServiceClient = restServiceClientFactory.create(host, serviceCall, substitutions);
			String response = handleServiceCall(restServiceClient, httpAuthenticator.isTokenRenewalSupported());

			if (value == null) {
				return parseJsonResponse(serviceCall.getResponseQuery().getQuery(), response);
			}
			return response;
		}
		return "Missing 'restAPIDataPoint' description in device description XML file";
	}	

	private String handleServiceCall(RestServiceClient serviceClient, boolean tryTokenRenewal) throws IOException, RestApiServiceCallException, RestApiResponseParseException {
		
		serviceClient.addHeader(HttpHeaders.AUTHORIZATION, httpAuthenticator.getAuthorizationHeaderValue(deviceDescription, restServiceClientFactory));
		
		if (LOG.isDebugEnabled()) {
			LOG.debug("Calling REST service: {} - {}", 
						serviceClient.getBaseUri(), 
						RestServiceClientUtils.printServiceCall(serviceClient.getRestServiceCall()));
		}
		
		Either<HttpResponse, String> result = serviceClient.callService();		
		if (result.isRight()) {
			LOG.debug("Received response: {}", result.get());
			return result.get();
		} else if (tryTokenRenewal && result.getLeft().getCode() == HttpStatus.SC_UNAUTHORIZED) {
			LOG.info("Authorisation error received. Trying with token renewal");
			httpAuthenticator.renewToken(deviceDescription, restServiceClientFactory);
			serviceClient.addHeader(HttpHeaders.AUTHORIZATION, httpAuthenticator.getAuthorizationHeaderValue(deviceDescription, restServiceClientFactory));
			// recurse into handleServiceCall, set tryTokenRenewal always to false here!
			return handleServiceCall(serviceClient, false); 
		} else {
			throw new RestApiServiceCallException(result.getLeft());
		}
	}
	

	private String parseJsonResponse(String jmesPath, String jsonResp) throws RestApiResponseParseException {
		
		if (jmesPath.trim().isEmpty()) {
			// no parsing required
			return jsonResp;
		}
		
		JmesPath<JsonNode> path = new JacksonRuntime();
		Expression<JsonNode> expression = path.compile(jmesPath);

		ObjectMapper mapper = new ObjectMapper();

		try {
			JsonNode jsonNode = mapper.readTree(jsonResp);			
			JsonNode res = expression.search(jsonNode);
			return res.asText();
		} catch (IOException e) {
			throw new RestApiResponseParseException("Parsing JSON response failed: " + e.getMessage(), e);
		}
	}

	private Optional<SGrRestAPIDataPointType> findProfileDataPoint(String profileName, String dataPointName) {
		
		Optional<SGrRestAPIFunctionalProfileType> profile = findProfile(profileName);
		if (profile.isPresent()) {
			Optional<SGrRestAPIDataPointType> dataPoint = findDataPointForProfile(profile.get(), dataPointName);
			if (dataPoint.isPresent()) {
				return dataPoint;
			}
		}
		return Optional.empty();
	}
	
	protected Optional<SGrRestAPIFunctionalProfileType> findProfile(String profileName) {
		return deviceDescription.getFpListElement().stream().filter(
				restApiProfileFrame -> restApiProfileFrame.getFunctionalProfile().getProfileName().equals(profileName))
				.findFirst();
	}

	protected Optional<SGrRestAPIDataPointType> findDataPointForProfile(SGrRestAPIFunctionalProfileType aProfile,
			String aDataPointName) {
		return aProfile.getDpListElement().stream()
				.filter(datapoint -> datapoint.getDataPoint().getDatapointName().equals(aDataPointName))
				.findFirst();				
	}
}
