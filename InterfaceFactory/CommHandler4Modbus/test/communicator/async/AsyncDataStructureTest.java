package communicator.async;


import com.smartgridready.ns.v0.SGrModbusDeviceFrame;
import com.smartgridready.ns.v0.SGrRestAPIDeviceFrame;
import communicator.common.runtime.GenDriverAPI4Modbus;
import communicator.common.runtime.GenDriverModbusException;
import communicator.helper.DeviceDescriptionLoader;
import communicator.impl.SGrModbusDevice;
import communicator.restapi.exception.RestApiAuthenticationException;
import communicator.restapi.http.client.ApacheRestServiceClientFactory;
import communicator.restapi.impl.SGrRestApiDevice;
import de.re.easymodbus.adapter.GenDriverAPI4ModbusRTU;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(value = MockitoExtension.class)
class AsyncDataStructureTest {

    private static final String XML_BASE_DIR = "../../../SGrSpecifications/XMLInstances/ExtInterfaces/";
    private static final Logger LOG = LoggerFactory.getLogger(AsyncDataStructureTest.class);
    @Mock
    SGrModbusDevice     wagoModbusDevice;
    @Mock
    SGrRestApiDevice    clemapRestApiDevice;
    @Mock
    SGrModbusDevice garoModbusDevice_A;
    @Mock
    SGrModbusDevice garoModbusDevice_B;

    private void initStubs() throws Exception {
        when(wagoModbusDevice.getVal(any(), any())).thenAnswer(
                (Answer<String>) invocation -> withDelay(500, "220V"));

        when(clemapRestApiDevice.getVal(any(), any())).thenAnswer(
                (Answer<String>) invocation -> withDelay(750, "20kWh"));

        when(garoModbusDevice_A.setVal(any(), any(), any())).thenAnswer(
                (Answer<String>) invocation ->  withDelay(500, "OK"));

        when(garoModbusDevice_B.setVal(any(), any(), any())).thenAnswer(
                (Answer<String>) invocation ->  withDelay(250, "OK"));
    }

    private String withDelay(long delay, String value) throws Exception {
        Thread.sleep(delay);
        return value;
    }

    @Test
    void buildAndRunDataStructure() throws Exception {
        initStubs();
        doBuildAndRunDatstructureTest(ExecStatus.SUCCESS, null);
    }



    @Test
    void buildAndRunDataStructureWithException() throws Exception {
        initStubsWithException("DEVICE ERROR");
        doBuildAndRunDatstructureTest(ExecStatus.ERROR, "DEVICE ERROR");
    }

