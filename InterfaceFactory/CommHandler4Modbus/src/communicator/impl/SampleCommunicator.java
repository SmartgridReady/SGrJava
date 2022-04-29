package communicator.impl;

import ch.smartgridready.ns.s.gr.v0.SGrModbusDeviceDescriptionType;
import communicator.helper.DeviceDescriptionLoader;
import communicator.helper.GenDriverAPI4Modbus;
import communicator.helper.GenDriverAPI4ModbusRTU;
//simulated Interface
import communicator.helper.GenDriverAPI4ModbusRTUMock;

public class SampleCommunicator {
	
	private static final String XML_BASE_DIR = "../XMLInstances/SGr/"; 
	
	public static void main( String argv[] ) {				
		
		try {
			
			DeviceDescriptionLoader<SGrModbusDeviceDescriptionType> loader = new DeviceDescriptionLoader<>();
			
			SGrModbusDeviceDescriptionType sgcpMeterDecription = loader.load( XML_BASE_DIR, "betaModbusABBMeterV0.1.2.xml");
			
			GenDriverAPI4Modbus mbRTUMock = new GenDriverAPI4ModbusRTUMock(); // Simulation API	
			
			GenDriverAPI4Modbus mbRTU = new GenDriverAPI4ModbusRTU();
			
			SGrModbusDevice sgcpDevice = new SGrModbusDevice(sgcpMeterDecription, mbRTU );					
			
			
			try {
				
				mbRTU.setUnitIdentifier((byte) 11);
				String Val1 = sgcpDevice.getVal("ActiveEnerBalanceAC", "ActiveImportAC");
				String Val2 = sgcpDevice.getVal("ActiveEnerBalanceAC", "ActiveExportAC");
				String Val3 = sgcpDevice.getVal("ActiveEnerBalanceAC", "ActiveNetAC");
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
