package communicator.impl;

import ch.smartgridready.ns.s.gr.v0.SGrModbusDeviceDescriptionType;
import commHandler4Modbus.DriverAPI4Modbus;
import commHandler4Modbus.impl.DriverAPI4ModbusTCP;
import communicator.helper.DeviceDescriptionLoader;
// generic API for the adoption any Modbus Driver
import communicator.helper.genDriverAPI4ModbusRTU;
import communicator.helper.genDriverAPI4ModbusTCP;

//simulated Interface
import communicator.helper.DriverAPI4ModbusRTUMock;

public class SampleCommunicator {
	
	private static final String XML_BASE_DIR = "../XMLInstances/SGr/";
	
	public static void main( String argv[] ) {				
		
		try {
			
			DeviceDescriptionLoader<SGrModbusDeviceDescriptionType> loader = new DeviceDescriptionLoader<>();
			
			SGrModbusDeviceDescriptionType sgcpMeter = loader.load( XML_BASE_DIR, "betaModbusABBMeterV0.1.2.xml");

			
			// DriverAPI4Modbus mbRTU = new genDriverAPI4ModbusRTUMock(); // Simulation API
			
			genDriverAPI4ModbusRTU mbRTU = new genDriverAPI4ModbusRTU();   
			
			
			// reference using   TrspServiceModbusType
			sgcpMeter.setRefDriverClass(mbRTU);
			
			// for IBT lab installation
			mbRTU.initTrspService("COM9");
           
			
			genDriverAPI4ModbusTCP mbTCP = new genDriverAPI4ModbusTCP();

			otherDevice.setRefDriverClass(mbTCP);
			
/*
			 SGrModbusDevice sgcpMeterDev = new SGrModbusDevice(sgcpMeter, mbRTU, mbTCP );
*/			
			try {
				
				mbRTU.setUnitIdentifier((byte) 11);
				String Val1 = sgcpMeter.getVal("ActiveEnerBalanceAC", "ActiveImportAC");
				String Val2 = sgcpMeter.getVal("ActiveEnerBalanceAC", "ActiveExportAC");
				String Val3 = sgcpMeter.getVal("ActiveEnerBalanceAC", "ActiveNetAC");
				System.out.printf("ABBMeter ActiveEnerBalanceAC [KWh]:  " + Val1 + ",  " + Val2 + ",  " + Val3 + " %n");

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
