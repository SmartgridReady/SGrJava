package commHandler4Modbus.impl;

/**
* <!-- begin-user-doc -->
* <!-- end-user-doc -->
* @generated NOT
**/

import java.io.IOException;
import java.math.BigInteger;
import java.net.SocketException;
import java.net.UnknownHostException;

import commHandler4Modbus.DriverAPI4Modbus;
import de.re.easymodbus.exceptions.ModbusException;
//import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortTimeoutException;

import easymodbus.de.re.easymodbus.exceptions.*;
import easymodbus.de.re.easymodbus.modbusclient.*;
import easymodbus.de.re.easymodbus.datatypes.*;



public class DriverAPI4ModbusTCP implements DriverAPI4Modbus {


	ModbusClient mbDevice = new ModbusClient();
	
	public void initDevice(String sIP4Address, int iPort) throws UnknownHostException, IOException
	{
		
		mbDevice.Connect(sIP4Address,iPort);
	}

    public int[] ReadHoldingRegisters(int startingAddress, int quantity) throws de.re.easymodbus.exceptions.ModbusException,
    UnknownHostException, SocketException, IOException, SerialPortException, SerialPortTimeoutException
    {   int[] responseint;
    	responseint = mbDevice.ReadHoldingRegisters(startingAddress,quantity);
    	return  responseint ;
    }          
	
    public void disconnect() throws UnknownHostException, IOException, SerialPortException, SerialPortTimeoutException
    {
    	mbDevice.Disconnect();
    }

	@Override
	public int[] ReadInputRegisters(int startingAddress, int quantity) throws ModbusException, UnknownHostException,
			SocketException, IOException, SerialPortException, SerialPortTimeoutException {
		// TODO Auto-generated method stub
		return null;
	}

    
	
}
