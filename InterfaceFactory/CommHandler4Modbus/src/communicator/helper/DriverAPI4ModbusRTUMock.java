package communicator.helper;

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;

import commHandler4Modbus.DriverAPI4Modbus;
import de.re.easymodbus.exceptions.ModbusException;
import jssc.SerialPortException;
import jssc.SerialPortTimeoutException;

public class DriverAPI4ModbusRTUMock implements DriverAPI4Modbus {

	
	
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
}