    private void doBuildAndRunDatstructureTest(ExecStatus expectedStatus, String expectedExceptionMessage) {
        // Setup IN data structures
        ReadExec<String> wago_voltageAC_l1 = new ReadExec<>( "VoltageAC", "VoltageL1",  wagoModbusDevice::getVal);
        ReadExec<String> wago_voltageAC_l2 = new ReadExec<>( "VoltageAC", "VoltageL2",  wagoModbusDevice::getVal);
        ReadExec<String> wago_voltageAC_l3 = new ReadExec<>( "VoltageAC", "VoltageL3",  wagoModbusDevice::getVal);
        ReadExec<String> clemap_actPowerAC_tot = new ReadExec<>( "ActivePowerAC", "ActivePowerACtot", clemapRestApiDevice::getVal);

        // Setup OUT data structures
        WriteExec<String> garo_wallbox_A_hems_curr_lim = new WriteExec<>("Curtailment", "HemsCurrentLimit", garoModbusDevice_A::setVal);
        WriteExec<String> garo_wallbox_B_hems_curr_lim = new WriteExec<>("Curtailment", "HemsCurrentLimit", garoModbusDevice_B::setVal);

        // Wire tasks
        Processor readChain = new Parallel()        // 1500
                .add( new Sequence()                // 1500
                        .add(wago_voltageAC_l1)
                        .add(wago_voltageAC_l2)
                        .add(wago_voltageAC_l3))
                .add( new Parallel()                //  750
                        .add(clemap_actPowerAC_tot))
                .await( wago_voltageAC_l1,
                        wago_voltageAC_l2,
                        wago_voltageAC_l3,
                        clemap_actPowerAC_tot);

        Processor writeChain = new Sequence()
                .add(garo_wallbox_A_hems_curr_lim)
                .add(new Parallel()
                        .add(garo_wallbox_A_hems_curr_lim)
                        .add(garo_wallbox_B_hems_curr_lim))
                .await(garo_wallbox_A_hems_curr_lim,
                        garo_wallbox_B_hems_curr_lim);


        readChain.process();
        garo_wallbox_A_hems_curr_lim.setValue("10A");
        garo_wallbox_B_hems_curr_lim.setValue("5A");
        writeChain.process();

        LOG.info(wago_voltageAC_l1.toString());
        LOG.info(wago_voltageAC_l2.toString());
        LOG.info(wago_voltageAC_l3.toString());
        LOG.info(clemap_actPowerAC_tot.toString());
        LOG.info(garo_wallbox_A_hems_curr_lim.toString());
        LOG.info(garo_wallbox_B_hems_curr_lim.toString());

        // Status
        assertEquals(expectedStatus, wago_voltageAC_l1.getExecStatus());
        assertEquals(expectedStatus, wago_voltageAC_l2.getExecStatus());
        assertEquals(expectedStatus, wago_voltageAC_l3.getExecStatus());
        assertEquals(expectedStatus, clemap_actPowerAC_tot.getExecStatus());
        assertEquals(expectedStatus, garo_wallbox_A_hems_curr_lim.getExecStatus());


        // Exception
        if (expectedExceptionMessage == null) {
            assertNull(wago_voltageAC_l1.getExecThrowable());
            assertNull(wago_voltageAC_l2.getExecThrowable());
            assertNull(wago_voltageAC_l3.getExecThrowable());
            assertNull(clemap_actPowerAC_tot.getExecThrowable());
            assertNull(garo_wallbox_A_hems_curr_lim.getExecThrowable());
            assertNull(garo_wallbox_B_hems_curr_lim.getExecThrowable());
            assertEquals("220V",  wago_voltageAC_l1.getReadValue());
            assertEquals("20kWh", clemap_actPowerAC_tot.getReadValue());
        } else {
            assertEquals( expectedExceptionMessage, wago_voltageAC_l1.getExecThrowable().getMessage());
            assertEquals( expectedExceptionMessage, wago_voltageAC_l2.getExecThrowable().getMessage());
            assertEquals( expectedExceptionMessage, wago_voltageAC_l3.getExecThrowable().getMessage());
            assertEquals( expectedExceptionMessage, clemap_actPowerAC_tot.getExecThrowable().getMessage());
            assertEquals( expectedExceptionMessage, garo_wallbox_A_hems_curr_lim.getExecThrowable().getMessage());
            assertEquals( expectedExceptionMessage, garo_wallbox_B_hems_curr_lim.getExecThrowable().getMessage());
            assertTrue( wago_voltageAC_l1.getExecThrowable() instanceof GenDriverModbusException);
            assertTrue( clemap_actPowerAC_tot.getExecThrowable() instanceof RestApiAuthenticationException);
            assertTrue( garo_wallbox_A_hems_curr_lim.getExecThrowable() instanceof GenDriverModbusException);
        }

        // Sequential read stuff
        // Timing
        Instant start = wago_voltageAC_l1.getRequestTime();
        assertTrue(start.plusMillis(500).isBefore(wago_voltageAC_l1.getResponseTime()));
        assertTrue(start.plusMillis(600).isAfter(wago_voltageAC_l1.getResponseTime()));
        assertTrue(start.plusMillis(1000).isBefore(wago_voltageAC_l2.getResponseTime()));
        assertTrue(start.plusMillis(1100).isAfter(wago_voltageAC_l2.getResponseTime()));
        assertTrue(start.plusMillis(1500).isBefore(wago_voltageAC_l3.getResponseTime()));
        assertTrue(start.plusMillis(1600).isAfter(wago_voltageAC_l3.getResponseTime()));
        // Parallel read stuff
        assertTrue(start.plusMillis(750).isBefore(clemap_actPowerAC_tot.getResponseTime()));
        assertTrue(start.plusMillis(1000).isAfter(clemap_actPowerAC_tot.getResponseTime()));
        LOG.info("Clemap duration={}", clemap_actPowerAC_tot.getResponseTime().toEpochMilli() - clemap_actPowerAC_tot.getRequestTime().toEpochMilli());

        // Parallel write stuff (sequential after read stuff)
        // Assert that writeCycle is performed after readCycle (await works...)
        assertTrue(start.plusMillis(1500).isBefore(garo_wallbox_A_hems_curr_lim.getRequestTime()));

        start = garo_wallbox_A_hems_curr_lim.getRequestTime();
        assertTrue(start.plusMillis(500).isBefore(garo_wallbox_A_hems_curr_lim.getResponseTime()));
        assertTrue(start.plusMillis(250).isBefore(garo_wallbox_B_hems_curr_lim.getResponseTime()));

        wago_voltageAC_l1.cleanup();
        wago_voltageAC_l2.cleanup();
        wago_voltageAC_l3.cleanup();
        clemap_actPowerAC_tot.cleanup();
        garo_wallbox_A_hems_curr_lim.cleanup();
        garo_wallbox_B_hems_curr_lim.cleanup();
    }


