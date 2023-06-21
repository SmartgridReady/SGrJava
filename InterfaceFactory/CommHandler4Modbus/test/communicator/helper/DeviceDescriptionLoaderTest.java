package communicator.helper;

import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.smartgridready.ns.v0.SGrContactAPIDeviceFrame;
import com.smartgridready.ns.v0.SGrModbusDeviceFrame;
import com.smartgridready.ns.v0.SGrRestAPIDeviceFrame;

import utils.ConfigurationLoader;
import utils.TestConfiguration;

public class DeviceDescriptionLoaderTest {

	private static final Logger LOG = LoggerFactory.getLogger(DeviceDescriptionLoaderTest.class);
	
	@Test
	public void testLoadDeviceDescriptions() throws Exception {
			
		TestConfiguration config = new ConfigurationLoader<TestConfiguration>()
				.load("./test/communicator/helper/devicedescriptions.yaml", TestConfiguration.class);
		
		String folder = config.getDeviceDescFolder();
		Collection<TestConfiguration.Description> files = config.getDescriptions();
		
		files.forEach( desc -> { 
			
			try {

				LOG.info("Loading file: " + desc.file);
				
				DeviceDescriptionLoader<?> loader = new DeviceDescriptionLoader<>();
				Object deviceDesc = loader.load(folder, desc.file);
				
				if (deviceDesc instanceof SGrModbusDeviceFrame) {
					SGrModbusDeviceFrame device = ((SGrModbusDeviceFrame)deviceDesc);
					System.out.println("Loaded MODBUS device" + device.getDeviceName() + " - " + device.getManufacturerName() + "\n");
				} else if ( deviceDesc instanceof SGrRestAPIDeviceFrame) {
					SGrRestAPIDeviceFrame device = ((SGrRestAPIDeviceFrame)deviceDesc);
					System.out.println("Loaded RESTAPI device" + device.getDeviceName() + " - " + device.getManufacturerName() + "\n");
				} else if ( deviceDesc instanceof SGrContactAPIDeviceFrame) {
					SGrContactAPIDeviceFrame device = ((SGrContactAPIDeviceFrame)deviceDesc);
					System.out.println("Loaded CONTACT device" + device.getDeviceName() + " - " + device.getManufacturerName() + "\n");
				} else {
					System.out.println("Device type " + deviceDesc.getClass().getName() + " not supported yet.");
				}
			} catch ( Exception e) {
				LOG.error( "Unable to load file: " + desc.file + "\n");
			}
		});				
	}
	

}
