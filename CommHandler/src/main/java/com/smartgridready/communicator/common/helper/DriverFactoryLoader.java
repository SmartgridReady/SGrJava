package com.smartgridready.communicator.common.helper;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ServiceLoader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.smartgridready.driver.api.contacts.GenDriverAPI4ContactsFactory;
import com.smartgridready.driver.api.http.GenHttpClientFactory;
import com.smartgridready.driver.api.messaging.GenMessagingClientFactory;
import com.smartgridready.driver.api.messaging.model.MessagingPlatformType;
import com.smartgridready.driver.api.modbus.GenDriverAPI4ModbusFactory;

public class DriverFactoryLoader {

    private static final Logger LOG = LoggerFactory.getLogger(DriverFactoryLoader.class);

    public static List<GenDriverAPI4ModbusFactory> getAllModbusDrivers() {
        return getImplementations(GenDriverAPI4ModbusFactory.class);
    }

    public static List<GenHttpClientFactory> getAllRestApiDrivers() {
        return getImplementations(GenHttpClientFactory.class);
    }

    public static List<GenMessagingClientFactory> getAllMessagingDrivers() {
        return getImplementations(GenMessagingClientFactory.class);
    }

    public static List<GenDriverAPI4ContactsFactory> getAllContactsDrivers() {
        return getImplementations(GenDriverAPI4ContactsFactory.class);
    }

    public static GenDriverAPI4ModbusFactory getModbusDriver() {
        return getAllModbusDrivers().stream().findFirst().orElse(null);
    }

    public static GenHttpClientFactory getRestApiDriver() {
        return getAllRestApiDrivers().stream().findFirst().orElse(null);
    }

    public static GenMessagingClientFactory getMessagingDriver(MessagingPlatformType platform) {
        return getAllMessagingDrivers()
            .stream()
            .filter(f -> f.getSupportedPlatforms().contains(platform))
            .findFirst()
            .orElse(null);
    }

    public static GenDriverAPI4ContactsFactory getContactsDriver() {
        return getAllContactsDrivers().stream().findFirst().orElse(null);
    }

    private static <T> List<T> getImplementations(Class<T> clazz) {
        try {
            ServiceLoader<T> services = ServiceLoader.load(clazz);

            List<T> implementations = new LinkedList<>();
            Iterator<T> iter = services.iterator();
            while (iter.hasNext()) {
                implementations.add(iter.next());
            }

            return implementations;
        } catch (Exception e) {
            LOG.warn("Could not load implementations of '%s': %s", clazz.getName(), e.getMessage());
        }

        return Collections.emptyList();
    }

    private DriverFactoryLoader() {}
}
