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

    private final Map<String, GenDriverAPI4Modbus> gateways;
    private final Map<GenDriverAPI4Modbus, Integer> gatewayRefCount;

    public SGrModbusGatewayRegistry() {
        gateways = new HashMap<>();
        gatewayRefCount = new HashMap<>();
    }

    @Override
    public synchronized GenDriverAPI4Modbus attachGateway(ModbusInterfaceDescription interfaceDescription) throws GenDriverException {

        String gatewayIdentifier = ModbusUtil.getModbusGatewayIdentifier(interfaceDescription);

        GenDriverAPI4Modbus gateway = gateways.get(gatewayIdentifier);
        if (gateway != null) {
            // use existing gateway
            Integer refCount = gatewayRefCount.getOrDefault(gateway, Integer.valueOf(0));
            refCount = refCount.intValue() + 1;
            gatewayRefCount.put(gateway, refCount);

            LOG.info("Attached Modbus gateway '{}', refcount={}", gatewayIdentifier, refCount);
        } else {
            // create and register new gateway
            gateway = createModbusGateway(gatewayIdentifier, interfaceDescription);
            gateways.put(gatewayIdentifier, gateway);
            gatewayRefCount.put(gateway, Integer.valueOf(1));

            LOG.info("Registered Modbus gateway '{}'", gatewayIdentifier);
        }

        return gateway;
    }

    @Override
    public synchronized void detachGateway(ModbusInterfaceDescription interfaceDescription) throws GenDriverException {

        String gatewayIdentifier = ModbusUtil.getModbusGatewayIdentifier(interfaceDescription);

        GenDriverAPI4Modbus gateway = gateways.get(gatewayIdentifier);
        if (gateway != null) {
            Integer refCount = gatewayRefCount.get(gateway);
            if (refCount != null) {
                refCount = refCount.intValue() - 1;
                gatewayRefCount.put(gateway, refCount);
                if (refCount <= 0) {
                    // disconnect gateway and remove from registry
                    try {
                        gateway.disconnect();
                    } catch (GenDriverException e) {
                        LOG.error("Error disconnecting Modbus gateway: {}", e.getMessage());
                    }
                    
                    gatewayRefCount.remove(gateway);
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
        for (GenDriverAPI4Modbus gw: gateways.values()) {
            try {
                gw.disconnect();
            } catch (Exception e) {}
        }

        gateways.clear();
        gatewayRefCount.clear();
        
        LOG.info("Removed all Modbus gateways");
    }

    private GenDriverAPI4Modbus createModbusGateway(String identifier, ModbusInterfaceDescription interfaceDescription) throws GenDriverException {
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

                return mbRTU;
            } else if (isTcp && !isSerial) {
                // use TCP/IP over RTU gateway
                ModbusTcp tcp = interfaceDescription.getModbusTcp();
                String address = tcp.getAddress();
                int port = ModbusUtil.hasValue(tcp.getPort()) ? Integer.valueOf(tcp.getPort()) : ModbusUtil.DEFAULT_MODBUS_TCP_PORT;

                GenDriverAPI4Modbus mbRTU = new GenDriverAPI4ModbusRTU();
                mbRTU.initDevice(address, port);

                LOG.info("Created Modbus RTU over TCP/IP gateway '{}'", identifier);

                return mbRTU;
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

                return mbTCP;
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
}
