package communicator.modbus.impl;

import com.smartgridready.ns.v0.DeviceFrame;
import communicator.common.api.values.Value;
import communicator.common.helper.DeviceDescriptionLoader;
import communicator.modbus.api.GenDeviceApi4Modbus;
import communicator.modbus.transport.SGrModbusGatewayRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;

public class GetValArrayTester {
		
	private static final Logger LOG = LoggerFactory.getLogger(GetValArrayTester.class);
	
	private static final String XML_BASE_DIR = "";

	@SuppressWarnings("java:S2925")
	public static void main( String[] argv ) {
		
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		URL deviceDesc = classloader.getResource("SGr_04_0014_0000_WAGO_SmartMeterV0.2.1-Arrays.xml");
		
		try {	
			DeviceDescriptionLoader loader = new DeviceDescriptionLoader();
			DeviceFrame tstMeter = loader.load( XML_BASE_DIR, deviceDesc != null ? deviceDesc.getPath() : null);
			
			GenDeviceApi4Modbus devWagoMeter = new SGrModbusDevice(tstMeter, new SGrModbusGatewayRegistry());
			
			try {	
				// set device address of devWagoMeter

				Value[] voltages = devWagoMeter.getValArr("VoltageAC", "Voltage-L1-L2-L3");
				
				// Voltages as GDP type
				LOG.info("WAGO Meter Voltages AC run 1: L1: {}V - L2 {}V - L3: {}V", 
						voltages[0].getFloat32(),
						voltages[1].getFloat32(),
						voltages[2].getFloat32());
				
				
				voltages = devWagoMeter.getValArr("VoltageAC", "Voltage-L1-L2-L3");
				LOG.info("WAGO Meter Voltages AC run 2: L1: {}V - L2 {}V - L3: {}V", 
						voltages[0].getFloat32(),
						voltages[1].getFloat32(),
						voltages[2].getFloat32());

				Thread.sleep(1000);
				voltages = devWagoMeter.getValArr("VoltageAC", "Voltage-L1-L2-L3");
				LOG.info("WAGO Meter Voltages AC run 3: L1: {}V - L2 {}V - L3: {}V", 
						voltages[0].getFloat32(),
						voltages[1].getFloat32(),
						voltages[2].getFloat32());
				
				
				// Voltages as String
				voltages = devWagoMeter.getValArr("VoltageAC", "Voltage-L1-L2-L3");
				LOG.info("WAGO Meter Voltages AC run 4; L1: {}V - L2 {}V - L3: {}V",
						voltages[0], voltages[1], voltages[2]);
				
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
