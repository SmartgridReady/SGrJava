package communicator.impl;

import java.util.Properties;

import org.apache.hc.core5.http.MethodNotSupportedException;
import org.junit.jupiter.api.Test;

import com.smartgridready.ns.v0.SGrRestAPIDeviceFrame;

import communicator.helper.DeviceDescriptionLoader;

public class ClemapRestApiTester {

	private static final String XML_BASE_DIR="../../../SGrSpecifications/XMLInstances/ExtInterfaces/";
	
	@Test
	void testClemapRead() {
		
		Properties props = new Properties();
		props.put("username", "hfurrer@ergonomics.ch");
		props.put("password", "Holdrio99");
		props.put("sensor_id", "63343431ecf2cf013a1e5a9f");
		
	
		DeviceDescriptionLoader<SGrRestAPIDeviceFrame> loader = new DeviceDescriptionLoader<>();						
		
		SGrRestAPIDeviceFrame clemapDeviceDesc = loader.load(XML_BASE_DIR, "SGr_04_0018_CLEMAP_EIcloudEnergyMonitorV0.2.1.xml", props);	
		SGrRestApiDevice clemapMonitor =  new SGrRestApiDevice(clemapDeviceDesc);
 
		try {
			clemapMonitor.authenticate();
			System.out.println("ACtot: " + clemapMonitor.getVal("ActivePowerAC", "ActivePowerACtot"));
			System.out.println("ACL1 : " + clemapMonitor.getVal("ActivePowerAC", "ActivePowerACL1"));
			System.out.println("ACL2 : " + clemapMonitor.getVal("ActivePowerAC", "ActivePowerACL2"));
			System.out.println("ACL3 : " + clemapMonitor.getVal("ActivePowerAC", "ActivePowerACL3"));
			
		} catch (MethodNotSupportedException | ReflectiveOperationException e) {
			System.out.println("Error: " + e.getMessage());
		}						
	}
	
}
