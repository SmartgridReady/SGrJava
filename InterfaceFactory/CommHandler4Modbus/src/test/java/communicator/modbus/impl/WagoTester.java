package communicator.modbus.impl;

import com.smartgridready.ns.v0.ModbusDeviceFrame;
import communicator.common.helper.DeviceDescriptionLoader;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusRTU;
import io.vavr.Tuple2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class WagoTester {

    private static final Logger LOG = LoggerFactory.getLogger(GetValArrayTester.class);

    private static final String XML_BASE_DIR="../../../SGrSpecifications/XMLInstances/ExtInterfaces/";

    private static final class ProtocolRecord {
        String fpName;
        String dpName;
        String readVal;
        String exception;

        @Override
        public String toString() {
            return String.format("%22s\t\t%18s\t\t%10s\t%s", fpName, dpName, readVal, exception);
        }
    }

    public static void main( String[] argv ) {

        try {

            DeviceDescriptionLoader<ModbusDeviceFrame> loader = new DeviceDescriptionLoader<>();
            ModbusDeviceFrame devDesc = loader.load( XML_BASE_DIR, "SGr_04_0014_0000_WAGO_SmartMeterV0.2.1.xml");

            GenDriverAPI4ModbusRTU mbRTU = new GenDriverAPI4ModbusRTU();
            mbRTU.initTrspService("COM3", 19200);

            SGrModbusDevice devWagoMeter = new SGrModbusDevice(devDesc, mbRTU );

            final List<Tuple2<String, String>> datapPoints = new ArrayList<>();

            System.out.print("\nWago test .");
            devDesc.getFunctionalProfileList().getFunctionalProfileListElement().forEach( fp -> {
                    String fpName = fp.getFunctionalProfile().getFunctionalProfileName();
                    fp.getDataPointList().getDataPointListElement().forEach( dp -> {
                            datapPoints.add(new Tuple2<>(fpName, dp.getDataPoint().getDataPointName()));
                                try {                                	
                                	System.out.print(".");
                                    Thread.sleep(500);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                    );
                }
            );
            
            System.out.println();

            final List<ProtocolRecord> protocol = new ArrayList<>();
            datapPoints.forEach( tuple -> protocol.add(checkDataPoint(tuple, devWagoMeter)));

            protocol.forEach(System.out::println);

        }
        catch ( Exception e )
        {
            LOG.error( "Error loading device description. " + e);
        }
    }

    private static ProtocolRecord checkDataPoint(Tuple2<String,String> dataPoint, SGrModbusDevice wagoMeter) {

        ProtocolRecord record = new ProtocolRecord();
        record.readVal = "-";
        record.exception = "";
        record.fpName = dataPoint._1;
        record.dpName = dataPoint._2;

        try {
            record.readVal = wagoMeter.getVal(dataPoint._1, dataPoint._2).getString();

        } catch (Exception e) {
            record.exception = e.getMessage();
        }
        return record;
    }

}
