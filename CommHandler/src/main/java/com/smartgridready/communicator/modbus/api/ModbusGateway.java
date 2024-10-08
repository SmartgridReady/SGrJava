package com.smartgridready.communicator.modbus.api;

import com.smartgridready.driver.api.modbus.GenDriverAPI4Modbus;
import com.smartgridready.ns.v0.ModbusInterfaceDescription;

public class ModbusGateway {

    private final String identifier;
    private final ModbusInterfaceDescription interfaceDescription;
    private final GenDriverAPI4Modbus transport;

    public ModbusGateway(String identifier, ModbusInterfaceDescription interfaceDescription, GenDriverAPI4Modbus transport) {
        this.identifier = identifier;
        this.interfaceDescription = interfaceDescription;
        this.transport = transport;
    }

    public ModbusInterfaceDescription getInterfaceDescription() {
        return interfaceDescription;
    }

    public GenDriverAPI4Modbus getTransport() {
        return transport;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public int hashCode() {
        return identifier == null ? 0 : identifier.hashCode();
    }

    @Override
    public boolean equals(final Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (getClass() == other.getClass()) {
            return true;
        }
        
        final ModbusGateway otherInstance = (ModbusGateway) other;
        return (
            (identifier == null && otherInstance.identifier == null) ||
            (identifier != null && identifier.equals(otherInstance.identifier))
        );
    }
}
