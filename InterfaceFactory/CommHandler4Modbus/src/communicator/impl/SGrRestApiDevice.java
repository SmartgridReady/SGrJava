package communicator.impl;

import java.io.IOException;
import java.util.Optional;

import org.apache.hc.core5.http.HttpHeaders;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.HttpStatus;
import org.apache.hc.core5.http.MethodNotSupportedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smartgridready.ns.v0.SGrRestAPIAuthenticationEnumMethodType;
import com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType;
import com.smartgridready.ns.v0.SGrRestAPIDataPointType;
import com.smartgridready.ns.v0.SGrRestAPIDeviceFrame;
import com.smartgridready.ns.v0.SGrRestAPIFunctionalProfileType;

import communicator.common.runtime.GenDriverException;
import communicator.http.authentication.Authenticator;
import communicator.http.authentication.AuthenticatorFactory;
import communicator.http.authentication.DummyHttpAuthenticator;
import communicator.http.client.ApacheRestServiceClient;
import communicator.http.client.RestServiceClient.HttpMethod;
import io.burt.jmespath.Expression;
import io.burt.jmespath.JmesPath;
import io.burt.jmespath.jackson.JacksonRuntime;
import io.vavr.control.Either;

public class SGrRestApiDevice {
	
	private static final Logger LOG = LoggerFactory.getLogger(SGrRestApiDevice.class);
	
	private final SGrRestAPIDeviceFrame deviceDescription;
	private Authenticator httpAuthenticator;
	
	public SGrRestApiDevice(SGrRestAPIDeviceFrame deviceDescription) {
		this.deviceDescription = deviceDescription;
		this.httpAuthenticator = new DummyHttpAuthenticator();		
	}
	
	
	public void authenticate() throws GenDriverException {
		SGrRestAPIAuthenticationEnumMethodType authMethod = 
				deviceDescription.getRestAPIInterfaceDesc().getRestAPIAuthenticationMethod();

			try {
				httpAuthenticator = AuthenticatorFactory.getAuthenticator(authMethod);
			} catch (MethodNotSupportedException | ReflectiveOperationException e) {
				throw new GenDriverException("Authenticator instantiation failed: " + e.getMessage(), e);
			}
	}
	
	
	public String getVal(String profileName, String dataPointName) throws GenDriverException {		
		Optional<ProfileDataPoint> profileDpOpt = findProfileDataPoint(profileName, dataPointName);	
		if (profileDpOpt.isPresent()) {
			return readVal(profileDpOpt.get());
		} else {
			return "Profile/access-point " + profileName + "/" + dataPointName + " not found!";
		}
	}
	
	
	public String readVal(ProfileDataPoint profileDp) throws GenDriverException {	
		
		String host = deviceDescription.getRestAPIInterfaceDesc().getTrspSrvRestURIoutOfBox();
		
		Optional<SGrRestAPIDataPointDescriptionType> dpDescriptionOpt 
			= Optional.ofNullable(profileDp.getDp().getRestAPIDataPoint().get(0));
				
		if (dpDescriptionOpt.isPresent()) {
			
			SGrRestAPIDataPointDescriptionType dpDescription = dpDescriptionOpt.get();
			ApacheRestServiceClient restServiceClient = new ApacheRestServiceClient("https://" + host, HttpMethod.GET);
			restServiceClient.setRequestPath(dpDescription.getRestAPIEndPoint());
			try {
				String response = handleServiceCall(restServiceClient, httpAuthenticator.isTokenRenewalSupported());
				return parseJsonResponse(dpDescription, response);				
			} catch (IOException e) {
				throw new GenDriverException("Read value failed: " + e.getMessage(), e);
			}			
		}		
		return "Missing datapoint description";
	}
	
	private String handleServiceCall(ApacheRestServiceClient serviceClient, boolean tryTokenRenewal) throws IOException, GenDriverException {
		
		serviceClient.addHeader(HttpHeaders.AUTHORIZATION, httpAuthenticator.getAuthorizationHeaderValue(deviceDescription));
		
		Either<HttpResponse, String> result = serviceClient.callService();		
		if (result.isRight()) {
			return result.get();
		} else if (tryTokenRenewal && result.getLeft().getCode() == HttpStatus.SC_UNAUTHORIZED) {
			LOG.info("Authorisation error received. Trying with token renewal");
			httpAuthenticator.renewToken(deviceDescription);
			serviceClient.addHeader(HttpHeaders.AUTHORIZATION, httpAuthenticator.getAuthorizationHeaderValue(deviceDescription));
			// recurse into handleServiceCall, set tryTokenRenewal always to false here!
			handleServiceCall(serviceClient, false); 
		} else {
			handleServiceCallError(result.getLeft());
		}
		return null;
	}
	
	private void handleServiceCallError(HttpResponse response) throws GenDriverException {
		throw new GenDriverException(
				"REST service call failed. HttpStatus: " + 
				response.getCode() + 
				" - reason: " + response.getReasonPhrase());
	}
	

	private String parseJsonResponse(SGrRestAPIDataPointDescriptionType dpDescription, String jsonResp) 
	throws GenDriverException {

		JmesPath<JsonNode> path = new JacksonRuntime();
		Expression<JsonNode> expression = path.compile(dpDescription.getRestAPIJMESPath());
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			JsonNode jsonNode = mapper.readTree(jsonResp);			
			JsonNode res = expression.search(jsonNode);
			return res.asText();
		} catch (IOException e) {
			throw new GenDriverException("Parsing JSON response failed: " + e.getMessage(), e);
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
