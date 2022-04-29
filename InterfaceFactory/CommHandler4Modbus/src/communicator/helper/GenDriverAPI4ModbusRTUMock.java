package communicator.helper;

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;

import de.re.easymodbus.exceptions.ModbusException;
import jssc.SerialPortException;
import jssc.SerialPortTimeoutException;

public class GenDriverAPI4ModbusRTUMock implements GenDriverAPI4Modbus {

	
	
	@Override
	public int[] ReadInputRegisters(int startingAddress, int quantity) throws ModbusException, UnknownHostException,
			SocketException, IOException, SerialPortException, SerialPortTimeoutException {		
		return new int[] { 0x00, 0xBB, 0xCC, 0xDD };
	}

	@Override
	public int[] ReadHoldingRegisters(int startingAddress, int quantity) throws ModbusException, UnknownHostException,
			SocketException, IOException, SerialPortException, SerialPortTimeoutException {
		return new int[] { 0x00, 0x22, 0x33, 0x44 };
	}

	@Override
	public void disconnect() throws UnknownHostException, IOException, SerialPortException, SerialPortTimeoutException {		
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
