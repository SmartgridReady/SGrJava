package com.smartgridready.communicator.modbus.impl;

import com.smartgridready.driver.api.modbus.DataBits;
import com.smartgridready.driver.api.modbus.GenDriverAPI4Modbus;
import com.smartgridready.driver.api.modbus.GenDriverAPI4ModbusFactory;
import com.smartgridready.driver.api.modbus.Parity;
import com.smartgridready.driver.api.modbus.StopBits;

public class MockModbusDriverFactory implements GenDriverAPI4ModbusFactory {

    @Override
    public GenDriverAPI4Modbus createRtuTransport(String arg0) {
        return new GenDriverAPI4ModbusRTUMock();
    }

    @Override
    public GenDriverAPI4Modbus createRtuTransport(String arg0, int arg1) {
        return new GenDriverAPI4ModbusRTUMock();
    }

    @Override
    public GenDriverAPI4Modbus createRtuTransport(String arg0, int arg1, Parity arg2) {
        return new GenDriverAPI4ModbusRTUMock();
    }

    @Override
    public GenDriverAPI4Modbus createRtuTransport(String arg0, int arg1, Parity arg2, DataBits arg3) {
        return new GenDriverAPI4ModbusRTUMock();
    }

    @Override
    public GenDriverAPI4Modbus createRtuTransport(String arg0, int arg1, Parity arg2, DataBits arg3, StopBits arg4) {
        return new GenDriverAPI4ModbusRTUMock();
    }

    @Override
    public GenDriverAPI4Modbus createTcpTransport(String arg0) {
        return new GenDriverAPI4ModbusRTUMock();
    }

    @Override
    public GenDriverAPI4Modbus createTcpTransport(String arg0, int arg1) {
        return new GenDriverAPI4ModbusRTUMock();
    }
}
