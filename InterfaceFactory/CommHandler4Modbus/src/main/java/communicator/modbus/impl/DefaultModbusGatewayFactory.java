package communicator.modbus.impl;

import com.smartgridready.ns.v0.ModbusInterfaceDescription;
import com.smartgridready.ns.v0.ModbusRtu;
import com.smartgridready.ns.v0.ModbusTcp;

import communicator.common.runtime.DataBits;
import communicator.common.runtime.GenDriverAPI4Modbus;
import communicator.common.runtime.GenDriverException;
import communicator.common.runtime.Parity;
import communicator.common.runtime.StopBits;
import communicator.modbus.api.ModbusGatewayFactory;
import communicator.modbus.helper.ModbusUtil;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusRTU;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusTCP;


public class DefaultModbusGatewayFactory implements ModbusGatewayFactory {

    @Override
    public GenDriverAPI4Modbus create(ModbusInterfaceDescription interfaceDescription) throws GenDriverException {
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

                return mbRTU;
            } else if (isTcp && !isSerial) {
                // use TCP/IP over RTU gateway
                ModbusTcp tcp = interfaceDescription.getModbusTcp();
                String address = tcp.getAddress();
                int port = ModbusUtil.hasValue(tcp.getPort()) ? Integer.valueOf(tcp.getPort()) : ModbusUtil.DEFAULT_MODBUS_TCP_PORT;

                GenDriverAPI4Modbus mbRTU = new GenDriverAPI4ModbusRTU();
                mbRTU.initDevice(address, port);

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
