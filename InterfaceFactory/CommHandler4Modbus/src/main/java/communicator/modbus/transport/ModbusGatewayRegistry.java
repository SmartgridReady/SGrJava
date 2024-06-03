package communicator.modbus.transport;

import com.smartgridready.ns.v0.ModbusInterfaceDescription;

import communicator.common.runtime.GenDriverAPI4Modbus;
import communicator.common.runtime.GenDriverException;

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
    public GenDriverAPI4Modbus attachGateway(ModbusInterfaceDescription interfaceDescription) throws GenDriverException;

    /**
     * Disconnects the Modbus transport gateway of a given device.
     * @param interfaceDescription the device's Modbus interface description
     * @throws GenDriverException
     */
    public void detachGateway(ModbusInterfaceDescription interfaceDescription) throws GenDriverException;

    public void detachAllGateways();
}
