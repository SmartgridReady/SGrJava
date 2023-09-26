package communicator.common.helper;

import com.smartgridready.ns.v0.DeviceFrame;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.ConfigurationLoader;
import utils.TestConfiguration;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class DeviceDescriptionLoaderTest {

	private static final Logger LOG = LoggerFactory.getLogger(DeviceDescriptionLoaderTest.class);
	
	@Test
	void testLoadDeviceDescriptions() throws Exception {

		TestConfiguration config = new ConfigurationLoader<TestConfiguration>()
				.load("devicedescriptions.yaml", TestConfiguration.class);
		
		String folder = config.getDeviceDescFolder();
		Collection<TestConfiguration.Description> files = config.getDescriptions();
		
		files.forEach( desc -> assertDoesNotThrow(() -> {
			LOG.info("Loading file: " + desc.file);
			DeviceDescriptionLoader<?> loader = new DeviceDescriptionLoader<>();
			DeviceFrame deviceDesc = (DeviceFrame) loader.load(folder, desc.file);
			LOG.info("Loaded device" + deviceDesc.getDeviceName() + " - " + deviceDesc.getManufacturerName() + "\n");
		}));
	}
}
