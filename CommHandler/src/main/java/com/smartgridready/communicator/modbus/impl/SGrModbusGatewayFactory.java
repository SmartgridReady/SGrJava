package com.smartgridready.communicator.modbus.impl;

import com.smartgridready.ns.v0.ModbusInterfaceDescription;
import com.smartgridready.ns.v0.ModbusRtu;
import com.smartgridready.ns.v0.ModbusTcp;

import com.smartgridready.driver.api.modbus.DataBits;
import com.smartgridready.driver.api.common.GenDriverException;
import com.smartgridready.driver.api.modbus.Parity;
import com.smartgridready.driver.api.modbus.StopBits;
import com.smartgridready.driver.api.modbus.GenDriverAPI4ModbusConnectable;
import com.smartgridready.communicator.modbus.api.ModbusGatewayFactory;
import com.smartgridready.communicator.modbus.api.ModbusGateway;
import com.smartgridready.communicator.modbus.helper.ModbusType;
import com.smartgridready.communicator.modbus.helper.ModbusUtil;


public class SGrModbusGatewayFactory implements ModbusGatewayFactory {

    @Override
    public ModbusGateway create(ModbusInterfaceDescription interfaceDescription) throws GenDriverException {
        // distinguish RTU or TCP protocol
        ModbusType modbusType = ModbusUtil.getModbusType(interfaceDescription);
        GenDriverAPI4ModbusConnectable transport;
        switch (modbusType) {
            case RTU:
                transport = createRTUTransport(interfaceDescription.getModbusRtu(), interfaceDescription.getModbusTcp());
                break;
 
            case TCP:
                transport = createTCPTransport(interfaceDescription.getModbusTcp());
                break;

            default:
                throw new GenDriverException(String.format("Unsupported Modbus type %s", modbusType));
        }

        String identifier = ModbusUtil.getModbusGatewayIdentifier(interfaceDescription);
        return new ModbusGateway(identifier, interfaceDescription, transport);
    }

    private GenDriverAPI4ModbusConnectable createRTUTransport(ModbusRtu rtu, ModbusTcp tcp) {
        String serialPort = rtu.getPortName();
        int baudrate = ModbusUtil.getSerialBaudrate(rtu.getBaudRateSelected());
        Parity parity = ModbusUtil.getSerialParity(rtu.getParitySelected());
        DataBits dataBits = ModbusUtil.getSerialDataBits(rtu.getByteLenSelected());
        StopBits stopBits = ModbusUtil.getSerialStopBits(rtu.getStopBitLenSelected());

        String tcpAddress = tcp.getAddress();
        int tcpPort = ModbusUtil.isNonEmptyString(tcp.getPort()) ? Integer.valueOf(tcp.getPort()) : ModbusUtil.DEFAULT_MODBUS_TCP_PORT;

        return new GenDriverAPI4ModbusRTUWrapper(serialPort, baudrate, parity, dataBits, stopBits, tcpAddress, tcpPort);
    }

    private GenDriverAPI4ModbusConnectable createTCPTransport(ModbusTcp tcp) {
        String tcpAddress = tcp.getAddress();
        int tcpPort = ModbusUtil.isNonEmptyString(tcp.getPort()) ? Integer.valueOf(tcp.getPort()) : ModbusUtil.DEFAULT_MODBUS_TCP_PORT;
        return new GenDriverAPI4ModbusTCPWrapper(tcpAddress, tcpPort);
    }
}
