package communicator.modbus.impl;

import com.smartgridready.ns.v0.DataType;
import com.smartgridready.ns.v0.SGrModbusDeviceFrame;
import communicator.common.helper.DeviceDescriptionLoader;
import communicator.modbus.api.GenDeviceApi4Modbus;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusRTU;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;

public class GetValArrayTester {
		
	private static final Logger LOG = LoggerFactory.getLogger(GetValArrayTester.class);
	
	private static final String XML_BASE_DIR = ""; 
	
	public static void main( String[] argv ) {
		
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		URL deviceDesc = classloader.getResource("SGr_04_0014_0000_WAGO_SmartMeterV0.2.1-Arrays.xml");
		
		try {	
			
			DeviceDescriptionLoader<SGrModbusDeviceFrame> loader = new DeviceDescriptionLoader<>();
			SGrModbusDeviceFrame tstMeter = loader.load( XML_BASE_DIR, deviceDesc.getPath());
			
			GenDriverAPI4ModbusRTU mbRTU = new GenDriverAPI4ModbusRTU();
			mbRTU.initTrspService("COM3", 19200);	
			
			GenDeviceApi4Modbus devWagoMeter = new SGrModbusDevice(tstMeter, mbRTU );
			
			try {	
				// set device address of devWagoMeter
					
				mbRTU.setUnitIdentifier((byte) 1);
				DataType[] voltages = devWagoMeter.getValArrByGDPType("VoltageAC", "Voltage-L1-L2-L3");
				
				// Voltages as GDP type
				LOG.info("WAGO Meter Voltages AC run 1: L1: {}V - L2 {}V - L3: {}V", 
						voltages[0].getFloat32(),
						voltages[1].getFloat32(),
						voltages[2].getFloat32());
				
				
				voltages = devWagoMeter.getValArrByGDPType("VoltageAC", "Voltage-L1-L2-L3");				
				LOG.info("WAGO Meter Voltages AC run 2: L1: {}V - L2 {}V - L3: {}V", 
						voltages[0].getFloat32(),
						voltages[1].getFloat32(),
						voltages[2].getFloat32());
				
				Thread.sleep(1000);
				voltages = devWagoMeter.getValArrByGDPType("VoltageAC", "Voltage-L1-L2-L3");				
				LOG.info("WAGO Meter Voltages AC run 3: L1: {}V - L2 {}V - L3: {}V", 
						voltages[0].getFloat32(),
						voltages[1].getFloat32(),
						voltages[2].getFloat32());
				
				
				// Voltages as String
				String[] strVoltages = devWagoMeter.getValArr("VoltageAC", "Voltage-L1-L2-L3");
				LOG.info("WAGO Meter Voltages AC run 4; L1: {}V - L2 {}V - L3: {}V",
						strVoltages[0], strVoltages[1], strVoltages[2]);						
				
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
