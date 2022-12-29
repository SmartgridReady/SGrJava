/**
*Copyright(c) 2022 Verein SmartGridready Switzerland
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

author: IBT/cb
The purpose of this class is to offer a test environment with all existing decives at the IBT lab in order to allow communication tests under long term  
and significant traffic load conditions 

 */

package communicator.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.math.BigInteger;

// WIP/cb import com.smartgridready.ns.v0.SGrBool2BitRankType;
import com.smartgridready.ns.v0.SGrEVStateType;
import com.smartgridready.ns.v0.SGrEnumListType;
import com.smartgridready.ns.v0.SGrModbusDeviceFrame;
import com.smartgridready.ns.v0.SGrOCPPStateType;
import com.smartgridready.ns.v0.SGrBool2BitRankType;
import communicator.common.runtime.Parity;
import communicator.helper.DeviceDescriptionLoader;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusRTU;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusTCP;

public class IBTlabLoopTester {
	
	private static final String XML_BASE_DIR = "../../../SGrSpecifications/XMLInstances/ExtInterfaces/"; 
	
	// we need static definitions for performance reason
	//------------------------------------------------------
	
	// Modbus RTU devices
	private static SGrModbusDevice devWagoMeter = null;
	private static SGrModbusDevice devABBMeter = null;
	private static SGrModbusDevice devTB_ABBMeter = null;
	// we need a single driver instance for RTU and separate these by device addres
	private static GenDriverAPI4ModbusRTU mbRTU = null;
	
	// Modbus TCP devices
	private static SGrModbusDevice devVGT_SGCP = null;
	private static SGrModbusDevice devGaroWallbox = null;
	private static SGrModbusDevice devOMCCIWallbox = null;
	private static SGrModbusDevice devFroniusSymo = null;
	
	// test loop parameters
	private static int runtimeCnt = 0;
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    
	// Exception Counters
	private static int devABBMeterExcpetions = 0;
	private static int devVGT_SGCPExceptions = 0;
	private static int devGaroWallboxExceptions = 0;
	private static int devFroniusSymoExceptions = 0;
	// TestBox
	private static int devTB_ABBMeterExcpetions = 0;
	private static int devWagoMeterExceptions = 0;
	private static int devOMCCIWallboxExceptions = 0;
	
	// device selection
	private static boolean  devABBMeterTestIsOn = false; 
	private static boolean  devVGT_SGCPTestIsOn = false; 
	private static boolean  devFroniusSymoTestIsOn = true; 
	private static boolean  devGaroWallboxTestIsOn = false; 
	// TestBox
	private static boolean  devTB_ABBMeterTestIsOn = false; 
	private static boolean  devWagoMeterTestIsOn = false; 
	private static boolean  devOMCCIWallboxTestIsOn = false; 
	
	// shell for enumerations
	private static SGrEnumListType oEnumList = null;
	
	public static void main( String argv[] ) {	
		

		
		try {
			
			//DeviceDescriptionLoader<SGrModbusDeviceDescriptionType> loader = new DeviceDescriptionLoader<>();
		  
			// Modbus RTU uses a single driver  (tailored to easymodbus)
			mbRTU = new GenDriverAPI4ModbusRTU();
			//mbRTU.initTrspService("COM5", 9600, Parity.NONE);	// for mobile RTU Interface		
			mbRTU.initTrspService("COM9", 9600, Parity.NONE);   // for Office RTU Interface	
			if (devABBMeterTestIsOn)  {
				System.out.printf("%n-init devABBMeterTest @:" + dtf.format(LocalDateTime.now())+ "%n");initABBMeter(XML_BASE_DIR, "SGr_04_0016_xxxx_ABBMeterV0.2.1.xml");
			}
			if (devVGT_SGCPTestIsOn)   {
				System.out.printf("%n-init devVGT_SGCPTest @:" + dtf.format(LocalDateTime.now())+ "%n");initVGT_SGCP (XML_BASE_DIR,"SGr_04_0019_0059_VGT_SPSDeviceforHomeAutomation_v0.2.1.xml");
			}
			if (devGaroWallboxTestIsOn) {
				System.out.printf("%n-init devGaroWallboxTest @:" + dtf.format(LocalDateTime.now())+ "%n"); initGaroWallbox(XML_BASE_DIR, "SGr_04_0005_xxxx_GARO_WallboxV0.2.1.xml");
			}
			if (devFroniusSymoTestIsOn) {
				System.out.printf("%n-init FroniusSymoTest @:" + dtf.format(LocalDateTime.now()) + "%n"); initFroniusSymo(XML_BASE_DIR,"SGr_04_0021_xxxx_FroniusSymoV0.2.1.xml");
			}	

			// TestBox
			if (devTB_ABBMeterTestIsOn)  {
				System.out.printf("%n-init TestBox: devTB_ABBMeterTest @:" + dtf.format(LocalDateTime.now())+ "%n");initTB_ABBMeter(XML_BASE_DIR, "SGr_04_0016_xxxx_ABBMeterV0.2.1.xml");
			}
			if (devWagoMeterTestIsOn) {
				System.out.printf("%n-init TestBox: devWagoMeterTest @: " + dtf.format(LocalDateTime.now())+ "%n");
				initWagoMeter(XML_BASE_DIR, "SGr_04_0014_0000_WAGO_SmartMeterV0.2.1.xml");
			}
			if (devOMCCIWallboxTestIsOn) {
				//TODO: complete and use OMCCI EI.xml
				System.out.printf("%n-init devOMCCIWallboxTest @:" + dtf.format(LocalDateTime.now())+ "%n"); initOMCCIWallbox(XML_BASE_DIR, "SGr_04_0005_xxxx_GARO_WallboxV0.2.1.xml");
			}

 
		
			
			// **************************   Start device Testing   **********************************						
   			
			try {
				  				   
				for (runtimeCnt = 0;runtimeCnt<30000;runtimeCnt++)
				{
					
				   // loop data & test reporting
			        System.out.printf("%n" + dtf.format(LocalDateTime.now()));			        
					System.out.printf("  ------> LOOP=" +	runtimeCnt + "  Exceptions:");		
					if (devABBMeterTestIsOn)    System.out.printf(" ABBMeter=" +  devABBMeterExcpetions+ ",");
					if (devVGT_SGCPTestIsOn)    System.out.printf(" VGT_SCP=" +  devVGT_SGCPExceptions+ ",");
				    if (devGaroWallboxTestIsOn) System.out.printf(" GaroWallbox=" + devGaroWallboxExceptions+ ",");
					if (devFroniusSymoTestIsOn) System.out.printf(" FroniusSymo=" + devFroniusSymoExceptions + ",");
					// TestBox
					if (devTB_ABBMeterTestIsOn)    System.out.printf(" TestBox ABBMeter=" +  devTB_ABBMeterExcpetions+ ",");
				  if (devOMCCIWallboxTestIsOn) System.out.printf(" TestBox OMCCIWallbox=" + devOMCCIWallboxExceptions+ ",");
					if (devWagoMeterTestIsOn)   System.out.printf(" TestBox WagoMeter=" + devWagoMeterExceptions + ",");
					System.out.println(" <------");
					
				    //_____Next loop 
					if (devABBMeterTestIsOn)    tstABBMeter();					
					if (devVGT_SGCPTestIsOn)    tstVGT_SGCP(); 
				    if (devGaroWallboxTestIsOn) tstGaroWallbox();
					if (devFroniusSymoTestIsOn) tstFroniusSymo();	
					// TestBox
					if (devTB_ABBMeterTestIsOn)  tstTB_ABBMeter();	
				    if (devOMCCIWallboxTestIsOn) tstOMCCIWallbox();
					if (devWagoMeterTestIsOn)    tstWagoMeter();

				    Thread.sleep(500);  // show last block for ccc  milliseconds
				}
			}

		    catch ( Exception e)
	 	   {
				System.out.println( "Error reading value from device " + e);
				e.printStackTrace();
		   }
	   }
	 
	   catch ( Exception e )
	   {
		  	 System.out.println( "Error loading device description. " + e);
	   }									
 
	}
   // -----------------------------------------------------------------------------------------------------------------------------	
   // WAGO Meter testing
   // -----------------------------------------------------------------------------------------------------------------------------	
	static void initWagoMeter(String aBaseDir, String aDescriptionFile ) {				
		
		try {	
			
			DeviceDescriptionLoader<SGrModbusDeviceFrame> loader = new DeviceDescriptionLoader<>();
			SGrModbusDeviceFrame tstMeter = loader.load(aBaseDir,aDescriptionFile);	
			devWagoMeter =  new SGrModbusDevice(tstMeter, mbRTU );

			
		}
		
		catch ( Exception e )
		{
			System.out.println( "Error loading device description devWagoMeter:" + e);
		}		
	}
	
