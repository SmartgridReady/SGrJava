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

The purpose of this class is to offer a test with

 */

package communicator.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// SmartGridready definitions
import com.smartgridready.ns.v0.CtaDHWOpModeType;
import com.smartgridready.ns.v0.CtaHPOpStateType;
import com.smartgridready.ns.v0.SGReadyStateLv2Type;
import com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType;
import com.smartgridready.ns.v0.SGrBool2BitRankType;
import com.smartgridready.ns.v0.SGrEVStateType;
import com.smartgridready.ns.v0.SGrEnumListType;
import com.smartgridready.ns.v0.SGrHPOpModeType;
import com.smartgridready.ns.v0.SGrHPOpstateType;
import com.smartgridready.ns.v0.SGrModbusDeviceFrame;
import com.smartgridready.ns.v0.V0Factory;

//proprietary definitions
import com.smartgridready.ns.v0.StiHPOpstateType;

import communicator.helper.DeviceDescriptionLoader;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusRTU;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusTCP;



public class HeatPumpTester {

	private static final Logger LOG = LoggerFactory.getLogger(HeatPumpTester.class);
	
	
	private static final String XML_BASE_DIR="../../../SGrSpecifications/XMLInstances/ExtInterfaces/"; 
	
	// we need static definitions for performance reason
	//------------------------------------------------------
	
	// Modbus RTU devices
	private static SGrModbusDevice devRTU_IOP=null;
	private static SGrModbusDevice devHovalRTU=null;
	
	// we need a single driver instance for RTU and separate these by device addres
	private static GenDriverAPI4ModbusRTU mbRTU=null;
	
	// Modbus TCP devices
	private static SGrModbusDevice devTCP_IOP=null;
	private static SGrModbusDevice devStiebelISG=null;
	private static SGrModbusDevice devCTAoptiHeat = null;
	
	// test loop parameters
	private static int runtimeCnt=0;
	// Exception Counters
	private static int devRTU_IOP_Exceptions=0;
	private static int devTCP_IOP_Exceptions=0;
	private static int devStiebel_ISGExcpetions=0;
	private static int devHovalRTU_Exceptions=0;
	private static int devHovalTCP_Exceptions=0;
	private static int devCTAoptiHeat_Exceptions=0;
	// device selection
	private static boolean  devRTU_IOPIsOn=false; 
	private static boolean  devTCP_IOPIsOn=true; 
	private static boolean  devStiebelISGIsOn=true; 
	private static boolean  devCTAoptiHeatIsOn=false; 
	
	// shell for enumerations
	private static SGrEnumListType oEnumList = V0Factory.eINSTANCE.createSGrEnumListType();
	
	public static void main( String argv[] ) {			

		
		try {
			
			DeviceDescriptionLoader<SGrModbusDeviceFrame> loader=new DeviceDescriptionLoader<>();
		  
			if (devRTU_IOPIsOn)
			{
			  // Modbus RTU uses a single driver  (tailored to easymodbus)
			  mbRTU=new GenDriverAPI4ModbusRTU();
			  mbRTU.initTrspService("COM9");			
			}
			
			if (devStiebelISGIsOn) initStiebelISG(XML_BASE_DIR, "SGr_04_0015_xxxx_StiebelEltron_HeatPumpV0.2.1.xml");			
			if (devCTAoptiHeatIsOn) initCTAoptiHeat(XML_BASE_DIR, "SGr_04_0033_0000_CTA_HeatPumpV0.2.1.xml");

			
			// **************************   Start device Testing   **********************************						
   			
			try {
				
				for (runtimeCnt=0;runtimeCnt<30000;runtimeCnt++)
				{
					
				   // loop data & test reporting
				   Thread.sleep(10000);  // show last block for ccc  milliseconds
					
					 LOG.info(String.format("\n------> LOOP=" +	runtimeCnt + "                     Exceptions:"));		
					if (devStiebelISGIsOn)  LOG.info(String.format(" StiebelISG=" + devStiebel_ISGExcpetions + ","));
					if (devCTAoptiHeatIsOn) LOG.info(String.format(" CTAoptiHeat=" + devCTAoptiHeat_Exceptions + ","));

					//Next loop 
					if (devStiebelISGIsOn)  tstStiebelISG();	
					if (devCTAoptiHeatIsOn)  tstCTAoptiHeat();	

			}

		}
		catch ( Exception e)
		{
				 LOG.info(String.format("Error reading value from device " + e));
				e.printStackTrace();
		}
	 }
	 catch ( Exception e )
	 {
			 LOG.info(String.format("Error loading device description. " + e));
	 }									
  }
	

	
	
	/*
	 LOG.info(ln(
			"------------------->  CREATING INSTANCE OF DEVICE sgrHeatPumpHoval  <-------------------");
	SGrModbusDeviceDescriptionType sgrHeatPumpHovalDescription=loader.load( XML_BASE_DIR,"SGr_04_0017_xxxx_HOVAL_HeatPumpV0.2.1.xml");
	GenDriverAPI4ModbusTCP mbHeatPumpHoval=new GenDriverAPI4ModbusTCP();
	SGrModbusDevice sgrHeatPumpHovalDev=new SGrModbusDevice(sgrHeatPumpHovalDescription, mbHeatPumpHoval);	
	
	 
	//TODO: add Exception for device present flag "IsConnected" from IBT/cb code
	//mbHeatPumpHoval.initDevice("192.168.1.150",502); 
	
	 LOG.info(ln(
	"------------------->  CREATING INSTANCE OF DEVICE sgrHeatPumpStiebel  <-------------------");
	SGrModbusDeviceDescriptionType sgrHeatPumpStiebelDescription=loader.load( XML_BASE_DIR,"SGr_04_0015_xxxx_Stiebel_Eltron_HeatPumpV0.2.1.xml");
	GenDriverAPI4ModbusTCP mbHeatPumpStiebel=new GenDriverAPI4ModbusTCP();
	SGrModbusDevice sgrHeatPumpStiebelDev=new SGrModbusDevice(sgrHeatPumpStiebelDescription, mbHeatPumpStiebel);	

	 
	//TODO: add Exception for device present flag "IsConnected" from IBT/cb code
	mbHeatPumpStiebel.initDevice("192.168.1.55",502); 
    */
	
	

