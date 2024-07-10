package com.smartgridready.communicator.modbus.api;

import com.smartgridready.ns.v0.ModbusInterfaceDescription;

import communicator.common.runtime.GenDriverException;

/**
 * An interface to create Modbus gateways (or transports).
 */
public interface ModbusGatewayFactory {
    
    /**
     * Creates a new Modbus gateway.
     * @param interfaceDescription the Modbus interface parameters
     * @return an instance of a Modbus gateway
     * @throws GenDriverException
     */
    ModbusGateway create(ModbusInterfaceDescription interfaceDescription) throws GenDriverException;
}
