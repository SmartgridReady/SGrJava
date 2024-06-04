package communicator.modbus.transport;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import com.smartgridready.ns.v0.ModbusInterfaceDescription;
import com.smartgridready.ns.v0.ModbusRtu;
import com.smartgridready.ns.v0.ModbusTcp;

import communicator.common.runtime.DataBits;
import communicator.common.runtime.GenDriverAPI4Modbus;
import communicator.common.runtime.GenDriverException;
import communicator.common.runtime.Parity;
import communicator.common.runtime.StopBits;
import communicator.modbus.helper.ModbusUtil;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusRTU;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusTCP;

public class SGrModbusGatewayRegistry implements ModbusGatewayRegistry {

    private static final Logger LOG = LoggerFactory.getLogger(SGrModbusGatewayRegistry.class);

    private final Map<String, ModbusGatewayInstance> gateways;
    private final Map<ModbusGatewayInstance, Integer> gatewayRefCount;

    public SGrModbusGatewayRegistry() {
        gateways = new HashMap<>();
        gatewayRefCount = new HashMap<>();
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
        // distinguish RTU or TCP protocol
        ModbusType modbusType = getModbusType(interfaceDescription);
        if (modbusType == ModbusType.RTU) {
            // distinguish between Serial and TCP
            boolean isSerial = ModbusUtil.isRtuOverSerial(interfaceDescription);
            boolean isTcp = ModbusUtil.isRtuOverTcp(interfaceDescription);
            if (isSerial && !isTcp) {
                // use serial gateway
                ModbusRtu serial = interfaceDescription.getModbusRtu();
                String portName = serial.getPortName();
                int baudrate = ModbusUtil.getSerialBaudrate(serial.getBaudRateSelected());
                Parity parity = ModbusUtil.getSerialParity(serial.getParitySelected());
                DataBits dataBits = ModbusUtil.getSerialDataBits(serial.getByteLenSelected());
                StopBits stopBits = ModbusUtil.getSerialStopBits(serial.getStopBitLenSelected());

                GenDriverAPI4Modbus mbRTU = new GenDriverAPI4ModbusRTU();
                mbRTU.initTrspService(portName, baudrate, parity, dataBits, stopBits);

                LOG.info("Created Modbus RTU serial gateway '{}'", identifier);

                return new ModbusGatewayInstance(identifier, interfaceDescription, mbRTU);
            } else if (isTcp && !isSerial) {
                // use TCP/IP over RTU gateway
                ModbusTcp tcp = interfaceDescription.getModbusTcp();
                String address = tcp.getAddress();
                int port = ModbusUtil.hasValue(tcp.getPort()) ? Integer.valueOf(tcp.getPort()) : ModbusUtil.DEFAULT_MODBUS_TCP_PORT;

                GenDriverAPI4Modbus mbRTU = new GenDriverAPI4ModbusRTU();
                mbRTU.initDevice(address, port);

                LOG.info("Created Modbus RTU over TCP/IP gateway '{}'", identifier);

                return new ModbusGatewayInstance(identifier, interfaceDescription, mbRTU);
            }
        } else if (modbusType == ModbusType.TCP) {
            // Modbus TCP
            ModbusTcp tcp = interfaceDescription.getModbusTcp();
            if (tcp != null) {
                String address = tcp.getAddress();
                int port = ModbusUtil.hasValue(tcp.getPort()) ? Integer.valueOf(tcp.getPort()) : ModbusUtil.DEFAULT_MODBUS_TCP_PORT;

                GenDriverAPI4Modbus mbTCP = new GenDriverAPI4ModbusTCP();
                mbTCP.initDevice(address, port);

                LOG.info("Created Modbus TCP gateway '{}'", identifier);

                return new ModbusGatewayInstance(identifier, interfaceDescription, mbTCP);
            }
        }

        throw new GenDriverException("Could not create Modbus gateway");
    }

    private static ModbusType getModbusType(ModbusInterfaceDescription interfaceDescription) {
        String modbusType = interfaceDescription
                .getModbusInterfaceSelection()
                .getName();
        if (modbusType.equals("TCPIP")) {
            return ModbusType.TCP;
        } else if (modbusType.equals("RTU")) {
            return ModbusType.RTU;
        }

        return ModbusType.UNKNOWN;
    }

    private static enum ModbusType {
        UNKNOWN,
        RTU,
        TCP
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
