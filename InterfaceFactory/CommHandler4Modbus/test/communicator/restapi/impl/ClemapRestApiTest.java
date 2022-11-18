package communicator.restapi.impl;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.smartgridready.ns.v0.SGrRestAPIDeviceFrame;

import communicator.helper.DeviceDescriptionLoader;
import communicator.restapi.exception.RestApiAuthenticationException;
import communicator.restapi.exception.RestApiResponseParseException;
import communicator.restapi.exception.RestApiServiceCallException;
import communicator.restapi.http.client.ApacheRestServiceClientFactory;
import communicator.restapi.impl.SGrRestApiDevice;

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
			+ "    \"user_ids\": [\"hfurrer@ergonomics.ch\"],\r\n"
			+ "    \"organization_ids\": [\"63343431ecf2cf013a1e5a9f\"],\r\n"
			+ "    \"virtual_meter_point\": false\r\n"
			+ "}";
	
	@Test
	void testClemapRead() throws Exception {
		
		Properties props = new Properties();
		props.put("username", "hfurrer@ergonomics.ch");
		props.put("password", "Holdrio99");
		props.put("baseUri", "https://cloud.clemap.com:3032");
		props.put("sensor_id", "63343431ecf2cf013a1e5a9f");
		
	
		DeviceDescriptionLoader<SGrRestAPIDeviceFrame> loader = new DeviceDescriptionLoader<>();						
		
		SGrRestAPIDeviceFrame clemapDeviceDesc = loader.load(XML_BASE_DIR, "SGr_04_0018_CLEMAP_EIcloudEnergyMonitorV0.2.1.xml", props);	
		SGrRestApiDevice clemapMonitor =  new SGrRestApiDevice(clemapDeviceDesc, new ApacheRestServiceClientFactory());
 
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
	
	@Disabled
	@Test
	void testClemapWrite() throws Exception {
		
		Properties props = new Properties();
		
		props.put("username", "hfurrer@ergonomics.ch");
		props.put("password", "Holdrio99");
		props.put("baseUri", "https://b1.cloud.clemap.com:3032");

		DeviceDescriptionLoader<SGrRestAPIDeviceFrame> loader = new DeviceDescriptionLoader<>();						
		
		SGrRestAPIDeviceFrame clemapDeviceDesc = loader.load(XML_BASE_DIR, "SGr_04_0018_CLEMAP_EIcloudMeterGroupV0.2.1.xml", props);	
		SGrRestApiDevice clemapConfigurator =  new SGrRestApiDevice(clemapDeviceDesc, new ApacheRestServiceClientFactory());
		
		try {
			clemapConfigurator.authenticate();
			LOG.info("Response: {}", clemapConfigurator.setVal("Configuration", "CreateMeterGroup", METER_GROUP_CONFIG_JSON));
		} catch (RestApiAuthenticationException | RestApiServiceCallException | RestApiResponseParseException | IOException e) {
			LOG.info("Error: " + e.getMessage());
			throw e;
		}
	}	
}