	/*	 
		 LOG.info(String.format("HeatPumpHoval"));
		//Setters
		float fValStpt=(float)  runtimeCnt *  (float) 0.1;
		SGrBasicGenDataPointTypeType gdtValue=V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();
		
		if (runtimeCnt == 1 )
		{
			//set control Modes
			
			// #0=Wärmeerzeuger aus
			// #1=Automatikbetrieb
			// #4=Manueller Heizbetrieb
			// #5=Manueller Kühlbetrieb   
			gdtValue.setInt16U(1);
			sgrHeatPumpHovalDev.setValByGDPType("HeatPumpBase","HPOpModeCmd",gdtValue);
			
			// #0=Standbybetrieb
			// #1=Woche 1
			// #2=Woche 2
			// #4=Konstant
			// #5=Sparbetrieb
			// #7=Handbetrieb Heizen
			// #8=Handbetrieb Kühlen
			gdtValue.setInt16U(4);
			//sgrHeatPumpHovalDev.setValByGDPType("HeatCoolCtrl_1","HeatCoolCtrlOpModeCmd",gdtValue);
			gdtValue.setInt16U(4);
			//sgrHeatPumpHovalDev.setValByGDPType("HeatCoolCtrl_2","HeatCoolCtrlOpModeCmd",gdtValue);
			gdtValue.setInt16U(4);
			//sgrHeatPumpHovalDev.setValByGDPType("HeatCoolCtrl_3","HeatCoolCtrlOpModeCmd",gdtValue);
			
			gdtValue.setInt16U(4);
			//sgrHeatPumpHovalDev.setValByGDPType("DomHotWaterCtrl", "DomHotWOpMode",gdtValue);
			
		}
		
		gdtValue.setFloat32(fVal1);
		gdtValue.setFloat32(fValStpt+(float)40.0);
		//sgrHeatPumpHovalDev.setValByGDPType("DomHotWaterCtrl", "DomHotWTempStpt",gdtValue);
		gdtValue.setFloat32(fValStpt+(float)50.0);  
		// Adresse SupplyWaterTempStptOffset Stufe Modbus falsch  (Wie SupplyWaterTempStpt) 
		//sgrHeatPumpHovalDev.setValByGDPType("HeatCoolCtrl_1", "SupplyWaterTempStpt",gdtValue);
		gdtValue.setFloat32(fValStpt+(float)60.0);
		//sgrHeatPumpHovalDev.setValByGDPType("HeatCoolCtrl_2", "SupplyWaterTempStpt",gdtValue);
		gdtValue.setFloat32(fValStpt+(float)70.0);
		//sgrHeatPumpHovalDev.setValByGDPType("HeatCoolCtrl_3", "SupplyWaterTempStpt",gdtValue);
		
		gdtValue.setFloat32(fValStpt*(float)10.0);
		//sgrHeatPumpHovalDev.setValByGDPType("CompressorPwrCtrl", "SpeedCtrlSetpt",gdtValue);
		

        // testing getters
		iVal1=sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "HPOpModeCmd").getInt16();
		iVal2=sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "HPOpState").getInt16();               
		iVal3=sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "ErrorNrSGr").getInt16();
		fVal1=sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "OutsideAirTemp").getFloat32();
		fVal2=sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "SupplyWaterTempStpt").getFloat32();
		fVal3=sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "SupplyWaterTempStptFb").getFloat32();					
		fVal4=sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "SupplyWaterTemp").getFloat32();	
		fVal5=sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "ReturnSupplyWaterTemp").getFloat32();	
		 LOG.info(String.format("  HeatPumpBase:      HPOpModeCmd=" + iVal1 + ",  HPOpState=" + iVal2 + ",  ErrorNrSGr=" + iVal3 + ",  OutsideAir=" + fVal1 +" °C,  SupplyWaterTempStpt(Handbetrieb Heizen,4)=" + fVal2 +" °C,  SupplyWaterTempStptFb=" + fVal3 + "°C, SupplyWaterTemp=" + fVal4 +  "°C,  ReturnSupplyWaterTemp=" + fVal5 +  " °C "));     
		 
		
		iVal1=sgrHeatPumpHovalDev.getValByGDPType("DomHotWaterCtrl", "DomHotWOpMode").getInt16();
		iVal2=sgrHeatPumpHovalDev.getValByGDPType("DomHotWaterCtrl", "DomHotWState").getInt16();
		fVal1=sgrHeatPumpHovalDev.getValByGDPType("DomHotWaterCtrl", "DomHotWTempStpt").getFloat32();
		fVal2=sgrHeatPumpHovalDev.getValByGDPType("DomHotWaterCtrl", "ActDomHotWaterTemp").getFloat32();
		fVal3=sgrHeatPumpHovalDev.getValByGDPType("DomHotWaterCtrl", "DomHotWTempStptFb").getFloat32();
		 LOG.info(String.format("  DomHotWaterCtrl:  DomHotWOpMode=" + iVal1 + ",  DomHotWState=" +  iVal2 + ",  DomHotWTempStpt (Kontstant,4)=" + fVal1 + " °C,   ActDomHotWaterTemp=" + fVal2 + " °C,  DomHotWTempStptFb=" + fVal3 + " °C "));  
		 

		fVal1=sgrHeatPumpHovalDev.getValByGDPType("CompressorPwrCtrl", "ActSpeed").getFloat32();
		 LOG.info(String.format("  CompressorPwrCtrl: ActSpeed="  + fVal1"));  
		 
		

		fVal1=sgrHeatPumpHovalDev.getValByGDPType("BufferStorageCtrl", "ActBufferWaterTempStptFb").getFloat32();
		iVal1=sgrHeatPumpHovalDev.getValByGDPType("BufferStorageCtrl", "BufferState").getInt16();
		fVal2=sgrHeatPumpHovalDev.getValByGDPType("BufferStorageCtrl", "ActHeatBufferTempUpper").getFloat32();
		fVal3=sgrHeatPumpHovalDev.getValByGDPType("BufferStorageCtrl", "ActHeatBufferTempLower").getFloat32();
		fVal4=sgrHeatPumpHovalDev.getValByGDPType("BufferStorageCtrl", "ActCoolBufferTempUpper").getFloat32();
		fVal5=sgrHeatPumpHovalDev.getValByGDPType("BufferStorageCtrl", "ActCoolBufferTempLower").getFloat32();
		 LOG.info(String.format("  BufferStorageCtrl: ActBufferWaterTempStptFb=" + fVal1 + ",  BufferState="+ iVal1 + ",  ActHeatBufferTempUpper="  + fVal2 +  " °C,  ActHeatBufferTempLower=" + fVal3 + " °C,  ActCoolBufferTempUpper=" + fVal4 + " °C,  ActCoolBufferTempLower=" + fVal5 + " °C "));  
		
		
		iVal1=sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_1", "HeatCoolCtrlOpModeCmd").getInt16();
		iVal2=sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_1", "HeatCoolOpState").getInt16(); 				
		fVal1=sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_1", "SupplyWaterTemp").getFloat32();
		fVal2=sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_1", "SupplyWaterTempStpt").getFloat32();
		fVal3=sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl", "ReturnSupplyWaterTemp").getFloat32();
		 LOG.info(String.format("  HeatCoolCtrl_1:    HeatCoolCtrlOpModeCmd=" + iVal1 +" ,  HeatCoolOpState: "  + iVal2 + " SupplyWaterTemp=" + fVal1 + " °C,  SupplyWaterTempStpt=" + fVal2 + " °C,  ReturnSupplyWaterTemp=" + fVal3 + " °C "));  

		 
		iVal1=sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_2", "HeatCoolCtrlOpModeCmd").getInt16();
		iVal2=sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_2", "HeatCoolOpState").getInt16();
		fVal1=sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_2", "SupplyWaterTemp").getFloat32();
		fVal2=sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_2", "SupplyWaterTempStpt").getFloat32();
		fVal3=sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl", "ReturnSupplyWaterTemp").getFloat32();
		 LOG.info(String.format("  HeatCoolCtrl_2:    HeatCoolCtrlOpModeCmd=" + iVal1 +" ,  HeatCoolOpState: "  + iVal2 + " SupplyWaterTemp=" + fVal1 + " °C,  SupplyWaterTempStpt=" + fVal2 + " °C,  ReturnSupplyWaterTemp=" + fVal3 + " °C "));  

		 
		iVal1=sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_3", "HeatCoolCtrlOpModeCmd").getInt16();
		iVal2=sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_3", "HeatCoolOpState").getInt16();
		fVal1=sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_3", "SupplyWaterTemp").getFloat32();
		fVal2=sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_3", "SupplyWaterTempStpt").getFloat32();
		fVal3=sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl", "ReturnSupplyWaterTemp").getFloat32();
		 LOG.info(String.format("  HeatCoolCtrl_3:    HeatCoolCtrlOpModeCmd=" + iVal1 +" ,  HeatCoolOpState: "  + iVal2 + " SupplyWaterTemp=" + fVal1 + " °C,  SupplyWaterTempStpt=" + fVal2 + " °C,  ReturnSupplyWaterTemp=" + fVal3 + " °C "));  
		 
		
		fVal1=sgrHeatPumpHovalDev.getValByGDPType("EnergyMonitor", "ThermalEnergyHeat").getFloat32();
		fVal2=sgrHeatPumpHovalDev.getValByGDPType("EnergyMonitor", "ThermalEnergyCool").getFloat32();
		fVal3=sgrHeatPumpHovalDev.getValByGDPType("EnergyMonitor", "RuntimeCompressor").getFloat32();
		long lVal=sgrHeatPumpHovalDev.getValByGDPType("EnergyMonitor", "NrOfStartupsCompressor").getInt32U();
		 LOG.info(String.format("  EnergyMonitor ThermalEnergyHeat, ThermalEnergyCool, RuntimeCompressor, NrOfStartupsCompressor  : " + fVal1 + " kWh,  " + fVal2 + " kWh,  " + fVal3 + " h,  " + lVal+"  times"));  
		  
		
*/			
			

