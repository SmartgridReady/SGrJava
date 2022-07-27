package communicator.impl;

public class HeatPumpTester {

	
	/*
	System.out.println(
			"------------------->  CREATING INSTANCE OF DEVICE sgrHeatPumpHoval  <-------------------");
	SGrModbusDeviceDescriptionType sgrHeatPumpHovalDescription = loader.load( XML_BASE_DIR,"SGr_04_0017_xxxx_HOVAL_HeatPumpV0.2.1.xml");
	GenDriverAPI4ModbusTCP mbHeatPumpHoval = new GenDriverAPI4ModbusTCP();
	SGrModbusDevice sgrHeatPumpHovalDev = new SGrModbusDevice(sgrHeatPumpHovalDescription, mbHeatPumpHoval);	
	
	System.out.println();
	//TODO: add Exception for device present flag "IsConnected" from IBT/cb code
	//mbHeatPumpHoval.initDevice("192.168.1.150",502); 
	
	System.out.println(
	"------------------->  CREATING INSTANCE OF DEVICE sgrHeatPumpStiebel  <-------------------");
	SGrModbusDeviceDescriptionType sgrHeatPumpStiebelDescription = loader.load( XML_BASE_DIR,"SGr_04_0015_xxxx_Stiebel_Eltron_HeatPumpV0.2.1.xml");
	GenDriverAPI4ModbusTCP mbHeatPumpStiebel = new GenDriverAPI4ModbusTCP();
	SGrModbusDevice sgrHeatPumpStiebelDev = new SGrModbusDevice(sgrHeatPumpStiebelDescription, mbHeatPumpStiebel);	

	System.out.println();
	//TODO: add Exception for device present flag "IsConnected" from IBT/cb code
	mbHeatPumpStiebel.initDevice("192.168.1.55",502); 
    */
	
	

