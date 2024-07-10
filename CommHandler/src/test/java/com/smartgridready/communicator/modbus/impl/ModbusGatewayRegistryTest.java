package com.smartgridready.communicator.modbus.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URL;
import java.util.Optional;
import java.util.Properties;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.smartgridready.ns.v0.DeviceFrame;

import com.smartgridready.communicator.common.helper.DeviceDescriptionLoader;
import communicator.common.runtime.GenDriverException;
import com.smartgridready.communicator.modbus.api.GenDeviceApi4Modbus;
import com.smartgridready.communicator.modbus.api.ModbusGatewayRegistry;

class ModbusGatewayRegistryTest {
   
    private ModbusGatewayRegistry modbusGatewayRegistry;

    @BeforeEach
    void setUp() {
        modbusGatewayRegistry = new SGrModbusGatewayRegistry(new MockModbusGatewayFactory());
    }

    @Test
    void testSingleRtuDevice() throws GenDriverException {
        assertEquals(0, modbusGatewayRegistry.getAllGatewayIdentifiers().size());

        GenDeviceApi4Modbus device = createModbusRtuDevice();
        assertEquals(1, modbusGatewayRegistry.getAllGatewayIdentifiers().size());

        device.connect();
        device.disconnect();

        assertEquals(0, modbusGatewayRegistry.getAllGatewayIdentifiers().size());
    }

    @Test
    void testSingleTcpDevice() throws GenDriverException {
        assertEquals(0, modbusGatewayRegistry.getAllGatewayIdentifiers().size());

        GenDeviceApi4Modbus device = createModbusTcpDevice();
        assertEquals(1, modbusGatewayRegistry.getAllGatewayIdentifiers().size());

        device.connect();
        device.disconnect();

        assertEquals(0, modbusGatewayRegistry.getAllGatewayIdentifiers().size());
    }

    @Test
    void testMultipleDevicesSameGateway() throws GenDriverException {
        assertEquals(0, modbusGatewayRegistry.getAllGatewayIdentifiers().size());

        GenDeviceApi4Modbus device1 = createModbusTcpDevice();
        assertEquals(1, modbusGatewayRegistry.getAllGatewayIdentifiers().size());

        GenDeviceApi4Modbus device2 = createModbusTcpDevice();
        assertEquals(1, modbusGatewayRegistry.getAllGatewayIdentifiers().size());

        device1.connect();
        device2.connect();

        device1.disconnect();
        assertEquals(1, modbusGatewayRegistry.getAllGatewayIdentifiers().size());

        device2.disconnect();
        assertEquals(0, modbusGatewayRegistry.getAllGatewayIdentifiers().size());
    }

    @Test
    void testMultipleDevicesDifferentGateways() throws GenDriverException {
        assertEquals(0, modbusGatewayRegistry.getAllGatewayIdentifiers().size());

        GenDeviceApi4Modbus device1 = createModbusTcpDevice();
        assertEquals(1, modbusGatewayRegistry.getAllGatewayIdentifiers().size());

        GenDeviceApi4Modbus device2 = createModbusRtuDevice();
        assertEquals(2, modbusGatewayRegistry.getAllGatewayIdentifiers().size());

        device1.connect();
        device2.connect();

        device1.disconnect();
        assertEquals(1, modbusGatewayRegistry.getAllGatewayIdentifiers().size());

        device2.disconnect();
        assertEquals(0, modbusGatewayRegistry.getAllGatewayIdentifiers().size());
    }

    private  SGrModbusDevice createModbusTcpDevice() throws GenDriverException {

        Properties properties = new Properties();
        properties.put("ipaddress", "127.0.0.1");

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        URL deviceDescUrl = classloader.getResource("SGr_04_0014_0000_WAGO_Testsystem_V1.0.xml");
        DeviceFrame deviceDesc = new DeviceDescriptionLoader()
                .load("", Optional.ofNullable(deviceDescUrl != null ? deviceDescUrl.getPath() : null).orElse(""), properties);

        return new SGrModbusDevice(deviceDesc, modbusGatewayRegistry);
    }

    private  SGrModbusDevice createModbusRtuDevice() throws GenDriverException {

        Properties properties = new Properties();
        properties.put("portName", "COM3");

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        URL deviceDescUrl = classloader.getResource("SGr_04_0014_0000_WAGO_SmartMeterV0.2.1-GenericAttributes.xml");
        DeviceFrame deviceDesc = new DeviceDescriptionLoader()
                .load("", Optional.ofNullable(deviceDescUrl != null ? deviceDescUrl.getPath() : null).orElse(""), properties);

        return new SGrModbusDevice(deviceDesc, modbusGatewayRegistry);
    }
}
