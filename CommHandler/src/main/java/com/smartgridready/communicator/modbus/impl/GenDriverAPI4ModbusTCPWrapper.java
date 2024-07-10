package com.smartgridready.communicator.modbus.impl;

import communicator.common.runtime.GenDriverException;
import com.smartgridready.communicator.modbus.api.GenDriverAPI4ModbusConnectable;
import com.smartgridready.communicator.modbus.helper.ModbusUtil;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusTCP;

class GenDriverAPI4ModbusTCPWrapper extends GenDriverAPI4ModbusTCP implements GenDriverAPI4ModbusConnectable {

    private boolean isConnected;
    private String tcpAddress;
    private int tcpPort;

    public GenDriverAPI4ModbusTCPWrapper(String tcpAddress, int tcpPort) {
        super();
        isConnected = false;
        this.tcpAddress = tcpAddress;
        this.tcpPort = tcpPort;
    }

    public GenDriverAPI4ModbusTCPWrapper(String tcpAddress) {
        this(tcpAddress, ModbusUtil.DEFAULT_MODBUS_TCP_PORT);
    }

    @Override
    public boolean connect() throws GenDriverException {
        this.initDevice(tcpAddress, tcpPort);
        isConnected = true;
        return isConnected;
    }

    @Override
    public void disconnect() throws GenDriverException {
        super.disconnect();
        isConnected = false;
    }

    @Override
    public boolean isConnected() {
        return isConnected;
    }
}
