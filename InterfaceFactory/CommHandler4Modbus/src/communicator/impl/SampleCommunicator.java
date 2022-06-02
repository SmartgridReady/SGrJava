package communicator.impl;

import ch.smartgridready.ns.s.gr.v0.SGrBasicGenDataPointTypeType;
import ch.smartgridready.ns.s.gr.v0.SGrEVStateType;
import ch.smartgridready.ns.s.gr.v0.SGrEnumListType;
import ch.smartgridready.ns.s.gr.v0.SGrModbusDeviceDescriptionType;
import ch.smartgridready.ns.s.gr.v0.V0Factory;
import ch.smartgridready.ns.s.gr.v0.impl.SGrEnumListTypeImpl;
import ch.smartgridready.ns.s.gr.v0.impl.V0FactoryImpl;
import communicator.helper.DeviceDescriptionLoader;
import communicator.helper.GenDriverAPI4Modbus;
import communicator.helper.GenDriverAPI4ModbusRTU;
//simulated Interface
import communicator.helper.GenDriverAPI4ModbusRTUMock;
import communicator.helper.GenDriverAPI4ModbusTCP;
import communicator.impl.SGrModbusDevice;

public class SampleCommunicator {
	
	private static final String XML_BASE_DIR = "../../../../SGrSpecification/XMLInstances/ExtInterfaces/"; 
	