	static void tstWagoMeter()
	{
		float fVal1 = (float) 0.0, fVal2 = (float) 0.0, fVal3 = (float) 0.0, fVal4 = (float) 0.0;
		String  sVal1 = "0.0", sVal2 = "0.0", sVal3 = "0.0", sVal4 ="0.0";
		
			try {							
				mbRTU.setUnitIdentifier((byte) 7);
			    System.out.println();
				System.out.println("@:Testing TestBox: WAGO Meter");
				Thread.sleep(25);
				fVal1 = devWagoMeter.getValByGDPType("VoltageAC", "VoltageL1").getFloat32();
				Thread.sleep(10);            
				fVal2 = devWagoMeter.getValByGDPType("VoltageAC", "VoltageL2").getFloat32(); 
				Thread.sleep(10);
				fVal3 = devWagoMeter.getValByGDPType("VoltageAC", "VoltageL3").getFloat32();
				Thread.sleep(10);
				fVal4 = devWagoMeter.getValByGDPType("Frequency", "Frequency").getFloat32();
				System.out.printf("  VoltageAC L1,2,3/Frequency [V,Hz]: " + fVal1 + ",  " + fVal2 + ",  "
						+ fVal3 + ",  " + fVal4 + " %n");
				Thread.sleep(10);
				fVal1 = devWagoMeter.getValByGDPType("VoltageAC", "VoltageACL1-L2").getFloat32();
				Thread.sleep(10);
				fVal2 = devWagoMeter.getValByGDPType("VoltageAC", "VoltageACL1-L3").getFloat32();
				Thread.sleep(10);
				fVal3 = devWagoMeter.getValByGDPType("VoltageAC", "VoltageACL2-L3").getFloat32();
				System.out.printf("  VoltageAC L12/13/23 [V]:           " + fVal1 + ",  " + fVal2 + ",  "
						+ fVal3 + " %n");
				Thread.sleep(10);
				fVal1 = devWagoMeter.getValByGDPType("CurrentAC", "CurrentACL1").getFloat32();
				Thread.sleep(10);
				fVal2 = devWagoMeter.getValByGDPType("CurrentAC", "CurrentACL2").getFloat32();
				Thread.sleep(10);
				fVal3 = devWagoMeter.getValByGDPType("CurrentAC", "CurrentACL3").getFloat32();
				System.out.printf("  CurrentAC L1/2/3 [A]:              " + fVal1 + ",  " + fVal2 + ",  "
						+ fVal3 + " %n");
				Thread.sleep(10);
				fVal1 = devWagoMeter.getValByGDPType("PowerFactor", "PowerFactor").getFloat32();
				Thread.sleep(10);
				fVal2 = devWagoMeter.getValByGDPType("PowerFactor", "PowerFactorL1").getFloat32();
				Thread.sleep(10);
				fVal3 = devWagoMeter.getValByGDPType("PowerFactor", "PowerFactorL2").getFloat32();
				Thread.sleep(10);
				fVal4 = devWagoMeter.getValByGDPType("PowerFactor", "PowerFactorL3").getFloat32();
				System.out.printf("  Powerfactor tot/L1/L2/L3:          " + fVal1 + ",  " + fVal2 + ",  "
						+ fVal3 + ",  " + fVal4 + " %n");
				Thread.sleep(10); 
				sVal1 = devWagoMeter.getVal("ActiveEnergyAC", "ActiveEnergyACtot");
				Thread.sleep(10);
				sVal2 = devWagoMeter.getVal("ActiveEnergyAC", "ActiveEnergyACL1");
				Thread.sleep(10);
				sVal3 = devWagoMeter.getVal("ActiveEnergyAC", "ActiveEnergyACL2");
				Thread.sleep(10);
				sVal4 = devWagoMeter.getVal("ActiveEnergyAC", "ActiveEnergyACL3");
				System.out.printf("  ActiveEnergyAC [kWh]:         " + sVal1 + ",  " + sVal2 + ",  " + sVal3
						+ ",  " + sVal4 + " %n");
				Thread.sleep(10);
				sVal1 = devWagoMeter.getVal("ActivePowerAC", "ActivePowerACtot");
				Thread.sleep(10);
				sVal2 = devWagoMeter.getVal("ActivePowerAC", "ActivePowerACL1");
				Thread.sleep(10);
				sVal3 = devWagoMeter.getVal("ActivePowerAC", "ActivePowerACL2");
				Thread.sleep(10);
				sVal4 = devWagoMeter.getVal("ActivePowerAC", "ActivePowerACL3");
				System.out.printf("  ActivePowerAC [kW]:           " + sVal1 + ", " + sVal2 + ",  " + sVal3
						+ ",  " + sVal4 + " %n");
				Thread.sleep(10);
				sVal1 = devWagoMeter.getVal("ReactivePowerAC", "ReactivePowerACtot");
				Thread.sleep(10);
				sVal2 = devWagoMeter.getVal("ReactivePowerAC", "ReactivePowerACL1");
				Thread.sleep(10);
				sVal3 = devWagoMeter.getVal("ReactivePowerAC", "ReactivePowerACL2");
				Thread.sleep(10);
				sVal4 = devWagoMeter.getVal("ReactivePowerAC", "ReactivePowerACL3");
				System.out.printf("  ReactivePowerAC [kvar]:       " + sVal1 + ", " + sVal2 + ",  " + sVal3
						+ ",  " + sVal4 + " %n");
				Thread.sleep(10);
				sVal1 = devWagoMeter.getVal("ApparentPowerAC", "ApparentPowerACtot");
				Thread.sleep(10);
				sVal2 = devWagoMeter.getVal("ApparentPowerAC", "ApparentPowerACL1");
				Thread.sleep(10);
				sVal3 = devWagoMeter.getVal("ApparentPowerAC", "ApparentPowerACL2");
				Thread.sleep(10);
				sVal4 = devWagoMeter.getVal("ApparentPowerAC", "ApparentPowerACL3");
				System.out.printf("  ApparentPowerAC [kva]:        " + sVal1 + ", " + sVal2 + ",  " + sVal3
						+ ",  " + sVal4 + " %n");
				Thread.sleep(10);
				sVal1 = devWagoMeter.getVal("ActiveEnerBalanceAC", "ActiveImportAC");
				Thread.sleep(10);
				sVal2 = devWagoMeter.getVal("ActiveEnerBalanceAC", "ActiveExportAC");
				Thread.sleep(10);
				sVal3 = devWagoMeter.getVal("ActiveEnerBalanceAC", "ActiveNetAC");
				System.out.printf("  ActiveEnerBalanceAC [KWh]:    " + sVal1 + ", " + sVal2 + ",  " + sVal3 + " %n");

				Thread.sleep(10);
				sVal1 = devWagoMeter.getVal("ReactiveEnerBalanceAC", "ReactiveImportAC");
				Thread.sleep(10);
				sVal2 = devWagoMeter.getVal("ReactiveEnerBalanceAC", "ReactiveExportAC");
				Thread.sleep(10);
				sVal3 = devWagoMeter.getVal("ReactiveEnerBalanceAC", "ReactiveNetAC");
				System.out.printf("  ReactiveEnerBalanceAC [kvarh]:" + sVal1 + ", " + sVal2 + ",  " + sVal3  + " %n");
				
				Thread.sleep(10);
				sVal1 = devWagoMeter.getVal("PowerQuadrant", "PwrQuadACtot");
				Thread.sleep(10);
				sVal2 = devWagoMeter.getVal("PowerQuadrant", "PwrQuadACL1");
				Thread.sleep(10);
				sVal3 = devWagoMeter.getVal("PowerQuadrant", "PwrQuadACL2");
				Thread.sleep(10);
				sVal4 = devWagoMeter.getVal("PowerQuadrant", "PwrQuadACL3");
				System.out.printf("  PowerQuadrant  tot/L1/L3/L3 :        " + sVal1 + ", " + sVal2 + ", " + sVal3
						+ ",  " + sVal4 + " %n");

				Thread.sleep(10);
				sVal1 = devWagoMeter.getVal("CurrentDirection", "CurrentDirL1");
				Thread.sleep(10);
				sVal2 = devWagoMeter.getVal("CurrentDirection", "CurrentDirL2");
				Thread.sleep(10);
				sVal3 = devWagoMeter.getVal("CurrentDirection", "CurrentDirL3");
				System.out.printf("  CurrentDirection  L1/L3/L3 :        " + sVal1 + ", " + sVal2 + ",  " + sVal3
						+  " %n"); 

			}
			catch ( Exception e)
			{
				devWagoMeterExceptions++;
				System.out.println( "Error reading value from device devWagoMeter:" + e);
				e.printStackTrace();
			}
		}
	
	
	

