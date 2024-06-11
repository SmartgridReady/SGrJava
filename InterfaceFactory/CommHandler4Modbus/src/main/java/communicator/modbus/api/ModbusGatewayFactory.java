package communicator.modbus.api;

import com.smartgridready.ns.v0.ModbusInterfaceDescription;

import communicator.common.runtime.GenDriverAPI4Modbus;
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
    GenDriverAPI4Modbus create(ModbusInterfaceDescription interfaceDescription)  throws GenDriverException;
}
