package communicator.helper;
/**
*Copyright(c) 2021 Verein SmartGridready Switzerland
* @generated NOT
* 
This Open Source Software is BSD 3 clause licensed:
Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in 
   the documentation and/or other materials provided with the distribution.
3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from 
   this software without specific prior written permission.
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR 
CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, 
PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
OF THE POSSIBILITY OF SUCH DAMAGE.

It includes completely manually generated code. It is the Interface of the Modbus RTU inside the CommHandler and its purpose is to enable 3rd party programmers to
use their own Modbus RTU drivers
 */


/**
 * <!-- begin-user-doc -->

 * <!-- end-user-doc -->
 * @generated NOT
 * 
 * 
**/

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;

import de.re.easymodbus.datatypes.Parity;
import de.re.easymodbus.datatypes.StopBits;
import de.re.easymodbus.exceptions.ModbusException;
import de.re.easymodbus.modbusclient.ModbusClient;
import jssc.SerialPortException;
import jssc.SerialPortTimeoutException;

//import jssc.SerialPort;

public class GenDriverAPI4ModbusRTU implements GenDriverAPI4Modbus {
	
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
	    	// mbRTU.setLogFileName("easyModebusRTULogger.txt",true);   
	    	// REMARK: to set datalogging active by setting the second parameter to true
	    	mbRTU.Connect(sCOM);
	    	mbRTU.setConnectionTimeout(1500);
	         
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

    public boolean[] ReadDiscreteInputs(int startingAddress, int quantity) throws de.re.easymodbus.exceptions.ModbusException,
    UnknownHostException, SocketException, IOException, SerialPortException, SerialPortTimeoutException
    {   boolean[] responsebool;
    responsebool = mbRTU.ReadDiscreteInputs(startingAddress,quantity);
    	return  responsebool ;
    }

    public boolean[] ReadCoils(int startingAddress, int quantity) throws de.re.easymodbus.exceptions.ModbusException,
    UnknownHostException, SocketException, IOException, SerialPortException, SerialPortTimeoutException
    {   boolean[] responseint;
		responseint = mbRTU.ReadCoils(startingAddress,quantity);
    	return  responseint ;
    }
    

    public void  WriteMultipleCoils(int startingAdress, boolean[] values) throws UnknownHostException, SocketException, ModbusException, IOException, SerialPortException, SerialPortTimeoutException 
    {
    	mbRTU.WriteMultipleCoils(startingAdress,values);  
    }
    
    public void  WriteSingleCoil(int startingAdress, boolean value) throws UnknownHostException, SocketException, ModbusException, IOException, SerialPortException, SerialPortTimeoutException 
    {
    	mbRTU.WriteSingleCoil(startingAdress, value);
    }

     public void  WriteMultipleRegisters(int startingAdress, int[] values) throws UnknownHostException, SocketException, ModbusException, IOException, SerialPortException, SerialPortTimeoutException 
     {
    	 mbRTU.WriteMultipleRegisters(startingAdress, values); 
     }
     
     public void WriteSingleRegister(int startingAdress, int value) throws UnknownHostException, SocketException, ModbusException, IOException, SerialPortException, SerialPortTimeoutException
     {
    	 mbRTU.WriteSingleRegister(startingAdress, value);   
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