	   // -----------------------------------------------------------------------------------------------------------------------------	
	   // Device testing frame
	   // -----------------------------------------------------------------------------------------------------------------------------	
		static void initStiebelISG(String aBaseDir, String aDescriptionFile ) {				
			
			SGrModbusDeviceFrame tmpDesc=null;
			try {	
				
				DeviceDescriptionLoader<SGrModbusDeviceFrame> loader=new DeviceDescriptionLoader<>();
				tmpDesc=loader.load(aBaseDir, aDescriptionFile);	
			}
			
			catch ( Exception e )
			{
				 devStiebelISGIsOn = false;
				 LOG.info(String.format("Error loading device description. " + e));
			}		
			
			if (tmpDesc != null)
			{
			  try {
				
				  // // replace device specific for TCP  (easymodus uses Driver instance per device)						
				  GenDriverAPI4ModbusTCP mbStiebelISG= new GenDriverAPI4ModbusTCP();
				  devStiebelISG=new SGrModbusDevice(tmpDesc, mbStiebelISG);							
				  mbStiebelISG.initDevice("192.168.1.55",502);
			   }
			
			  catch ( Exception e )
			  {
				 devStiebelISGIsOn = false;
				 LOG.info(String.format("Error while connecting device. " + e));
			  }	
				
			}
			
		}
		
