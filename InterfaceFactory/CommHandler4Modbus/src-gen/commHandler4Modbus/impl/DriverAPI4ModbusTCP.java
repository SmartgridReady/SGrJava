package commHandler4Modbus.impl;

/**
* <!-- begin-user-doc -->
* <!-- end-user-doc -->
* @generated NOT
**/

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;

import communicator.helper.GenDriverAPI4Modbus;
import de.re.easymodbus.exceptions.ModbusException;
import de.re.easymodbus.modbusclient.ModbusClient;
//import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortTimeoutException;



public class DriverAPI4ModbusTCP implements GenDriverAPI4Modbus {


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

	@Override
	public boolean[] ReadDiscreteInputs(int startingAddress, int quantity) throws ModbusException, UnknownHostException,
			SocketException, IOException, SerialPortException, SerialPortTimeoutException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean[] ReadCoils(int startingAddress, int quantity) throws ModbusException, UnknownHostException,
			SocketException, IOException, SerialPortException, SerialPortTimeoutException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void WriteMultipleCoils(int startingAdress, boolean[] values) throws UnknownHostException, SocketException,
			ModbusException, IOException, SerialPortException, SerialPortTimeoutException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void WriteSingleCoil(int startingAdress, boolean value) throws UnknownHostException, SocketException,
			ModbusException, IOException, SerialPortException, SerialPortTimeoutException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void WriteMultipleRegisters(int startingAdress, int[] values) throws UnknownHostException, SocketException,
			ModbusException, IOException, SerialPortException, SerialPortTimeoutException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void WriteSingleRegister(int startingAdress, int value) throws UnknownHostException, SocketException,
			ModbusException, IOException, SerialPortException, SerialPortTimeoutException {
		// TODO Auto-generated method stub
		
	}    
}
