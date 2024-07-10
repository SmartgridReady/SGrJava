package com.smartgridready.communicator.async;


import com.smartgridready.communicator.async.process.ExecStatus;
import com.smartgridready.communicator.async.process.Executable;
import com.smartgridready.communicator.async.process.Parallel;
import com.smartgridready.communicator.async.process.Processor;
import com.smartgridready.communicator.async.process.ReadExec;
import com.smartgridready.communicator.async.process.Sequence;
import com.smartgridready.communicator.async.process.WriteExec;
import com.smartgridready.communicator.common.api.values.Float32Value;
import com.smartgridready.communicator.common.api.values.Float64Value;
import com.smartgridready.communicator.common.api.values.StringValue;
import com.smartgridready.communicator.common.api.values.Value;
import communicator.common.runtime.GenDriverModbusException;
import com.smartgridready.communicator.modbus.impl.SGrModbusDevice;
import com.smartgridready.communicator.rest.exception.RestApiAuthenticationException;
import com.smartgridready.communicator.rest.impl.SGrRestApiDevice;
import org.awaitility.Awaitility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;

@ExtendWith(value = MockitoExtension.class)
class AsyncDataStructureTest {

    private static final int TIME_TOLERANCE_MS = 2;

    private static final String DEVICE_ERROR = "DEVICE ERROR";

    private static final Logger LOG = LoggerFactory.getLogger(AsyncDataStructureTest.class);
    @Mock
    SGrModbusDevice wagoModbusDevice;
    @Mock
    SGrRestApiDevice clemapRestApiDevice;

    @Mock
    SGrRestApiDevice clemapRestApiDevice_2;

    @Mock
    SGrModbusDevice garoModbusDevice_A;
    @Mock
    SGrModbusDevice garoModbusDevice_B;

    private Value withDelay(long delay, Value value) {
        Awaitility.await().pollDelay(Duration.ofMillis(delay)).until(() -> true);
        LOG.debug("Delay {}ms is over.", delay);
        return value;
    }

    private void withDelay(long delay) {
        Awaitility.await().pollDelay(Duration.ofMillis(delay)).until(() -> true);
        LOG.debug("Delay {}ms is over.", delay);
    }

    @Test
    void
    buildAndRunDataStructure() throws Exception {
        initStubs();
        doBuildAndRunDatstructureTest(ExecStatus.SUCCESS, null);
    }

    @Test
    void buildAndRunDataStructureWithException() throws Exception {
        initStubsWithException();
        doBuildAndRunDatstructureTest(ExecStatus.ERROR, "DEVICE ERROR");
    }