    private SGrModbusDevice createWagoDevice() throws Exception {
        SGrModbusDeviceFrame deviceDesc = new DeviceDescriptionLoader<SGrModbusDeviceFrame>()
                .load(XML_BASE_DIR, "SGr_04_0014_0000_WAGO_SmartMeterV0.2.1.xml");
        GenDriverAPI4Modbus mbRTU = new GenDriverAPI4ModbusRTU();
        mbRTU.initTrspService("COM3", 19200);
        mbRTU.setUnitIdentifier((byte)1);
        return new SGrModbusDevice(deviceDesc, mbRTU);
    }

    private SGrRestApiDevice createClemapDevice() throws Exception {

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

    private void initStubsWithException(String errorMessage) throws Exception {

        when(wagoModbusDevice.getVal(any(), any())).thenAnswer(
                (Answer<String>) invocation -> { withDelay(500, "220V"); throw new GenDriverModbusException(errorMessage);});

        when(clemapRestApiDevice.getVal(any(), any())).thenAnswer(
                (Answer<String>) invocation -> { withDelay(750, "20kWh"); throw new RestApiAuthenticationException(errorMessage);});

        when(garoModbusDevice_A.setVal(any(), any(), any())).thenAnswer(
                (Answer<String>) invocation ->  { withDelay(1000, "OK"); throw new GenDriverModbusException(errorMessage);});

        when(garoModbusDevice_B.setVal(any(), any(), any())).thenAnswer(
                (Answer<String>) invocation ->  { withDelay(1000, "OK"); throw new GenDriverModbusException(errorMessage);});
    }

    @Test
    void asyncRealClemapWago() throws Exception {

        // Setup devices
        SGrModbusDevice     wagoDevice = createWagoDevice();
        SGrRestApiDevice    clemapDevice = createClemapDevice();

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

        // Run the tasks
        readChain.process();
        LOG.info(wago_voltageAC_l1.toString());
        LOG.info(wago_voltageAC_l2.toString());
        LOG.info(wago_voltageAC_l3.toString());
        LOG.info(clemap_actPowerAC_tot.toString());
        LOG.info(clemap_actPowerAC_L1.toString());

    }
}