	   // -----------------------------------------------------------------------------------------------------------------------------	
	   // Device ABBMeter Testing
	   // -----------------------------------------------------------------------------------------------------------------------------	
		static void initABBMeter(String aBaseDir, String aDescriptionFile ) {				
			
			try {	
				
				DeviceDescriptionLoader<SGrModbusDeviceFrame> loader = new DeviceDescriptionLoader<>();
				SGrModbusDeviceFrame tstDesc = loader.load(aBaseDir, aDescriptionFile);	
				devABBMeter =  new SGrModbusDevice(tstDesc, mbRTU );
				
			}
			
			catch ( Exception e )
			{
				System.out.println( "Error loading device description. " + e);
			}		
		}
		
		static void tstABBMeter()
		{
			float fVal1 = (float) 0.0, fVal2 = (float) 0.0, fVal3 = (float) 0.0, fVal4 = (float) 0.0;
			String  sVal1 = "0.0", sVal2 = "0.0", sVal3 = "0.0", sVal4 ="0.0";
			
				try {
	 				  mbRTU.setUnitIdentifier((byte) 11);	
	  				  System.out.printf("%n@:Testing ABBMeter:%n");
					  Thread.sleep(50);
					  sVal1 = devABBMeter.getVal("ActiveEnerBalanceAC", "ActiveImportAC");
					  Thread.sleep(10);
					  sVal2 = devABBMeter.getVal("ActiveEnerBalanceAC", "ActiveExportAC");
					  Thread.sleep(10);
					  sVal3 = devABBMeter.getVal("ActiveEnerBalanceAC", "ActiveNetAC");
					  Thread.sleep(10);
					  System.out.printf(" ActiveEnerBalanceAC [KWh]:  " + sVal1 + ",  " + sVal2 + ",  " + sVal3 + " %n");	
	 
					  sVal1 = devABBMeter.getVal("ActivePowerAC", "ActivePowerACtot");
					  Thread.sleep(10);
					  sVal2 = devABBMeter.getVal("ActivePowerAC", "ActivePowerACL1");
					  Thread.sleep(10);
					  sVal3 = devABBMeter.getVal("ActivePowerAC", "ActivePowerACL2");
					  Thread.sleep(10);
					  sVal4 = devABBMeter.getVal("ActivePowerAC", "ActivePowerACL3");
					  Thread.sleep(10);
					  System.out.printf(" ActivePowerAC [KW]:           " + sVal1 + ",  " + sVal2 + ",  " + sVal3 + ",  " + sVal4 + " %n");	
	 	
					  sVal1 = devABBMeter.getVal("CurrentAC", "CurrentACL1");
					  Thread.sleep(10);
					  sVal2 = devABBMeter.getVal("CurrentAC", "CurrentACL2");
					  Thread.sleep(10);
					  sVal3 = devABBMeter.getVal("CurrentAC", "CurrentACL3");
					  Thread.sleep(10);
					  sVal4 = devABBMeter.getVal("CurrentAC", "CurrentACN");
					  Thread.sleep(10);
					  System.out.printf(" CurrentAC [A]:             " + sVal1 + ",  " + sVal2 + ",  " + sVal3 +  ",  " + sVal4 + " %n");	
		
					
				}
				catch ( Exception e)
				{
					devABBMeterExcpetions++;
					System.out.println( "Error reading value from device devABBMeter:" +  e);
					e.printStackTrace();
				}
			}
		

