package com.smartgridready.communicator.modbus.impl;

import communicator.common.runtime.DataBits;
import communicator.common.runtime.GenDriverException;
import communicator.common.runtime.Parity;
import communicator.common.runtime.StopBits;
import com.smartgridready.communicator.modbus.api.GenDriverAPI4ModbusConnectable;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusRTU;
import com.smartgridready.utils.StringUtil;

class GenDriverAPI4ModbusRTUWrapper extends GenDriverAPI4ModbusRTU implements GenDriverAPI4ModbusConnectable {

    private boolean isConnected;

    private String serialPort;
    private int baudrate;
    private Parity parity;
    private DataBits dataBits;
    private StopBits stopBits;

    private String tcpAddress;
    private int tcpPort;

    public GenDriverAPI4ModbusRTUWrapper(String serialPort, int baudRate, Parity parity, DataBits dataBits, StopBits stopBits, String tcpAddress, int tcpPort) {
        super();
        isConnected = false;
        this.serialPort = serialPort;
        this.baudrate = baudRate;
        this.parity = parity;
        this.dataBits = dataBits;
        this.stopBits = stopBits;
        this.tcpAddress = tcpAddress;
        this.tcpPort = tcpPort;
    }

    @Override
    public boolean connect() throws GenDriverException {
        if (StringUtil.isNotEmpty(tcpAddress)) {
            // use RTU over TCP/IP gateway
            this.initDevice(tcpAddress, tcpPort);
            isConnected = true;
        } else if (StringUtil.isNotEmpty(serialPort)) {
            // use serial RTU gateway
            isConnected = this.initTrspService(serialPort, baudrate, parity, dataBits, stopBits);
        } else {
            throw new GenDriverException("No Modbus RTU serial or TCP interface configuration");
        }

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
