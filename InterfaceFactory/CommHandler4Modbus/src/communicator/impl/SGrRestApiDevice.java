package communicator.impl;

import java.io.IOException;
import java.util.Optional;

import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.client5.http.fluent.Response;
import org.apache.hc.core5.http.MethodNotSupportedException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smartgridready.ns.v0.SGrRestAPIAuthenticationEnumMethodType;
import com.smartgridready.ns.v0.SGrRestAPIDataPointDescriptionType;
import com.smartgridready.ns.v0.SGrRestAPIDataPointType;
import com.smartgridready.ns.v0.SGrRestAPIDeviceFrame;
import com.smartgridready.ns.v0.SGrRestAPIFunctionalProfileType;

import communicator.http.authentication.Authenticator;
import communicator.http.authentication.AuthenticatorFactory;
import communicator.http.authentication.DummyHttpAuthenticator;
import io.burt.jmespath.Expression;
import io.burt.jmespath.JmesPath;
import io.burt.jmespath.jackson.JacksonRuntime;

public class SGrRestApiDevice {
	
	private final SGrRestAPIDeviceFrame deviceDescription;
	private Authenticator httpAuthenticator;
	
	public SGrRestApiDevice(SGrRestAPIDeviceFrame deviceDescription) {
		this.deviceDescription = deviceDescription;
		this.httpAuthenticator = new DummyHttpAuthenticator();		
	}
	
	public void authenticate() throws MethodNotSupportedException, ReflectiveOperationException {
		SGrRestAPIAuthenticationEnumMethodType authMethod = 
				deviceDescription.getRestAPIInterfaceDesc().getRestAPIAuthenticationMethod();
		
		httpAuthenticator = AuthenticatorFactory.getAuthenticator(authMethod);
	}
	
	
	public String getVal(String profileName, String dataPointName) {		
		Optional<ProfileDataPoint> profileDpOpt = findProfileDataPoint(profileName, dataPointName);	
		if (profileDpOpt.isPresent()) {
			return readVal(profileDpOpt.get());
		} else {
			return "Profile/access-point " + profileName + "/" + dataPointName + " not found!";
		}
	}
	
	public String readVal(ProfileDataPoint profileDp) {	
		
		Optional<SGrRestAPIDataPointDescriptionType> dpDescriptionOpt 
			= Optional.ofNullable(profileDp.getDp().getRestAPIDataPoint().get(0));
		
		String host = deviceDescription.getRestAPIInterfaceDesc().getTrspSrvRestURIoutOfBox();
		
		if (dpDescriptionOpt.isPresent()) {
			
			SGrRestAPIDataPointDescriptionType dpDescription = dpDescriptionOpt.get();
			Request httpReq = Request.get("https://" + host + dpDescription.getRestAPIEndPoint());
			
			try {
				
				Response httpResp = httpAuthenticator.provideAuthenicationHeader(deviceDescription, httpReq).execute();
				String resp = httpResp.returnContent().asString();
				System.out.println("Server response: " + resp);
				
				JmesPath<JsonNode> path = new JacksonRuntime();
				Expression<JsonNode> expression = path.compile(dpDescription.getRestAPIJMESPath());
				
				ObjectMapper mapper = new ObjectMapper();
				JsonNode jsonNode = mapper.readTree(resp);
				
				JsonNode res = expression.search(jsonNode);
				return res.asText();
				
			} catch (IOException e) {
				return "Read datapoint failed: " + e.getMessage();
			}			
		}
		
		return "Missing datapoint description";
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
