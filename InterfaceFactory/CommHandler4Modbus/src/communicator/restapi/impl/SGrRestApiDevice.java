package communicator.restapi.impl;

import java.io.IOException;
import java.util.Optional;
import java.util.Properties;

import org.apache.commons.codec.binary.StringUtils;
import org.apache.hc.core5.http.HttpHeaders;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smartgridready.ns.v0.RestServiceCall;
import com.smartgridready.ns.v0.SGrRestAPIAuthenticationEnumMethodType;
import com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType;
import com.smartgridready.ns.v0.SGrRestAPIDataPointType;
import com.smartgridready.ns.v0.SGrRestAPIDeviceFrame;
import com.smartgridready.ns.v0.SGrRestAPIFunctionalProfileType;

import communicator.restapi.exception.RestApiAuthenticationException;
import communicator.restapi.exception.RestApiResponseParseException;
import communicator.restapi.exception.RestApiServiceCallException;
import communicator.restapi.http.authentication.Authenticator;
import communicator.restapi.http.authentication.AuthenticatorFactory;
import communicator.restapi.http.authentication.DummyHttpAuthenticator;
import communicator.restapi.http.client.RestServiceClient;
import communicator.restapi.http.client.RestServiceClientFactory;
import communicator.restapi.http.client.RestServiceClientUtils;
import io.burt.jmespath.Expression;
import io.burt.jmespath.JmesPath;
import io.burt.jmespath.jackson.JacksonRuntime;
import io.vavr.control.Either;

public class SGrRestApiDevice {
	
	private static final Logger LOG = LoggerFactory.getLogger(SGrRestApiDevice.class);
	
	private final SGrRestAPIDeviceFrame deviceDescription;
	private Authenticator httpAuthenticator;
	private RestServiceClientFactory restServiceClientFactory;
	
	public SGrRestApiDevice(SGrRestAPIDeviceFrame deviceDescription, RestServiceClientFactory restServiceClientFactory) {
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
		
	public String getVal(String profileName, String dataPointName) throws IOException, RestApiServiceCallException, RestApiResponseParseException {		
		Optional<ProfileDataPoint> profileDpOpt = findProfileDataPoint(profileName, dataPointName);	
		if (profileDpOpt.isPresent()) {
			return doReadWriteVal(profileDpOpt.get(), Optional.empty());
		} else {
			return "Profile/access-point " + profileName + "/" + dataPointName + " not found!";
		}
	}
	
	public String setVal(String profileName, String dataPointName, String value) throws IOException, RestApiServiceCallException, RestApiResponseParseException {
		Optional<ProfileDataPoint> profileDpOpt = findProfileDataPoint(profileName, dataPointName);	
		if (profileDpOpt.isPresent()) {
			return doReadWriteVal(profileDpOpt.get(), Optional.of(value));
		} else {
			return "Profile/access-point " + profileName + "/" + dataPointName + " not found!";
		}						
	}

	private String doReadWriteVal(ProfileDataPoint profileDp, Optional<String> value) throws IOException, RestApiServiceCallException, RestApiResponseParseException {
		
		String host = deviceDescription.getRestAPIInterfaceDesc().getTrspSrvRestURIoutOfBox();
		
		Optional<SGrRestAPIDataPointDescriptionType> dpDescriptionOpt 
		= Optional.ofNullable(profileDp.getDp().getRestAPIDataPoint().get(0));
		
		if (dpDescriptionOpt.isPresent()) {
			
			Properties substitutions = new Properties();
			if (value.isPresent()) {
				substitutions.put("value", value.get());
			}
			
			SGrRestAPIDataPointDescriptionType dpDescription = dpDescriptionOpt.get();
			RestServiceCall serviceCall = dpDescription.getRestServiceCall();
			RestServiceClient restServiceClient = restServiceClientFactory.create(host, serviceCall, substitutions);
			String response = handleServiceCall(restServiceClient, httpAuthenticator.isTokenRenewalSupported());
			return parseJsonResponse(serviceCall.getResponseQuery().getQuery(), response);
		}
		return "Missing 'restAPIDataPoint' description in device description XML file";
	}	

	private String handleServiceCall(RestServiceClient serviceClient, boolean tryTokenRenewal) throws IOException, RestApiServiceCallException, RestApiResponseParseException {
		
		serviceClient.addHeader(HttpHeaders.AUTHORIZATION, httpAuthenticator.getAuthorizationHeaderValue(deviceDescription, restServiceClientFactory));
		
		if (LOG.isInfoEnabled()) {
			LOG.info("Calling REST service: {} - {}", 
						serviceClient.getBaseUri(), 
						RestServiceClientUtils.printServiceCall(serviceClient.getRestServiceCall()));
		}
		
		Either<HttpResponse, String> result = serviceClient.callService();		
		if (result.isRight()) {
			LOG.info("Received response: {}", result.get());
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

	
	private Optional<ProfileDataPoint> findProfileDataPoint(String profileName, String dataPointName) {
		
		Optional<SGrRestAPIFunctionalProfileType> profile = findProfile(profileName);
		if (profile.isPresent()) {
			Optional<SGrRestAPIDataPointType> dataPoint = findDataPointForProfile(profile.get(), dataPointName);
			if (dataPoint.isPresent()) {
				return Optional.of(new ProfileDataPoint(profile.get(), dataPoint.get()));
			}
		}
		return Optional.empty();
	}
	
	private Optional<SGrRestAPIFunctionalProfileType> findProfile(String profileName) {
		return deviceDescription.getFpListElement().stream().filter(
				modbusProfileFrame -> modbusProfileFrame.getFunctionalProfile().getProfileName().equals(profileName))
				.findFirst();
	}

	private Optional<SGrRestAPIDataPointType> findDataPointForProfile(SGrRestAPIFunctionalProfileType aProfile,
			String aDataPointName) {
		return aProfile.getDpListElement().stream()
				.filter(datapoint -> datapoint.getDataPoint().getDatapointName().equals(aDataPointName))
				.findFirst();				
	}
	
	private static class ProfileDataPoint {
		
		private final SGrRestAPIFunctionalProfileType fp;	// functional profile
		private final SGrRestAPIDataPointType dp;			// datapoint				
		
		public ProfileDataPoint(SGrRestAPIFunctionalProfileType fp, SGrRestAPIDataPointType dp) {
			super();
			this.fp = fp;
			this.dp = dp;
		}
		
		public SGrRestAPIFunctionalProfileType getFp() {
			return fp;
		}
		
		public SGrRestAPIDataPointType getDp() {
			return dp;
		}					
	}	
}
