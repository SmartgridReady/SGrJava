package com.smartgridready.communicator.generic.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URL;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.smartgridready.communicator.common.api.GenDeviceApi;
import com.smartgridready.communicator.common.api.values.Int32Value;
import com.smartgridready.communicator.common.api.values.Value;
import com.smartgridready.communicator.common.helper.DeviceDescriptionLoader;
import com.smartgridready.driver.api.common.GenDriverException;
import com.smartgridready.ns.v0.DeviceFrame;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(value = MockitoExtension.class)
public class SGrGenericDeviceTest {
    
    private static final Logger LOG = LoggerFactory.getLogger(SGrGenericDeviceTest.class);

    static DeviceFrame deviceFrame;

	@BeforeAll
	static void initDeviceFrame() {
		deviceFrame = createSGrGenericDeviceFrame();
	}

    @Test
    void testGetValSuccess() throws Exception {

        // when
		GenDeviceApi device = new SGrGenericDevice(deviceFrame);
		Value res = device.getVal("Test", "TestConst");
		
		// then		
		assertEquals(1337, res.getInt32());
    }

    @Test
    void testSetValFail() throws Exception {

        // when
		GenDeviceApi device = new SGrGenericDevice(deviceFrame);

        // then
        assertThrows(GenDriverException.class, () -> device.setVal("Test", "TestConst", Int32Value.of(1337)));
    }

    private static DeviceFrame createSGrGenericDeviceFrame() {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		URL devDescUrl = classloader.getResource("test_eid_generic_V0.1.xml");

        DeviceDescriptionLoader loader = new DeviceDescriptionLoader();
		return loader.load("", Optional.ofNullable(devDescUrl).map(URL::getPath).orElse(""), null);
    }
}