		static void tstStiebelISG()
		{
			float fVal1=(float) 0.0, fVal2=(float) 0.0, fVal3=(float) 0.0, fVal4=(float) 0.0, fVal5=(float) 0.0;
			double dVal1 = 0.0, dVal2 = 0.0;
			int  iVal1=0, iVal2=0, iVal3=0, iVal4=0;
			long lVal=0;
			boolean bVal1=false,bVal2=false,bVal3=false;
			String  sVal1="0.0", sVal2="0.0", sVal3="0.0", sVal4 ="0.0";

				
			try {			
				 LOG.info(String.format("HeatPump Stiebel-Eltron"));
				Thread.sleep(25);
				
				if (runtimeCnt == 2)
				{

				  SGrBasicGenDataPointTypeType  hpval = V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();
					
				   LOG.info(String.format("######################  setting new values ######################"));
				   // testing setters: one setting for a test run only recommended
				   // read the device manual carefully before testing any setpoint
				  // control by HPOpMode enum

	/*			
				  oEnumList.setSgrHPOpMode(SGrHPOpModeType.WPPROGOP);
				  hpval.setEnum(oEnumList);
				  devStiebelISG.setValByGDPType("HeatPumpBase", "HPOpModeCmd", hpval);	
				  LOG.info(String.format("  Setting  HeatPumpBase:HPOpModeCmd="+ hpval.getEnum().getSgrHPOpMode().getLiteral()));
	*/			
				 
				  //Setpoints Comfort
				  fVal1= (float) 31.1;
				  hpval.setFloat32(fVal1); 
				  devStiebelISG.setValByGDPType("HeatCoolCtrl_1", "SupplyWaterTempStptComf",hpval);
				  LOG.info(String.format("  Setting HeatCoolCtrl_1: SupplyWaterTempStptComf=" + fVal1));
				  fVal1= (float) 32.2;
				  hpval.setFloat32(fVal1); 
				  devStiebelISG.setValByGDPType("HeatCoolCtrl_2", "SupplyWaterTempStptComf",hpval);
				  LOG.info(String.format("  Setting HeatCoolCtrl_2: SupplyWaterTempStptComf=" + fVal1));
				  fVal1= (float) 43.3;
				  hpval.setFloat32(fVal1); 
				  devStiebelISG.setValByGDPType("DomHotWaterCtrl", "DomHotWTempStptComf",hpval);
				  LOG.info(String.format("  Setting DomHotWaterCtrl: DomHotWTempStptComf=" + fVal1));
				 
/*
				  //Setpoints Eco
				  fVal1= (float) 25.1;
				  hpval.setFloat32(fVal1); 
				  devStiebelISG.setValByGDPType("HeatCoolCtrl_1", "SupplyWaterTempStptEco",hpval);
				  LOG.info(String.format("  Setting HeatCoolCtrl_1: SupplyWaterTempStptEco=" + fVal1));
				  fVal1= (float) 25.2;
				  hpval.setFloat32(fVal1); 
				  devStiebelISG.setValByGDPType("HeatCoolCtrl_2", "SupplyWaterTempStptEco",hpval);
				  LOG.info(String.format("  Setting HeatCoolCtrl_2: SupplyWaterTempStptEco=" + fVal1));
				  fVal1= (float) 41.2;
				  hpval.setFloat32(fVal1); 
				  devStiebelISG.setValByGDPType("DomHotWaterCtrl", "DomHotWTempStptEco",hpval);
				  LOG.info(String.format("  Setting HeatCoolCtrl_2: DomHotWTempStptEco=" + fVal1));
			 
*/				 
				 
				
				// enable or disable SG-Ready				   
					hpval.setBoolean(false);
				LOG.info(String.format("  Setting ReadyStates_bwp:SGReadyEnabled=" + hpval.isBoolean()));
				devStiebelISG.setValByGDPType("SG-ReadyStates_bwp", "SGReadyEnabled", hpval);
				
				
				/// control SG-Ready by enum SGReadyStateLv2Type
                oEnumList.setSgreadyStateLv2(SGReadyStateLv2Type.HPNORMAL);
				SGrBasicGenDataPointTypeType  bwpCmd = V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();
				bwpCmd.setEnum(oEnumList);
				devStiebelISG.setValByGDPType("SG-ReadyStates_bwp", "SGReadyCmd", bwpCmd);
				LOG.info(String.format("  Setting  ReadyStates_bwp:SGReadyCmd="+ oEnumList.getSgreadyStateLv2().getLiteral()));
				oEnumList.unsetSgreadyStateLv2();
				
				
			/*	// control SG-Ready by contacts
				hpval.setBoolean(false);  
				devStiebelISG.setValByGDPType("SG-ReadyStates_bwp", "SGReadyInp1isON", hpval);	
				LOG.info(String.format("  Setting SG-ReadyStates_bwp:SGReadyInp1isON=" + hpval.isBoolean()));
				hpval.setBoolean(false);  
				devStiebelISG.setValByGDPType("SG-ReadyStates_bwp", "SGReadyInp2isON", hpval);
				LOG.info(String.format("  Setting SG-ReadyStates_bwp:SGReadyInp2isON=" + hpval.isBoolean()));
		 */
					
				}
				
				  
				// testing 
				oEnumList= devStiebelISG.getValByGDPType("HeatPumpBase", "HPOpModeCmd").getEnum();
				iVal1=devStiebelISG.getValByGDPType("HeatPumpBase", "HPOpState").getInt16U();     
				iVal2=devStiebelISG.getValByGDPType("HeatPumpBase", "stiHPOpState").getInt16U();          
				bVal1=devStiebelISG.getValByGDPType("HeatPumpBase", "ErrorNrSGr").isBoolean();
				fVal1=devStiebelISG.getValByGDPType("HeatPumpBase", "OutsideAirTemp").getFloat32();			
				fVal2=devStiebelISG.getValByGDPType("HeatPumpBase", "SupplyWaterTemp").getFloat32();
				fVal3=devStiebelISG.getValByGDPType("HeatPumpBase", "ReturnSupplyWaterTemp").getFloat32();
				fVal4=devStiebelISG.getValByGDPType("HeatPumpBase", "SourceTemp").getFloat32();		
				 LOG.info(String.format("  HeatPumpBase:      HPOpModeCmd=" + oEnumList.getSgrHPOpMode().getLiteral() + ",  HPOpState=" + iVal2 + ",  ErrorNrSGr=" + bVal1 + ",  OutsideAir=" + fVal1 +" °C, SupplyWaterTemp=" + fVal2 +  "°C,  ReturnSupplyWaterTemp=" + fVal3 +  " °C,   SourceTemp=" + fVal4 +" °C "));  
				 oEnumList.unsetSgrHPOpMode();
				 
				if (iVal1 != 0)  
				{
					 LOG.info(String.format("    HPOpState bits set: ")); 
					if(( (iVal2 & (1<<SGrHPOpstateType.HPPUMPON_VALUE))) != 0)  LOG.info(String.format("HP_PUMP_ON, "));
					if(( (iVal2 & (1<<SGrHPOpstateType.HPINHEATINGMODE_VALUE))) != 0)  LOG.info(String.format("HP_IN_HEATING_MODE, "));
					if(( (iVal2 & (1<<SGrHPOpstateType.HPINDHWMODE_VALUE))) != 0)  LOG.info(String.format("DWH ON, "));
					if(( (iVal2 & (1<<SGrHPOpstateType.COMPRESSORRUNNING_VALUE))) != 0)  LOG.info(String.format("Compressor ON, "));
					if(( (iVal2 & (1<<SGrHPOpstateType.SUMMERMODEACTIVE_VALUE))) != 0)  LOG.info(String.format("SUMMER_MODE_ACTIVE, "));
					if(( (iVal2 & (1<<SGrHPOpstateType.COOLINGMODEACTIVE_VALUE))) != 0)  LOG.info(String.format("COOLING_MODE_ACTIVE, "));
					if(( (iVal2 & (1<<SGrHPOpstateType.INDEFROSTMODE_VALUE))) != 0)  LOG.info(String.format("DEFROSTING, "));
				}
				if (iVal2 != 0)  
				{
					 LOG.info(String.format("    HPOpStateStiebel bits set: ")); 
					if(( (iVal2 & (1<<StiHPOpstateType.HP1PUMPON_VALUE))) != 0)  LOG.info(String.format("HP_1_ON, "));
					if(( (iVal2 & (1<<StiHPOpstateType.HP2PUMPON_VALUE))) != 0)  LOG.info(String.format("HP_2_ON, "));
					if(( (iVal2 & (1<<StiHPOpstateType.HPINDHWMODE_VALUE))) != 0)  LOG.info(String.format("DHW ON, "));
					if(( (iVal2 & (1<<StiHPOpstateType.HPINHEATINGMODE_VALUE))) != 0)  LOG.info(String.format("HEAT ON, "));
					if(( (iVal2 & (1<<StiHPOpstateType.COMPRESSORRUNNING_VALUE))) != 0)  LOG.info(String.format("Compressor ON, "));
					if(( (iVal2 & (1<<StiHPOpstateType.COOLINGMODEACTIVE_VALUE))) != 0)  LOG.info(String.format("COOLING ON, "));
					if(( (iVal2 & (1<<StiHPOpstateType.HEATUPPROGRAM_VALUE))) != 0)  LOG.info(String.format("HEAT PRORGRAMM, "));
					if(( (iVal2 & (1<<StiHPOpstateType.NHZSTAGESRUNNING_VALUE))) != 0)  LOG.info(String.format("NHZ Stage ON, "));
					if(( (iVal2 & (1<<StiHPOpstateType.MINONEIWSINDEFROSTMODE_VALUE))) != 0)  LOG.info(String.format("DEFROSTING, "));
					if(( (iVal2 & (1<<StiHPOpstateType.SILENTMODE1ACTIVE_VALUE))) != 0)  LOG.info(String.format("Silent 1 Mode, "));
					if(( (iVal2 & (1<<StiHPOpstateType.SILENTMODE2ACTIVE_VALUE))) != 0)  LOG.info(String.format("Silent 2 Mode (HP is off) "));
				}
				LOG.info(String.format(" "));	
				
				bVal1 = devStiebelISG.getValByGDPType("SG-ReadyStates_bwp", "SGReadyEnabled").isBoolean();
				bVal2 = devStiebelISG.getValByGDPType("SG-ReadyStates_bwp", "SGReadyInp1isON").isBoolean();	
				bVal3 = devStiebelISG.getValByGDPType("SG-ReadyStates_bwp", "SGReadyInp2isON").isBoolean();	  	
				// bVal3 = devStiebelISG.getValByGDPType("SG-ReadyStates_bwp", "SGReadyState").getEnum();	
				LOG.info(String.format(" "));	
				
				
				fVal1=devStiebelISG.getValByGDPType("DomHotWaterCtrl", "DomHotWTempStptComf").getFloat32();
				fVal2=devStiebelISG.getValByGDPType("DomHotWaterCtrl", "DomHotWTempStptEco").getFloat32();							
				fVal3=devStiebelISG.getValByGDPType("DomHotWaterCtrl", "DomHotWTempStptFb").getFloat32();
				fVal4=devStiebelISG.getValByGDPType("DomHotWaterCtrl", "ActDomHotWaterTemp").getFloat32();
				 LOG.info(String.format("  DomHotWaterCtrl:  DomHotWTempStptComf=" + fVal1 + " °C,  DomHotWTempStptEco=" + + fVal2 + " °C,  DomHotWTempStptFb=" + fVal3 + " °C,  ActDomHotWaterTemp=" + fVal4 + " °C "));  
				 LOG.info(String.format(" "));	
				fVal1=devStiebelISG.getValByGDPType("BufferStorageCtrl", "ActHeatBufferTempStptFb").getFloat32();
				fVal2=devStiebelISG.getValByGDPType("BufferStorageCtrl", "ActHeatBufferTemp").getFloat32();
				 LOG.info(String.format("  BufferStorageCtrl: ActHeatBufferTempStptFb=" + fVal1 + " °C,    ActHeatBufferTemp="  + fVal2 +  " °C"));  
				 LOG.info(String.format(" "));	
				fVal1=devStiebelISG.getValByGDPType("HeatCoolCtrl_1", "SupplyWaterTempStptComf").getFloat32();	
				fVal2=devStiebelISG.getValByGDPType("HeatCoolCtrl_1", "SupplyWaterTempStptEco").getFloat32();	
				fVal3=devStiebelISG.getValByGDPType("HeatCoolCtrl_1", "SupplyWaterTempStptFb").getFloat32();			
				fVal4=devStiebelISG.getValByGDPType("HeatCoolCtrl_1", "SupplyWaterTemp").getFloat32();
				 LOG.info(String.format("  HeatCoolCtrl_1:    SupplyWaterTempStptComf=" + fVal1 + " °C,  SupplyWaterTempStptEco=" + fVal2 +  " °C,  SupplyWaterTempStptFb=" + fVal3 + " °C,  SupplyWaterTemp=" + fVal4 + " °C "));  
				 LOG.info(String.format(" "));				 ;
				fVal1=devStiebelISG.getValByGDPType("HeatCoolCtrl_2", "SupplyWaterTempStptComf").getFloat32();	
				fVal2=devStiebelISG.getValByGDPType("HeatCoolCtrl_2", "SupplyWaterTempStptEco").getFloat32();	
				fVal3=devStiebelISG.getValByGDPType("HeatCoolCtrl_2", "SupplyWaterTempStptFb").getFloat32();			
				fVal4=devStiebelISG.getValByGDPType("HeatCoolCtrl_2", "SupplyWaterTemp").getFloat32();
				 LOG.info(String.format("  HeatCoolCtrl_2:    SupplyWaterTempStptComf=" + fVal1 + " °C,  SupplyWaterTempStptEco=" + fVal2 +  " °C,  SupplyWaterTempStptFb=" + fVal3 + " °C,  SupplyWaterTemp=" + fVal4 + " °C "));  
				 LOG.info(String.format(" "));	
				oEnumList = devStiebelISG.getValByGDPType("SG-ReadyStates_bwp", "SGReadyState").getEnum();
				bVal1=devStiebelISG.getValByGDPType("SG-ReadyStates_bwp", "SGReadyEnabled").isBoolean(); 
				bVal2=devStiebelISG.getValByGDPType("SG-ReadyStates_bwp", "SGReadyInp1isON").isBoolean();               
				bVal3=devStiebelISG.getValByGDPType("SG-ReadyStates_bwp", "SGReadyInp2isON").isBoolean();                             
				LOG.info(String.format("  SGReady-bwp:      SGReadyState=" + oEnumList.getSgreadyStateLv2().getLiteral() + ",  SGReadyEnabled=" + bVal1 + ",  SGReadyInp1isON=" + bVal2 + ",  SGReadyInp2isON=" + bVal3 ));
				oEnumList.unsetSgreadyStateLv2();
				LOG.info(String.format(" "));	
				fVal1=devStiebelISG.getValByGDPType("EnergyMonitor", "ThermalEnergyHeat").getFloat32();
				fVal2=devStiebelISG.getValByGDPType("EnergyMonitor", "ActiveEnergyACheat").getFloat32();
				fVal3=devStiebelISG.getValByGDPType("EnergyMonitor", "ThermalEnergyDomHotWater").getFloat32();
				fVal4=devStiebelISG.getValByGDPType("EnergyMonitor", "ActivelEnergyACdomWater").getFloat32();			
				LOG.info(String.format(" "));
				 LOG.info(String.format("  EnergyMonitor ThermalEnergyHeat=" + fVal1 + " kWh,  ActiveEnergyACheat="+ fVal2 + " kWh,  ThermalEnergyDomHotWater="+ fVal3 + " kWh,  ActivelEnergyACdomWater="+ fVal4 + " kWh"));  
				  
				
				fVal1=devStiebelISG.getValByGDPType("EnergyMonitor", "RuntimeHeating").getFloat32();
				fVal2=devStiebelISG.getValByGDPType("EnergyMonitor", "RuntimeDomHotWater").getFloat32();
				 LOG.info(String.format("  EnergyMonitor RuntimeHeating=" + fVal1 + " h,  RuntimeDomHotWater="+ fVal2 + " h"));  
				 				
//	             TBC: launches illegal address @31 , no other start data found
//	 				lVal=devStiebelISG.getValByGDPType("EnergyMonitor", "NrOfStartupsCompressor").getInt16U();
//				+ fVal3 + " h,  NrOfStartupsCompressor="  + lVal+" times
		}

			catch ( Exception e)
			{
				 LOG.info(String.format("Error reading value from device devStiebelISG: " + e));
				e.printStackTrace();
				devStiebel_ISGExcpetions++;
			}
	
}
	
		

		
	    // USED TO COPY / PASTE ADDITIONAL TEST DEVICES
		   // -----------------------------------------------------------------------------------------------------------------------------	
		   // Device testing frame
		   // -----------------------------------------------------------------------------------------------------------------------------	
			static void initCTAoptiHeat(String aBaseDir, String aDescriptionFile ) {				
				
				try {	
					
					DeviceDescriptionLoader<SGrModbusDeviceFrame> loader=new DeviceDescriptionLoader<>();
					SGrModbusDeviceFrame tstDesc=loader.load(aBaseDir, aDescriptionFile);	
					
					
					// // replace device specific for TCP  (easymodus uses Driver instance per device)						
					GenDriverAPI4ModbusTCP mbCTAoptiHeat= new GenDriverAPI4ModbusTCP();
					devCTAoptiHeat=new SGrModbusDevice(tstDesc, mbCTAoptiHeat);							
					mbCTAoptiHeat.initDevice("192.168.1.55",502);
					
				}
				
				catch ( Exception e )
				{
					 LOG.info(String.format("Error loading device description. " + e));
				}		
			}
			