	/*	System.out.println();
		System.out.println("HeatPumpHoval");
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
		// Adresse FlowWaterTempStptOffset Stufe Modbus falsch  (Wie FlowWaterTempStpt) 
		//sgrHeatPumpHovalDev.setValByGDPType("HeatCoolCtrl_1", "FlowWaterTempStpt",gdtValue);
		gdtValue.setFloat32(fValStpt+(float)60.0);
		//sgrHeatPumpHovalDev.setValByGDPType("HeatCoolCtrl_2", "FlowWaterTempStpt",gdtValue);
		gdtValue.setFloat32(fValStpt+(float)70.0);
		//sgrHeatPumpHovalDev.setValByGDPType("HeatCoolCtrl_3", "FlowWaterTempStpt",gdtValue);
		
		gdtValue.setFloat32(fValStpt*(float)10.0);
		//sgrHeatPumpHovalDev.setValByGDPType("CompressorPwrCtrl", "SpeedCtrlSetpt",gdtValue);
		

        // testing getters
		iVal1 = sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "HPOpModeCmd").getInt16();
		iVal2 = sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "HPOpState").getInt16();               
		iVal3 = sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "ErrorNrSGr").getInt16();
		fVal1 = sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "OutsideAirTemp").getFloat32();
		fVal2 = sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "FlowWaterTempStpt").getFloat32();
		fVal3 = sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "FlowWaterTempStptFb").getFloat32();					
		fVal4 = sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "FlowWaterTemp").getFloat32();	
		fVal5 = sgrHeatPumpHovalDev.getValByGDPType("HeatPumpBase", "BackFlowWaterTemp").getFloat32();	
		System.out.printf("  HeatPumpBase:      HPOpModeCmd = " + iVal1 + ",  HPOpState = " + iVal2 + ",  ErrorNrSGr = " + iVal3 + ",  OutsideAir = " + fVal1 +" °C,  FlowWaterTempStp(Handbetrieb Heizen,4) = " + fVal2 +" °C,  FlowWaterTempStpFb = " + fVal3 + "°C, FlowWaterTemp = " + fVal4 +  "°C,  BackFlowWaterTemp = " + fVal5 +  " °C %n");     
		System.out.println();
		
		iVal1 = sgrHeatPumpHovalDev.getValByGDPType("DomHotWaterCtrl", "DomHotWOpMode").getInt16();
		iVal2 = sgrHeatPumpHovalDev.getValByGDPType("DomHotWaterCtrl", "DomHotWState").getInt16();
		fVal1 = sgrHeatPumpHovalDev.getValByGDPType("DomHotWaterCtrl", "DomHotWTempStpt").getFloat32();
		fVal2 = sgrHeatPumpHovalDev.getValByGDPType("DomHotWaterCtrl", "ActDomHotWaterTemp").getFloat32();
		fVal3 = sgrHeatPumpHovalDev.getValByGDPType("DomHotWaterCtrl", "DomHotWTempStptFb").getFloat32();
		System.out.printf("  DomHotWaterCtrl:  DomHotWOpMode = " + iVal1 + ",  DomHotWState = " +  iVal2 + ",  DomHotWTempStpt (Kontstant,4) = " + fVal1 + " °C,   ActDomHotWaterTemp = " + fVal2 + " °C,  DomHotWTempStptFb = " + fVal3 + " °C %n");  
		System.out.println();

		fVal1 = sgrHeatPumpHovalDev.getValByGDPType("CompressorPwrCtrl", "ActSpeed").getFloat32();
		System.out.printf("  CompressorPwrCtrl: ActSpeed = "  + fVal1 + "%%  %n");  
		System.out.println();
		

		fVal1 = sgrHeatPumpHovalDev.getValByGDPType("BufferStorageCtrl", "ActBufferWaterTempStpFb").getFloat32();
		iVal1 = sgrHeatPumpHovalDev.getValByGDPType("BufferStorageCtrl", "BufferState").getInt16();
		fVal2 = sgrHeatPumpHovalDev.getValByGDPType("BufferStorageCtrl", "ActHeatBufferTempUpper").getFloat32();
		fVal3 = sgrHeatPumpHovalDev.getValByGDPType("BufferStorageCtrl", "ActHeatBufferTempLower").getFloat32();
		fVal4 = sgrHeatPumpHovalDev.getValByGDPType("BufferStorageCtrl", "ActCoolBufferTempUpper").getFloat32();
		fVal5 = sgrHeatPumpHovalDev.getValByGDPType("BufferStorageCtrl", "ActCoolBufferTempLower").getFloat32();
		System.out.printf("  BufferStorageCtrl: ActBufferWaterTempStpFb = " + fVal1 + ",  BufferState = "+ iVal1 + ",  ActHeatBufferTempUpper = "  + fVal2 +  " °C,  ActHeatBufferTempLower = " + fVal3 + " °C,  ActCoolBufferTempUpper = " + fVal4 + " °C,  ActCoolBufferTempLower = " + fVal5 + " °C %n%n");  
		
		
		iVal1 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_1", "HeatCoolCtrlOpModeCmd").getInt16();
		iVal2 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_1", "HeatCoolOpState").getInt16(); 				
		fVal1 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_1", "FlowWaterTemp").getFloat32();
		fVal2 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_1", "FlowWaterTempStpt").getFloat32();
		fVal3 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl", "BackFlowWaterTemp").getFloat32();
		System.out.printf("  HeatCoolCtrl_1:    HeatCoolCtrlOpModeCmd = " + iVal1 +" ,  HeatCoolOpState: "  + iVal2 + " FlowWaterTemp = " + fVal1 + " °C,  FlowWaterTempStpt = " + fVal2 + " °C,  BackFlowWaterTemp = " + fVal3 + " °C %n");  

		System.out.println();
		iVal1 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_2", "HeatCoolCtrlOpModeCmd").getInt16();
		iVal2 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_2", "HeatCoolOpState").getInt16();
		fVal1 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_2", "FlowWaterTemp").getFloat32();
		fVal2 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_2", "FlowWaterTempStpt").getFloat32();
		fVal3 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl", "BackFlowWaterTemp").getFloat32();
		System.out.printf("  HeatCoolCtrl_2:    HeatCoolCtrlOpModeCmd = " + iVal1 +" ,  HeatCoolOpState: "  + iVal2 + " FlowWaterTemp = " + fVal1 + " °C,  FlowWaterTempStpt = " + fVal2 + " °C,  BackFlowWaterTemp = " + fVal3 + " °C %n");  

		System.out.println();
		iVal1 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_3", "HeatCoolCtrlOpModeCmd").getInt16();
		iVal2 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_3", "HeatCoolOpState").getInt16();
		fVal1 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_3", "FlowWaterTemp").getFloat32();
		fVal2 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl_3", "FlowWaterTempStpt").getFloat32();
		fVal3 = sgrHeatPumpHovalDev.getValByGDPType("HeatCoolCtrl", "BackFlowWaterTemp").getFloat32();
		System.out.printf("  HeatCoolCtrl_3:    HeatCoolCtrlOpModeCmd = " + iVal1 +" ,  HeatCoolOpState: "  + iVal2 + " FlowWaterTemp = " + fVal1 + " °C,  FlowWaterTempStpt = " + fVal2 + " °C,  BackFlowWaterTemp = " + fVal3 + " °C %n");  
		System.out.println();
		
		fVal1 = sgrHeatPumpHovalDev.getValByGDPType("EnergyMonitor", "ThermalEnergyHeat").getFloat32();
		fVal2 = sgrHeatPumpHovalDev.getValByGDPType("EnergyMonitor", "ThermalEnergyCool").getFloat32();
		fVal3 = sgrHeatPumpHovalDev.getValByGDPType("EnergyMonitor", "RuntimeCompressor").getFloat32();
		long lVal = sgrHeatPumpHovalDev.getValByGDPType("EnergyMonitor", "NrOfStartupsCompressor").getInt32U();
		System.out.printf("  EnergyMonitor ThermalEnergyHeat, ThermalEnergyCool, RuntimeCompressor, NrOfStartupsCompressor  : " + fVal1 + " kWh,  " + fVal2 + " kWh,  " + fVal3 + " h,  " + lVal+"  times%n");  
		System.out.println(); 
		
			
			System.out.println();
			System.out.println("HeatPump Stiebel-Eltron");

            // testing getters
			iVal1 = sgrHeatPumpStiebelDev.getValByGDPType("HeatPumpBase", "HPOpModeCmd").getInt16();
			//iVal2 = sgrHeatPumpStiebelDev.getValByGDPType("HeatPumpBase", "HPOpState").getInt16();               
			iVal3 = sgrHeatPumpStiebelDev.getValByGDPType("HeatPumpBase", "ErrorNrSGr").getInt16();
			fVal1 = sgrHeatPumpStiebelDev.getValByGDPType("HeatPumpBase", "OutsideAirTemp").getFloat32();
			fVal2 = sgrHeatPumpStiebelDev.getValByGDPType("HeatPumpBase", "FlowWaterTempStpt").getFloat32();
			fVal3 = sgrHeatPumpStiebelDev.getValByGDPType("HeatPumpBase", "FlowWaterTempStptFb").getFloat32();					
			fVal4 = sgrHeatPumpStiebelDev.getValByGDPType("HeatPumpBase", "FlowWaterTemp").getFloat32();	
			fVal5 = sgrHeatPumpStiebelDev.getValByGDPType("HeatPumpBase", "BackFlowWaterTemp").getFloat32();	
			System.out.printf("  HeatPumpBase:      HPOpModeCmd = " + iVal1 + ",  HPOpState = " + iVal2 + ",  ErrorNrSGr = " + iVal3 + ",  OutsideAir = " + fVal1 +" °C,  FlowWaterTempStp(Handbetrieb Heizen,4) = " + fVal2 +" °C,  FlowWaterTempStpFb = " + fVal3 + "°C, FlowWaterTemp = " + fVal4 +  "°C,  BackFlowWaterTemp = " + fVal5 +  " °C %n");     
			System.out.println();
			

			fVal1 = sgrHeatPumpStiebelDev.getValByGDPType("DomHotWaterCtrl", "DomHotWTempStptComf").getFloat32();
			fVal2 = sgrHeatPumpStiebelDev.getValByGDPType("DomHotWaterCtrl", "DomHotWTempStptEco").getFloat32();							
			fVal3 = sgrHeatPumpStiebelDev.getValByGDPType("DomHotWaterCtrl", "DomHotWTempStptFb").getFloat32();
			fVal4 = sgrHeatPumpStiebelDev.getValByGDPType("DomHotWaterCtrl", "ActDomHotWaterTemp").getFloat32();
			System.out.printf("  DomHotWaterCtrl:  DomHotWTempStptComf= " + fVal1 + " °C,  DomHotWTempStptEco= " + + fVal2 + " °C,  DomHotWTempStptFb = " + fVal3 + "ActDomHotWaterTemp = " + fVal4 + " °C %n");  
			System.out.println();

			fVal1 = sgrHeatPumpStiebelDev.getValByGDPType("BufferStorageCtrl", "ActBufferWaterTempStpFb").getFloat32();
			fVal2 = sgrHeatPumpStiebelDev.getValByGDPType("BufferStorageCtrl", "ActHeatBufferTemp").getFloat32();
			System.out.printf("  BufferStorageCtrl: ActBufferWaterTempStpFb = " + fVal1 + ",  BufferState = "+ iVal1 + ",  ActHeatBufferTempUpper = "  + fVal2 +  " °C,  ActHeatBufferTempLower = " + fVal3 + " °C,  ActCoolBufferTempUpper = " + fVal4 + " °C,  ActCoolBufferTempLower = " + fVal5 + " °C %n%n");  
			
			fVal1 = sgrHeatPumpStiebelDev.getValByGDPType("HeatCoolCtrl_1", "FlowWaterTempStptComf").getFloat32();	
			fVal2 = sgrHeatPumpStiebelDev.getValByGDPType("HeatCoolCtrl_1", "FlowWaterTempStptEco").getFloat32();	
			fVal3 = sgrHeatPumpStiebelDev.getValByGDPType("HeatCoolCtrl_1", "FlowWaterTempStptFb").getFloat32();			
			fVal4 = sgrHeatPumpStiebelDev.getValByGDPType("HeatCoolCtrl_1", "FlowWaterTemp").getFloat32();
			System.out.printf("  HeatCoolCtrl_1:    FlowWaterTempStptComf = " + fVal1 + " °C,  FlowWaterTempStptEco = " + fVal2 +  " °C,  FlowWaterTempStptFb = " + fVal3 + " °C,  BackFlowWaterTemp = " + fVal4 + " °C %n");  
 

			/*
			fVal1 = sgrHeatPumpStiebelDev.getValByGDPType("EnergyMonitor", "ThermalEnergyHeat").getFloat32();
			fVal2 = sgrHeatPumpStiebelDev.getValByGDPType("EnergyMonitor", "ThermalEnergyCool").getFloat32();
			fVal3 = sgrHeatPumpStiebelDev.getValByGDPType("EnergyMonitor", "RuntimeCompressor").getFloat32();
			long lVal = sgrHeatPumpStiebelDev.getValByGDPType("EnergyMonitor", "NrOfStartupsCompressor").getInt32U();
			System.out.printf("  EnergyMonitor ThermalEnergyHeat, ThermalEnergyCool, RuntimeCompressor, NrOfStartupsCompressor  : " + fVal1 + " kWh,  " + fVal2 + " kWh,  " + fVal3 + " h,  " + lVal+"  times%n");  
			System.out.println(); 
			*/
}
