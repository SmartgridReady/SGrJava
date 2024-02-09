package communicator.modbus.impl;

import com.smartgridready.ns.v0.DeviceFrame;
import communicator.common.helper.DeviceDescriptionLoader;
import communicator.common.impl.SGrDeviceBase;
import communicator.rest.http.client.ApacheRestServiceClientFactory;
import communicator.rest.impl.SGrRestApiDevice;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusRTU;
import io.vavr.Tuple2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

public class IntrospectiveDeviceTester {

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

            // Uncomment to test WAGO smart meter
            //Tuple2<DeviceFrame, SGrDeviceBase> device = createWagoDevice();

            // Uncomment to test Smart-me meter
            //Tuple2<DeviceFrame, SGrDeviceBase<?, ?, ?>> device = createSmartMeDevice();

            // Uncomment to test Clemap meter
            Tuple2<DeviceFrame, SGrDeviceBase<?, ?, ?>> device = createSmartMeDevice();


            DeviceFrame devDesc = device._1;
            SGrDeviceBase<?,?,?> deviceBase = device._2;

            // List containing data points to be read.
            final List<Tuple2<String, String>> datapPoints = new ArrayList<>();

            // Fill REST interface datapoints if any
            Optional.ofNullable(devDesc.getInterfaceList().getRestApiInterface()).ifPresent(restApiIf ->
                    restApiIf.getFunctionalProfileList().getFunctionalProfileListElement().forEach(fp-> {
                        String fpName = fp.getFunctionalProfile().getFunctionalProfileName();
                        fp.getDataPointList().getDataPointListElement().forEach( dp -> datapPoints.add(new Tuple2<>(fpName, dp.getDataPoint().getDataPointName())));

            }));

            // Fill modbus interface datapoints if any
            Optional.ofNullable(devDesc.getInterfaceList().getModbusInterface()).ifPresent(modbusIf ->
                    modbusIf.getFunctionalProfileList().getFunctionalProfileListElement().forEach(fp -> {
                        String fpName = fp.getFunctionalProfile().getFunctionalProfileName();
                        fp.getDataPointList().getDataPointListElement().forEach( dp -> datapPoints.add(new Tuple2<>(fpName, dp.getDataPoint().getDataPointName())));
                }
            ));
            
            System.out.println();

            final List<ProtocolRecord> protocol = new ArrayList<>();
            System.out.print("Introspective reading test: .");
            for (Tuple2<String, String> tuple : datapPoints) {
                protocol.add(checkDataPoint(tuple, deviceBase));
                Thread.sleep(100);
                System.out.print(".");
            }
            System.out.println();

            protocol.forEach(System.out::println);

        }
        catch ( Exception e )
        {
            LOG.error( "Error loading device description. " + e);
        }
    }

    private static ProtocolRecord checkDataPoint(Tuple2<String,String> dataPoint, SGrDeviceBase<?, ?, ?> wagoMeter) {

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

    private static Tuple2<DeviceFrame, SGrDeviceBase<?, ?, ?>> createWagoDevice() throws Exception {

        DeviceDescriptionLoader<DeviceFrame> loader = new DeviceDescriptionLoader<>();
        DeviceFrame devDesc = loader.load( XML_BASE_DIR, "SGr_04_0014_0000_WAGO_SmartMeterV0.2.1.xml");

        GenDriverAPI4ModbusRTU mbRTU = new GenDriverAPI4ModbusRTU();
        mbRTU.initTrspService("COM3", 19200);
        return new Tuple2<>(devDesc, new SGrModbusDevice(devDesc, mbRTU));
    }

    private static Tuple2<DeviceFrame, SGrDeviceBase<?, ?, ?>> createSmartMeDevice() throws Exception {

        Properties properties = new Properties();
        properties.put("username", "smith83@gmx.ch");
        properties.put("password", "lapo83");
        properties.put("device_id", "08fffe1c-f3ae-4afe-bd70-bc0a73d7ac31");

        DeviceDescriptionLoader<DeviceFrame> loader = new DeviceDescriptionLoader<>();
        DeviceFrame devDesc = loader.load( XML_BASE_DIR,
                "SGr_02_mmmm_8288089799_Smart-me_SubMeterElectricity_V1.0.0.xml",
                properties);

        SGrRestApiDevice restApiDevice = new SGrRestApiDevice(devDesc, new ApacheRestServiceClientFactory());
        return new Tuple2<>(devDesc, restApiDevice);
    }

    private static Tuple2<DeviceFrame, SGrDeviceBase<?, ?, ?>> createClemapDevice() throws Exception {

        Properties properties = new Properties();
        properties.put("username", "hfurrer@ergonomics.ch");
        properties.put("password", "Holdrio99");
        properties.put("baseUri", "https://cloud.clemap.com:3032");
        properties.put("sensor_id", "63343431ecf2cf013a1e5a9f");

        DeviceDescriptionLoader<DeviceFrame> loader = new DeviceDescriptionLoader<>();
        DeviceFrame devDesc = loader.load( XML_BASE_DIR,
                "SGr_02_0018_CLEMAP_EIcloudEnergyMonitor_V1.0.0.xml",
                properties);

        SGrRestApiDevice restApiDevice = new SGrRestApiDevice(devDesc, new ApacheRestServiceClientFactory());
        return new Tuple2<>(devDesc, restApiDevice);
    }

}
