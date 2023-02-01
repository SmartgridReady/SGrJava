package communicator.async;

import com.smartgridready.ns.v0.SGrModbusDeviceFrame;
import com.smartgridready.ns.v0.SGrRestAPIDeviceFrame;
import communicator.async.process.Parallel;
import communicator.async.process.Processor;
import communicator.async.process.ReadExec;
import communicator.async.process.Sequence;
import communicator.helper.DeviceDescriptionLoader;
import communicator.impl.SGrModbusDevice;
import communicator.restapi.http.client.ApacheRestServiceClientFactory;
import communicator.restapi.impl.SGrRestApiDevice;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusRTU;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;
import java.util.Properties;

public class AsyncClemapWagoTest {
    public static final Logger LOG = LoggerFactory.getLogger(AsyncClemapWagoTest.class);

    private static final String XML_BASE_DIR = "../../../SGrSpecifications/XMLInstances/ExtInterfaces/";

    private static SGrModbusDevice wagoDevice;

    private static SGrRestApiDevice clemapDevice;

    private static GenDriverAPI4ModbusRTU wagoDriver;

    @BeforeAll
    public static void createDevices() throws Exception {
        wagoDevice = createWagoDevice();
        clemapDevice = createClemapDevice();
    }

    @AfterAll
    public static void closeDevices() throws Exception {
        wagoDriver.disconnect();
    }

    @Test
    void asyncRealClemapWago() {

        // Setup tasks
        ReadExec<String> wago_voltageAC_l1 = new ReadExec<>( "VoltageAC", "VoltageL1",  wagoDevice::getVal);
        ReadExec<String> wago_voltageAC_l2 = new ReadExec<>( "VoltageAC", "VoltageL2",  wagoDevice::getVal);
        ReadExec<String> wago_voltageAC_l3 = new ReadExec<>( "VoltageAC", "VoltageL3",  wagoDevice::getVal);
        ReadExec<String> clemap_actPowerAC_tot = new ReadExec<>( "ActivePowerAC", "ActivePowerACtot", clemapDevice::getVal);
        ReadExec<String> clemap_actPowerAC_L1  = new ReadExec<>( "ActivePowerAC", "ActivePowerACL1", clemapDevice::getVal);

        // Wire tasks
        Processor readChain = new Parallel()        // 1500
                .add( new Sequence()                // 1500
                        .add(wago_voltageAC_l1)
                        .add(wago_voltageAC_l2)
                        .add(wago_voltageAC_l3))
                .add( new Parallel()                //  750
                        .add(clemap_actPowerAC_tot)
                        .add(clemap_actPowerAC_L1))
                .await( wago_voltageAC_l1,
                        wago_voltageAC_l2,
                        wago_voltageAC_l3,
                        clemap_actPowerAC_tot,
                        clemap_actPowerAC_L1);

        Instant startTime = Instant.now();
        readChain.process();
        Instant endTime = Instant.now();
        LOG.info("Delta T: {}ms", endTime.toEpochMilli() - startTime.toEpochMilli());

        LOG.info(wago_voltageAC_l1.toString());
        LOG.info(wago_voltageAC_l2.toString());
        LOG.info(wago_voltageAC_l3.toString());
        LOG.info(clemap_actPowerAC_tot.toString());
        LOG.info(clemap_actPowerAC_L1.toString());
    }

    @Test
    void asyncRealClemapWagoSerial() {

        // Setup tasks
        ReadExec<String> wago_voltageAC_l1 = new ReadExec<>( "VoltageAC", "VoltageL1",  wagoDevice::getVal);
        ReadExec<String> wago_voltageAC_l2 = new ReadExec<>( "VoltageAC", "VoltageL2",  wagoDevice::getVal);
        ReadExec<String> wago_voltageAC_l3 = new ReadExec<>( "VoltageAC", "VoltageL3",  wagoDevice::getVal);
        ReadExec<String> clemap_actPowerAC_tot = new ReadExec<>( "ActivePowerAC", "ActivePowerACtot", clemapDevice::getVal);
        ReadExec<String> clemap_actPowerAC_L1  = new ReadExec<>( "ActivePowerAC", "ActivePowerACL1", clemapDevice::getVal);

        // Wire tasks
        Processor readChain = new Sequence()       // 1500
                        .add(wago_voltageAC_l1)
                        .add(wago_voltageAC_l2)
                        .add(wago_voltageAC_l3)
                        .add(clemap_actPowerAC_tot)
                        .add(clemap_actPowerAC_L1)
                .await( wago_voltageAC_l1,
                        wago_voltageAC_l2,
                        wago_voltageAC_l3,
                        clemap_actPowerAC_tot,
                        clemap_actPowerAC_L1);

        Instant startTime = Instant.now();
        readChain.process();
        Instant endTime = Instant.now();
        LOG.info("Delta T: {}ms", endTime.toEpochMilli() - startTime.toEpochMilli());
        LOG.info(wago_voltageAC_l1.toString());
        LOG.info(wago_voltageAC_l2.toString());
        LOG.info(wago_voltageAC_l3.toString());
        LOG.info(clemap_actPowerAC_tot.toString());
        LOG.info(clemap_actPowerAC_L1.toString());
    }

    private static SGrModbusDevice createWagoDevice() throws Exception {
        SGrModbusDeviceFrame deviceDesc = new DeviceDescriptionLoader<SGrModbusDeviceFrame>()
                .load(XML_BASE_DIR, "SGr_04_0014_0000_WAGO_SmartMeterV0.2.1.xml");
        wagoDriver = new GenDriverAPI4ModbusRTU();
        wagoDriver.initTrspService("COM3", 19200);
        wagoDriver.setUnitIdentifier((byte)1);
        return new SGrModbusDevice(deviceDesc, wagoDriver);
    }

    private static SGrRestApiDevice createClemapDevice() throws Exception {

        Properties props = new Properties();
        props.put("username", "hfurrer@ergonomics.ch");
        props.put("password", "Holdrio99");
        props.put("baseUri", "https://cloud.clemap.com:3032");
        props.put("sensor_id", "63343431ecf2cf013a1e5a9f");

        SGrRestAPIDeviceFrame deviceDesc = new DeviceDescriptionLoader<SGrRestAPIDeviceFrame>()
                .load(XML_BASE_DIR, "SGr_04_0018_CLEMAP_EIcloudEnergyMonitorV0.2.1.xml", props);

        SGrRestApiDevice clemapDevice = new SGrRestApiDevice(deviceDesc, new ApacheRestServiceClientFactory());
        clemapDevice.authenticate();
        return clemapDevice;
    }
}
