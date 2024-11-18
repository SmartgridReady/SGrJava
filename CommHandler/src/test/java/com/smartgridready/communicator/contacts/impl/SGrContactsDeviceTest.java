package com.smartgridready.communicator.contacts.impl;

import java.net.URL;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.smartgridready.communicator.common.api.GenDeviceApi;
import com.smartgridready.communicator.common.api.values.EnumValue;
import com.smartgridready.communicator.common.api.values.Value;
import com.smartgridready.communicator.common.helper.DeviceDescriptionLoader;
import com.smartgridready.driver.api.contacts.GenDriverAPI4Contacts;
import com.smartgridready.driver.api.contacts.GenDriverAPI4ContactsFactory;
import com.smartgridready.ns.v0.DeviceFrame;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(value = MockitoExtension.class)
public class SGrContactsDeviceTest {
    
    private static final Logger LOG = LoggerFactory.getLogger(SGrContactsDeviceTest.class);

    private static final String VALUE_0 = "LD_NORMAL";
    private static final String VALUE_1 = "LD_REDUCED";
    private static final String VALUE_2 = "LD_LOCKED";
    private static final String VALUE_3 = "LD_MAX";

    // LSB-first (value = 01)
    private static final boolean[] RESP_1 = new boolean[] { true, false };
    private static final boolean[] RESP_2 = new boolean[] { false, true };

    private final ArgumentCaptor<boolean[]> boolCaptor1 = ArgumentCaptor.forClass(boolean[].class);

    @Mock
    GenDriverAPI4ContactsFactory contactsDriverFactory;

    @Mock
    GenDriverAPI4Contacts contactsDriver;

    static DeviceFrame deviceFrame;

	@BeforeAll
	static void initDeviceFrame() {
		deviceFrame = createSGrContactsDeviceFrame();
	}

    @Test
    void testGetValSuccess() throws Exception {

        // given
		when(contactsDriverFactory.create(anyInt(), anyLong())).thenReturn(contactsDriver);
        when(contactsDriver.readContacts(anyString(), anyString())).thenReturn(RESP_1);

        // when
		GenDeviceApi device = new SGrContactsDevice(deviceFrame, contactsDriverFactory);
        device.connect();

		Value res = device.getVal("SGCPFlexLoad", "SGCP_FeedInOutStateLv2");
		
		// then		
		assertEquals(VALUE_1, res.getEnum().getLiteral());
    }

    @Test
    void testSetValSuccess() throws Exception {

        // given
		when(contactsDriverFactory.create(anyInt(), anyLong())).thenReturn(contactsDriver);

        // when
		GenDeviceApi device = new SGrContactsDevice(deviceFrame, contactsDriverFactory);
        device.connect();

        // then
        assertDoesNotThrow(() -> device.setVal("SGCPFlexLoad", "SGCP_FeedInOutStateLv2", EnumValue.of(VALUE_2, 2L, "Locked")));

        verify(contactsDriver).writeContacts(anyString(), anyString(), boolCaptor1.capture());

        assertArrayEquals(RESP_2, boolCaptor1.getValue());
    }

    private static DeviceFrame createSGrContactsDeviceFrame() {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		URL devDescUrl = classloader.getResource("test_eid_contacts_V0.1.xml");

        DeviceDescriptionLoader loader = new DeviceDescriptionLoader();
		return loader.load("", Optional.ofNullable(devDescUrl).map(URL::getPath).orElse(""), null);
    }
}
