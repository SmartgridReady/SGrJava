package com.smartgridready.communicator.modbus.api;

import communicator.common.runtime.GenDriverAPI4Modbus;
import communicator.common.runtime.GenDriverException;

/**
 * Adds generic connect functionality to Modbus driver.
 */
public interface GenDriverAPI4ModbusConnectable extends GenDriverAPI4Modbus {
    
    /**
     * Connects to Modbus transport.
     * @return true if connected, false otherwise
     * @throws GenDriverException
     */
    public boolean connect() throws GenDriverException;

    /**
     * Tells if the transport is connected.
     * @return true if connected, false otherwise
     */
    public boolean isConnected();
}
