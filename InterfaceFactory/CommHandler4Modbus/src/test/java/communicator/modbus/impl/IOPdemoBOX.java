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

author: IBT/cb 2023/5/11
The purpose of this class is to offer a test environment to show Device Interoperabil-ity (WAGO METER vs ABB METER), Functional Profile Interoperability 
(CurrentAC WAGO METER vs ABB METER vs Bender Controller) and Protocol Interoperability ( Bender Con-troller Modbus/TCP  vs OCPP)


 */

package communicator.modbus.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// WIP/cb import com.smartgridready.ns.v0.SGrBool2BitRankType;
import com.smartgridready.ns.v0.SGrEVStateType;
import com.smartgridready.ns.v0.SGrEnumListType;
import com.smartgridready.ns.v0.SGrModbusDeviceFrame;
import com.smartgridready.ns.v0.SGrOCPPStateType;
import communicator.modbus.api.GenDeviceApi4Modbus;
import communicator.common.runtime.Parity;
import communicator.common.helper.DeviceDescriptionLoader;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusRTU;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusTCP;
// debug an logger classes
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class IOPdemoBOX {
	

	private static final String XML_BASE_DIR = "../../../SGrSpecifications/XMLInstances/ExtInterfaces/"; 
	private static final Logger LOG = LoggerFactory.getLogger(IOPdemoBOX.class);
	
	// we need static definitions for performance reason
	//------------------------------------------------------
	// Modbus RTU devices

	private static GenDeviceApi4Modbus devIOPMeter = null;
	// we need a single driver instance for RTU and separate these by device addres
	private static GenDriverAPI4ModbusRTU mbRTU = null;
	
	// Modbus TCP devices
	private static GenDeviceApi4Modbus devOMCCIWallbox = null;
	
	// test loop parameters
	private static int runtimeCnt = 0;
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    
	// Exception Counters
	private static int devIOPMeterExceptions = 0;
	private static int devOMCCIWallboxExceptions = 0;
	
	// device selection
	private static boolean  devIOPMeterTestIsOn = true; 
	private static boolean  devOMCCIWallboxTestIsOn = true; 


	// shell for enumerations
	private static SGrEnumListType oEnumList = null;
	
		
	public static void main( String argv[] ) {	
			
		try {
			
			//DeviceDescriptionLoader<SGrModbusDeviceDescriptionType> loader = new DeviceDescriptionLoader<>();
		  
			// Modbus RTU uses a single driver  (tailored to easymodbus)
			mbRTU = new GenDriverAPI4ModbusRTU();
			//mbRTU.initTrspService("COM5", 9600, Parity.NONE);	// for mobile RTU Interface		
			mbRTU.initTrspService("COM9", 9600, Parity.NONE);   // for Office RTU Interface	
 
			int IOPDeviceSelection = 2;

			// TestBox
			if (devIOPMeterTestIsOn)  {
				
				if (IOPDeviceSelection==1)
				{
					LOG.info(" -init WagoMeter as IOP demonstrator @: " + dtf.format(LocalDateTime.now())+ " ");
					initIOPMeter(XML_BASE_DIR, "SGr_04_0014_0000_WAGO_SmartMeterV0.2.1.xml",(byte)7);
				}
				else
				{	LOG.info("make sure  the switch in the testbox is set to EXT.");
					LOG.info(" -init ABB M23 Meter as IOP demonstrator @:" + dtf.format(LocalDateTime.now())+ " ");
					initIOPMeter(XML_BASE_DIR, "SGr_04_0016_xxxx_ABBMeterV0.2.1.xml",(byte)1);
				}
			}	
			if (devOMCCIWallboxTestIsOn) {
				//TODO: complete and use OMCCI EI.xml
				LOG.info(" -init devOMCCIWallbox as Modbus/TCP demonstrator @:" + dtf.format(LocalDateTime.now())+ " "); 
				initOMCCIWallbox(XML_BASE_DIR, "SGr_04_0005_xxxx_GARO_WallboxV0.2.1.xml");
			}
			

			
			// **************************   Start demo loop    **********************************						
   			
			try {
				  				   
				for (runtimeCnt = 0;runtimeCnt<30000;runtimeCnt++)
				{
					
				   // loop data & test reporting 
					LOG.info("\n\n>>>Time=" + dtf.format(LocalDateTime.now())+" ------> LOOP=" +	runtimeCnt + "  Exceptions:");	
					if (devIOPMeterTestIsOn)     LOG.info("   IOPMeter=" +  devIOPMeterExceptions+ ",");
				    if (devOMCCIWallboxTestIsOn) LOG.info("   OMCCIWallbox=" + devOMCCIWallboxExceptions+ ",");
					
				    //_____Next loop 
					if (devIOPMeterTestIsOn)    tstIOPMeter();					
					if (devOMCCIWallboxTestIsOn) tstOMCCIWallbox();
				    Thread.sleep(5000);  // show last block for ccc  milliseconds
				}
			}

		    catch ( Exception e)
	 	   {
				LOG.info( "Error reading value from device " + e);
				e.printStackTrace();
		   }
	   }
	 
	   catch ( Exception e )
	   {
		  	 LOG.info( "Error loading device description. " + e);
	   }									
 
	}




	   // -----------------------------------------------------------------------------------------------------------------------------	
	   // Device IOPMeter Testing
	   // -----------------------------------------------------------------------------------------------------------------------------	
	    static byte rtuAddr=0;
	    
		static void initIOPMeter(String aBaseDir, String aDescriptionFile, byte deviceAddr ) {				
			
			try {	
				rtuAddr = deviceAddr;
				DeviceDescriptionLoader<SGrModbusDeviceFrame> loader = new DeviceDescriptionLoader<>();
				SGrModbusDeviceFrame tstDesc = loader.load(aBaseDir, aDescriptionFile);	
				devIOPMeter =  new SGrModbusDevice(tstDesc, mbRTU );
				
			}
			
			catch ( Exception e )
			{
				LOG.info( "Error loading device description. " + e);
			}		
		}
		
		static void tstIOPMeter()
		{
			float fVal1 = (float) 0.0, fVal2 = (float) 0.0, fVal3 = (float) 0.0, fVal4 = (float) 0.0;
			String  sVal1 = "0.0", sVal2 = "0.0", sVal3 = "0.0", sVal4 ="0.0";
			
				try {
	 				mbRTU.setUnitIdentifier(rtuAddr);	
				    LOG.info("\n@:Testing IOPMeterData: ");
	  				Thread.sleep(25);
	  				fVal1 = devIOPMeter.getValByGDPType("VoltageAC", "VoltageL1").getDecimal().floatValue();
	  				Thread.sleep(10);            
	  				fVal2 = devIOPMeter.getValByGDPType("VoltageAC", "VoltageL2").getDecimal().floatValue();
	  				Thread.sleep(10);
	  				fVal3 = devIOPMeter.getValByGDPType("VoltageAC", "VoltageL3").getDecimal().floatValue();
	  				Thread.sleep(10);
	  				fVal4 = devIOPMeter.getValByGDPType("Frequency", "Frequency").getDecimal().floatValue();
	  				LOG.info("  VoltageAC L1,2,3/Frequency [V,Hz]: " + fVal1 + ",  " + fVal2 + ",  "
	  						+ fVal3 + ",  " + fVal4 + "  ");
	  				Thread.sleep(10);
	  				fVal1 = devIOPMeter.getValByGDPType("VoltageAC", "VoltageACL1-L2").getDecimal().floatValue();
	  				Thread.sleep(10);
	  				fVal2 = devIOPMeter.getValByGDPType("VoltageAC", "VoltageACL1-L3").getDecimal().floatValue();
	  				Thread.sleep(10);
	  				fVal3 = devIOPMeter.getValByGDPType("VoltageAC", "VoltageACL2-L3").getDecimal().floatValue();
	  				LOG.info("  VoltageAC L12/13/23 [V]:           " + fVal1 + ",  " + fVal2 + ",  "
	  						+ fVal3 + "  ");
	  				Thread.sleep(10);
	  				fVal1 = devIOPMeter.getValByGDPType("CurrentAC", "CurrentACL1").getDecimal().floatValue();
	  				Thread.sleep(10);
	  				fVal2 = devIOPMeter.getValByGDPType("CurrentAC", "CurrentACL2").getDecimal().floatValue();
	  				Thread.sleep(10);
	  				fVal3 = devIOPMeter.getValByGDPType("CurrentAC", "CurrentACL3").getDecimal().floatValue();
	  				LOG.info("  CurrentAC L1/2/3 [A]:              " + fVal1 + ",  " + fVal2 + ",  "
	  						+ fVal3 + "  ");
	  				Thread.sleep(10);
	  				fVal1 = devIOPMeter.getValByGDPType("PowerFactor", "PowerFactor").getDecimal().floatValue();
	  				Thread.sleep(10);
	  				fVal2 = devIOPMeter.getValByGDPType("PowerFactor", "PowerFactorL1").getDecimal().floatValue();
	  				Thread.sleep(10);
	  				fVal3 = devIOPMeter.getValByGDPType("PowerFactor", "PowerFactorL2").getDecimal().floatValue();
	  				Thread.sleep(10);
	  				fVal4 = devIOPMeter.getValByGDPType("PowerFactor", "PowerFactorL3").getDecimal().floatValue();
	  				LOG.info("  Powerfactor tot/L1/L2/L3:          " + fVal1 + ",  " + fVal2 + ",  "
	  						+ fVal3 + ",  " + fVal4 + "  ");
	  				Thread.sleep(10); 
	  				sVal1 = devIOPMeter.getVal("ActiveEnergyAC", "ActiveEnergyACtot");
	  				Thread.sleep(10);
	  				sVal2 = devIOPMeter.getVal("ActiveEnergyAC", "ActiveEnergyACL1");
	  				Thread.sleep(10);
	  				sVal3 = devIOPMeter.getVal("ActiveEnergyAC", "ActiveEnergyACL2");
	  				Thread.sleep(10);
	  				sVal4 = devIOPMeter.getVal("ActiveEnergyAC", "ActiveEnergyACL3");
	  				LOG.info("  ActiveEnergyAC [kWh]:         " + sVal1 + ",  " + sVal2 + ",  " + sVal3
	  						+ ",  " + sVal4 + "  ");
	  				Thread.sleep(10);
	  				sVal1 = devIOPMeter.getVal("ActivePowerAC", "ActivePowerACtot");
	  				Thread.sleep(10);
	  				sVal2 = devIOPMeter.getVal("ActivePowerAC", "ActivePowerACL1");
	  				Thread.sleep(10);
	  				sVal3 = devIOPMeter.getVal("ActivePowerAC", "ActivePowerACL2");
	  				Thread.sleep(10);
	  				sVal4 = devIOPMeter.getVal("ActivePowerAC", "ActivePowerACL3");
	  				LOG.info("  ActivePowerAC [W]:           " + sVal1 + ", " + sVal2 + ",  " + sVal3
	  						+ ",  " + sVal4 + "  ");
	  				Thread.sleep(10);
	  				sVal1 = devIOPMeter.getVal("ReactivePowerAC", "ReactivePowerACtot");
	  				Thread.sleep(10);
	  				sVal2 = devIOPMeter.getVal("ReactivePowerAC", "ReactivePowerACL1");
	  				Thread.sleep(10);
	  				sVal3 = devIOPMeter.getVal("ReactivePowerAC", "ReactivePowerACL2");
	  				Thread.sleep(10);
	  				sVal4 = devIOPMeter.getVal("ReactivePowerAC", "ReactivePowerACL3");
	  				LOG.info("  ReactivePowerAC [var]:       " + sVal1 + ", " + sVal2 + ",  " + sVal3
	  						+ ",  " + sVal4 + "  ");
	  				Thread.sleep(10);
	  				sVal1 = devIOPMeter.getVal("ApparentPowerAC", "ApparentPowerACtot");
	  				Thread.sleep(10);
	  				sVal2 = devIOPMeter.getVal("ApparentPowerAC", "ApparentPowerACL1");
	  				Thread.sleep(10);
	  				sVal3 = devIOPMeter.getVal("ApparentPowerAC", "ApparentPowerACL2");
	  				Thread.sleep(10);
	  				sVal4 = devIOPMeter.getVal("ApparentPowerAC", "ApparentPowerACL3");
	  				LOG.info("  ApparentPowerAC [va]:        " + sVal1 + ", " + sVal2 + ",  " + sVal3
	  						+ ",  " + sVal4 + "  ");
	  				Thread.sleep(10);
	  				sVal1 = devIOPMeter.getVal("ActiveEnerBalanceAC", "ActiveImportAC");
	  				Thread.sleep(10);
	  				sVal2 = devIOPMeter.getVal("ActiveEnerBalanceAC", "ActiveExportAC");
	  				Thread.sleep(10);
	  				sVal3 = devIOPMeter.getVal("ActiveEnerBalanceAC", "ActiveNetAC");
	  				LOG.info("  ActiveEnerBalanceAC [KWh]:    " + sVal1 + ", " + sVal2 + ",  " + sVal3 + "  ");

	  				Thread.sleep(10);
	  				sVal1 = devIOPMeter.getVal("ReactiveEnerBalanceAC", "ReactiveImportAC");
	  				Thread.sleep(10);
	  				sVal2 = devIOPMeter.getVal("ReactiveEnerBalanceAC", "ReactiveExportAC");
	  				Thread.sleep(10);
	  				sVal3 = devIOPMeter.getVal("ReactiveEnerBalanceAC", "ReactiveNetAC");
	  				LOG.info("  ReactiveEnerBalanceAC [kvarh]:" + sVal1 + ", " + sVal2 + ",  " + sVal3  + "  ");
	  				
	  				Thread.sleep(10);
	  				sVal1 = devIOPMeter.getVal("PowerQuadrant", "PwrQuadACtot");
	  				Thread.sleep(10);
	  				sVal2 = devIOPMeter.getVal("PowerQuadrant", "PwrQuadACL1");
	  				Thread.sleep(10);
	  				sVal3 = devIOPMeter.getVal("PowerQuadrant", "PwrQuadACL2");
	  				Thread.sleep(10);
	  				sVal4 = devIOPMeter.getVal("PowerQuadrant", "PwrQuadACL3");
	  				LOG.info("  PowerQuadrant  tot/L1/L3/L3 :        " + sVal1 + ", " + sVal2 + ", " + sVal3
	  						+ ",  " + sVal4 + "  ");
							
				}
				catch ( Exception e)
				{
					devIOPMeterExceptions++;
					LOG.info( "Error reading value from device devIOPMeter:" +  e);
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
					LOG.info( "Error loading device description. " + e);
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
						 LOG.info("\n@:Testing  OMCCIWallbox: ");							
						 if ((runtimeCnt%60)== 0)
						 {
							 CurtailCurrent = (float) 7.0 + (float)((runtimeCnt/60)%4) ;
							 devOMCCIWallbox.setVal("Curtailment", "HemsCurrentLimit", String.valueOf(CurtailCurrent));
							 LOG.info("  Setting HemsCurrentLimit to :     " + CurtailCurrent + "  ");
						 }
						 fVal1 = devOMCCIWallbox.getValByGDPType("CurrentAC", "CurrentACL1").getDecimal().floatValue();
						 Thread.sleep(200);
						 fVal2 = devOMCCIWallbox.getValByGDPType("CurrentAC", "CurrentACL2").getDecimal().floatValue();
						 Thread.sleep(200);
						 fVal3 = devOMCCIWallbox.getValByGDPType("CurrentAC", "CurrentACL3").getDecimal().floatValue();
						 Thread.sleep(200);
						 oEnumList = devOMCCIWallbox.getValByGDPType("EVSEState", "EV-StatusCode").getEnum();
						 Thread.sleep(200);
						 sgrEVState = oEnumList.getSgrEVState();
						 LOG.info("  EV-StatusCode:                    " + sgrEVState+ "  ");
						 
						 oEnumList = devOMCCIWallbox.getValByGDPType("EVSEState", "ocppState").getEnum();
						 Thread.sleep(200);
						 sgrOCPPState = oEnumList.getSgrOCPPState();
						 LOG.info("  OCPP-StatusCode:                  " + sgrOCPPState + "  ");
						 LOG.info("  CurrentAC[A]                      I[L1]= " + fVal1 + ",  I[L2] = "  + fVal2 + ",  I[L3] = "  + fVal3 + "  ");		 

						 fVal1 = devOMCCIWallbox.getValByGDPType("ActivePowerAC", "ActivePowerACL1").getDecimal().floatValue();
						 Thread.sleep(200);
						 fVal2 = devOMCCIWallbox.getValByGDPType("ActivePowerAC", "ActivePowerACL2").getDecimal().floatValue();
						 Thread.sleep(200);
						 fVal3 = devOMCCIWallbox.getValByGDPType("ActivePowerAC", "ActivePowerACL3").getDecimal().floatValue();
						 Thread.sleep(200);
						 LOG.info("  PowerAC[kW]:                      P[1L]= " + fVal1 + ",  P[L2] = "  + fVal2 + ",  P[L3] = "  + fVal3 + "  ");	
							 
						 fVal1 = devOMCCIWallbox.getValByGDPType("ActiveEnergyAC", "ActiveEnergyACL1").getDecimal().floatValue();
						 Thread.sleep(200);
						 fVal2 = devOMCCIWallbox.getValByGDPType("ActiveEEnergyAC", "ActiveEnergyACL2").getDecimal().floatValue();
						 Thread.sleep(200);
						 fVal3 = devOMCCIWallbox.getValByGDPType("ActiveEEnergyAC", "ActiveEnergyACL3").getDecimal().floatValue();
						 Thread.sleep(200);
						 LOG.info("  EnergyAC[kWh] L1/L2/L3:           W[1] = " + fVal1 + "  W[2] = "  + fVal2 + "  W[3] = "  + fVal3 + "  ");	
							
						 //sVal1 = devOMCCIWallbox.getVal("EVState", "isSmartEV15118");
						 //Thread.sleep(200);
						 //??? sVal2 = devOMCCIWallbox.getVal("EVState", "EVCCID");
						 Thread.sleep(200);
						 LOG.info("  EVState  support (ISO/IEC 15118): " + sVal1 + ",    EVCCID = " + sVal2 + "  ");
						 
						 fVal1 = devOMCCIWallbox.getValByGDPType("Curtailment", "SafeCurrent").getDecimal().floatValue();
						 Thread.sleep(200);
						 fVal2 = devOMCCIWallbox.getValByGDPType("Curtailment", "HemsCurrentLimit").getDecimal().floatValue();
						 Thread.sleep(200);
						 fVal3 = devOMCCIWallbox.getValByGDPType("Curtailment", "HWCurrentLimit").getDecimal().floatValue();
						 Thread.sleep(200);
						 iVal1 = (int)devOMCCIWallbox.getValByGDPType("Curtailment", "maxReceiveTimeSec").getInteger();
						 Thread.sleep(200);
						 LOG.info("  Curtailment:                      SafeCurrent = " + fVal1 + "  HemsCurrentLimit = "  + fVal2 + "  HWCurrentLimit = "  + fVal3 +  "  maxReceiveTimeSec = "  + iVal1 +"  ");
						 
					}
					catch ( Exception e)
					{
						devOMCCIWallboxExceptions++;
						LOG.info( "Error reading value from device devOMCCIWallbox:" + e);
						e.printStackTrace();
					}
				}
			
}
