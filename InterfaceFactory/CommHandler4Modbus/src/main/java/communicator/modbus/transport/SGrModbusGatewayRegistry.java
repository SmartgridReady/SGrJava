package communicator.modbus.transport;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import com.smartgridready.ns.v0.ModbusInterfaceDescription;

import communicator.common.runtime.GenDriverAPI4Modbus;
import communicator.common.runtime.GenDriverException;
import communicator.modbus.api.ModbusGatewayFactory;
import communicator.modbus.helper.ModbusUtil;
import communicator.modbus.impl.DefaultModbusGatewayFactory;

public class SGrModbusGatewayRegistry implements ModbusGatewayRegistry {

    private static final Logger LOG = LoggerFactory.getLogger(SGrModbusGatewayRegistry.class);

    private final ModbusGatewayFactory modbusGatewayFactory;
    private final Map<String, ModbusGatewayInstance> gateways;
    private final Map<ModbusGatewayInstance, Integer> gatewayRefCount;

    public SGrModbusGatewayRegistry(ModbusGatewayFactory modbusGatewayFactory) {
        this.modbusGatewayFactory = modbusGatewayFactory;
        gateways = new HashMap<>();
        gatewayRefCount = new HashMap<>();
    }

    public SGrModbusGatewayRegistry() {
        this(new DefaultModbusGatewayFactory());
    }

    @Override
    public synchronized GenDriverAPI4Modbus attachGateway(ModbusInterfaceDescription interfaceDescription) throws GenDriverException {

        String gatewayIdentifier = ModbusUtil.getModbusGatewayIdentifier(interfaceDescription);

        ModbusGatewayInstance gatewayInstance = gateways.get(gatewayIdentifier);
        if (gatewayInstance != null) {
            // verify that interface parameters match
            if (!ModbusUtil.interfaceParametersMatch(interfaceDescription, gatewayInstance.getInterfaceDescription())) {
                throw new GenDriverException("Interface parameters do not match");
            }

            // use existing gateway
            Integer refCount = gatewayRefCount.getOrDefault(gatewayInstance, Integer.valueOf(0));
            refCount = refCount.intValue() + 1;
            gatewayRefCount.put(gatewayInstance, refCount);

            LOG.info("Attached Modbus gateway '{}', refcount={}", gatewayIdentifier, refCount);
        } else {
            // create and register new gateway
            gatewayInstance = createModbusGateway(gatewayIdentifier, interfaceDescription);
            gateways.put(gatewayIdentifier, gatewayInstance);
            gatewayRefCount.put(gatewayInstance, Integer.valueOf(1));

            LOG.info("Registered Modbus gateway '{}'", gatewayIdentifier);
        }

        return gatewayInstance.getGateway();
    }

    @Override
    public synchronized void detachGateway(ModbusInterfaceDescription interfaceDescription) throws GenDriverException {

        String gatewayIdentifier = ModbusUtil.getModbusGatewayIdentifier(interfaceDescription);

        ModbusGatewayInstance gatewayInstance = gateways.get(gatewayIdentifier);
        if (gatewayInstance != null) {
            Integer refCount = gatewayRefCount.get(gatewayInstance);
            if (refCount != null) {
                refCount = refCount.intValue() - 1;
                gatewayRefCount.put(gatewayInstance, refCount);
                if (refCount <= 0) {
                    // disconnect gateway and remove from registry
                    try {
                        gatewayInstance.getGateway().disconnect();
                    } catch (GenDriverException e) {
                        LOG.error("Error disconnecting Modbus gateway: {}", e.getMessage());
                    }
                    
                    gatewayRefCount.remove(gatewayInstance);
                    gateways.remove(gatewayIdentifier);

                    LOG.info("Removed Modbus gateway '{}'", gatewayIdentifier);
                } else {
                    LOG.info("Detached Modbus gateway '{}', refcount={}", gatewayIdentifier, refCount);
                }
            } else {
                gateways.remove(gatewayIdentifier);

                LOG.info("Removed Modbus gateway '{}'", gatewayIdentifier);
            }
        }
    }

    @Override
    public synchronized void detachAllGateways() {
        for (ModbusGatewayInstance gw: gateways.values()) {
            try {
                gw.getGateway().disconnect();
            } catch (Exception e) {}
        }

        gateways.clear();
        gatewayRefCount.clear();
        
        LOG.info("Removed all Modbus gateways");
    }

    private ModbusGatewayInstance createModbusGateway(String identifier, ModbusInterfaceDescription interfaceDescription) throws GenDriverException {
        GenDriverAPI4Modbus mbGW = modbusGatewayFactory.create(interfaceDescription);
        return new ModbusGatewayInstance(identifier, interfaceDescription, mbGW);
    }

    private static class ModbusGatewayInstance {

        private String identifier;
        private ModbusInterfaceDescription interfaceDescription;
        private GenDriverAPI4Modbus gateway;

        public ModbusGatewayInstance(String identifier, ModbusInterfaceDescription interfaceDescription, GenDriverAPI4Modbus gateway) {
            this.identifier = identifier;
            this.interfaceDescription = interfaceDescription;
            this.gateway = gateway;
        }

        public String getIdentifier() {
            return identifier;
        }

        public ModbusInterfaceDescription getInterfaceDescription() {
            return interfaceDescription;
        }

        public GenDriverAPI4Modbus getGateway() {
            return gateway;
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
            
            final ModbusGatewayInstance otherInstance = (ModbusGatewayInstance) other;
            return (
                (identifier == null && otherInstance.identifier == null) ||
                (identifier != null && identifier.equals(otherInstance.identifier))
            );
        }
    }
}
