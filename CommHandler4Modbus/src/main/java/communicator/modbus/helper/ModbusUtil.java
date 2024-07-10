package communicator.modbus.helper;

import java.util.Map;
import java.util.Objects;

import com.smartgridready.ns.v0.ModbusInterfaceDescription;
import com.smartgridready.ns.v0.ModbusRtu;
import com.smartgridready.ns.v0.ModbusTcp;

import communicator.common.runtime.DataBits;
import communicator.common.runtime.GenDriverException;
import communicator.common.runtime.StopBits;
import communicator.common.runtime.Parity;

public class ModbusUtil {

    public static final int DEFAULT_MODBUS_TCP_PORT = 502;
    
    public static final int DEFAULT_BAUDRATE = 9600;
    public static final Parity DEFAULT_PARITY = Parity.NONE;
    public static final DataBits DEFAULT_DATABITS = DataBits.EIGHT;
    public static final StopBits DEFAULT_STOPBITS = StopBits.ONE;

    public static final short DEFAULT_SLAVE_ID = 0xff;
    
    private static final Map<String, DataBits> dataBitMap = Map.of(
        com.smartgridready.ns.v0.ByteLength._7.getLiteral(), DataBits.SEVEN,
        com.smartgridready.ns.v0.ByteLength._8.getLiteral(), DataBits.EIGHT
    );
    
    private static final Map<String, StopBits> stopBitMap = Map.of(
        com.smartgridready.ns.v0.StopBitLength._1.getLiteral(), StopBits.ONE,
        com.smartgridready.ns.v0.StopBitLength._15.getLiteral(), StopBits.ONE_AND_HALF,
        com.smartgridready.ns.v0.StopBitLength._2.getLiteral(), StopBits.TWO
    );

    private static final Map<String, Parity> parityMap = Map.of(
        com.smartgridready.ns.v0.Parity.NONE.getLiteral(), Parity.NONE,
        com.smartgridready.ns.v0.Parity.EVEN.getLiteral(), Parity.EVEN,
        com.smartgridready.ns.v0.Parity.ODD.getLiteral(), Parity.ODD
    );

    public static boolean isRtuOverSerial(ModbusInterfaceDescription interfaceDescription) {
        ModbusRtu rtu = interfaceDescription.getModbusRtu();
        return (
            (rtu != null) &&
            isNonEmptyString(rtu.getPortName())
        );
    }

    public static boolean isRtuOverTcp(ModbusInterfaceDescription interfaceDescription) {
        ModbusTcp tcp = interfaceDescription.getModbusTcp();
        return (
            (tcp != null) &&
            isNonEmptyString(tcp.getAddress())
        );
    }

    public static Short getModbusSlaveId(ModbusInterfaceDescription interfaceDescription) {
        // distinguish between Serial and TCP
        boolean isSerial = isRtuOverSerial(interfaceDescription);
        boolean isTcp = isRtuOverTcp(interfaceDescription);
        if (isSerial && !isTcp) {
            ModbusRtu serial = interfaceDescription.getModbusRtu();
            return isNonEmptyString(serial.getSlaveAddr()) ? Short.valueOf(serial.getSlaveAddr()) : DEFAULT_SLAVE_ID;
        } else if (isTcp && !isSerial) {
            ModbusTcp tcp = interfaceDescription.getModbusTcp();
            return isNonEmptyString(tcp.getSlaveId()) ? Short.valueOf(tcp.getSlaveId()) : DEFAULT_SLAVE_ID;
        }

        return DEFAULT_SLAVE_ID;
    }

    public static String getModbusGatewayIdentifier(ModbusInterfaceDescription interfaceDescription) throws GenDriverException {
        // distinguish between Serial and TCP
        boolean isSerial = isRtuOverSerial(interfaceDescription);
        boolean isTcp = isRtuOverTcp(interfaceDescription);
        if (isSerial && !isTcp) {
            ModbusRtu rtu = interfaceDescription.getModbusRtu();
            String portName = rtu.getPortName();
            return String.format("serial:%s", portName);
        } else if (isTcp && !isSerial) {
            ModbusTcp tcp = interfaceDescription.getModbusTcp();
            String address = tcp.getAddress();
            int port = isNonEmptyString(tcp.getPort()) ? Integer.valueOf(tcp.getPort()) : DEFAULT_MODBUS_TCP_PORT;
            return String.format("tcp:%s:%d", address, port);
        }

        // cannot be both or none
        throw new GenDriverException("Could not get Modbus gateway identifier");
    }

    public static DataBits getSerialDataBits(String dataBits) {
        return dataBitMap.getOrDefault(dataBits, DEFAULT_DATABITS);
    }

    public static StopBits getSerialStopBits(String stopBits) {
        return stopBitMap.getOrDefault(stopBits, DEFAULT_STOPBITS);
    }

    public static Parity getSerialParity(String parity) {
        return parityMap.getOrDefault(parity, DEFAULT_PARITY);
    }

    public static int getSerialBaudrate(String baudRate) {
        return isNonEmptyString(baudRate) ? Integer.valueOf(baudRate) : DEFAULT_BAUDRATE;
    }

    public static boolean isNonEmptyString(String value) {
        return (
            (value != null) &&
            !value.isEmpty()
        );
    }

    public static boolean interfaceParametersMatch(ModbusInterfaceDescription interface1, ModbusInterfaceDescription interface2) {
        if (
            (null == interface1.getModbusRtu() && null != interface2.getModbusRtu()) ||
            (null != interface1.getModbusRtu() && null == interface2.getModbusRtu())
        ) {
            return false;
        } else if (null != interface1.getModbusRtu() && null != interface2.getModbusRtu()) {
            ModbusRtu rtu1 = interface1.getModbusRtu();
            ModbusRtu rtu2 = interface2.getModbusRtu();
            if (
                !(
                    Objects.equals(rtu1.getPortName(), rtu2.getPortName()) &&
                    Objects.equals(rtu1.getBaudRateSelected(), rtu2.getBaudRateSelected()) &&
                    Objects.equals(rtu1.getByteLenSelected(), rtu2.getByteLenSelected()) &&
                    Objects.equals(rtu1.getParitySelected(), rtu2.getParitySelected()) &&
                    Objects.equals(rtu1.getStopBitLenSelected(), rtu2.getStopBitLenSelected())
                )
            ) {
                return false;
            }
        }

        if (
            (null == interface1.getModbusTcp() && null != interface2.getModbusTcp()) ||
            (null != interface1.getModbusTcp() && null == interface2.getModbusTcp())
        ) {
            return false;
        } else if (null != interface1.getModbusTcp() && null != interface2.getModbusTcp()) {
            ModbusTcp tcp1 = interface1.getModbusTcp();
            ModbusTcp tcp2 = interface2.getModbusTcp();
            if (
                !(
                    Objects.equals(tcp1.getAddress(), tcp2.getAddress()) &&
                    Objects.equals(tcp1.getPort(), tcp2.getPort())
                )
            ) {
                return false;
            }
        }

        return true;
    }

    public static ModbusType getModbusType(ModbusInterfaceDescription interfaceDescription) {
        String modbusType = interfaceDescription
                .getModbusInterfaceSelection()
                .getName();

        switch (modbusType) {
            case "TCPIP":
                return ModbusType.TCP;

            case "RTU":
                return ModbusType.RTU;

            default:
                return ModbusType.UNKNOWN;
        }
    }
}
