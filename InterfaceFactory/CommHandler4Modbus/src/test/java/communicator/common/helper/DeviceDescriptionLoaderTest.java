package communicator.common.helper;

import com.smartgridready.ns.v0.DeviceFrame;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.ConfigurationLoader;
import utils.TestConfiguration;

import java.util.Collection;

public class DeviceDescriptionLoaderTest {

	private static final Logger LOG = LoggerFactory.getLogger(DeviceDescriptionLoaderTest.class);
	
	@Test
	public void testLoadDeviceDescriptions() throws Exception {

		TestConfiguration config = new ConfigurationLoader<TestConfiguration>()
				.load("devicedescriptions.yaml", TestConfiguration.class);
		
		String folder = config.getDeviceDescFolder();
		Collection<TestConfiguration.Description> files = config.getDescriptions();
		
		files.forEach( desc -> { 
			
			try {

				LOG.info("Loading file: " + desc.file);
				
				DeviceDescriptionLoader<?> loader = new DeviceDescriptionLoader<>();
				Object deviceDesc = loader.load(folder, desc.file);
				
				if (deviceDesc instanceof DeviceFrame) {
					DeviceFrame device = ((DeviceFrame)deviceDesc);
					System.out.println("Loaded MODBUS device" + device.getDeviceName() + " - " + device.getManufacturerName() + "\n");
				} else if ( deviceDesc instanceof DeviceFrame) {
					DeviceFrame device = ((DeviceFrame)deviceDesc);
					System.out.println("Loaded RESTAPI device" + device.getDeviceName() + " - " + device.getManufacturerName() + "\n");
				} else if ( deviceDesc instanceof DeviceFrame) {
					DeviceFrame device = ((DeviceFrame)deviceDesc);
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