			static void tstCTAoptiHeat()
			{
				float fVal1=(float) 0.0, fVal2=(float) 0.0, fVal3=(float) 0.0, fVal4=(float) 0.0 ;
				String  sVal1="0.0", sVal2="0.0", sVal3="0.0", sVal4 ="0.0";
				int  iVal1=0, iVal2=0, iVal3=0, iVal4=0;
				long  lVal1=0, lVal2=0, lVal3=0, lVal4=0;
				SGrEnumListType oEnumListGet=V0Factory.eINSTANCE.createSGrEnumListType();
				
				//Setters
				float fValStpt=(float)  runtimeCnt *  (float) 0.1;
				SGrBasicGenDataPointTypeType gdtValue=V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();
				SGrEnumListType oEnumListSet=V0Factory.eINSTANCE.createSGrEnumListType();
				SGrBasicGenDataPointTypeType  modeCmd = V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();
				
					try {	
						// if RTU is used, set address here
						// mbRTU.setUnitIdentifier((byte) 7);
					     
						LOG.info(String.format("Testing CTAoptiHeat"));
						Thread.sleep(25);
						

						if (runtimeCnt == 3)
						{   

						  // test setters 
						  gdtValue.setFloat32(fValStpt+(float)10.0);
						  // read only ! devCTAoptiHeat.setValByGDPType("BufferStorageCtrl", "HeatBufferTempStptOffset",gdtValue);
						  //gdtValue.setFLOAT32(fValStpt+(float)20.0);8
						  //devCTAoptiHeat.setValByGDPType("BufferStorageCtrl", "CoolBufferTempStptOffset",gdtValue);
						  //gdtValue.setFLOAT32(fValStpt*(float)10.0);
						  // read only ! devCTAoptiHeat.setValByGDPType("CompressorPwrCtrl", "SpeedCtrlSetpt",gdtValue);

						  
						  oEnumListSet.setCtaDHWOpMode(CtaDHWOpModeType.DHWON);
						  modeCmd.setEnum(oEnumListSet);
						  devCTAoptiHeat.setValByGDPType("DomHotWaterCtrl", "ctaDomHotWOpMode", modeCmd);
						}
						
			            // testing getters						
						oEnumListSet= devCTAoptiHeat.getValByGDPType("HeatPumpBase", "ctaHPOpModeCmd").getEnum();
						oEnumListGet = devCTAoptiHeat.getValByGDPType("HeatPumpBase", "ctaHPOpState").getEnum();						
						iVal3 = devCTAoptiHeat.getValByGDPType("HeatPumpBase", "ErrorNrSGr").getInt16();
						fVal1 = devCTAoptiHeat.getValByGDPType("HeatPumpBase", "OutsideAirTemp").getFloat32();
						fVal2 = devCTAoptiHeat.getValByGDPType("HeatPumpBase", "SupplyWaterTemp").getFloat32();	
						fVal3 = devCTAoptiHeat.getValByGDPType("HeatPumpBase", "ReturnSupplyWaterTemp").getFloat32();	
						
						LOG.info(String.format("  HeatPumpBase: HPOpModeCmd="+ oEnumListSet.getCtaHPOpMode().getLiteral() + " / " + oEnumListSet.getCtaHPOpMode().getValue() + ", HPOpState=" + oEnumListGet.getCtaHPOpState().getLiteral() + " / " + oEnumListGet.getCtaHPOpState().getValue() + ", ErrorNrSGr=" + iVal3));

						LOG.info(String.format("		  OutsideAir="+ fVal1 +" °C,  SupplyWaterTemp=" + fVal2 + "°C, ReturnSupplyWaterTemp="   + fVal3 +  "°C "));    
						 LOG.info(String.format(" "));
						
						oEnumListSet=  devCTAoptiHeat.getValByGDPType("DomHotWaterCtrl", "ctaDHWOpMode").getEnum();
						fVal1 = devCTAoptiHeat.getValByGDPType("DomHotWaterCtrl", "ActDomHotWaterTemp").getFloat32();
						fVal2 = devCTAoptiHeat.getValByGDPType("DomHotWaterCtrl", "DomHotWTempStpt").getFloat32();
						LOG.info(String.format("  DomHotWaterCtrl: DomHotWOpMode=" + oEnumListSet.getCtaDHWOpMode().getLiteral() + " / " +   oEnumListSet.getCtaDHWOpMode().getValue()  + ",  ActDomHotWaterTemp="  + fVal1 + " °C,  DomHotWTempStpt=" + fVal2 + " °C "));  
						LOG.info(String.format(" "));	
						
						fVal1 = devCTAoptiHeat.getValByGDPType("CompressorPwrCtrl", "ActSpeed").getFloat32();
						fVal2 = devCTAoptiHeat.getValByGDPType("CompressorPwrCtrl", "ActPowerACtot").getFloat32();
						fVal3 = devCTAoptiHeat.getValByGDPType("CompressorPwrCtrl","SpeedCtrlSetpt").getFloat32();
						LOG.info(String.format("  CompressorPwrCtrl  ActSpeed ActPowerACtot SpeedCtrlSetpt : "  + fVal1 + " %% rpm,  " + fVal2 + " %% kW,  " + fVal3 + "  rpm "));  
						LOG.info(String.format(" "));	

						fVal1 = devCTAoptiHeat.getValByGDPType("BufferStorageCtrl", "HeatWTempStptOffset").getFloat32();
						fVal2 = devCTAoptiHeat.getValByGDPType("BufferStorageCtrl", "ActHeatBufferTempUpper").getFloat32();
						fVal3 = devCTAoptiHeat.getValByGDPType("BufferStorageCtrl", "ActHeatBufferTempLower").getFloat32();
						LOG.info(String.format("  BufferStorageCtrl : " + fVal1 + " °C,  " + fVal2 + " °C,  " + fVal3  + " °C "));  
						LOG.info(String.format(" "));	
						
						iVal1 = devCTAoptiHeat.getValByGDPType("HeatCoolCtrl", "ctaHCOpModeCmd").getInt16();
						iVal2 = devCTAoptiHeat.getValByGDPType("HeatCoolCtrl", "HeatCoolOpState").getInt16();
						LOG.info(String.format("  HeatCoolCtrl HeatCoolCtrlOpModeCmd,  HeatCoolOpState: " + iVal1 + " ,  " + iVal2 + " "));   
						LOG.info(String.format(" "));	
						
						fVal1 = devCTAoptiHeat.getValByGDPType("HeatCoolCtrl", "SupplyWaterTempStpt").getFloat32();
						fVal2 = devCTAoptiHeat.getValByGDPType("HeatCoolCtrl", "SupplyWaterTemp").getFloat32();
						// not yet supported fVal4 = devCTAoptiHeat.getValByGDPType("HeatCoolCtrl", "ReturnSupplyWaterTemp").getFloat32();
						LOG.info(String.format("  HeatCoolCtrl SupplyWaterTempStpt,  SupplyWaterTemp  : " + fVal1 + " °C,  " + fVal2 + " °C "));  			
						LOG.info(String.format(" "));	
						
						fVal1 = devCTAoptiHeat.getValByGDPType("RoomTempCtrl", "RoomZoneTempSetpt").getFloat32();
						fVal2 = devCTAoptiHeat.getValByGDPType("RoomTempCtrl", "RoomZoneTemp").getFloat32();			
						LOG.info(String.format("  RoomZoneTemp Stpt, Val   :  " + fVal1 + " °C,  " + fVal2 + "  °C "));       
						LOG.info(String.format(" "));	
						
						
						//fVal1 = devCTAoptiHeat.getValByGDPType("Monitoring", "ThermalEnergyHeat").getFloat32();
						//fVal2 = devCTAoptiHeat.getValByGDPType("Monitoring", "ThermalEnergyCool").getFloat32();
						//fVal3 = devCTAoptiHeat.getValByGDPType("Monitoring", "RuntimeCompressor").getFloat32();
						//long lVal = devCTAoptiHeat.getValByGDPType("Monitoring", "NrOfStartupsCompressor").getInt32U();
						//LOG.info(String.format("  Monitoring ThermalEnergyHeat, ThermalEnergyCool, RuntimeCompressor, NrOfStartupsCompressor  : " + fVal1 + " kWh,  " + fVal2 + " kWh,  " + fVal3 + " h,  " + lVal+"  times"));  
						
						
					}
					catch ( Exception e)
					{
						 LOG.info(String.format("Error reading value from device dev: " + e));
						e.printStackTrace();
						devCTAoptiHeat_Exceptions++;
					}
			}
	
