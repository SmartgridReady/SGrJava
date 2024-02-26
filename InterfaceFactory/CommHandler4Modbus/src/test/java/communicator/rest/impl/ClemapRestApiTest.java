package communicator.rest.impl;

import com.smartgridready.ns.v0.DeviceFrame;
import communicator.common.api.StringValue;
import communicator.common.helper.DeviceDescriptionLoader;
import communicator.rest.api.GenDeviceApi4Rest;
import communicator.rest.exception.RestApiAuthenticationException;
import communicator.rest.exception.RestApiResponseParseException;
import communicator.rest.exception.RestApiServiceCallException;
import communicator.rest.http.client.ApacheRestServiceClientFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;

@Disabled("Neeeds a real device")
class ClemapRestApiTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(ClemapRestApiTest.class);

	private static final String XML_BASE_DIR="../../../SGrSpecifications/XMLInstances/ExtInterfaces/";
	
	private static final String METER_GROUP_CONFIG_JSON = "{\r\n"
			+ "    \"name\": \"ErgoMeters\",\r\n"
			+ "    \"description\": \"Meter group for tests\",\r\n"
			+ "    \"address\": {},\r\n"
			+ "    \"coordinates\": {},\r\n"
			+ "    \"group_measuring_point\": false,\r\n"
			+ "    \"sensor_ids\": [],\r\n"
			+ "    \"user_ids\": [\"636e081e4195a677ca6190be\"],\r\n"
			+ "    \"organization_ids\": [],\r\n"
			+ "    \"virtual_meter_point\": false\r\n"
			+ "}";
	
	@Test
	@SuppressWarnings("squid:S2699")
	void testClemapRead() throws Exception {
		
		Properties props = new Properties();
		props.put("username", "hfurrer@ergonomics.ch");
		props.put("password", "Holdrio99");
		props.put("baseUri", "https://cloud.clemap.com:3032");
		props.put("sensor_id", "63343431ecf2cf013a1e5a9f");
		
	
		DeviceDescriptionLoader<DeviceFrame> loader = new DeviceDescriptionLoader<>();
		
		DeviceFrame clemapDeviceDesc = loader.load(XML_BASE_DIR, "SGr_02_0018_CLEMAP_EIcloudEnergyMonitor_V1.0.0.xml", props);
		GenDeviceApi4Rest clemapMonitor =  new SGrRestApiDevice(clemapDeviceDesc, new ApacheRestServiceClientFactory());
 
		try {
			clemapMonitor.authenticate();
			LOG.info("ACtot: " + clemapMonitor.getVal("ActivePowerAC", "ActivePowerACtot"));
			LOG.info("ACL1 : " + clemapMonitor.getVal("ActivePowerAC", "ActivePowerACL1"));
			LOG.info("ACL2 : " + clemapMonitor.getVal("ActivePowerAC", "ActivePowerACL2"));
			LOG.info("ACL3 : " + clemapMonitor.getVal("ActivePowerAC", "ActivePowerACL3"));
			
		} catch (RestApiAuthenticationException | RestApiServiceCallException | RestApiResponseParseException | IOException e) {
			LOG.info("Error: " + e.getMessage());
			throw e;
		}						
	}

	@Disabled("needs a Clemap EI-XML that contains a 'Configuration/CreateMeterGroup' profile")
	@Test
	@SuppressWarnings("squid:S2699")
	void testClemapWrite() throws Exception {
		
		Properties props = new Properties();
		
		props.put("username", "hfurrer@ergonomics.ch");
		props.put("password", "Holdrio99");
		props.put("baseUri", "https://b1.cloud.clemap.com:3032");

		DeviceDescriptionLoader<DeviceFrame> loader = new DeviceDescriptionLoader<>();
		
		DeviceFrame clemapDeviceDesc = loader.load(XML_BASE_DIR, "SGr_04_0018_CLEMAP_EIcloudEnergyMonitorV0.2.1.xml", props);
		SGrRestApiDevice clemapConfigurator =  new SGrRestApiDevice(clemapDeviceDesc, new ApacheRestServiceClientFactory());
		
		try {
			clemapConfigurator.authenticate();
			clemapConfigurator.setVal("Configuration", "CreateMeterGroup", StringValue.of(METER_GROUP_CONFIG_JSON));
		} catch (RestApiAuthenticationException | RestApiServiceCallException | RestApiResponseParseException | IOException e) {
			LOG.info("Error: " + e.getMessage());
			throw e;
		}
	}	
}
