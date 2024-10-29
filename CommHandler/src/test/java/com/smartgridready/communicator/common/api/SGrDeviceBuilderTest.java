package com.smartgridready.communicator.common.api;

import com.smartgridready.driver.api.common.GenDriverException;
import com.smartgridready.driver.api.http.GenHttpRequest;
import com.smartgridready.driver.api.http.GenHttpClientFactory;
import com.smartgridready.driver.api.http.GenHttpResponse;
import com.smartgridready.driver.api.http.GenUriBuilder;
import com.smartgridready.driver.api.http.HttpStatus;
import com.smartgridready.ns.v0.ResponseQuery;
import com.smartgridready.ns.v0.ResponseQueryType;
import com.smartgridready.communicator.messaging.impl.SGrMessagingDevice;
import com.smartgridready.communicator.modbus.api.GenDeviceApi4Modbus;
import com.smartgridready.driver.api.modbus.GenDriverAPI4Modbus;
import com.smartgridready.driver.api.modbus.GenDriverAPI4ModbusFactory;
import com.smartgridready.communicator.modbus.api.ModbusGatewayRegistry;
import com.smartgridready.communicator.modbus.api.ModbusGateway;
import com.smartgridready.communicator.rest.impl.SGrRestApiDevice;
import com.smartgridready.ns.v0.RestApiServiceCall;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(value = MockitoExtension.class)
public class SGrDeviceBuilderTest {

    @Mock
    ModbusGatewayRegistry modbusGatewayRegistry;

    @Mock
    ModbusGateway modbusGateway;

    @Mock
    GenDriverAPI4ModbusFactory modbusClientFactory;

    @Mock
    GenDriverAPI4Modbus modbusDriver;

    @Mock
    GenHttpClientFactory restServiceClientFactory;

    @Mock
    GenHttpRequest httpRequest;

    @Mock
    GenUriBuilder uriBuilder;

    @Test
    void buildRestApiDevice() throws Exception {

        var restServiceCall = new RestApiServiceCall();
        var responseQery = new ResponseQuery();
        responseQery.setQueryType(ResponseQueryType.JMES_PATH_EXPRESSION);
        responseQery.setQuery("status");
        restServiceCall.setResponseQuery(responseQery);

        when(restServiceClientFactory.createHttpRequest()).thenReturn(httpRequest);
        when(restServiceClientFactory.createUriBuilder(any())).thenReturn(uriBuilder);
        when(httpRequest.execute()).thenReturn(GenHttpResponse.of("{ \"token\" : \"dummyToken\" }", HttpStatus.OK, ""));

        Properties properties = new Properties();
        properties.put("sensor_id", "123456");

        var device = new SGrDeviceBuilder()
                .useRestServiceClientFactory(restServiceClientFactory)
                .eid(loadResourceAsString("SGr_04_0018_CLEMAP_EIcloudEnergyMonitorV0.2.1.xml"))
                .properties(properties)
                .build();

        assertInstanceOf(SGrRestApiDevice.class, device);

        device.connect();
        verify(httpRequest).execute();
    }

    @Test
    void buildModbusDeviceTcp() throws Exception {

        Properties properties = new Properties();
        properties.put("ipaddress", "127.0.0.1");

        when(modbusClientFactory.createTcpTransport(anyString(), anyInt())).thenReturn(modbusDriver);
        when(modbusDriver.connect()).thenReturn(true);

        GenDeviceApi device = new SGrDeviceBuilder()
                .useModbusClientFactory(modbusClientFactory)
                .properties(properties)
                .eid(loadResourceAsString("SGr_04_0014_0000_WAGO_Testsystem_V1.0.xml"))
                .build();

        assertInstanceOf(GenDeviceApi4Modbus.class, device);

        device.connect();
        verify(modbusDriver).connect();

        device.disconnect();
        verify(modbusDriver).disconnect();
    }

