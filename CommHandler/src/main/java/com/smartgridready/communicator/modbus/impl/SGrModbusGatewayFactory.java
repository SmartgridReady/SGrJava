package com.smartgridready.communicator.modbus.impl;

import com.smartgridready.ns.v0.ModbusInterfaceDescription;
import com.smartgridready.driver.api.common.GenDriverException;
import com.smartgridready.driver.api.modbus.GenDriverAPI4Modbus;
import com.smartgridready.driver.api.modbus.GenDriverAPI4ModbusFactory;
import com.smartgridready.communicator.modbus.api.ModbusGatewayFactory;
import com.smartgridready.communicator.modbus.api.ModbusGateway;
import com.smartgridready.communicator.modbus.helper.ModbusTransportUtil;
import com.smartgridready.communicator.modbus.helper.ModbusUtil;


public class SGrModbusGatewayFactory implements ModbusGatewayFactory {

    private final GenDriverAPI4ModbusFactory driverFactory;

    public SGrModbusGatewayFactory(GenDriverAPI4ModbusFactory driverFactory) {
        this.driverFactory = driverFactory;
    }

    @Override
    public ModbusGateway create(ModbusInterfaceDescription interfaceDescription) throws GenDriverException {
        GenDriverAPI4Modbus transport = ModbusTransportUtil.createTransport(interfaceDescription, driverFactory);
        String identifier = ModbusUtil.getModbusGatewayIdentifier(interfaceDescription);
        return new ModbusGateway(identifier, interfaceDescription, transport);
    }
}
