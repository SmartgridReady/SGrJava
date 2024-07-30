package com.smartgridready.communicator.modbus.api;

import java.util.List;

import com.smartgridready.ns.v0.ModbusInterfaceDescription;

import com.smartgridready.driver.api.common.GenDriverException;


/**
 * An interface for a Modbus gateway registry.
 */
public interface ModbusGatewayRegistry {

    /**
     * Uses or creates a Modbus transport gateway for a given device.
     * @param interfaceDescription the device's Modbus interface description
     * @return a Modbus gateway instance
     * @throws GenDriverException
     */
    public ModbusGateway attachGateway(ModbusInterfaceDescription interfaceDescription) throws GenDriverException;

    /**
     * Disconnects the Modbus transport gateway of a given device.
     * @param interfaceDescription the device's Modbus interface description
     * @throws GenDriverException
     */
    public void detachGateway(ModbusInterfaceDescription interfaceDescription) throws GenDriverException;

    /**
     * Disconnects the Modbus transport gateway of a given device.
     * @param identifier the transport identifier
     * @throws GenDriverException
     */
    public void detachGateway(String identifier) throws GenDriverException;

    public void detachAllGateways();

    public List<String> getAllGatewayIdentifiers();
}