    @Test
    void buildModbusDeviceTcpWithSharedRegistry() throws Exception {

        Properties properties = new Properties();
        properties.put("ipaddress", "127.0.0.1");

        when(modbusGatewayRegistry.attachGateway(any())).thenReturn(modbusGateway);
        when(modbusGateway.getIdentifier()).thenReturn("tcp:127.0.0.1:502");
        when(modbusGateway.getTransport()).thenReturn(modbusDriver);
        when(modbusDriver.connect()).thenReturn(true);

        GenDeviceApi device = new SGrDeviceBuilder()
                .useSharedModbusGatewayRegistry(modbusGatewayRegistry)
                .properties(properties)
                .eid(loadResourceAsString("SGr_04_0014_0000_WAGO_Testsystem_V1.0.xml"))
                .build();

        assertInstanceOf(GenDeviceApi4Modbus.class, device);

        verify(modbusGatewayRegistry).attachGateway(any());

        device.connect();
        verify(modbusDriver).connect();

        device.disconnect();
        verify(modbusGatewayRegistry).detachGateway(any(String.class));
    }

    @Test
    void buildModbusDeviceRtu() throws Exception {

        Properties properties = new Properties();
        properties.put("portName", "COM3");

        when(modbusClientFactory.createRtuTransport(anyString(), anyInt(), any(), any(), any())).thenReturn(modbusDriver);
        when(modbusDriver.connect()).thenReturn(false); // report connection failure

        GenDeviceApi device = new SGrDeviceBuilder()
                .useModbusClientFactory(modbusClientFactory)
                .properties(properties)
                .eid(loadResourceAsPath("SGr_04_0014_0000_WAGO_SmartMeterV0.2.1-GenericAttributes.xml"))
                .build();

        assertInstanceOf(GenDeviceApi4Modbus.class, device);

        //
        var exception = assertThrows(GenDriverException.class, device::connect);
        verify(modbusDriver).connect();
        assertEquals("Connect to modbus device on port COM3 failed.", exception.getMessage());

        device.disconnect();
        verify(modbusDriver).disconnect();
    }

    @Test
    void buildModbusDeviceRtuWithSharedRegistry() throws Exception {

        Properties properties = new Properties();
        properties.put("portName", "COM3");

        when(modbusGatewayRegistry.attachGateway(any())).thenReturn(modbusGateway);
        when(modbusGateway.getIdentifier()).thenReturn("rtu:COM3");
        when(modbusGateway.getTransport()).thenReturn(modbusDriver);
        when(modbusDriver.connect()).thenReturn(true);

        GenDeviceApi device = new SGrDeviceBuilder()
                .useSharedModbusGatewayRegistry(modbusGatewayRegistry)
                .properties(properties)
                .eid(loadResourceAsPath("SGr_04_0014_0000_WAGO_SmartMeterV0.2.1-GenericAttributes.xml"))
                .build();

        assertInstanceOf(GenDeviceApi4Modbus.class, device);

        verify(modbusGatewayRegistry).attachGateway(any());

        device.connect();
        verify(modbusDriver).connect();

        device.disconnect();
        verify(modbusGatewayRegistry).detachGateway(any(String.class));
    }

    @SuppressWarnings("resource") // we are just checking the instance.
    @Test
    void buildMessagingDevice() throws Exception {

        Properties properties = new Properties();
        properties.put("port", "8883");
        properties.put("host", "152f30e8c480481886072e4f8250d91a.s1.eu.hivemq.cloud");
        properties.put("username", "smartgrid");
        properties.put("password", "1SmartGrid!");

        GenDeviceApi device = new SGrDeviceBuilder()
                .properties(properties)
                .eid(loadResourceAsStream("SGr_XX_HiveMQ_MQTT_Cloud.xml"))
                .build();

        assertInstanceOf(SGrMessagingDevice.class, device);
        assertDoesNotThrow(device::connect);
    }

    public static InputStream loadResourceAsStream(String resourceName) {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        return classLoader.getResourceAsStream(resourceName);
    }

    @SuppressWarnings("ConstantConditions")
    public static String loadResourceAsString(String resourceName) throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try (InputStream inputStream = classLoader.getResourceAsStream(resourceName);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            return reader.lines().collect(Collectors.joining(System.lineSeparator()));
        }
    }

    @SuppressWarnings("ConstantConditions")
    public static Path loadResourceAsPath(String resourceName) throws  Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        var resource = classLoader.getResource(resourceName);
        return Paths.get(resource.toURI());
    }
}