	   // -----------------------------------------------------------------------------------------------------------------------------	
	   // Device ABBMeter Testing
	   // -----------------------------------------------------------------------------------------------------------------------------	
		static void initTB_ABBMeter(String aBaseDir, String aDescriptionFile ) {				
			
			try {	
				
				DeviceDescriptionLoader<SGrModbusDeviceFrame> loader = new DeviceDescriptionLoader<>();
				SGrModbusDeviceFrame tstDesc = loader.load(aBaseDir, aDescriptionFile);	
				devTB_ABBMeter =  new SGrModbusDevice(tstDesc, mbRTU );
				
			}
			
			catch ( Exception e )
			{
				System.out.println( "Error loading device description. " + e);
			}		
		}
		
		static void tstTB_ABBMeter()
		{
			float fVal1 = (float) 0.0, fVal2 = (float) 0.0, fVal3 = (float) 0.0, fVal4 = (float) 0.0;
			String  sVal1 = "0.0", sVal2 = "0.0", sVal3 = "0.0", sVal4 ="0.0";
			
				try {
	 				  mbRTU.setUnitIdentifier((byte) 1 );	
	  				  System.out.printf("%n@:Testing TestBox: ABBMeter:%n");
					  Thread.sleep(50);
					  sVal1 = devTB_ABBMeter.getVal("ActiveEnerBalanceAC", "ActiveImportAC");
					  Thread.sleep(10);
					  sVal2 = devTB_ABBMeter.getVal("ActiveEnerBalanceAC", "ActiveExportAC");
					  Thread.sleep(10);
					  sVal3 = devTB_ABBMeter.getVal("ActiveEnerBalanceAC", "ActiveNetAC");
					  Thread.sleep(10);
					  System.out.printf(" ActiveEnerBalanceAC [KWh]:  " + sVal1 + ",  " + sVal2 + ",  " + sVal3 + " %n");	
	 
					  sVal1 = devTB_ABBMeter.getVal("ActivePowerAC", "ActivePowerACtot");
					  Thread.sleep(10);
					  sVal2 = devTB_ABBMeter.getVal("ActivePowerAC", "ActivePowerACL1");
					  Thread.sleep(10);
					  sVal3 = devTB_ABBMeter.getVal("ActivePowerAC", "ActivePowerACL2");
					  Thread.sleep(10);
					  sVal4 = devTB_ABBMeter.getVal("ActivePowerAC", "ActivePowerACL3");
					  Thread.sleep(10);
					  System.out.printf(" ActivePowerAC [KW]:         " + sVal1 + ",  " + sVal2 + ",  " + sVal3 + ",  " + sVal4 + " %n");	
	 	
					  sVal1 = devTB_ABBMeter.getVal("CurrentAC", "CurrentACL1");
					  Thread.sleep(10);
					  sVal2 = devTB_ABBMeter.getVal("CurrentAC", "CurrentACL2");
					  Thread.sleep(10);
					  sVal3 = devTB_ABBMeter.getVal("CurrentAC", "CurrentACL3");
					  Thread.sleep(10);
					  sVal4 = devTB_ABBMeter.getVal("CurrentAC", "CurrentACN");
					  Thread.sleep(10);
					  System.out.printf(" CurrentAC [A]:              " + sVal1 + ",  " + sVal2 + ",  " + sVal3 +  ",  " + sVal4 + " %n");	
		
					
				}
				catch ( Exception e)
				{
					devTB_ABBMeterExcpetions++;
					System.out.println( "Error reading value from device devABBMeter:" +  e);
					e.printStackTrace();
				}
			}
		
		
		
	    
		   // -----------------------------------------------------------------------------------------------------------------------------	
		   // Device  VGT SGCP Testing
		   // -----------------------------------------------------------------------------------------------------------------------------	
			static void initVGT_SGCP(String aBaseDir, String aDescriptionFile ) {				
				
				try {	
					
					DeviceDescriptionLoader<SGrModbusDeviceFrame> loader = new DeviceDescriptionLoader<>();
					SGrModbusDeviceFrame tstDesc = loader.load(aBaseDir, aDescriptionFile);	

					// Modbus TCP uses a driver instance per device (Sockets, tailored to easymodbus)
					GenDriverAPI4ModbusTCP mbVGT_SGCP= new GenDriverAPI4ModbusTCP();
					devVGT_SGCP = new SGrModbusDevice(tstDesc, mbVGT_SGCP);	

					mbVGT_SGCP.initDevice("192.168.1.50",502);
					
				}
				
				catch ( Exception e )
				{
					System.out.println( "Error loading device description mbVGT_SGCP: " + e);
				}		
			}
			
