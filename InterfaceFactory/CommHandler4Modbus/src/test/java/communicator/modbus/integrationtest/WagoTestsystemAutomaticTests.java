package communicator.modbus.integrationtest;

import communicator.common.api.BitmapValue;
import communicator.common.api.BooleanValue;
import communicator.common.api.Int16Value;
import communicator.common.api.Value;
import communicator.common.runtime.GenDriverException;
import communicator.common.runtime.GenDriverModbusException;
import communicator.common.runtime.GenDriverSocketException;
import org.apache.logging.log4j.util.TriConsumer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WagoTestsystemAutomaticTests extends TestsystemBase {

    private static final Logger LOG = LoggerFactory.getLogger(WagoTestsystemAutomaticTests.class);

    private static final int MAX_VOLTAGE = 24;
    private static final int MAX_RESOLUTION_INT_16 = 32767;
    private static final int AD_CONV_FAULT_TOLERANCE_INT_16 = 60;
    private static final float AD_CONV_FAULT_TOLERANCE_24V =  (float)AD_CONV_FAULT_TOLERANCE_INT_16 * MAX_VOLTAGE / MAX_RESOLUTION_INT_16;
    private static final int AD_DATAPOINT_MAX_INDEX = 8;

    private static final int STEP_INT16_OUTPUT_BY = 200;

    @BeforeAll
    static void beforeAll() throws Exception {
        init();
    }

    @Test
    void analogInputOutput() throws Exception {

        // Check Connector1
        checkAnalogDatapoint(1, WagoTestsystemAutomaticTests::assertFloatValues);

        // Check Connector2 - Connector8
        for (int i=2; i<=AD_DATAPOINT_MAX_INDEX; i++) {
            checkAnalogDatapoint(i, WagoTestsystemAutomaticTests::assertIntegerValues);
        }
    }

    @Test
    void digitalRegisterIO() throws Exception {

        for (int i = 0; i < 8; i++) {

            String bit = String.format("Bit%d", i);
            Map<String, Boolean> bitMap = new HashMap<>();
            bitMap.put(bit, true);
            BitmapValue bitmapValue = BitmapValue.of(bitMap);
            getTestSystem().setVal("RegisterDigital_OUT", "Register1", bitmapValue);

            Value res = getTestSystem().getVal("RegisterDigital_IN", "Register1");
            assertEquals(bitmapValue.getBitmap().get(bit), res.getBitmap().get(bit));

            res = getTestSystem().getVal("RegisterDigital_OUT", "Register1");
            assertEquals(bitmapValue.getBitmap().get(bit), res.getBitmap().get(bit));

            // Reset all bits to false
            getTestSystem().setVal("RegisterDigital_OUT", "Register1", BitmapValue.of(new HashMap<>()));
        }
    }

    @Test
    void digitalDiscreteIO() throws Exception {

        for (int i = 0; i < 8; i++) {
            checkDiscreteIO(i, true);
        }

        for (int i = 0; i < 8; i++) {
            checkDiscreteIO(i, false);
        }
    }

    @Test
    void readout_EI_XML() {

        List<DataPointDescriptor> dps = getDataPoints();
        dps.forEach(System.out::println);
    }

    void checkAnalogDatapoint(int dataPointIndex, TriConsumer<String, Value, Value> assertFunction)
            throws Exception {

        for (int i = 0; i< MAX_RESOLUTION_INT_16; i=i+STEP_INT16_OUTPUT_BY) {

            String dataPointName = String.format("Connector%d", dataPointIndex);

            Int16Value voltConn1Out = Int16Value.of((short) i);
            getTestSystem().setVal("VoltageDC_OUT", dataPointName, voltConn1Out);

            Value voltConn1In = getTestSystem().getVal("VoltageDC_IN", dataPointName);

            assertFunction.accept(dataPointName, voltConn1Out, voltConn1In);
        }
    }

    private static void assertFloatValues(String dataPointName, Value outValue, Value inValue) {

        float fOutValue = outValue.getFloat32() * MAX_VOLTAGE / MAX_RESOLUTION_INT_16;
        float fInValue =  inValue.getFloat32();

        LOG.info(String.format("DC voltage %s: set: %.6f \t-> get: %.6f", dataPointName, fOutValue, fInValue));
        String errorMessage = String.format(
                "%s: ABS(VoltageIN - VoltageOUT) > FAULT_TOLERANCE=%.6f, Vout=%.6f Vin=%.6f diff=%.6f",
                dataPointName,
                AD_CONV_FAULT_TOLERANCE_24V,
                fOutValue,
                fInValue,
                Math.abs(fInValue - fOutValue));

        assertTrue(Math.abs(fInValue - fOutValue) <= AD_CONV_FAULT_TOLERANCE_24V, errorMessage);
    }

    private static void assertIntegerValues(String dataPointName, Value outValue, Value inValue) {

        int iOutValue = outValue.getInt16();
        int iInValue =  inValue.getInt16();

        LOG.info(String.format("DC voltage %s: set: %d \t-> get: %d", dataPointName, iOutValue, iInValue));
        String errorMessage = String.format(
                "%s: ABS(VoltageIN - VoltageOUT) > FAULT_TOLERANCE=%d, Vout=%d Vin=%d diff=%d",
                dataPointName,
                AD_CONV_FAULT_TOLERANCE_INT_16,
                iOutValue,
                iInValue,
                Math.abs(iInValue - iOutValue));

        assertTrue(Math.abs(iInValue - iOutValue) <= AD_CONV_FAULT_TOLERANCE_INT_16, errorMessage);
    }

    private static void checkDiscreteIO(int i, boolean value) throws GenDriverException, GenDriverSocketException, GenDriverModbusException {
        String bit = String.format("Bit%d", i);
        getTestSystem().setVal("DiscreteDigital_OUT", bit, BooleanValue.of(value));
        Value res = getTestSystem().getVal("DiscreteDigital_IN", "Bit0");
        assertEquals(value, res.getBoolean());
    }
}