    private void doBuildAndRunDatstructureTest(ExecStatus expectedStatus, String expectedExceptionMessage) {

        // Setup READ tasks
        ReadExec<Value> wago_voltageAC_l1       = new ReadExec<>( "VoltageAC", "VoltageL1",  wagoModbusDevice::getVal);
        ReadExec<Value> wago_voltageAC_l2       = new ReadExec<>( "VoltageAC", "VoltageL2",  wagoModbusDevice::getVal);
        ReadExec<Value> wago_voltageAC_l3       = new ReadExec<>( "VoltageAC", "VoltageL3",  wagoModbusDevice::getVal);
        ReadExec<Value> clemap_actPowerAC_tot   = new ReadExec<>( "ActivePowerAC", "ActivePowerACtot", clemapRestApiDevice::getVal);
        ReadExec<Value> clemap_actPowerAC_tot_2 = new ReadExec<>("ActivePowerAC", "ActivePowerACtot",  clemapRestApiDevice_2::getVal);

        // Setup WRITE tasks
        WriteExec<Value> garo_wallbox_A_hems_curr_lim = new WriteExec<>("Curtailment", "HemsCurrentLimit", garoModbusDevice_A::setVal);
        WriteExec<Value> garo_wallbox_B_hems_curr_lim = new WriteExec<>("Curtailment", "HemsCurrentLimit", garoModbusDevice_B::setVal);

        // Wire tasks
        Processor readChain = new Parallel()        // 2000
                .add( new Sequence()                // 1500
                        .add(wago_voltageAC_l1)
                        .add(wago_voltageAC_l2)
                        .add(wago_voltageAC_l3))
                .add( new Parallel()                    // 2000
                        .add(clemap_actPowerAC_tot)     // 750
                        .add(clemap_actPowerAC_tot_2))  // 2000
                .await( wago_voltageAC_l1,
                        wago_voltageAC_l2,
                        wago_voltageAC_l3,
                        clemap_actPowerAC_tot,
                        clemap_actPowerAC_tot_2);

        Processor writeChain = new Parallel()
                        .add(garo_wallbox_A_hems_curr_lim)
                        .add(garo_wallbox_B_hems_curr_lim)
                .await(garo_wallbox_A_hems_curr_lim,
                        garo_wallbox_B_hems_curr_lim);

        // Run readChain
        readChain.process();

        // Get results from read-chain.
        // Example: wago_voltageAC_l1.getReadValue();
        // Do some calculations and determine new control values:
        garo_wallbox_A_hems_curr_lim.setWriteValue(Float32Value.of(10f));
        garo_wallbox_B_hems_curr_lim.setWriteValue(Float32Value.of(5f));
        // Process the write-chain:
        writeChain.process();


        LOG.info(wago_voltageAC_l1.toString());
        LOG.info(wago_voltageAC_l2.toString());
        LOG.info(wago_voltageAC_l3.toString());
        LOG.info(clemap_actPowerAC_tot.toString());
        LOG.info(clemap_actPowerAC_tot_2.toString());
        LOG.info(garo_wallbox_A_hems_curr_lim.toString());
        LOG.info(garo_wallbox_B_hems_curr_lim.toString());

        verifyResultsAndTiming(
                expectedStatus,
                expectedExceptionMessage,
                wago_voltageAC_l1,
                wago_voltageAC_l2,
                wago_voltageAC_l3,
                clemap_actPowerAC_tot,
                clemap_actPowerAC_tot_2,
                garo_wallbox_A_hems_curr_lim,
                garo_wallbox_B_hems_curr_lim);

        wago_voltageAC_l1.cleanup();
        wago_voltageAC_l2.cleanup();
        wago_voltageAC_l3.cleanup();
        clemap_actPowerAC_tot.cleanup();
        garo_wallbox_A_hems_curr_lim.cleanup();
        garo_wallbox_B_hems_curr_lim.cleanup();
    }

    private static void verifyResultsAndTiming(ExecStatus expectedStatus,
                                               String expectedExceptionMessage,
                                               ReadExec<Value> wago_voltageAC_l1,
                                               ReadExec<Value> wago_voltageAC_l2,
                                               ReadExec<Value> wago_voltageAC_l3,
                                               ReadExec<Value> clemap_actPowerAC_tot,
                                               ReadExec<Value> clemap_actPowerAC_tot_2,
                                               WriteExec<Value> garo_wallbox_A_hems_curr_lim,
                                               WriteExec<Value> garo_wallbox_B_hems_curr_lim) {
        // Status
        assertEquals(expectedStatus, wago_voltageAC_l1.getExecStatus());
        assertEquals(expectedStatus, wago_voltageAC_l2.getExecStatus());
        assertEquals(expectedStatus, wago_voltageAC_l3.getExecStatus());
        assertEquals(expectedStatus, clemap_actPowerAC_tot.getExecStatus());
        assertEquals(expectedStatus, clemap_actPowerAC_tot_2.getExecStatus());
        assertEquals(expectedStatus, garo_wallbox_A_hems_curr_lim.getExecStatus());


        if (expectedExceptionMessage== null) {
            // Happy case
            assertNull(wago_voltageAC_l1.getExecThrowable());
            assertNull(wago_voltageAC_l2.getExecThrowable());
            assertNull(wago_voltageAC_l3.getExecThrowable());
            assertNull(clemap_actPowerAC_tot.getExecThrowable());
            assertNull(garo_wallbox_A_hems_curr_lim.getExecThrowable());
            assertNull(garo_wallbox_B_hems_curr_lim.getExecThrowable());
            assertEquals("220.0", wago_voltageAC_l1.getReadValue().getString());
            assertEquals(20.0, clemap_actPowerAC_tot.getReadValue().getFloat32());
            assertEquals(50.0, clemap_actPowerAC_tot_2.getReadValue().getFloat64());

            // Sequential read stuff
            // Timing
            Instant start = wago_voltageAC_l1.getRequestTime();

            verifyTimeslot(wago_voltageAC_l1, start, 500, 600);
            verifyTimeslot(wago_voltageAC_l2, start, 1000, 1100);
            verifyTimeslot(wago_voltageAC_l3, start, 1500, 1600);

            // Parallel read stuff
            verifyTimeslot(clemap_actPowerAC_tot, start,750, 1000);
            verifyTimeslot(clemap_actPowerAC_tot_2, start, 2000, 2200);

            // Parallel write stuff (sequential after read stuff)
            // Assert that writeCycle is performed after readCycle (await works...)
            assertTrue(Duration.between(start.plusMillis(2000), garo_wallbox_A_hems_curr_lim.getRequestTime()).toMillis() >= 0);

            start = garo_wallbox_B_hems_curr_lim.getRequestTime();
            verifyTimeslot(garo_wallbox_A_hems_curr_lim, start, 400, 600);
            verifyTimeslot(garo_wallbox_B_hems_curr_lim, start,200, 400);

        } else {
            // Exception case
            assertEquals(expectedExceptionMessage, wago_voltageAC_l1.getExecThrowable().getMessage());
            assertEquals(expectedExceptionMessage, wago_voltageAC_l2.getExecThrowable().getMessage());
            assertEquals(expectedExceptionMessage, wago_voltageAC_l3.getExecThrowable().getMessage());
            assertEquals(expectedExceptionMessage, clemap_actPowerAC_tot.getExecThrowable().getMessage());
            assertEquals(expectedExceptionMessage, garo_wallbox_A_hems_curr_lim.getExecThrowable().getMessage());
            assertEquals(expectedExceptionMessage, garo_wallbox_B_hems_curr_lim.getExecThrowable().getMessage());
            assertTrue( wago_voltageAC_l1.getExecThrowable() instanceof GenDriverModbusException);
            assertTrue( clemap_actPowerAC_tot.getExecThrowable() instanceof RestApiAuthenticationException);
            assertTrue( garo_wallbox_A_hems_curr_lim.getExecThrowable() instanceof GenDriverModbusException);
        }
    }