    // USED TO COPY / PASTE ADDITIONAL TEST DEVICES
	   // -----------------------------------------------------------------------------------------------------------------------------	
	   // Device testing frame
	   // -----------------------------------------------------------------------------------------------------------------------------	
		static void initEmptyDevFrame(String aBaseDir, String aDescriptionFile ) {				
			
			try {	
				
				DeviceDescriptionLoader<SGrModbusDeviceFrame> loader=new DeviceDescriptionLoader<>();
				SGrModbusDeviceFrame tstDesc=loader.load(aBaseDir, aDescriptionFile);	
				
				// replace device specific for RTU
				//add devXXXX= new SGrModbusDevice(tstDesc, mbRTU );
				
				// // replace device specific for TCP  (easymodus uses Driver instance per device)						
				// GenDriverAPI4ModbusTCP mbXXXXX= new GenDriverAPI4ModbusTCP();
				// devXXXXX=new SGrModbusDevice(tstDesc, mbWmbXXXXX);							
				// mbXXXXX.initDevice("192.168.1.182",502);
				
			}
			
			catch ( Exception e )
			{
				 LOG.info(String.format("Error loading device description. " + e));
			}		
		}
		
		static void tstEmptyDevFrame()
		{
			float fVal1=(float) 0.0, fVal2=(float) 0.0, fVal3=(float) 0.0, fVal4=(float) 0.0;
			String  sVal1="0.0", sVal2="0.0", sVal3="0.0", sVal4 ="0.0";
			
				try {	
					// if RTU is used, set address here
					// mbRTU.setUnitIdentifier((byte) 7);
				     
					LOG.info(String.format("Testing   xxxxx"));
					Thread.sleep(25);
					
					// Add test getters and setters for binary interface
					//fVal1=devWagoMeter.getValByGDPType("FpName", "DpName").getFloat32(); 
					//Thread.sleep(10);   


					// Add test getters and setters for String interfaces
					//sVal1=devWagoMeter.getVal("ActiveEnerBalanceAC", "ActiveImportAC");
					//Thread.sleep(10);
					
				}
				catch ( Exception e)
				{
					 LOG.info(String.format("Error reading value from device dev: " + e ));
					e.printStackTrace();
					// add Exception counter here
				}
		}
		
		// ******************  ENUM Sample  ************************************ //
		//SGrEnumListType oEnumListSet=V0Factory.eINSTANCE.createSGrEnumListType();
		//oEnumListSet.setSgrEVState(SGrEVStateType.EVSTANDBY);
	
}
