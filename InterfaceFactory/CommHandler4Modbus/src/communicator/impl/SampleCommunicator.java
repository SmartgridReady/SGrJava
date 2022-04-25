package communicator.impl;

import ch.smartgridready.ns.s.gr.v0.SGrModbusDeviceDescriptionType;
import commHandler4Modbus.DriverAPI4Modbus;
import commHandler4Modbus.impl.DriverAPI4ModbusTCP;
import communicator.helper.DeviceDescriptionLoader;
import communicator.helper.DriverAPI4ModbusRTUMock;

public class SampleCommunicator {
	
	private static final String XML_BASE_DIR = "../XMLInstances/SGr/"; 
	
	public static void main( String argv[] ) {				
		
		try {
			
			DeviceDescriptionLoader<SGrModbusDeviceDescriptionType> loader = new DeviceDescriptionLoader<>();
			
			SGrModbusDeviceDescriptionType sgcpMeter = loader.load( XML_BASE_DIR, "betaModbusABBMeterV0.1.2.xml");
			
			DriverAPI4Modbus mbRTU = new DriverAPI4ModbusRTUMock();
			DriverAPI4Modbus mbTCP = new DriverAPI4ModbusTCP();	
			
			SGrModbusDevice sgcpDevice = new SGrModbusDevice(sgcpMeter, mbRTU, mbTCP );
			
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
