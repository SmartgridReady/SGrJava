package communicator.helper;

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;

import de.re.easymodbus.exceptions.ModbusException;
import jssc.SerialPortException;
import jssc.SerialPortTimeoutException;

public interface GenDriverAPI4Modbus {
	
	public default void setUnitIdentifier( short ident ) {};
	
    public int[] ReadInputRegisters(int startingAddress, int quantity) throws de.re.easymodbus.exceptions.ModbusException,    
    UnknownHostException, SocketException, IOException, SerialPortException, SerialPortTimeoutException;        
    
    public int[] ReadHoldingRegisters(int startingAddress, int quantity) throws de.re.easymodbus.exceptions.ModbusException,
    UnknownHostException, SocketException, IOException, SerialPortException, SerialPortTimeoutException;
    
    
    public boolean[] ReadDiscreteInputs(int startingAddress, int quantity) throws de.re.easymodbus.exceptions.ModbusException,
    UnknownHostException, SocketException, IOException, SerialPortException, SerialPortTimeoutException;
 

    public boolean[] ReadCoils(int startingAddress, int quantity) throws de.re.easymodbus.exceptions.ModbusException,
    UnknownHostException, SocketException, IOException, SerialPortException, SerialPortTimeoutException;
       
    public void  WriteMultipleCoils(int startingAdress, boolean[] values) throws UnknownHostException, SocketException, ModbusException, IOException, SerialPortException, SerialPortTimeoutException;
    
    public void  WriteSingleCoil(int startingAdress, boolean value) throws UnknownHostException, SocketException, ModbusException, IOException, SerialPortException, SerialPortTimeoutException;
     
    public void  WriteMultipleRegisters(int startingAdress, int[] values) throws UnknownHostException, SocketException, ModbusException, IOException, SerialPortException, SerialPortTimeoutException; 
     
    public void WriteSingleRegister(int startingAdress, int value) throws UnknownHostException, SocketException, ModbusException, IOException, SerialPortException, SerialPortTimeoutException;

    public void disconnect() throws UnknownHostException, IOException, SerialPortException, SerialPortTimeoutException;
}