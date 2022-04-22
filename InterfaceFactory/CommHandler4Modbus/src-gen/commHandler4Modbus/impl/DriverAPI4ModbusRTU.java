package commHandler4Modbus.impl;

/**
 * <!-- begin-user-doc -->

 * <!-- end-user-doc -->
 * @generated NOT
 * 
 * 
**/

import java.io.IOException;
import java.math.BigInteger;
import java.net.SocketException;
import java.net.UnknownHostException;

import commHandler4Modbus.DriverAPI4Modbus;
import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortTimeoutException;
import  easymodbus.de.re.easymodbus.exceptions.*;
import  easymodbus.de.re.easymodbus.modbusclient.*;
import  easymodbus.de.re.easymodbus.datatypes.*;

//import jssc.SerialPort;

public class DriverAPI4ModbusRTU implements DriverAPI4Modbus {
	
	ModbusClient mbRTU = new ModbusClient();
	
	public boolean initTrspService(String sCOM)
	{
		int[] responseint;
		
	    try 
	    {          
	    	mbRTU.setSerialFlag(true);
	    	mbRTU.setSerialPort(sCOM);
	    	mbRTU.setBaudrate(19200);
	    	mbRTU.setParity(Parity.Even);
	    	mbRTU.setStopBits(StopBits.One);
	    	mbRTU.setLogFileName("easyModebusRTULogger.txt");   // der Logger läuft, wirft aber eine exception
	    	mbRTU.Connect(sCOM);
	    	mbRTU.setConnectionTimeout(1000);
	         
	    } 
	   
	    
        catch (SerialPortException ex) 
	    {
            System.out.println(ex);
            return false;
        }
        catch (Exception e)
	    {
          e.printStackTrace();
          return false;
         }
        finally
        {	
        	 return true;
        }
	
    }
	

    public void test()
    {
    	 int[] responseint;
    	 try
    	 {
         mbRTU.setUnitIdentifier((byte)11);
         responseint = mbRTU.ReadHoldingRegisters(23308,16);
         System.out.println("ABBMeter I[L1] = " + (((responseint[0]*65536) +responseint[1])/100.0)+" A"); 
         System.out.println("ABBMeter I[L2] = " + (((responseint[2]*65536) + responseint[3])/100.0)+" A"); 
         System.out.println("ABBMeter I[L3] = " + (((responseint[4]*65536) + responseint[5])/100.0)+" A"); 
         //System.out.println("ABBMeter I[N]  = " + (((responseint[6]*65536) + responseint[7])/100.0)+" A"); 
         //System.out.println("ABBMeter P[tot]= " + (((responseint[8]*65536) +  Math.abs(responseint[9])/100.0))+" W"); 
         System.out.println("ABBMeter P[L1] = " + (((responseint[10]*65536) +  Math.abs(responseint[11]))/100.0)+" W"); 
         System.out.println("ABBMeter P[L2] = " + (((responseint[12]*65536) +  Math.abs(responseint[13]))/100.0)+" W"); 
         System.out.println("ABBMeter P[L3] = " + (((responseint[14]*65536) +  Math.abs(responseint[15]))/100.0)+" W");
    	 }
    	 
         catch (SerialPortException ex) 
 	     {
             System.out.println(ex);
         }
         catch (Exception e)
 	     {
           e.printStackTrace();
         }
    }
    
    public void setUnitIdentifier(short unitIdentifier) {
	   mbRTU.setUnitIdentifier(unitIdentifier);
    }
    public int[] ReadHoldingRegisters(int startingAddress, int quantity) throws de.re.easymodbus.exceptions.ModbusException,
    UnknownHostException, SocketException, IOException, SerialPortException, SerialPortTimeoutException
    {
    	return mbRTU.ReadHoldingRegisters(startingAddress,quantity);
    }

    public int[] ReadInputRegisters(int startingAddress, int quantity) throws de.re.easymodbus.exceptions.ModbusException,
    UnknownHostException, SocketException, IOException, SerialPortException, SerialPortTimeoutException
    {
    	return mbRTU.ReadInputRegisters(startingAddress,quantity);
    }

    public void disconnect()
    {
   	  try
   	  {
      	 mbRTU.Disconnect();
      }

      catch (Exception e)
	  {
       e.printStackTrace();
      }
    }
}
