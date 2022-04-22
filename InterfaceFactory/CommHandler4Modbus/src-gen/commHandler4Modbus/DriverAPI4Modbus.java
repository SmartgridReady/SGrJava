package commHandler4Modbus;

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;

import jssc.SerialPortException;
import jssc.SerialPortTimeoutException;

public interface DriverAPI4Modbus {
	
	public default void setUnitIdentifier( short ident ) {};
	
    public int[] ReadInputRegisters(int startingAddress, int quantity) throws de.re.easymodbus.exceptions.ModbusException,    
    UnknownHostException, SocketException, IOException, SerialPortException, SerialPortTimeoutException;        
    
    public int[] ReadHoldingRegisters(int startingAddress, int quantity) throws de.re.easymodbus.exceptions.ModbusException,
    UnknownHostException, SocketException, IOException, SerialPortException, SerialPortTimeoutException;

    public void disconnect() throws UnknownHostException, IOException, SerialPortException, SerialPortTimeoutException;
}