			static void tstVGT_SGCP()
			{
				float fVal1 = (float) 0.0, fVal2 = (float) 0.0, fVal3 = (float) 0.0, fVal4 = (float) 0.0;
				String  sVal1 = "0.0", sVal2 = "0.0", sVal3 = "0.0", sVal4 ="0.0";
				
					try {	
					    System.out.println();
						System.out.println("@:Testing devVGT_SGCP");
						Thread.sleep(25);

						  sVal1 = devVGT_SGCP.getVal("BiDirFlexMgmt", "ReadinessState");
						  sVal2 = devVGT_SGCP.getVal("BiDirFlexMgmt", "RunState");
						  sVal3 = devVGT_SGCP.getVal("BiDirFlexMgmt", "ActualActivePower");
						  if ((runtimeCnt & 1) == 0)
							  devVGT_SGCP.setVal("BiDirFlexMgmt", "ActivePowerActivation", "false");
						  else
							  devVGT_SGCP.setVal("BiDirFlexMgmt", "ActivePowerActivation", "true");

						System.out.printf(" ReadinessState / RunState / ActualActivePower: " + sVal1 + ", "
								+ sVal2 + sVal3 + " %n");
						
					}
					catch ( Exception e)
					{
						devVGT_SGCPExceptions++;
						System.out.println( "Error reading value from device devVGT_SGCP :" + e);
						e.printStackTrace();
					}
				}
		
		
			
		    
			   // -----------------------------------------------------------------------------------------------------------------------------	
			   // GARO Wallbox Test
			   // -----------------------------------------------------------------------------------------------------------------------------	
				static void initGaroWallbox(String aBaseDir, String aDescriptionFile ) {				
					
					try {	
						
						DeviceDescriptionLoader<SGrModbusDeviceFrame> loader = new DeviceDescriptionLoader<>();
						SGrModbusDeviceFrame tstDesc = loader.load(aBaseDir, aDescriptionFile);	
						
						// Modbus TCP uses a driver instance per device (Sockets, tailored to easymodbus)
						GenDriverAPI4ModbusTCP mbWbGaro= new GenDriverAPI4ModbusTCP();
						devGaroWallbox = new SGrModbusDevice(tstDesc, mbWbGaro);							
						mbWbGaro.initDevice("192.168.1.182",502);	
						
					}
					
					catch ( Exception e )
					{
						System.out.println( "Error loading device description. " + e);
					}		
				}
				
				
				static void tstGaroWallbox()
				{
					float fVal1 = (float) 0.0, fVal2 = (float) 0.0, fVal3 = (float) 0.0;
					String  sVal1 = "0.0", sVal2 = "0.0";
					SGrEVStateType sgrEVState = null;
					SGrOCPPStateType sgrOCPPState = null;
					int     iVal1  = 0;
					float CurtailCurrent;
					
					
						try {	
							 System.out.printf("%n@:Testing GaroWallbox:%n");							
							 if ((runtimeCnt%60)== 0)
							 {
								 CurtailCurrent = (float) 7.0 + (float)((runtimeCnt/60)%4) ;
								 devGaroWallbox.setVal("Curtailment", "HemsCurrentLimit", String.valueOf(CurtailCurrent));
								 System.out.printf("  Setting HemsCurrentLimit to :     " + CurtailCurrent + " %n");
							 }
							 fVal1 = devGaroWallbox.getValByGDPType("CurrentAC", "CurrentACL1").getFloat32();
							 Thread.sleep(200);
							 fVal2 = devGaroWallbox.getValByGDPType("CurrentAC", "CurrentACL2").getFloat32();
							 Thread.sleep(200);
							 fVal3 = devGaroWallbox.getValByGDPType("CurrentAC", "CurrentACL3").getFloat32();
							 Thread.sleep(200);
							 oEnumList = devGaroWallbox.getValByGDPType("EVSEState", "EV-StatusCode").getEnum();
							 Thread.sleep(200);
							 sgrEVState = oEnumList.getSgrEVState();
							 System.out.printf("  EV-StatusCode:                    " + sgrEVState+ " %n");
							 
							 oEnumList = devGaroWallbox.getValByGDPType("EVSEState", "ocppState").getEnum();
							 Thread.sleep(200);
							 sgrOCPPState = oEnumList.getSgrOCPPState();
							 System.out.printf("  OCPP-StatusCode:                  " + sgrOCPPState + " %n");
							 System.out.printf("  CurrentAC[A]                      I[L1]= " + fVal1 + ",  I[L2] = "  + fVal2 + ",  I[L3] = "  + fVal3 + " %n");		 

							 fVal1 = devGaroWallbox.getValByGDPType("ActivePowerAC", "ActivePowerACL1").getFloat32();
							 Thread.sleep(200);
							 fVal2 = devGaroWallbox.getValByGDPType("ActivePowerAC", "ActivePowerACL2").getFloat32();
							 Thread.sleep(200);
							 fVal3 = devGaroWallbox.getValByGDPType("ActivePowerAC", "ActivePowerACL3").getFloat32();
							 Thread.sleep(200);
							 System.out.printf("  PowerAC[kW]:                      P[1L]= " + fVal1 + ",  P[L2] = "  + fVal2 + ",  P[L3] = "  + fVal3 + " %n");	
								 
							 fVal1 = devGaroWallbox.getValByGDPType("ActiveEnergyAC", "ActiveEnergyACL1").getFloat32();
							 Thread.sleep(200);
							 fVal2 = devGaroWallbox.getValByGDPType("ActiveEEnergyAC", "ActiveEnergyACL2").getFloat32();
							 Thread.sleep(200);
							 fVal3 = devGaroWallbox.getValByGDPType("ActiveEEnergyAC", "ActiveEnergyACL3").getFloat32();
							 Thread.sleep(200);
							 System.out.printf("  EnergyAC[kWh] L1/L2/L3:           W[1] = " + fVal1 + "  W[2] = "  + fVal2 + "  W[3] = "  + fVal3 + " %n");	
								
							 //sVal1 = devGaroWallbox.getVal("EVState", "isSmartEV15118");
							 //Thread.sleep(200);
							 //??? sVal2 = devGaroWallbox.getVal("EVState", "EVCCID");
							 Thread.sleep(200);
							 System.out.printf("  EVState  support (ISO/IEC 15118): " + sVal1 + ",    EVCCID = " + sVal2 + " %n");
							 
							 fVal1 = devGaroWallbox.getValByGDPType("Curtailment", "SafeCurrent").getFloat32();
							 Thread.sleep(200);
							 fVal2 = devGaroWallbox.getValByGDPType("Curtailment", "HemsCurrentLimit").getFloat32();
							 Thread.sleep(200);
							 fVal3 = devGaroWallbox.getValByGDPType("Curtailment", "HWCurrentLimit").getFloat32();
							 Thread.sleep(200);
							 iVal1 = devGaroWallbox.getValByGDPType("Curtailment", "maxReceiveTimeSec").getInt16U();
							 Thread.sleep(200);
							 System.out.printf("  Curtailment:                      SafeCurrent = " + fVal1 + "  HemsCurrentLimit = "  + fVal2 + "  HWCurrentLimit = "  + fVal3 +  "  maxReceiveTimeSec = "  + iVal1 +" %n");
							 
							
						}
						catch ( Exception e)
						{
							devGaroWallboxExceptions++;
							System.out.println( "Error reading value from device devGaroWallbox:" + e);
							e.printStackTrace();
						}
					}
			
				
				
			    
				   // -----------------------------------------------------------------------------------------------------------------------------	
				   // OMCCI Wallbox Test
				   // -----------------------------------------------------------------------------------------------------------------------------	
					static void initOMCCIWallbox(String aBaseDir, String aDescriptionFile ) {				
						//TODO: complete and use full OMCCI EI.xml
						try {	
							
							DeviceDescriptionLoader<SGrModbusDeviceFrame> loader = new DeviceDescriptionLoader<>();
							SGrModbusDeviceFrame tstDesc = loader.load(aBaseDir, aDescriptionFile);	
							
							// Modbus TCP uses a driver instance per device (Sockets, tailored to easymodbus)
							GenDriverAPI4ModbusTCP mbWbOMCCI= new GenDriverAPI4ModbusTCP();
							devOMCCIWallbox = new SGrModbusDevice(tstDesc, mbWbOMCCI);							
							mbWbOMCCI.initDevice("192.168.1.183",502);	
							
						}
						
						catch ( Exception e )
						{
							System.out.println( "Error loading device description. " + e);
						}		
					}
					
					
					static void tstOMCCIWallbox()
					{
						float fVal1 = (float) 0.0, fVal2 = (float) 0.0, fVal3 = (float) 0.0;
						String  sVal1 = "0.0", sVal2 = "0.0";
						SGrEVStateType sgrEVState = null;
						SGrOCPPStateType sgrOCPPState = null;
						int     iVal1  = 0;
						float CurtailCurrent;
						
						
							try {	
								 System.out.printf("%n@:Testing TestBox: OMCCIWallbox:%n");							
								 if ((runtimeCnt%60)== 0)
								 {
									 CurtailCurrent = (float) 7.0 + (float)((runtimeCnt/60)%4) ;
									 devOMCCIWallbox.setVal("Curtailment", "HemsCurrentLimit", String.valueOf(CurtailCurrent));
									 System.out.printf("  Setting HemsCurrentLimit to :     " + CurtailCurrent + " %n");
								 }
								 fVal1 = devOMCCIWallbox.getValByGDPType("CurrentAC", "CurrentACL1").getFloat32();
								 Thread.sleep(200);
								 fVal2 = devOMCCIWallbox.getValByGDPType("CurrentAC", "CurrentACL2").getFloat32();
								 Thread.sleep(200);
								 fVal3 = devOMCCIWallbox.getValByGDPType("CurrentAC", "CurrentACL3").getFloat32();
								 Thread.sleep(200);
								 oEnumList = devOMCCIWallbox.getValByGDPType("EVSEState", "EV-StatusCode").getEnum();
								 Thread.sleep(200);
								 sgrEVState = oEnumList.getSgrEVState();
								 System.out.printf("  EV-StatusCode:                    " + sgrEVState+ " %n");
								 
								 oEnumList = devOMCCIWallbox.getValByGDPType("EVSEState", "ocppState").getEnum();
								 Thread.sleep(200);
								 sgrOCPPState = oEnumList.getSgrOCPPState();
								 System.out.printf("  OCPP-StatusCode:                  " + sgrOCPPState + " %n");
								 System.out.printf("  CurrentAC[A]                      I[L1]= " + fVal1 + ",  I[L2] = "  + fVal2 + ",  I[L3] = "  + fVal3 + " %n");		 

								 fVal1 = devOMCCIWallbox.getValByGDPType("ActivePowerAC", "ActivePowerACL1").getFloat32();
								 Thread.sleep(200);
								 fVal2 = devOMCCIWallbox.getValByGDPType("ActivePowerAC", "ActivePowerACL2").getFloat32();
								 Thread.sleep(200);
								 fVal3 = devOMCCIWallbox.getValByGDPType("ActivePowerAC", "ActivePowerACL3").getFloat32();
								 Thread.sleep(200);
								 System.out.printf("  PowerAC[kW]:                      P[1L]= " + fVal1 + ",  P[L2] = "  + fVal2 + ",  P[L3] = "  + fVal3 + " %n");	
									 
								 fVal1 = devOMCCIWallbox.getValByGDPType("ActiveEnergyAC", "ActiveEnergyACL1").getFloat32();
								 Thread.sleep(200);
								 fVal2 = devOMCCIWallbox.getValByGDPType("ActiveEEnergyAC", "ActiveEnergyACL2").getFloat32();
								 Thread.sleep(200);
								 fVal3 = devOMCCIWallbox.getValByGDPType("ActiveEEnergyAC", "ActiveEnergyACL3").getFloat32();
								 Thread.sleep(200);
								 System.out.printf("  EnergyAC[kWh] L1/L2/L3:           W[1] = " + fVal1 + "  W[2] = "  + fVal2 + "  W[3] = "  + fVal3 + " %n");	
									
								 //sVal1 = devOMCCIWallbox.getVal("EVState", "isSmartEV15118");
								 //Thread.sleep(200);
								 //??? sVal2 = devOMCCIWallbox.getVal("EVState", "EVCCID");
								 Thread.sleep(200);
								 System.out.printf("  EVState  support (ISO/IEC 15118): " + sVal1 + ",    EVCCID = " + sVal2 + " %n");
								 
								 fVal1 = devOMCCIWallbox.getValByGDPType("Curtailment", "SafeCurrent").getFloat32();
								 Thread.sleep(200);
								 fVal2 = devOMCCIWallbox.getValByGDPType("Curtailment", "HemsCurrentLimit").getFloat32();
								 Thread.sleep(200);
								 fVal3 = devOMCCIWallbox.getValByGDPType("Curtailment", "HWCurrentLimit").getFloat32();
								 Thread.sleep(200);
								 iVal1 = devOMCCIWallbox.getValByGDPType("Curtailment", "maxReceiveTimeSec").getInt16U();
								 Thread.sleep(200);
								 System.out.printf("  Curtailment:                      SafeCurrent = " + fVal1 + "  HemsCurrentLimit = "  + fVal2 + "  HWCurrentLimit = "  + fVal3 +  "  maxReceiveTimeSec = "  + iVal1 +" %n");
								 
							}
							catch ( Exception e)
							{
								devOMCCIWallboxExceptions++;
								System.out.println( "Error reading value from device devOMCCIWallbox:" + e);
								e.printStackTrace();
							}
						}
				
					
			    
