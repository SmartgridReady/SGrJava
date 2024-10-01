package com.smartgridready.communicator.modbus.impl;

import com.smartgridready.ns.v0.ModbusInterfaceDescription;
import com.smartgridready.ns.v0.ModbusRtu;
import com.smartgridready.ns.v0.ModbusTcp;

import de.re.easymodbus.adapter.GenDriverAPI4ModbusRTU;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusTCP;

import com.smartgridready.driver.api.modbus.DataBits;
import com.smartgridready.driver.api.common.GenDriverException;
import com.smartgridready.driver.api.modbus.Parity;
import com.smartgridready.driver.api.modbus.StopBits;
import com.smartgridready.driver.api.modbus.GenDriverAPI4Modbus;
import com.smartgridready.communicator.modbus.api.ModbusGatewayFactory;
import com.smartgridready.communicator.modbus.api.ModbusGateway;
import com.smartgridready.communicator.modbus.helper.ModbusType;
import com.smartgridready.communicator.modbus.helper.ModbusUtil;


public class EasyModbusGatewayFactory implements ModbusGatewayFactory {

    @Override
    public ModbusGateway create(ModbusInterfaceDescription interfaceDescription) throws GenDriverException {
        // distinguish RTU or TCP protocol
        ModbusType modbusType = ModbusUtil.getModbusType(interfaceDescription);
        GenDriverAPI4Modbus transport;
        switch (modbusType) {
            case RTU:
                transport = createRTUTransport(interfaceDescription.getModbusRtu());
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

    private GenDriverAPI4Modbus createRTUTransport(ModbusRtu rtu) {
        String serialPort = rtu.getPortName();
        int baudrate = ModbusUtil.getSerialBaudrate(rtu.getBaudRateSelected());
        Parity parity = ModbusUtil.getSerialParity(rtu.getParitySelected());
        DataBits dataBits = ModbusUtil.getSerialDataBits(rtu.getByteLenSelected());
        StopBits stopBits = ModbusUtil.getSerialStopBits(rtu.getStopBitLenSelected());

        return new GenDriverAPI4ModbusRTU(serialPort, baudrate, parity, dataBits, stopBits);
    }

    private GenDriverAPI4Modbus createTCPTransport(ModbusTcp tcp) {
        String tcpAddress = tcp.getAddress();
        int tcpPort = ModbusUtil.isNonEmptyString(tcp.getPort()) ? Integer.valueOf(tcp.getPort()) : ModbusUtil.DEFAULT_MODBUS_TCP_PORT;
        return new GenDriverAPI4ModbusTCP(tcpAddress, tcpPort);
    }
}
