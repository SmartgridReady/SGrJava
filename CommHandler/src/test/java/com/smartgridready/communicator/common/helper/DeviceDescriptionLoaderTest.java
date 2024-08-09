package com.smartgridready.communicator.common.helper;

import com.smartgridready.ns.v0.DeviceFrame;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.ConfigurationLoader;
import utils.TestConfiguration;

import java.io.File;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class DeviceDescriptionLoaderTest {

	private static final Logger LOG = LoggerFactory.getLogger(DeviceDescriptionLoaderTest.class);

	// Tests do not run on the build pipeline. The EI-XML are not available.
	static boolean isWin() {
		return System.getProperty("os.name").toLowerCase(Locale.ROOT).contains("win");
	}
	
	@Test
	@EnabledIf("isWin")
	void testLoadDeviceDescriptionsFromFiles() throws Exception {

		TestConfiguration config = new ConfigurationLoader<TestConfiguration>()
				.load("devicedescriptions.yaml", TestConfiguration.class);
		
		String folder = config.getDeviceDescFolder();
		Collection<TestConfiguration.Description> files = config.getDescriptions();
		
		files.forEach(desc -> assertDoesNotThrow(() -> {
			LOG.info("Loading file: " + desc.file);
			DeviceDescriptionLoader loader = new DeviceDescriptionLoader();
			DeviceFrame deviceDesc = loader.load(folder, desc.file);
			LOG.info("Loaded device" + deviceDesc.getDeviceName() + " - " + deviceDesc.getManufacturerName() + "\n");
		}));
	}

	@Test
	@EnabledIf("isWin")
	void testLoadDeviceDescriptionsFromStreams() throws Exception {

		TestConfiguration config = new ConfigurationLoader<TestConfiguration>()
				.load("devicedescriptions.yaml", TestConfiguration.class);
		
		String folder = config.getDeviceDescFolder();
		Collection<TestConfiguration.Description> files = config.getDescriptions();
		
		files.forEach(desc -> assertDoesNotThrow(() -> {
			LOG.info("Loading file: " + desc.file);
			DeviceDescriptionLoader loader = new DeviceDescriptionLoader();
			InputStream is = FileUtils.openInputStream(new File(folder + File.separator + desc.file));
			DeviceFrame deviceDesc = loader.load(desc.file, is);
			LOG.info("Loaded device" + deviceDesc.getDeviceName() + " - " + deviceDesc.getManufacturerName() + "\n");
		}));
	}

	@Test
	@EnabledIf("isWin")
	void testLoadDeviceDescriptionsFromStrings() throws Exception {

		TestConfiguration config = new ConfigurationLoader<TestConfiguration>()
				.load("devicedescriptions.yaml", TestConfiguration.class);
		
		String folder = config.getDeviceDescFolder();
		Collection<TestConfiguration.Description> files = config.getDescriptions();
		
		files.forEach(desc -> assertDoesNotThrow(() -> {
			LOG.info("Loading file: " + desc.file);
			DeviceDescriptionLoader loader = new DeviceDescriptionLoader();
			String xml = FileUtils.readFileToString(new File(folder + File.separator + desc.file), StandardCharsets.UTF_8);
			DeviceFrame deviceDesc = loader.load(xml);
			LOG.info("Loaded device" + deviceDesc.getDeviceName() + " - " + deviceDesc.getManufacturerName() + "\n");
		}));
	}
}