				   // -----------------------------------------------------------------------------------------------------------------------------	
				   // Fronius Symo test 
				   // -----------------------------------------------------------------------------------------------------------------------------	
					static void initFroniusSymo(String aBaseDir, String aDescriptionFile ) {				
						
						try {	
							
							DeviceDescriptionLoader<SGrModbusDeviceFrame> loader = new DeviceDescriptionLoader<>();
							SGrModbusDeviceFrame tstDesc = loader.load(aBaseDir, aDescriptionFile);	
							
							// Modbus TCP uses a driver instance per device (Sockets, tailored to easymodbus)
							GenDriverAPI4ModbusTCP mbPVFroniusSymo = new GenDriverAPI4ModbusTCP();
							devFroniusSymo = new SGrModbusDevice(tstDesc, mbPVFroniusSymo);
						    mbPVFroniusSymo.initDevice("192.168.1.181",502);
						}
						
						catch ( Exception e )
						{
							System.out.println( "Error loading device description. " + e);
						}		
					}
					
					static void tstFroniusSymo()
					{
						float fVal1 = (float) 0.0, fVal2 = (float) 0.0, fVal3 = (float) 0.0, fVal4 = (float) 0.0;
						String  sVal1 = "0.0", sVal2 = "0.0", sVal3 = "0.0", sVal4 ="0.0";						
						boolean b;
						long l;
											

							try {	
								 System.out.printf("%n@:Testing FroniusSymo:%n");
								 sVal1 = devFroniusSymo.getVal("SunspInvModel", "SunspecID");
								 Thread.sleep(25);
								 sVal2 = devFroniusSymo.getVal("SunspInvModel", "InvModelBlockLen");
								 Thread.sleep(25);
								 sVal3 = devFroniusSymo.getVal("SunspInvModel", "CurrentACtot");
								 Thread.sleep(25);
								 System.out.printf("  SunspInvModel, SspID.len CurrACtot[A]:  " + sVal1 + ",     " + sVal2 + ",  "	+ sVal3 + " %n");
								 Thread.sleep(25);
								 sVal1 = devFroniusSymo.getVal("SunspInvModel", "CurrentACL1");
								 Thread.sleep(25);
								 sVal2 = devFroniusSymo.getVal("SunspInvModel", "CurrentACL2");
								 Thread.sleep(25);
								 sVal3 = devFroniusSymo.getVal("SunspInvModel", "CurrentACL3");
								 Thread.sleep(25);
								 System.out.printf("  SunspInvModel CurrentAC [A]:          " + sVal1 + ", " + sVal2 + ",  " + sVal3 + " %n");	
								 Thread.sleep(25);		
									
								 
								 System.out.printf("  Status SunspInvModel EvenList1 %n");
								 l =  devFroniusSymo.getValByGDPType("  SunspInvModel","EventList1").getInt32U();
								 System.out.printf("   StatusRegister :         " + l + " %n");
							     Thread.sleep(25);
								 System.out.printf("   SunspInvModel EventList 1: isTrue =  ");
							     b = devFroniusSymo.getValArr("SunspInvModel","EventList1")[SGrBool2BitRankType.BIT0_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT0, ") ;
								Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList1")[SGrBool2BitRankType.BIT1_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT1, ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList1")[SGrBool2BitRankType.BIT2_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT2, ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList1")[SGrBool2BitRankType.BIT3_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT3, ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList1")[SGrBool2BitRankType.BIT4_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT4 ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList1")[SGrBool2BitRankType.BIT5_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT5 ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList1")[SGrBool2BitRankType.BIT6_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT6 ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList1")[SGrBool2BitRankType.BIT7_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT7 ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList1")[SGrBool2BitRankType.BIT8_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT8 ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList1")[SGrBool2BitRankType.BIT9_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT9 ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList1")[SGrBool2BitRankType.BIT10_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT10, ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList1")[SGrBool2BitRankType.BIT11_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT11, ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList1")[SGrBool2BitRankType.BIT12_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT12, ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList1")[SGrBool2BitRankType.BIT13_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT13, ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList1")[SGrBool2BitRankType.BIT14_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT14 ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList1")[SGrBool2BitRankType.BIT15_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT15 ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList1")[SGrBool2BitRankType.BIT16_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT16 ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList1")[SGrBool2BitRankType.BIT17_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT17 ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList1")[SGrBool2BitRankType.BIT18_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT18 ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList1")[SGrBool2BitRankType.BIT19_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT19 ") ;
								 Thread.sleep(25);
								 System.out.printf("%n");
								 // REM: array type is preliminary  
								 System.out.printf("  Status SunspInvModel EvenList2 %n");
								 System.out.printf("   EventList 2: isTrue =  ");
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList2")[SGrBool2BitRankType.BIT0_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT0, ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList2")[SGrBool2BitRankType.BIT1_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT1, ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList2")[SGrBool2BitRankType.BIT2_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT2, ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList2")[SGrBool2BitRankType.BIT3_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT3, ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList2")[SGrBool2BitRankType.BIT4_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT4 ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList2")[SGrBool2BitRankType.BIT5_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT5 ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList2")[SGrBool2BitRankType.BIT6_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT6 ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList2")[SGrBool2BitRankType.BIT7_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT7 ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList2")[SGrBool2BitRankType.BIT8_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT8 ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList2")[SGrBool2BitRankType.BIT9_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT9 ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList2")[SGrBool2BitRankType.BIT10_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT10, ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList2")[SGrBool2BitRankType.BIT11_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT11, ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList2")[SGrBool2BitRankType.BIT12_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT12, ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList2")[SGrBool2BitRankType.BIT13_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT13, ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList2")[SGrBool2BitRankType.BIT14_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT14 ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList2")[SGrBool2BitRankType.BIT15_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT15 ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList2")[SGrBool2BitRankType.BIT16_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT16 ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList2")[SGrBool2BitRankType.BIT17_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT17 ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList2")[SGrBool2BitRankType.BIT18_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT18 ") ;
								 Thread.sleep(25);
								 b= devFroniusSymo.getValArr("SunspInvModel","EventList2")[SGrBool2BitRankType.BIT19_VALUE].isBoolean();
								 if (b)  System.out.printf("BIT19 ") ;
								 Thread.sleep(25);
								 System.out.printf("%n");
								 Thread.sleep(25);
								 l =  devFroniusSymo.getValByGDPType("SunspInvModel","EventList1").getInt32U();
								 System.out.printf("   StatusRegister :         " + l + " %n");
							 }
							 catch ( Exception e)
							 {
								devFroniusSymoExceptions++;
								System.out.println( "Error reading value from device: "+ devFroniusSymo.getClass().getName() + e);
								e.printStackTrace();
							}
						}
				
				
		
       // USED TO COPY / PASTE ADDITIONAL TEST DEVICES
	   // -----------------------------------------------------------------------------------------------------------------------------	
	   // Device testing frame
	   // -----------------------------------------------------------------------------------------------------------------------------	
		static void initEmptyDevFrame(String aBaseDir, String aDescriptionFile ) {				
			
			try {	
				
				DeviceDescriptionLoader<SGrModbusDeviceFrame> loader = new DeviceDescriptionLoader<>();
				SGrModbusDeviceFrame tstDesc = loader.load(aBaseDir, aDescriptionFile);	
				
				// replace device specific for RTU
				//add devXXXX =  new SGrModbusDevice(tstDesc, mbRTU );
				
				// // replace device specific for TCP  (easymodus uses Driver instance per device)						
				// GenDriverAPI4ModbusTCP mbXXXXX= new GenDriverAPI4ModbusTCP();
				// devXXXXX = new SGrModbusDevice(tstDesc, mbWmbXXXXX);							
				// mbXXXXX.initDevice("192.168.1.182",502);
				
			}
			
			catch ( Exception e )
			{
				System.out.println( "Error loading device description. " + e);
			}		
		}
		
		static void tstEmptyDevFrame()
		{
			float fVal1 = (float) 0.0, fVal2 = (float) 0.0, fVal3 = (float) 0.0, fVal4 = (float) 0.0;
			String  sVal1 = "0.0", sVal2 = "0.0", sVal3 = "0.0", sVal4 ="0.0";
			
				try {	
					// if RTU is used, set address here
					// mbRTU.setUnitIdentifier((byte) 7);
				    System.out.println();
					System.out.println("@:Testing   xxxxx");
					Thread.sleep(25);
					
					// Add test getters and setters for binary interface
					//fVal1 = devWagoMeter.getValByGDPType("FpName", "DpName").getFloat32(); 
					//Thread.sleep(10);   


					// Add test getters and setters for String interfaces
					//sVal1 = devWagoMeter.getVal("ActiveEnerBalanceAC", "ActiveImportAC");
					//Thread.sleep(10);
					
				}
				catch ( Exception e)
				{
					System.out.println( "Error reading value from device: "+ devFroniusSymo.getClass().getName() + e);
					e.printStackTrace();
					// add Exception counter here
				}
			}
	
	}
	
