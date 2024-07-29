package com.smartgridready.communicator.modbus.impl;

import java.util.List;
import java.util.Collections;

import com.smartgridready.ns.v0.ModbusInterfaceDescription;

import com.smartgridready.driver.modbus.api.GenDriverException;
import com.smartgridready.communicator.modbus.api.ModbusGatewayRegistry;
import com.smartgridready.communicator.modbus.api.ModbusGateway;
import com.smartgridready.communicator.modbus.helper.GenDriverAPI4ModbusRTUMock;

public class ModbusGatewayRegistryMock implements ModbusGatewayRegistry {

    private final ModbusGateway mock;

    public ModbusGatewayRegistryMock() {
        mock = new ModbusGateway(null, null, new GenDriverAPI4ModbusLegacyWrapper(new GenDriverAPI4ModbusRTUMock()));
    }

    public void setIsIntegerType(boolean returnInteger) {
        ((GenDriverAPI4ModbusRTUMock) mock.getTransport()).setIsIntegerType(returnInteger);
    }

    @Override
    public ModbusGateway attachGateway(ModbusInterfaceDescription interfaceDescription)
            throws GenDriverException {
        return mock;
    }

    @Override
    public void detachGateway(ModbusInterfaceDescription interfaceDescription) throws GenDriverException {
        // nothing
    }

    @Override
    public void detachGateway(String identifier) throws GenDriverException {
        // nothing
    }

    @Override
    public void detachAllGateways() {
        // nothing
    }

    @Override
    public List<String> getAllGatewayIdentifiers() {
        return Collections.singletonList("rtu:mock");
    }
}
