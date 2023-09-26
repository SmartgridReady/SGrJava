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

The purpose of this class is to support tests with EID's for Heat Pumps

 */

package communicator.modbus.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.smartgridready.ns.v0.DataTypeProduct;
import com.smartgridready.ns.v0.DeviceFrame;
import communicator.common.api.EnumRecord;
import communicator.common.api.Float64Value;
import communicator.common.api.Value;
import communicator.common.runtime.GenDriverAPI4Modbus;
import communicator.modbus.helper.GenDriverAPI4ModbusRTUMock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// SmartGridready definitions
import com.smartgridready.ns.v0.V0Factory;

//proprietary definitions

import communicator.common.helper.DeviceDescriptionLoader;
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
	
	// we need a single driver instance for RTU and separate these by device address
	private static GenDriverAPI4ModbusRTU mbRTU=null;
	
	// Modbus TCP devices
	private static SGrModbusDevice devTCP_IOP=null;
	private static SGrModbusDevice devStiebelISG=null;
	private static SGrModbusDevice devCTAoptiHeat = null;
	private static SGrModbusDevice devHovalTCP = null;
	
	// test loop parameters
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
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
	private static boolean  devHovalTCPIsOn=false;
	private static GenDriverAPI4Modbus  mockModbusDriver = new GenDriverAPI4ModbusRTUMock();

	public static void main( String argv[] ) {			

		
		try {
			
			DeviceDescriptionLoader<DeviceFrame> loader=new DeviceDescriptionLoader<>();
		    
			LOG.info(String.format("\n\n\n"));
			LOG.info(String.format("****************************************  SESSION STARTS ***********************************"));
			LOG.info("*  Time=" + dtf.format(LocalDateTime.now()) + "                                                                *");	
			LOG.info(String.format("********************************************************************************************"));
			
			if (devRTU_IOPIsOn)
			{
			  // Modbus RTU uses a single driver  (tailored to easymodbus)
			  mbRTU=new GenDriverAPI4ModbusRTU();
			  mbRTU.initTrspService("COM9");			
			}
			
			if (devStiebelISGIsOn) initStiebelISG(XML_BASE_DIR, "SGr_04_0015_xxxx_StiebelEltron_HeatPumpV0.2.1.xml");			
			if (devCTAoptiHeatIsOn) initCTAoptiHeat(XML_BASE_DIR, "SGr_04_0033_0000_CTA_HeatPumpV0.2.1.xml");
			if (devHovalTCPIsOn) initHovalTCP (XML_BASE_DIR, "SGr_04_0017_xxxx_HOVAL_HeatPumpV0.2.1.xml");
			
			// **************************   Start device Testing   **********************************						
   			
			try {
				
				for (runtimeCnt=0;runtimeCnt<3000;runtimeCnt++)
				{
				   // loop data & test reporting
				   Thread.sleep(10000);  // show last block for ccc  milliseconds
				    LOG.info(String.format("\n\n"));
				    LOG.info(">>> Time=" + dtf.format(LocalDateTime.now()));	
					LOG.info(String.format("------> LOOP=" + runtimeCnt ));		
					
					if (devStiebelISGIsOn && (devStiebel_ISGExcpetions !=0 ))  
						LOG.info(String.format("  StiebelISG Excpetions =" + devStiebel_ISGExcpetions));
					if (devCTAoptiHeatIsOn && (devCTAoptiHeat_Exceptions!=0)) 
						LOG.info(String.format("  CTAoptiHeat Excpetions=" + devCTAoptiHeat_Exceptions));
					if (devHovalTCPIsOn && (devHovalTCP_Exceptions!=0) )  
						LOG.info(String.format("HovalTCP Excpetions=" + devHovalTCP_Exceptions ));

					//Next loop 
					if (devStiebelISGIsOn)  tstStiebelISG();	
					if (devCTAoptiHeatIsOn)  tstCTAoptiHeat();	
					if (devHovalTCPIsOn) tstHovalTCP();

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
	

	
	
	
	   // -----------------------------------------------------------------------------------------------------------------------------	
	   // Device testing frame
	   // -----------------------------------------------------------------------------------------------------------------------------	
		static void initHovalTCP(String aBaseDir, String aDescriptionFile ) {				
			
			DeviceFrame tstDesc = null;
			
			try {	
				
				DeviceDescriptionLoader<DeviceFrame> loader=new DeviceDescriptionLoader<>();
				tstDesc=loader.load(aBaseDir, aDescriptionFile);
				
				// replace device specific for RTU
				//devHovalRTU= new SGrModbusDevice(tstDesc, mbRTU );
			}
			
			catch ( Exception e )
			{
				devHovalTCPIsOn = false;
				LOG.info(String.format("Error loading device description. " + e));
			}	
			
			try {
				// // replace device specific for TCP  (easymodus uses Driver instance per device)
				GenDriverAPI4Modbus mbHovalTCP = mockModbusDriver;
				if (mockModbusDriver == null) {
					mbHovalTCP = new GenDriverAPI4ModbusTCP();
				}
				devHovalTCP=new SGrModbusDevice(tstDesc, mbHovalTCP);							
				//setting Hoval Lab 
				mbHovalTCP.initDevice("192.168.0.35",502);						
				//mbHovalTCP.initDevice("192.168.1.55",502);
			}
			
			catch ( Exception e )
			{
				devHovalTCPIsOn = false;
				LOG.info(String.format("Error connecting device  " + e));
			}		
		}
		
		
		static void tstHovalTCP()
		{

			double fVal1=(long) 0.0, fVal2=(long) 0.0, fVal3=(long) 0.0, fVal4=(long) 0.0, fVal5=(long) 0.0;
			double dVal1 = 0.0, dVal2 = 0.0;
			int  iVal1=0, iVal2=0, iVal3=0, iVal4=0;
			long lVal=0;
			boolean bVal1=false,bVal2=false,bVal3=false;
			String  sVal1="0.0", sVal2="0.0", sVal3="0.0", sVal4 ="0.0";
			DataTypeProduct gdtValue = V0Factory.eINSTANCE.createDataTypeProduct();
				
			try {			
				 LOG.info(String.format("HeatPump HovalTCP"));
				 Thread.sleep(200);
				
				if (runtimeCnt == 2)
				{
                  // Testing Setters
				  DataTypeProduct  hpCmd = V0Factory.eINSTANCE.createDataTypeProduct();

				  float fValStpt = (float) 0.0 ;	
				  Value hpval = Float64Value.of(fValStpt);
				   LOG.info(String.format("######################  setting new values ######################"));
				   // testing setters: one setting for a test run only recommended
				   // read the device manual carefully before testing any setpoint
				   
				/*
				  // -------------------------------  SGR LEVEL 2 SETPOINTS	------------------------			 
				  // control HeatPumpBase by hovHPOpModeCmd enum
				  oEnumList.setHovHPOpMode(HovHPOpModeType.HPAUTOMATIC);
				  hpCmd.setEnum(oEnumList);
				  devHovalTCP.setValByGDPType("HeatPumpBase", "hovHPOpModeCmd", hpCmd);	
				  LOG.info(String.format("  Setting  HeatPumpBase:hovHPOpModeCmd="+ hpCmd.getEnum().getSgrHPOpMode().getLiteral()));
				  
				  // control HeatCoolCtrl_1 by enum hovHeatCoolCtrlOpModeCmd
	              oEnumList.setHovHCOpMode(HovHCOpModeType.HCCONSTANT);
				  hpCmd.setEnum(oEnumList);
				  devHovalTCP.setValByGDPType("HeatCoolCtrl_1", "hovHeatCoolCtrlOpModeCmd", hpCmd);
				  LOG.info(String.format("  Setting  HeatCoolCtrl_1:hovHeatCoolCtrlOpModeCmd="+ oEnumList.getHovHCOpMode().getLiteral()));
				  
				  // control HeatCoolCtrl_2 by enum hovHeatCoolCtrlOpModeCmd
	              oEnumList.setHovHCOpMode(HovHCOpModeType.HCCONSTANT);
				  hpCmd.setEnum(oEnumList);
				  devHovalTCP.setValByGDPType("HeatCoolCtrl_2", "hovHeatCoolCtrlOpModeCmd", hpCmd);
				  LOG.info(String.format("  Setting  HeatCoolCtrl_2:hovHeatCoolCtrlOpModeCmd="+ oEnumList.getHovHCOpMode().getLiteral()));
				  
				  // control HeatCoolCtrl_1 by enum hovHeatCoolCtrlOpModeCmd
	              oEnumList.setHovHCOpMode(HovHCOpModeType.HCCONSTANT);
				  hpCmd.setEnum(oEnumList);
				  devHovalTCP.setValByGDPType("HeatCoolCtrl_3", "hovHeatCoolCtrlOpModeCmd", hpCmd);
				  LOG.info(String.format("  Setting  HeatCoolCtrl_3:hovHeatCoolCtrlOpModeCmd="+ oEnumList.getHovHCOpMode().getLiteral()));
				  
				  // control DomHotWCtrl by  DomHotWOpMode
	              oEnumList.setHovDomHotWOpMode(HovDomHotWOpModeType.DHWECOOP);
				  hpCmd.setEnum(oEnumList);
				  devHovalTCP.setValByGDPType("DomHotWaterCtrl", "hovDomHotWOpModeCmd", hpCmd);
				  LOG.info(String.format("  Setting  DomHotWaterCtrl:hovDomHotWOpModeCmd"+ oEnumList.getHovDomHotWOpMode().getLiteral()));
				 		
				  // control ReadyStates_bwp by enum SGReadyStateLv2Type
	              oEnumList.setSgreadyStateLv2(SGReadyStateLv2Type.HPNORMAL);
	              oEnumList1.setHovSGReadySrcSel(HovSGReadySrcSelType.SGR_SRC_OFF);				  
	              hpCmd.setEnum(oEnumList1);
				  devHovalTCP.setValByGDPType("SG-ReadyStates_bwp", "hovSGReadySrcSelect", hpCmd);
				  LOG.info(String.format("  Setting  ReadyStates_bwp:hovSGReadySrcSelect="+ oEnumList1.getHovSGReadySrcSel().getLiteral())); 
				  				  hpCmd.setEnum(oEnumList);
				  devHovalTCP.setValByGDPType("SG-ReadyStates_bwp", "SGReadyCmd", hpCmd);
				  LOG.info(String.format("  Setting  ReadyStates_bwp:SGReadyCmd="+ oEnumList.getSgreadyStateLv2().getLiteral()));				  
				
                 // -------------------------------  SGR LEVEL 4 SETPOINTS -----------------------		
				 // PowerCtrl new Setpoint in %
				 fValStpt = (float) 50.0 ;
		         gdtValue.setFloat64(fVal1);
		         devHovalTCP.setValByGDPType("PowerCtrl", "PowerCtrlStpt",gdtValue);
		         LOG.info(String.format("  Setting PowerCtrl: PowerCtrlStp=" +fValStpt + "%%"));	
				   
		         // HeatCoolCtrl Setpoints  
				 fValStpt = (float) 20.1;
				 gdtValue.setFloat64(fValStpt);
		         devHovalTCP.setValByGDPType("HeatCoolCtrl_1", "SupplyWaterTempStpt",gdtValue);
		         gdtValue.setFloat64(fValStpt + (float) 0.1);
		         devHovalTCP.setValByGDPType("HeatCoolCtrl_2", "SupplyWaterTempStpt",gdtValue);
		         gdtValue.setFloat64(fValStpt+(float)0.2);
		         devHovalTCP.setValByGDPType("HeatCoolCtrl_3", "SupplyWaterTempStpt",gdtValue);
		         LOG.info(String.format("  Setting HeatCoolCtrl: SupplyWaterTempStpt _1="+ fValStpt +" °C , _2=" + (fValStpt+(float)0.1) +" °C , _3=" + (fValStpt+(float)0.2)+" °C" ));

			     // BufferStorageCtrl Offset-Setpoint Heating  
				 fValStpt = (float) 1.3;
				 gdtValue.setFloat64(fValStpt);
			     devHovalTCP.setValByGDPType("BufferStorageCtrl", "HeatBufferTempStptOffs",gdtValue);
			     LOG.info(String.format("  Setting BufferStorageCtrl: HeatBufferTempStptOffs=" + fValStpt + " °C" ));
			     
			      // BufferStorageCtrl Offset-Setpoint Cooling
				 fValStpt = (float) -1.3;
				 gdtValue.setFloat64(fValStpt);
			     devHovalTCP.setValByGDPType("BufferStorageCtrl", "CoolBufferTempStptOffs",gdtValue);
			     LOG.info(String.format("  Setting BufferStorageCtrl: CoolBufferTempStptOffs=" + fValStpt + " °C" ));
			    
				   
				 // DomHotWaterCtrl  DomHotWTempStptComf Setpoint 
				 fValStpt = (float) 55.0 ;
				 gdtValue.setFloat64(fValStpt);
			     devHovalTCP.setValByGDPType("DomHotWaterCtrl", "DomHotWTempStptComf",gdtValue);
			     LOG.info(String.format("  Setting DomHotWaterCtrl: DomHotWTempStptComf=" + fValStpt + " °C" ));
				   
				 // DomHotWaterCtrl  DomHotWTempStptComf Setpoint 
				 fValStpt = (float) 55.5 ;
				 gdtValue.setFloat64(fValStpt);
			     devHovalTCP.setValByGDPType("DomHotWaterCtrl", "DomHotWTempStptEco",gdtValue);
			     LOG.info(String.format("  Setting DomHotWaterCtrl: DomHotWTempStptEco=" + fValStpt + " °C" ));	     
			       */
			     LOG.info("\n");
			}
 
        // testing gette
		setMockIntegerType(true);
		EnumRecord opModeVal = devHovalTCP.getVal("HeatPumpBase", "hovHPOpModeCmd").getEnum();
		EnumRecord opStateVal = devHovalTCP.getVal("HeatPumpBase", "hovHPOpState").getEnum();
		bVal1=devHovalTCP.getVal("HeatPumpBase", "ErrorNrSGr").getBoolean();
		fVal1=devHovalTCP.getVal("HeatPumpBase", "OutsideAirTemp").getFloat64();
		fVal2=devHovalTCP.getVal("HeatPumpBase", "SupplyWaterTempStpt").getFloat64();
		fVal3=devHovalTCP.getVal("HeatPumpBase", "SupplyWaterTempStptFb").getFloat64();
		fVal4=devHovalTCP.getVal("HeatPumpBase", "SupplyWaterTemp").getFloat64();
		fVal5=devHovalTCP.getVal("HeatPumpBase", "ReturnSupplyWaterTemp").getFloat64();

		LOG.info(String.format(
				"  HeatPumpBase:    hovHPOpModeCmd=" + opModeVal.getLiteral() + "/" + opModeVal.getOrdinal()
						+ ",  HPOpState=" + opStateVal.getLiteral()+"/" + opStateVal.getOrdinal()
						+ ",  ErrorNrSGr=" + bVal1 + ",  OutsideAir=" + fVal1 +"°C"));

		LOG.info(String.format("    SupplyWaterTempStpt=" + fVal2 +" °C,  SupplyWaterTempStptFb=" + fVal3 + "°C, SupplyWaterTemp=" + fVal4 +  "°C,  ReturnSupplyWaterTemp=" + fVal5 +  " °C "));
		LOG.info(" ");

		setMockIntegerType(true);
		EnumRecord hovHotWOpMode =  devHovalTCP.getVal("DomHotWaterCtrl", "DomHotWOpMode").getEnum();
		EnumRecord hovHotWOpState = devHovalTCP.getVal("DomHotWaterCtrl", "hovDomHotWState").getEnum();
		fVal1=devHovalTCP.getVal("DomHotWaterCtrl", "DomHotWTempStpt").getFloat64();
		fVal2=devHovalTCP.getVal("DomHotWaterCtrl", "DomHotWTempStptComf").getFloat64();
		fVal3=devHovalTCP.getVal("DomHotWaterCtrl", "DomHotWTempStptEco").getFloat64();
		fVal4=devHovalTCP.getVal("DomHotWaterCtrl", "ActDomHotWTemp").getFloat64();
		fVal5=devHovalTCP.getVal("DomHotWaterCtrl", "DomHotWTempStptFb").getFloat64();

		LOG.info(String.format(
				"  DomHotWCtrl: hovDomHotWOpModeCmd=" + hovHotWOpMode.getLiteral() +"/"+ hovHotWOpMode.getOrdinal()
						+ ",  DomHotWState=" +  hovHotWOpState.getLiteral()+"/"+ hovHotWOpState.getOrdinal().intValue()
						+ ", DomHotWTempStptComf=" + fVal2 + " °C"));

		LOG.info(String.format("        DomHotWTempStptComf=" + fVal2 + " °C,  DomHotWTempStptEco=" + fVal3 + " °C,   ActDomHotWTemp=" + fVal4 + " °C,  DomHotWTempStptFb=" + fVal5 + " °C "));  
		LOG.info(" ");

		setMockIntegerType(false);
		fVal1=devHovalTCP.getVal("PowerCtrl", "PowerCtrlStpt").getFloat64();
		fVal2=devHovalTCP.getVal("PowerCtrl", "ActSpeed").getFloat64();
		fVal3=devHovalTCP.getVal("BufferStorageCtrl", "CoolBufferTempStptOffs").getFloat64();
		fVal3=devHovalTCP.getVal("PowerCtrl", "ActPowerACtot").getFloat64();
		LOG.info(String.format("  PowerCtrl: PowerCtrlStp =" + fVal1 + " %% , ActSpeed="  + fVal2 + " %% , ActPowerACtot=" + fVal3 +" kW"  ));  
		LOG.info(" ");  

		EnumRecord oEnumList = devHovalTCP.getVal("BufferStorageCtrl", "hovActBufferState").getEnum();
		fVal1=devHovalTCP.getVal("BufferStorageCtrl", "ActBufferWaterTempStptFb").getFloat64();
		fVal2=devHovalTCP.getVal("BufferStorageCtrl","HeatBufferTempStptOffs").getFloat64();
		fVal3=devHovalTCP.getVal("BufferStorageCtrl","CoolBufferTempStptOffs").getFloat64();
		LOG.info(String.format("  BufferStorageCtrl: hovActBufferState=" + oEnumList.getLiteral()+"/"+ oEnumList.getOrdinal()
				+ ",  ActBufferWaterTempStptFb=" + fVal1 +",  HeatBufferTempStptOffs="  + fVal2 +  " °C,  CoolBufferTempStptOffs=" + fVal3 + " °C"));
		fVal1=devHovalTCP.getVal("BufferStorageCtrl", "ActHeatBufferTemp").getFloat64();
		fVal2=devHovalTCP.getVal("BufferStorageCtrl", "ActHeatBufferTempUpper").getFloat64();
		fVal3=devHovalTCP.getVal("BufferStorageCtrl", "ActHeatBufferTempLower").getFloat64();
		fVal4=devHovalTCP.getVal("BufferStorageCtrl", "ActCoolBufferTempUpper").getFloat64();
		fVal5=devHovalTCP.getVal("BufferStorageCtrl", "ActCoolBufferTempLower").getFloat64();
		LOG.info(String.format("      ActHeatBufferTemp=" + fVal1 +",  ActHeatBufferTempUpper="  + fVal2 +  " °C,  ActHeatBufferTempLower=" + fVal3 + " °C,  ActCoolBufferTempUpper=" + fVal4 + " °C,  ActCoolBufferTempLower=" + fVal5 + " °C "));
		LOG.info(" "); 	
	

		oEnumList=devHovalTCP.getVal("HeatCoolCtrl_1", "hovHeatCoolCtrlOpModeCmd").getEnum();
		EnumRecord oEnumList1 =devHovalTCP.getVal("HeatCoolCtrl_1", "hovHeatCoolOpState").getEnum();
		fVal1=devHovalTCP.getVal("HeatCoolCtrl_1", "SupplyWaterTemp").getFloat64();
		fVal2=devHovalTCP.getVal("HeatCoolCtrl_1", "SupplyWaterTempStpt").getFloat64();
		fVal3=devHovalTCP.getVal("HeatCoolCtrl", "ReturnSupplyWaterTemp").getFloat64();
		LOG.info(String.format(
				"  HeatCoolCtrl_1:  HeatCoolCtrlOpModeCmd=" + oEnumList.getLiteral()+"/"+oEnumList.getOrdinal()
						+" ,  HeatCoolOpState: "  + oEnumList1.getLiteral()+"/"+ oEnumList1.getOrdinal()
						+ " SupplyWaterTemp=" + fVal1 + " °C,  SupplyWaterTempStpt=" + fVal2
						+ " °C,  ReturnSupplyWaterTemp=" + fVal3 + " °C "));
		LOG.info(" "); 

		oEnumList=devHovalTCP.getVal("HeatCoolCtrl_2", "hovHeatCoolCtrlOpModeCmd").getEnum();
		oEnumList1=devHovalTCP.getVal("HeatCoolCtrl_2", "hovHeatCoolOpState").getEnum();
		fVal1=devHovalTCP.getVal("HeatCoolCtrl_2", "SupplyWaterTemp").getFloat64();
		fVal2=devHovalTCP.getVal("HeatCoolCtrl_2", "SupplyWaterTempStpt").getFloat64();
		fVal3=devHovalTCP.getVal("HeatCoolCtrl", "ReturnSupplyWaterTemp").getFloat64();
		LOG.info(String.format(
				"  HeatCoolCtrl_2:  HeatCoolCtrlOpModeCmd=" + oEnumList.getLiteral()+"/"+oEnumList.getOrdinal()
						+" ,  HeatCoolOpState: "  + oEnumList1.getLiteral()+"/"+ oEnumList1.getOrdinal()
						+ ", SupplyWaterTemp=" + fVal1 + " °C,  SupplyWaterTempStpt=" + fVal2 + " °C,  ReturnSupplyWaterTemp=" + fVal3 + " °C "));
		LOG.info(" "); 

		oEnumList=devHovalTCP.getVal("HeatCoolCtrl_3", "hovHeatCoolCtrlOpModeCmd").getEnum();
		oEnumList1=devHovalTCP.getVal("HeatCoolCtrl_3", "hovHeatCoolOpState").getEnum();
		fVal1=devHovalTCP.getVal("HeatCoolCtrl_3", "SupplyWaterTemp").getFloat64();
		fVal2=devHovalTCP.getVal("HeatCoolCtrl_3", "SupplyWaterTempStpt").getFloat64();
		fVal3=devHovalTCP.getVal("HeatCoolCtrl", "ReturnSupplyWaterTemp").getFloat64();
		LOG.info(String.format("  HeatCoolCtrl_3:  HeatCoolCtrlOpModeCmd=" + oEnumList.getLiteral()+"/"+oEnumList.getOrdinal()
				+ " ,  HeatCoolOpState: "  + oEnumList1.getLiteral()+ "/" + oEnumList1.getOrdinal()
				+ " SupplyWaterTemp=" + fVal1 + " °C,  SupplyWaterTempStpt=" + fVal2
				+ " °C,  ReturnSupplyWaterTemp=" + fVal3 + " °C "));
		LOG.info(" "); 
		
		fVal1=devHovalTCP.getVal("EnergyMonitor", "ThermalEnergyTot").getFloat64();
		fVal2=devHovalTCP.getVal("EnergyMonitor", "ThermalEnergyHeat").getFloat64();
		fVal3=devHovalTCP.getVal("EnergyMonitor", "ThermalEnergyCool").getFloat64();
		fVal4=devHovalTCP.getVal("EnergyMonitor", "ThermalEnergyDomHotWater").getFloat64();
		LOG.info(String.format("  EnergyMonitor: ThermalEnergyTot=" + fVal1 + " kWh, ThermalEnergyHeat=" + fVal2 + " kWh, ThermalEnergyCool=" + fVal3 + " kWh, ThermalEnergyDomHotWater=" + fVal4 + " kWh"));    

		fVal1=devHovalTCP.getVal("EnergyMonitor", "ActiveEnergyACtot").getFloat64();
		fVal2=devHovalTCP.getVal("EnergyMonitor", "ActivePowerACtot").getFloat64();
		fVal3=devHovalTCP.getVal("EnergyMonitor", "RuntimeCompressor").getFloat64();
		lVal=devHovalTCP.getVal("EnergyMonitor", "NrOfStartupsCompressor").getInt32U();
		LOG.info(String.format("         ActiveEnergyACtot="+ fVal1 + " kWh,  ActivePowerACtot=" + fVal2 + " kWh, RuntimeCompressor="+ fVal3 + " h,  NrOfStartupsCompressor="+ lVal+"  times"));    
		LOG.info(" "); 


		oEnumList=devHovalTCP.getVal("SG-ReadyStates_bwp", "SGReadyCmd").getEnum();
		oEnumList1=devHovalTCP.getVal("SG-ReadyStates_bwp", "hovSGReadySrcSelect").getEnum();
		LOG.info(String.format("  SG-ReadyStates_bwp SGReadyCmd="+ oEnumList.getLiteral()+"/" + oEnumList.getOrdinal()
				+ ",   hovSGReadySrcSelect="+ oEnumList1.getLiteral() +"/" + oEnumList1.getOrdinal()));
			}
	catch ( Exception e)
	{
		 LOG.info(String.format("Error reading value from device dev: " + e));
		e.printStackTrace();
		devHovalTCP_Exceptions++;
	}
  }	
		
			

	   // -----------------------------------------------------------------------------------------------------------------------------	
	   // Device testing frame Stiebel
	   // -----------------------------------------------------------------------------------------------------------------------------	
		static void initStiebelISG(String aBaseDir, String aDescriptionFile ) {				
			
			DeviceFrame tmpDesc=null;

			try {	
				
				DeviceDescriptionLoader<DeviceFrame> loader=new DeviceDescriptionLoader<>();
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
				
				  // replace device specific for TCP  (easymodus uses Driver instance per device)
				  GenDriverAPI4Modbus mbStiebelISG = mockModbusDriver;
				  if (mockModbusDriver == null) {
					  mbStiebelISG = new GenDriverAPI4ModbusTCP();
				  }
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
			double fVal1=(double) 0.0, fVal2=(double) 0.0, fVal3=(double) 0.0, fVal4=(double) 0.0, fVal5=(double) 0.0;
			double dVal1 = 0.0, dVal2 = 0.0;
			int iVal1, iVal2=0, iVal3=0, iVal4=0;
			Value bitmapVal1;
			Value bitmapVal2;
			long lVal=0;
			boolean bVal1=false,bVal2=false,bVal3=false;
			String  sVal1="0.0", sVal2="0.0", sVal3="0.0", sVal4 ="0.0";

				
			try {
				LOG.info(String.format("HeatPump Stiebel-Eltron"));
				Thread.sleep(25);
				
				if (runtimeCnt == 2)
				{
					DataTypeProduct  hpval = V0Factory.eINSTANCE.createDataTypeProduct();
				  /*	
				   LOG.info(String.format("######################  setting new values ######################"));
				   // testing setters: one setting for a test run only recommended
				   // read the device manual carefully before testing any setpoint
				  // control by HPOpMode enum

				
				  oEnumList.setSgrHPOpMode(HPOpModeType.WPPROGOP);
				  hpval.setEnum(oEnumList);
				  devStiebelISG.setValByGDPType("HeatPumpBase", "HPOpModeCmd", hpval);
				  LOG.info(String.format("  Setting  HeatPumpBase:HPOpModeCmd="+ hpval.getEnum().getSgrHPOpMode().getLiteral()));
				
				 
				  //Setpoints Comfort
				  fVal1= (float) 31.1;
				  hpval.setFloat64(fVal1);
				  devStiebelISG.setValByGDPType("HeatCoolCtrl_1", "SupplyWaterTempStptComf",hpval);
				  LOG.info(String.format("  Setting HeatCoolCtrl_1: SupplyWaterTempStptComf=" + fVal1));
				  fVal1= (float) 32.2;
				  hpval.setFloat64(fVal1);
				  devStiebelISG.setValByGDPType("HeatCoolCtrl_2", "SupplyWaterTempStptComf",hpval);
				  LOG.info(String.format("  Setting HeatCoolCtrl_2: SupplyWaterTempStptComf=" + fVal1));
				  fVal1= (float) 43.3;
				  hpval.setFloat64(fVal1);
				  devStiebelISG.setValByGDPType("DomHotWCtrl", "DomHotWTempStptComf",hpval);
				  LOG.info(String.format("  Setting DomHotWCtrl: DomHotWTempStptComf=" + fVal1));
				 

				  //Setpoints Eco
				  fVal1= (float) 25.1;
				  hpval.setFloat64(fVal1);
				  devStiebelISG.setValByGDPType("HeatCoolCtrl_1", "SupplyWaterTempStptEco",hpval);
				  LOG.info(String.format("  Setting HeatCoolCtrl_1: SupplyWaterTempStptEco=" + fVal1));
				  fVal1= (float) 25.8;
				  hpval.setFloat64(fVal1);
				  devStiebelISG.setValByGDPType("HeatCoolCtrl_2", "SupplyWaterTempStptEco",hpval);
				  LOG.info(String.format("  Setting HeatCoolCtrl_2: SupplyWaterTempStptEco=" + fVal1));
				  fVal1= (float) 41.2;
				  hpval.setFloat64(fVal1);
				  devStiebelISG.setValByGDPType("DomHotWCtrl", "DomHotWTempStptEco",hpval);
				  LOG.info(String.format("  Setting HeatCoolCtrl_2: DomHotWTempStptEco=" + fVal1));

				 
				
				// enable or disable SG-Ready				   
				hpval.setBoolean(false);
				LOG.info(String.format("  Setting ReadyStates_bwp:SGReadyEnabled=" + hpval.isBoolean()));
				devStiebelISG.setValByGDPType("SG-ReadyStates_bwp", "SGReadyEnabled", hpval);
				
							
				/// control SG-Ready by enum SGReadyStateLv2Type
                oEnumList.setSgreadyStateLv2(SGReadyStateLv2Type.HPNORMAL);
				SGrGenDataType  hpCmd = V0Factory.eINSTANCE.createSGrGenDataType();
				hpCmd.setEnum(oEnumList);
				devStiebelISG.setValByGDPType("SG-ReadyStates_bwp", "SGReadyCmd", hpCmd);
				LOG.info(String.format("  Setting  ReadyStates_bwp:SGReadyCmd="+ oEnumList.getSgreadyStateLv2().getLiteral()));
				oEnumList.unsetSgreadyStateLv2();
			
			
				// control SG-Ready by contacts
				hpval.setBoolean(false);  
				devStiebelISG.setValByGDPType("SG-ReadyStates_bwp", "SGReadyInp1isON", hpval);
				LOG.info(String.format("  Setting SG-ReadyStates_bwp:SGReadyInp1isON=",hpval.isBoolean()));
				hpval.setBoolean(false);  
                devStiebelISG.setValByGDPType("SG-ReadyStates_bwp", "SGReadyInp2isON", hpval);
                LOG.info(String.format("  Setting SG-ReadyStates_bwp:SGReadyInp2isON=",hpval.isBoolean()));
				   */

				}

				  
				// testing
				setMockIntegerType(true);
				EnumRecord oEnumList= devStiebelISG.getVal("HeatPumpBase", "HPOpModeCmd").getEnum();
				bitmapVal1 = devStiebelISG.getVal("HeatPumpBase", "HPOpState");
				bitmapVal2 = devStiebelISG.getVal("HeatPumpBase", "stiHPOpState");
				bVal1=devStiebelISG.getVal("HeatPumpBase", "ErrorNrSGr").getBoolean();
				fVal1=devStiebelISG.getVal("HeatPumpBase", "OutsideAirTemp").getFloat64();
				fVal2=devStiebelISG.getVal("HeatPumpBase", "SupplyWaterTemp").getFloat64();
				fVal3=devStiebelISG.getVal("HeatPumpBase", "ReturnSupplyWaterTemp").getFloat64();
				fVal4=devStiebelISG.getVal("HeatPumpBase", "SourceTemp").getFloat64();
				LOG.info(String.format("  HeatPumpBase:      HPOpModeCmd=" + oEnumList.getLiteral() + ",  HPOpState=" + iVal2 + ",  ErrorNrSGr=" + bVal1 + ",  OutsideAir=" + fVal1 +" °C, SupplyWaterTemp=" + fVal2 +  "°C,  ReturnSupplyWaterTemp=" + fVal3 +  " °C,   SourceTemp=" + fVal4 +" °C "));
				// oEnumList.unsetSgrHPOpMode(); // TODO what is this supposed to do?

				LOG.info("    HPOpState bits set = {}", Integer.toBinaryString(bitmapVal1.getInt32()));
				bitmapVal1.getBitmap().forEach( (literal, value) -> LOG.info("        {} = {}", literal, value));


				LOG.info("    stiHPOpState bits set = {}", Integer.toBinaryString(bitmapVal2.getInt32()));
				bitmapVal2.getBitmap().forEach((literal, value) -> LOG.info("        {} = {}", literal, value));
				LOG.info(" ");
				
				fVal1=devStiebelISG.getVal("DomHotWaterCtrl", "DomHotWTempStptComf").getFloat64();
				fVal2=devStiebelISG.getVal("DomHotWaterCtrl", "DomHotWTempStptEco").getFloat64();
				fVal3=devStiebelISG.getVal("DomHotWaterCtrl", "DomHotWTempStptFb").getFloat64();
				fVal4=devStiebelISG.getVal("DomHotWaterCtrl", "ActDomHotWTemp").getFloat64();
				 LOG.info(String.format("  DomHotWCtrl:  DomHotWTempStptComf=" + fVal1 + " °C,  DomHotWTempStptEco=" + + fVal2 + " °C,  DomHotWTempStptFb=" + fVal3 + " °C,  ActDomHotWTemp=" + fVal4 + " °C "));  
				 LOG.info(String.format(" "));	
				fVal1=devStiebelISG.getVal("BufferStorageCtrl", "ActHeatBufferTempStptFb").getFloat64();
				fVal2=devStiebelISG.getVal("BufferStorageCtrl", "ActHeatBufferTemp").getFloat64();
				 LOG.info(String.format("  BufferStorageCtrl: ActHeatBufferTempStptFb=" + fVal1 + " °C,    ActHeatBufferTemp="  + fVal2 +  " °C"));  
				 LOG.info(String.format(" "));	
				fVal1=devStiebelISG.getVal("HeatCoolCtrl_1", "SupplyWaterTempStptComf").getFloat64();
				fVal2=devStiebelISG.getVal("HeatCoolCtrl_1", "SupplyWaterTempStptEco").getFloat64();
				fVal3=devStiebelISG.getVal("HeatCoolCtrl_1", "SupplyWaterTempStptFb").getFloat64();
				fVal4=devStiebelISG.getVal("HeatCoolCtrl_1", "SupplyWaterTemp").getFloat64();
				 LOG.info(String.format("  HeatCoolCtrl_1:    SupplyWaterTempStptComf=" + fVal1 + " °C,  SupplyWaterTempStptEco=" + fVal2 +  " °C,  SupplyWaterTempStptFb=" + fVal3 + " °C,  SupplyWaterTemp=" + fVal4 + " °C "));  
				 LOG.info(String.format(" "));				 ;
				fVal1=devStiebelISG.getVal("HeatCoolCtrl_2", "SupplyWaterTempStptComf").getFloat64();
				fVal2=devStiebelISG.getVal("HeatCoolCtrl_2", "SupplyWaterTempStptEco").getFloat64();
				fVal3=devStiebelISG.getVal("HeatCoolCtrl_2", "SupplyWaterTempStptFb").getFloat64();
				fVal4=devStiebelISG.getVal("HeatCoolCtrl_2", "SupplyWaterTemp").getFloat64();
				 LOG.info(String.format("  HeatCoolCtrl_2:    SupplyWaterTempStptComf=" + fVal1 + " °C,  SupplyWaterTempStptEco=" + fVal2 +  " °C,  SupplyWaterTempStptFb=" + fVal3 + " °C,  SupplyWaterTemp=" + fVal4 + " °C "));  
				 LOG.info(String.format(" "));

				oEnumList = devStiebelISG.getVal("SG-ReadyStates_bwp", "SGReadyState").getEnum();
				bVal1=devStiebelISG.getVal("SG-ReadyStates_bwp", "SGReadyEnabled").getBoolean();
				bVal2=devStiebelISG.getVal("SG-ReadyStates_bwp", "SGReadyInp1isON").getBoolean();
				bVal3=devStiebelISG.getVal("SG-ReadyStates_bwp", "SGReadyInp2isON").getBoolean();
				LOG.info(String.format(
						"  SGReady-bwp:      SGReadyState=" + oEnumList.getLiteral() + ",  SGReadyEnabled=" + bVal1
						+ ",  SGReadyInp1isON=" + bVal2 + ",  SGReadyInp2isON=" + bVal3 ));
				// oEnumList.unsetSgreadyStateLv2(); // TODO what is this supposed to do?
				LOG.info(String.format(" "));	
				fVal1=devStiebelISG.getVal("EnergyMonitor", "ThermalEnergyHeat").getFloat64();
				fVal2=devStiebelISG.getVal("EnergyMonitor", "ActiveEnergyACheat").getFloat64();
				fVal3=devStiebelISG.getVal("EnergyMonitor", "ThermalEnergyDomHotW").getFloat64();
				fVal4=devStiebelISG.getVal("EnergyMonitor", "ActivelEnergyACdomWater").getFloat64();
				LOG.info(String.format(" "));
				LOG.info(String.format("  EnergyMonitor ThermalEnergyHeat=" + fVal1 + " kWh,  ActiveEnergyACheat="+ fVal2 + " kWh,  ThermalEnergyDomHotW="+ fVal3 + " kWh,  ActivelEnergyACdomWater="+ fVal4 + " kWh"));  
				  
				
				fVal1=devStiebelISG.getVal("EnergyMonitor", "RuntimeHeating").getFloat64();
				fVal2=devStiebelISG.getVal("EnergyMonitor", "RuntimeDomHotW").getFloat64();
				 LOG.info(String.format("  EnergyMonitor RuntimeHeating=" + fVal1 + " h,  RuntimeDomHotW="+ fVal2 + " h"));  
			 				
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
		   // Device testing frame CTA
		   // -----------------------------------------------------------------------------------------------------------------------------	
			static void initCTAoptiHeat(String aBaseDir, String aDescriptionFile ) {
				
				DeviceFrame tstDesc=null;
				
				try {	
					
					DeviceDescriptionLoader<DeviceFrame> loader=new DeviceDescriptionLoader<>();
					tstDesc=loader.load(aBaseDir, aDescriptionFile);	
				}
				
				catch ( Exception e )
				{
					devCTAoptiHeatIsOn = false;
					LOG.info(String.format("Error loading device description. " + e));
				}	
					
				try {
					// // replace device specific for TCP  (easymodus uses Driver instance per device)						
					GenDriverAPI4ModbusTCP mbCTAoptiHeat= new GenDriverAPI4ModbusTCP();
					devCTAoptiHeat=new SGrModbusDevice(tstDesc, mbCTAoptiHeat);							
					mbCTAoptiHeat.initDevice("192.168.1.55",502);
					
				}
				
				catch ( Exception e )
				{
					 LOG.info(String.format("Error connecting device. " + e));
				}		
			}
			
			static void tstCTAoptiHeat()
			{
				double fVal1=(double) 0.0, fVal2=(double) 0.0, fVal3=(double) 0.0, fVal4=(double) 0.0 ;
				String  sVal1="0.0", sVal2="0.0", sVal3="0.0", sVal4 ="0.0";
				int  iVal1=0, iVal2=0, iVal3=0, iVal4=0;
				long  lVal1=0, lVal2=0, lVal3=0, lVal4=0;
				boolean bVal1 = false;
				
				//Setters
				float fValStpt=(float)  runtimeCnt *  (float) 0.1;
				DataTypeProduct gdtValue=V0Factory.eINSTANCE.createDataTypeProduct();
				DataTypeProduct  modeCmd = V0Factory.eINSTANCE.createDataTypeProduct();
				
					try {	
						// if RTU is used, set address here
						// mbRTU.setUnitIdentifier((byte) 7);
					     
						LOG.info(String.format("Testing CTAoptiHeat"));
						Thread.sleep(25);
						

						if (runtimeCnt == 2)
						{
							DataTypeProduct  hpval = V0Factory.eINSTANCE.createDataTypeProduct();
								
						  LOG.info(String.format("######################  setting new values ######################"));
						  // testing setters: one setting for a test run only recommended
						  // read the device manual carefully before testing any setpoint
				  
					      // test setters
					      /* Important Remark
					       * ctaRemoteCtrlTimeSec is a time counter counting down all setpoints of ths device.
					       * Activating this counter means that all remote setpoints become valid again
					       * 
					       */
						  
						  /* set power
						  //TODO: read timeout beim Schreiben klären 
						  gdtValue.setInt16U(20);
						  devCTAoptiHeat.setValByGDPType("PowerCtrl","ctaRemoteCtrlTimeSec",gdtValue);
						  LOG.info(String.format("Setting ctaRemoteCtrlTimeSec="  + gdtValue.getInt16U()));
						  Thread.sleep(25);
					      gdtValue.setFloat64((float)38.0);
						  devCTAoptiHeat.setValByGDPType("PowerCtrl","PowerCtrlStpt",gdtValue);
						  LOG.info(String.format("Setting PowerCtrl: PowerCtrlStpt="  + gdtValue.getFloat64()));
						  */
						  
						  
						  /* set storage buffer
						  //TODO: read timeout beim Schreiben klären
						  gdtValue.setInt16U(20);
						  devCTAoptiHeat.setValByGDPType("BufferStorageCtrl","ctaRemoteCtrlTimeSec",gdtValue);
						  LOG.info(String.format("Setting ctaRemoteCtrlTimeSec="  + gdtValue.getInt16U()));
						  Thread.sleep(25);					  
						  gdtValue.setFloat64((float)-2.0);
						  devCTAoptiHeat.setValByGDPType("BufferStorageCtrl","HeatBufferTempStptOffset",gdtValue);
						  LOG.info(String.format("Setting BufferStorageCtrl: HeatBufferTempStptOffset="  + gdtValue.getFloat64()));
						  */

					      
						  /*  Set DomHotWSetPoint
						 //TODO: read timeout beim Schreiben klären
						  gdtValue.setInt16U(20);
						  devCTAoptiHeat.setValByGDPType("DomHotWCtrl","ctaRemoteCtrlTimeSec",gdtValue);
						  LOG.info(String.format("Setting ctaRemoteCtrlTimeSec="  + gdtValue.getInt16U()));
						  Thread.sleep(25);							  
						  gdtValue.setFloat64((float)51.0);
						  devCTAoptiHeat.setValByGDPType("DomHotWCtrl", "DomHotWTempStpt",gdtValue);
						  */
						
						  /*  Set DomHotWCtrl
						  * /TODO: read timeout beim Schreiben klären
						  gdtValue.setInt16U(20);
						  devCTAoptiHeat.setValByGDPType("DomHotWCtrl","ctaRemoteCtrlTimeSec",gdtValue);
						  LOG.info(String.format("Setting ctaRemoteCtrlTimeSec="  + gdtValue.getInt16U()));
						  Thread.sleep(25);						  
						  oEnumListSet.setCtaDHWOpMode(CtaDHWOpModeType.DHWON);
						  modeCmd.setEnum(oEnumListSet);
						  devCTAoptiHeat.setValByGDPType("DomHotWCtrl", "ctaDomHotWOpMode", modeCmd);
						  */
					      
						  /* control SG-Ready by enum SGReadyStateLv2Type
						  gdtValue.setInt16U(120);
						  devCTAoptiHeat.setValByGDPType("SG-ReadyStates_bwp","ctaRemoteCtrlTimeSec",gdtValue);
		                  oEnumList.setSgreadyStateLv2(SGReadyStateLv2Type.HPNORMAL);
						  SGrGenDataType  hpCmd = V0Factory.eINSTANCE.createSGrGenDataType();
						  hpCmd.setEnum(oEnumList);
						  devCTAoptiHeat.setValByGDPType("SG-ReadyStates_bwp", "SGReadyCmd", hpCmd);
						  LOG.info(String.format("  Setting  ReadyStates_bwp:SGReadyCmd="+ oEnumList.getSgreadyStateLv2().getLiteral()));
						  oEnumList.unsetSgreadyStateLv2();						  
						  // ctaRemoteCtrlTimeSec is a second counter starting @max 3000 in order to allow using setpoints for external controls
						  gdtValue.setInt16U(20);
						  devCTAoptiHeat.setValByGDPType("SG-ReadyStates_bwp","ctaRemoteCtrlTimeSec",gdtValue);
						  LOG.info(String.format("Setting ctaRemoteCtrlTimeSec="  + gdtValue.getInt16U()));
					      */
						  LOG.info("\n");
													  
						 
						}
						
					      
			            // testing getters

						iVal1 =  (int)devCTAoptiHeat.getVal("SG-ReadyStates_bwp","ctaRemoteCtrlTimeSec").getInt16U();
						boolean bRem = true;
						if (iVal1==0) bRem = false; 
						LOG.info(String.format("  ctaRemoteCtrlTimeSec: "  + bRem + "  ctaRemoteCtrlTimeSec=" + iVal1));

						EnumRecord oEnumListSet= devCTAoptiHeat.getVal("HeatPumpBase", "ctaHPOpModeCmdFb").getEnum();
						EnumRecord oEnumListGet = devCTAoptiHeat.getVal("HeatPumpBase", "ctaHPOpState").getEnum();
						iVal3 = (int)devCTAoptiHeat.getVal("HeatPumpBase", "ErrorNrSGr").getInt16();
						fVal1 = devCTAoptiHeat.getVal("HeatPumpBase", "OutsideAirTemp").getFloat64();
						fVal2 = devCTAoptiHeat.getVal("HeatPumpBase", "SupplyWaterTemp").getFloat64();
						fVal3 = devCTAoptiHeat.getVal("HeatPumpBase", "ReturnSupplyWaterTemp").getFloat64();
						fVal4 = devCTAoptiHeat.getVal("HeatPumpBase", "SourceTemp").getFloat64();

						LOG.info(String.format("  HeatPumpBase: ctaHPOpModeCmdFb="+ oEnumListSet.getLiteral() + "/" + oEnumListSet.getOrdinal()
								+ ", ctaHPOpState=" + oEnumListGet.getLiteral() + " / " + oEnumListGet.getOrdinal() + ", ErrorNrSGr=" + iVal3));

						LOG.info(String.format("		  OutsideAir="+ fVal1 +" °C,  SupplyWaterTemp=" + fVal2 + "°C, ReturnSupplyWaterTemp="   + fVal3 +  "°C, SourceTemp="   + fVal4 +  "°C " ));    
						LOG.info(String.format(" "));

						oEnumListSet=  devCTAoptiHeat.getVal("DomHotWaterCtrl", "ctaDomHotWOpModeCmd").getEnum();
						fVal1 = devCTAoptiHeat.getVal("DomHotWaterCtrl", "ActDomHotWTemp").getFloat64();
						fVal2 = devCTAoptiHeat.getVal("DomHotWaterCtrl", "DomHotWTempStpt").getFloat64();

						LOG.info(String.format("  DomHotWaterCtrl: ctaDomHotWOpModeCmd=" + oEnumListSet.getLiteral() + "/" +   oEnumListSet.getOrdinal()
								+ ",  ActDomHotWTemp="  + fVal1 + " °C,  DomHotWTempStpt=" + fVal2 + " °C "));
						LOG.info(String.format(" "));	
						
						fVal1 = devCTAoptiHeat.getVal("PowerCtrl", "ActSpeed").getFloat64();
						fVal2 = devCTAoptiHeat.getVal("PowerCtrl", "ActPowerACtot").getFloat64();
						fVal3 = devCTAoptiHeat.getVal("PowerCtrl","PowerCtrlStpt").getFloat64();
						LOG.info(String.format("  PowerCtrl:  ActSpeed="  + fVal1 + " Hz, ActPowerACtot=" + fVal2 + " kW,  PowerCtrlStpt=" + fVal3 ));  
						LOG.info(String.format(" "));	

						fVal1 = devCTAoptiHeat.getVal("BufferStorageCtrl", "HeatBufferTempStptOffset").getFloat64();
						fVal2 = devCTAoptiHeat.getVal("BufferStorageCtrl", "ActHeatBufferTempUpper").getFloat64();
						fVal3 = devCTAoptiHeat.getVal("BufferStorageCtrl", "ActHeatBufferTempLower").getFloat64();
						LOG.info(String.format("  BufferStorageCtrl : ActHeatBufferTempUpper=" + fVal2 + " °C,  ActHeatBufferTempLower=" + fVal3  + " °C   HeatBufferTempStptOffset=" + fVal1 + " °C"));  
						LOG.info(String.format(" "));	
						
						iVal1 = (int)devCTAoptiHeat.getVal("HeatCoolCtrl", "ctaHCOpModeCmd").getInt16();
						iVal2 = (int)devCTAoptiHeat.getVal("HeatCoolCtrl", "HeatCoolOpState").getInt16();
						LOG.info(String.format("  HeatCoolCtrl: HeatCoolCtrlOpModeCmd="+ iVal1 + ",  HeatCoolOpState=" + iVal2));   				
						fVal1 = devCTAoptiHeat.getVal("HeatCoolCtrl", "SupplyWaterTempStpt").getFloat64();
						fVal2 = devCTAoptiHeat.getVal("HeatCoolCtrl", "SupplyWaterTemp").getFloat64();
						// not yet supported fVal4 = devCTAoptiHeat.getValByGDPType("HeatCoolCtrl", "ReturnSupplyWaterTemp").getFloat64();
						LOG.info(String.format("                SupplyWaterTempStpt=" + fVal1 + " °C,  SupplyWaterTemp=" + fVal2 + " °C "));  			
						LOG.info(String.format(" "));	
						
						fVal1 = devCTAoptiHeat.getVal("RoomTempCtrl", "RoomZoneTempStpt").getFloat64();
						fVal2 = devCTAoptiHeat.getVal("RoomTempCtrl", "RoomZoneTemp").getFloat64();
						LOG.info(String.format("  RoomTempCtrl: RoomZoneTemp=" + fVal2 + " °C,  RoomZoneTempStpt=" + fVal1 + "  °C "));       
						LOG.info(String.format(" "));	
						
						EnumRecord oEnumList = devCTAoptiHeat.getVal("SG-ReadyStates_bwp", "SGReadyCmd").getEnum();
						LOG.info(String.format("  SGReady-bwp:  SGReadyCmd=" + oEnumList.getLiteral()));
						//oEnumList.unsetSgreadyStateLv2(); // TODO what is this supposed to do
						LOG.info(String.format(" "));	
						

						fVal1 = devCTAoptiHeat.getVal("EnergyMonitor", "ThermalEnergyTot").getFloat64();
						fVal2 = devCTAoptiHeat.getVal("EnergyMonitor", "ThermalEnergyHeat").getFloat64();
						fVal3 = devCTAoptiHeat.getVal("EnergyMonitor", "ThermalEnergyDomHotW").getFloat64();
						LOG.info(String.format("  EnergyMonitor: ThermalEnergyTot="  + fVal1 + " kWh, ThermalEnergyHeat=" + fVal2 + " kWh,  ThermalEnergyDomHotW=" + fVal3 + " kWh")); 
						fVal1 = devCTAoptiHeat.getVal("EnergyMonitor", "ActiveEnergyACTot").getFloat64();
						fVal2 = devCTAoptiHeat.getVal("EnergyMonitor", "ActiveEnergyACHeat").getFloat64();
						fVal3 = devCTAoptiHeat.getVal("EnergyMonitor", "ActiveEnergyAC").getFloat64();
						LOG.info(String.format("                 ActiveEnergyACTot="  + fVal1 + " kWh, ActiveEnergyACHeat=" + fVal2 + " kWh, ActiveEnergyACDomHotW=" + fVal3 + " kWh"));   


						fVal1 = devCTAoptiHeat.getVal("EnergyMonitor", "RuntimeHeating").getFloat64();
						fVal2 = devCTAoptiHeat.getVal("EnergyMonitor", "RuntimeCooling").getFloat64();
						long lVal = devCTAoptiHeat.getVal("EnergyMonitor", "NrOfStartupsCompressor").getInt32U();
						LOG.info(String.format("                 RuntimeHeating="  + fVal1 + " h, RuntimeCooling=" + fVal2 + " h, NrOfStartupsCompressor=" + lVal + " times"));   

						
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
		static void initdevXXXXX(String aBaseDir, String aDescriptionFile ) {				
			
			DeviceFrame tstDesc;
			
			try {	
				
				DeviceDescriptionLoader<DeviceFrame> loader=new DeviceDescriptionLoader<>();
				tstDesc=loader.load(aBaseDir, aDescriptionFile);	
				
				// replace device specific for RTU
				//add devXXXX= new SGrModbusDevice(tstDesc, mbRTU );
			}
			
			catch ( Exception e )
			{
				    // devXXXXXON = false; 
					 LOG.info(String.format("Error loading device description. " + e));
			}	
			
			try {
				// // replace device specific for TCP  (easymodus uses Driver instance per device)						
				// GenDriverAPI4ModbusTCP mbXXXXX= new GenDriverAPI4ModbusTCP();
				// devXXXXX=new SGrModbusDevice(tstDesc, mbWmbXXXXX);							
				// mbXXXXX.initDevice("192.168.1.182",502);
					
			}
			
			catch ( Exception e )
			{
				 //devXXXXXON = false; 
				 LOG.info(String.format("Error connecting device  " + e));
			}		
		}
		
		
		static void tstdevXXXXX()
		{

			float fVal1=(float) 0.0, fVal2=(float) 0.0, fVal3=(float) 0.0, fVal4=(float) 0.0, fVal5=(float) 0.0;
			double dVal1 = 0.0, dVal2 = 0.0;
			int  iVal1=0, iVal2=0, iVal3=0, iVal4=0;
			long lVal=0;
			boolean bVal1=false,bVal2=false,bVal3=false;
			String  sVal1="0.0", sVal2="0.0", sVal3="0.0", sVal4 ="0.0";

				
			try {			
				 LOG.info(String.format("HeatPump xxxxxx"));
				Thread.sleep(25);
				
				if (runtimeCnt == 2)
				{

					DataTypeProduct  hpval = V0Factory.eINSTANCE.createDataTypeProduct();
					
				   LOG.info(String.format("######################  setting new values ######################"));
				   // testing setters: one setting for a test run only recommended
				   // read the device manual carefully before testing any setpoint
				  // control by HPOpMode enum

	/*			
				  oEnumList.setSgrHPOpMode(SGrHPOpModeType.WPPROGOP);
				  hpval.setEnum(oEnumList);
				  devXXXXX.setValByGDPType("HeatPumpBase", "HPOpModeCmd", hpval);	
				  LOG.info(String.format("  Setting  HeatPumpBase:HPOpModeCmd="+ hpval.getEnum().getSgrHPOpMode().getLiteral()));
				
				 
				  //Setpoints Comfort
				  fVal1= (float) 31.1;
				  hpval.setFloat64(fVal1);
				  devXXXXX.setValByGDPType("HeatCoolCtrl_1", "SupplyWaterTempStptComf",hpval);
				  LOG.info(String.format("  Setting HeatCoolCtrl_1: SupplyWaterTempStptComf=" + fVal1));
		*/		 
					
				}
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

		private static void setMockIntegerType(boolean isInteger) {
			if (mockModbusDriver instanceof GenDriverAPI4ModbusRTUMock) {
				((GenDriverAPI4ModbusRTUMock)mockModbusDriver).setIsIntegerType(isInteger);
			}
		}
	
}
