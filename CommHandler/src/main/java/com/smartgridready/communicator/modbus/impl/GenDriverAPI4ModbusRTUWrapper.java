package com.smartgridready.communicator.modbus.impl;

import com.smartgridready.driver.api.modbus.DataBits;
import com.smartgridready.driver.api.common.GenDriverException;
import com.smartgridready.driver.api.modbus.Parity;
import com.smartgridready.driver.api.modbus.StopBits;
import com.smartgridready.driver.api.modbus.GenDriverAPI4ModbusConnectable;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusRTU;
import com.smartgridready.utils.StringUtil;

class GenDriverAPI4ModbusRTUWrapper extends GenDriverAPI4ModbusRTU implements GenDriverAPI4ModbusConnectable {

    private boolean isConnected;

    private final String serialPort;
    private final int baudrate;
    private final Parity parity;
    private final DataBits dataBits;
    private final StopBits stopBits;

    public GenDriverAPI4ModbusRTUWrapper(String serialPort, int baudRate, Parity parity, DataBits dataBits, StopBits stopBits) {
        super();
        isConnected = false;
        this.serialPort = serialPort;
        this.baudrate = baudRate;
        this.parity = parity;
        this.dataBits = dataBits;
        this.stopBits = stopBits;
    }

    @Override
    public boolean connect() throws GenDriverException {
        if (StringUtil.isNotEmpty(serialPort)) {
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