    private static void verifyTimeslot(Executable executable, Instant start, long offsBeginMs, long offsEndMs) {
        Instant time = executable.getResult().getResponseTime();
        Instant begin = start.plusMillis(offsBeginMs - TIME_TOLERANCE_MS);
        Instant end = start.plusMillis(offsEndMs + TIME_TOLERANCE_MS);
        if (time.isBefore(begin)) {
            fail(String.format("Async exec terminated %dms too early: %s", Duration.between(time, begin).toMillis(), executable));
        }
        if (time.isAfter(end)) {
            fail(String.format("Async exec terminated %dms too late: %s", Duration.between(end, time).toMillis(), executable));
        }
    }

    private void initStubs() throws Exception {
        when(wagoModbusDevice.getVal(any(), any())).thenAnswer(
                (Answer<Value>) invocation -> withDelay(500, Float32Value.of(220f)));

        when(clemapRestApiDevice.getVal(any(), any())).thenAnswer(
                (Answer<Value>) invocation -> withDelay(750, Float32Value.of(20f)));

        when(clemapRestApiDevice_2.getVal(any(), any())).thenAnswer(
                (Answer<Value>) invocation -> withDelay(2000, Float64Value.of(50d)));

        doAnswer((Answer<Void>) invocation -> {
            withDelay(500);
            return null;
        }).when(garoModbusDevice_A).setVal(any(), any(), any());

        doAnswer((Answer<Void>) invocation -> {
            withDelay(250);
            return null;
        }).when(garoModbusDevice_B).setVal(any(), any(), any());
    }

    private void initStubsWithException() throws Exception {

        when(wagoModbusDevice.getVal(any(), any())).thenAnswer(
                (Answer<Value>) invocation -> { withDelay(500, StringValue.of("220")); throw new GenDriverModbusException(DEVICE_ERROR);});

        when(clemapRestApiDevice.getVal(any(), any())).thenAnswer(
                (Answer<Value>) invocation -> { withDelay(750, StringValue.of("20.0")); throw new RestApiAuthenticationException(DEVICE_ERROR);});

        when(clemapRestApiDevice_2.getVal(any(), any())).thenAnswer(
                (Answer<Value>) invocation -> { withDelay(2000, StringValue.of("50.0")); throw new RestApiAuthenticationException(DEVICE_ERROR);});

        doAnswer((Answer<Void>) invocation -> {
            withDelay(1000);
            throw new GenDriverModbusException(DEVICE_ERROR);
        }).when(garoModbusDevice_A).setVal(any(), any(), any());

        doAnswer((Answer<Void>) invocation -> {
            withDelay(1000);
            throw new GenDriverModbusException(DEVICE_ERROR);
        }).when(garoModbusDevice_B).setVal(any(), any(), any());
    }
}