	public static void main( String argv[] ) {				
		
		try {
			
			DeviceDescriptionLoader<SGrModbusDeviceDescriptionType> loader = new DeviceDescriptionLoader<>();
			
			SGrModbusDeviceDescriptionType sgcpMeterDecription = loader.load( XML_BASE_DIR, "betaModbusABBMeterV0.1.2.xml");
			
		    //GenDriverAPI4Modbus mbRTUMock = new GenDriverAPI4ModbusRTUMock(); // Simulation API	
			GenDriverAPI4ModbusRTU mbRTU = new GenDriverAPI4ModbusRTU();
			mbRTU.initTrspService("COM9");			
			SGrModbusDevice sgcpMeterDevice = new SGrModbusDevice(sgcpMeterDecription, mbRTU);	
			
			
			// ******************  GARO & ENUM Test  ************************************ //
			SGrModbusDeviceDescriptionType wbGaroDescription = loader.load( XML_BASE_DIR, "EI4ModbusGaroEVSE_V0.1.2.xml");
			GenDriverAPI4ModbusTCP mbWbGaro = new GenDriverAPI4ModbusTCP();	
			SGrModbusDevice wbGaroDevice = new SGrModbusDevice(wbGaroDescription, mbWbGaro);
			mbWbGaro.initDevice("192.168.1.182",502);		
			 

			SGrEnumListType oEnumList = V0Factory.eINSTANCE.createSGrEnumListType();
			oEnumList.setSgrEVState(SGrEVStateType.EVSTANDBY);
			 
			oEnumList = wbGaroDevice.getValByGDPType("SmartEV", "EV-StatusCode").getEnum();
			SGrEVStateType sgrEVState = oEnumList.getSgrEVState();
			 
			System.out.printf("%n*****************  %nGaroWallbox EV-StatusCode:  " + oEnumList.getSgrEVState() + " %n*****************%n ");
			 
			
			// **************************   Start GA Testing   **********************************
							

			System.out.println(
					"------------------->  CREATING INSTANCE OF DEVICE sgrBiDirFlexMgmtVGT  <-------------------");
			
			SGrModbusDeviceDescriptionType SGrBiDirFlexMgmtVGTDescription = loader.load( XML_BASE_DIR,"VGT_Ei4Modbus_0000_0036_0030_4_0.1_SGCP_BiDirFlexMgmt.xml");
			GenDriverAPI4ModbusTCP mbBiDirFlexMgmtVGT = new GenDriverAPI4ModbusTCP();
			SGrModbusDevice sgcpBiDirFlexMgmtVGTDev = new SGrModbusDevice(SGrBiDirFlexMgmtVGTDescription, mbBiDirFlexMgmtVGT);	
			
			System.out.println();
			//TODO: add Exception for device present flag "IsConnected" from IBT/cb code
			mbBiDirFlexMgmtVGT.initDevice("192.168.1.50",502);
			
			System.out.println(
					"------------------->  CREATING INSTANCE OF DEVICE sgrHeatPumpHoval  <-------------------");
			SGrModbusDeviceDescriptionType sgrHeatPumpHovalDescription = loader.load( XML_BASE_DIR,"SGr_04_0017_0000_HOVAL_HeatPumpV0.1.2.xml");
			GenDriverAPI4ModbusTCP mbHeatPumpHoval = new GenDriverAPI4ModbusTCP();
			SGrModbusDevice sgrHeatPumpHovalDev = new SGrModbusDevice(sgrHeatPumpHovalDescription, mbHeatPumpHoval);	
			
			System.out.println();
			//TODO: add Exception for device present flag "IsConnected" from IBT/cb code
			mbHeatPumpHoval.initDevice("192.168.1.51",502);
						
			try {
				  int runtimeCnt;
				  String sVal1, sVal2, sVal3, sVal4;
				   float fVal1 = (float) 0.0, fVal2 = (float) 0.0, fVal3 = (float) 0.0, fVal4 = (float) 0.0;
				   int iVal1 = 0, iVal2 = 0, iVal3 = 0, iVal4 = 0, iVal5 = 0;
				   long lVal1 = 0, lVal2 = 0, lVal3 = 0, lVal4 = 0, lVal5 = 0; 
				   String hmVal1 = "-", hmVal2 = "-", hmVal3 = "-", hmVal4 = "-";
				   int hmTime = 4000, hmStep = 0;
				   float  fHovalSchlepp = (float) 0.0;
				   
				   mbRTU.setUnitIdentifier((byte) 11);
				   sVal1 = sgcpMeterDevice.getVal("ActiveEnerBalanceAC", "ActiveImportAC");
				   sVal2 = sgcpMeterDevice.getVal("ActiveEnerBalanceAC", "ActiveExportAC");
				   sVal3 = sgcpMeterDevice.getVal("ActiveEnerBalanceAC", "ActiveNetAC");
				   System.out.printf("ABBMeter ActiveEnerBalanceAC [KWh]:  " + sVal1 + ",  " + sVal2 + ",  " + sVal3 + " %n");	
				
				for (runtimeCnt = 0;runtimeCnt<500;runtimeCnt++)
				{
				   // loop data

							
				  System.out.println();
				  System.out.println("VGT SGCP");

				  sVal1 = sgcpBiDirFlexMgmtVGTDev.getVal("BiDirFlexMgmt", "ReadinessState");
				  sVal2 = sgcpBiDirFlexMgmtVGTDev.getVal("BiDirFlexMgmt", "RunState");
				  sVal3 = sgcpBiDirFlexMgmtVGTDev.getVal("BiDirFlexMgmt", "ActualActivePower");
				  if ((runtimeCnt & 1) == 0)
					  sgcpBiDirFlexMgmtVGTDev.setVal("BiDirFlexMgmt", "ActivePowerActivation", "false");
				  else
					  sgcpBiDirFlexMgmtVGTDev.setVal("BiDirFlexMgmt", "ActivePowerActivation", "true");

				System.out.printf(" ReadinessState / RunState / ActualActivePower: " + sVal1 + ", "
						+ sVal2 + sVal3 + " %n");
				 Thread.sleep(500);
				 oEnumList = wbGaroDevice.getValByGDPType("SmartEV", "EV-StatusCode").getEnum();
				 if (oEnumList != null)
				 {
					 fVal1 = wbGaroDevice.getValByGDPType("CurrentAC", "CurrentACL1").getFloat32();
					 fVal2 = wbGaroDevice.getValByGDPType("CurrentAC", "CurrentACL2").getFloat32();
					 fVal3 = wbGaroDevice.getValByGDPType("CurrentAC", "CurrentACL3").getFloat32();
					 sgrEVState = oEnumList.getSgrEVState();				 
					 System.out.printf("%nGaroWallbox:%n");
					 System.out.printf("  EV-StatusCode, CurrentAC[A] L1/L2/L3:  " + oEnumList.getSgrEVState() + "  I[1]=" + fVal1 + "  I[2]="  + fVal2 + "  I[3]="  + fVal3 + " %n");		 

					 fVal1 = wbGaroDevice.getValByGDPType("ActivePowerAC", "ActivePowerACL1").getFloat32();
					 fVal2 = wbGaroDevice.getValByGDPType("ActivePowerAC", "ActivePowerACL2").getFloat32();
					 fVal3 = wbGaroDevice.getValByGDPType("ActivePowerAC", "ActivePowerACL3").getFloat32();
					 System.out.printf("  PowerAC[kW] L1/L2/L3:     P[1]=" + fVal1 + "  P[2]="  + fVal2 + "  P[3]="  + fVal3 + " %n");	
					 
					 fVal1 = wbGaroDevice.getValByGDPType("ActiveEnergyAC", "ActiveEnergyACL1").getFloat32();
					 fVal2 = wbGaroDevice.getValByGDPType("ActiveEEnergyAC", "ActiveEnergyACL2").getFloat32();
					 fVal3 = wbGaroDevice.getValByGDPType("ActiveEEnergyAC", "ActiveEnergyACL3").getFloat32();
					 System.out.printf("  EnergyAC[kWh] L1/L2/L3:   W[1]=" + fVal1 + "  W[2]="  + fVal2 + "  W[3]="  + fVal3 + " %n");	
					
					 sVal1 = wbGaroDevice.getVal("SmartEV", "isSmartEV15188");
					 sVal2 = wbGaroDevice.getVal("SmartEV", "EVCCID");
					 System.out.printf("  SmartEV support (ISO/IEC 1588):" + sVal1 + "    EVCCID=" + sVal2 + " %n");	
				 }
				Thread.sleep(1500);
				/*
				System.out.println();
				System.out.println("HeatPumpHoval");
				//Thread.sleep(5000);
				//Setters
				float fValStpt = (float)  runtimeCnt *  (float) 0.1;
				SGrBasicGenDataPointTypeType gdtValue = V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();
				
				if (runtimeCnt == 1 )
				{
					//set control Modes
					
					// #0 = Wärmeerzeuger aus
					// #1 = Automatikbetrieb
					// #4 = Manueller Heizbetrieb
					// #5 = Manueller Kühlbetrieb   
					gdtValue.setInt16U(1);
					sgrHeatPumpHovalDev.setValByGDPType("HeatPumpBase","HPOpModeCmd",gdtValue);
					
					// #0 = Standbybetrieb
					// #1 = Woche 1
					// #2 = Woche 2
					// #4 = Konstant
					// #5 = Sparbetrieb
					// #7 = Handbetrieb Heizen
					// #8 = Handbetrieb Kühlen
					gdtValue.setInt16U(4);
					sgrHeatPumpHovalDev.setValByGDPType("HeatCoolCtrl_1","HeatCoolCtrlOpModeCmd",gdtValue);
					gdtValue.setInt16U(4);
					sgrHeatPumpHovalDev.setValByGDPType("HeatCoolCtrl_2","HeatCoolCtrlOpModeCmd",gdtValue);
					gdtValue.setInt16U(4);
					sgrHeatPumpHovalDev.setValByGDPType("HeatCoolCtrl_3","HeatCoolCtrlOpModeCmd",gdtValue);
					
					gdtValue.setInt16U(4);
					sgrHeatPumpHovalDev.setValByGDPType("DomHotWaterCtrl", "DomHotWOpMode",gdtValue);
					
				}
				
				gdtValue.setFloat32(fVal1);
				gdtValue.setFloat32(fValStpt+(float)40.0);
				sgrHeatPumpHovalDev.setValByGDPType("DomHotWaterCtrl", "DomHotWTempStptOffset",gdtValue);
				gdtValue.setFloat32(fValStpt+(float)50.0);  
				// Adresse FlowWaterTempStptOffset Stufe Modbus falsch  (Wie FlowWaterTempStpt) 
				sgrHeatPumpHovalDev.setValByGDPType("HeatCoolCtrl_1", "FlowWaterTempStpt",gdtValue);
				gdtValue.setFloat32(fValStpt+(float)60.0);
				sgrHeatPumpHovalDev.setValByGDPType("HeatCoolCtrl_2", "FlowWaterTempStpt",gdtValue);
				gdtValue.setFloat32(fValStpt+(float)70.0);
				sgrHeatPumpHovalDev.setValByGDPType("HeatCoolCtrl_3", "FlowWaterTempStpt",gdtValue);
				
				//gdtValue.setFloat32(fValStpt+(float)10.0);
				//sgrHeatPumpHovalDev.setValByGDPType("BufferStorageCtrl", "HeatBufferTempStptOffset",gdtValue);
				//gdtValue.setFloat32(fValStpt+(float)20.0);
				//sgrHeatPumpHovalDev.setValByGDPType("BufferStorageCtrl", "CoolBufferTempStptOffset",gdtValue);
				gdtValue.setFloat32(fValStpt*(float)10.0);
				sgrHeatPumpHovalDev.setValByGDPType("CompressorPwrCtrl", "SpeedCtrlSetpt",gdtValue);
				

	            // testing getters
				iVal1 = sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "HPOpModeCmd").getInt16();
				iVal2 = sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "HPOpState").getInt16();
				iVal3 = sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "ErrorNrSGr").getInt16();
				fVal1 = sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "OutsideAirTemp").getFloat32();
				fVal2 = sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "FlowWaterTempStpt").getFloat32();	
				fVal3 = sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "FlowWaterTemp").getFloat32();	
				fVal4 = sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "BackFlowWaterTemp").getFloat32();	
				System.out.printf("  HeatPumpBase: HPOpModeCmd, HPOpState, ErrorNrSGr, OutsideAir, FlowWaterTempStp, FlowWaterTemp, BackFlowWaterTemp : " + iVal1 + ",  " + iVal2 + ",  " + iVal3 + ",  " + fVal1 +" °C,  " + fVal2 + "°C  ," + fVal3 +  "°C, " + fVal4 +  "°C %n");     
				System.out.println();
				
				iVal1 = sgrHeatPumpHovalDev.getValByGDPType("DomHotWaterCtrl", "DomHotWOpMode").getInt16();
				fVal1 = sgrHeatPumpHovalDev.getValByGDPType("DomHotWaterCtrl", "ActDomHotWaterTemp").getFloat32();
				fVal2 = sgrHeatPumpHovalDev.getValByGDPType("DomHotWaterCtrl", "DomHotWTempStptOffset").getFloat32();
				System.out.printf("  DomHotWaterCtrl DomHotWOpMode ActDomHotWaterTemp DomHotWTempStptOffset  : "+iVal1 + ", "  + fVal1 + " °C,  " + fVal2 + " °C %n");  
				System.out.println();

				fVal1 = sgrHeatPumpHovalDev.getValByGDPType("CompressorPwrCtrl", "ActSpeed").getFloat32();
				fVal2 = sgrHeatPumpHovalDev.getValByGDPType("CompressorPwrCtrl", "ActPowerACtot").getFloat32();
				fVal3 = sgrHeatPumpHovalDev.getValByGDPType("CompressorPwrCtrl","SpeedCtrlSetpt").getFloat32();
				System.out.printf("  CompressorPwrCtrl  ActSpeed ActPowerACtot SpeedCtrlSetpt : "  + fVal1 + " %% rpm,  " + fVal2 + " %% kW,  " + fVal3 + " %% rpm %n");  
				System.out.println();
				
                
				fVal1 = sgrHeatPumpHovalDev.getValByGDPType("BufferStorageCtrl", "ActHeatBufferTempUpper").getFloat32();
				fVal2 = sgrHeatPumpHovalDev.getValByGDPType("BufferStorageCtrl", "ActHeatBufferTempLower").getFloat32();
				fVal3 = sgrHeatPumpHovalDev.getValByGDPType("BufferStorageCtrl", "ActCoolBufferTempUpper").getFloat32();
				fVal4 = sgrHeatPumpHovalDev.getValByGDPType("BufferStorageCtrl", "ActCoolBufferTempLower").getFloat32();
				System.out.printf("  BufferStorageCtrl : " + fVal1 + " °C,  " + fVal2 + " °C,  " + fVal3 + " °C,  " + fVal4 + " °C %n");  
				
				
				iVal1 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_1", "HeatCoolCtrlOpModeCmd").getInt16();
				iVal2 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_1", "HeatCoolOpState").getInt16();
				System.out.printf("  HeatCoolCtrl_1 HeatCoolCtrlOpModeCmd,  HeatCoolOpState: " + iVal1 + " ,  " + iVal2 + " %n");   
				
				fVal1 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_1", "FlowWaterTemp").getFloat32();
				fVal2 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_1", "FlowWaterTempStptOffset").getFloat32();
				fVal3 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_1", "FlowWaterTempStpt").getFloat32();
				fVal4 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl", "BackFlowWaterTemp").getFloat32();
				System.out.printf("  HeatCoolCtrl_1 FlowWaterTemp, FlowWaterTempStptOffset, FlowWaterTempStpt  : " + fVal1 + " °C,  " + fVal2 + " °C,  " + fVal3 + " °C, " + fVal4 + " °C  %n");  

				System.out.println();
				iVal1 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_2", "HeatCoolCtrlOpModeCmd").getInt16();
				iVal2 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_2", "HeatCoolOpState").getInt16();
				System.out.printf("  HeatCoolCtrl_2 HeatCoolCtrlOpModeCmd,  HeatCoolOpState: " + iVal1 + ",  " + iVal2 + " %n");   

				fVal1 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_2", "FlowWaterTemp").getFloat32();
				fVal2 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_2", "FlowWaterTempStptOffset").getFloat32();
				fVal3 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_2", "FlowWaterTempStpt").getFloat32();
				fVal4 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl", "BackFlowWaterTemp").getFloat32();
				System.out.printf("  HeatCoolCtrl_2 FlowWaterTemp, FlowWaterTempStptOffset, FlowWaterTempStpt  : " + fVal1 + " °C,  " + fVal2 + " °C,  " + fVal4 + " °C, " + fVal3 + " °C %n");  

				System.out.println();
				iVal1 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_3", "HeatCoolCtrlOpModeCmd").getInt16();
				iVal2 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_3", "HeatCoolOpState").getInt16();
				System.out.printf("  HeatCoolCtrl_3 HeatCoolCtrlOpModeCmd,  HeatCoolOpState: " + iVal1 + ",  " + iVal2 + " %n");   

				fVal1 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_3", "FlowWaterTemp").getFloat32();
				fVal2 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_3", "FlowWaterTempStptOffset").getFloat32();
				fVal3 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_3", "FlowWaterTempStpt").getFloat32();
				fVal4 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl", "BackFlowWaterTemp").getFloat32();
				System.out.printf("  HeatCoolCtrl_3 FlowWaterTemp, FlowWaterTempStptOffset, FlowWaterTempStpt  : " + fVal1 + " °C,  " + fVal2 + " °C,  " + fVal3 +" °C ,"+ fVal4 + " °C%n");  
				System.out.println();
				
				/*fVal1 = sgrHeatPumpHovalDev.getValByGDPType("Monitoring", "ThermalEnergyHeat").getFloat32();
				fVal2 = sgrHeatPumpHovalDev.getValByGDPType("Monitoring", "ThermalEnergyCool").getFloat32();
				fVal3 = sgrHeatPumpHovalDev.getValByGDPType("Monitoring", "RuntimeCompressor").getFloat32();
				long lVal = sgrHeatPumpHovalDev.getValByGDPType("Monitoring", "NrOfStartupsCompressor").getInt32U();
				System.out.printf("  Monitoring ThermalEnergyHeat, ThermalEnergyCool, RuntimeCompressor, NrOfStartupsCompressor  : " + fVal1 + " kWh,  " + fVal2 + " kWh,  " + fVal3 + " h,  " + lVal+"  times%n");  
				System.out.println();
				
				 Thread.sleep(3000); */
			}

		}
		catch ( Exception e)
		{
				System.out.println( "Error reading value from device. " + e);
				e.printStackTrace();
		}
	 }
	 catch ( Exception e )
	 {
			System.out.println( "Error loading device description. " + e);
	 }									
  }
		

}
