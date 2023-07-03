package communicator.common.impl;

import com.smartgridready.ns.v0.SGrAttr4GenericType;
import com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType;
import com.smartgridready.ns.v0.SGrModbusDeviceFrame;
import com.smartgridready.ns.v0.V0Factory;
import communicator.common.helper.DeviceDescriptionLoader;
import communicator.common.impl.SGrDeviceBase.Comparator;
import communicator.common.runtime.GenDriverException;
import communicator.modbus.impl.SGrModbusDevice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SGrDeviceBaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(SGrDeviceBaseTest.class);

    private static final SGrBasicGenDataPointTypeType SHORT_VALUE_256 = V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();
    private static final SGrBasicGenDataPointTypeType INT_VALUE_2048 = V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();
    private static final SGrBasicGenDataPointTypeType INT_VALUE_2049 = V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();
    private static final SGrBasicGenDataPointTypeType INT_VALUE_2050 = V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();
    private static final SGrBasicGenDataPointTypeType LONG_VALUE_20482048= V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();
    private static final SGrBasicGenDataPointTypeType FLOAT_VALUE_4096_9999 = V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();
    private static final SGrBasicGenDataPointTypeType DOUBLE_VALUE_4096_00009999 = V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();
    private static final SGrBasicGenDataPointTypeType BIG_INT_VALUE_80449999 = V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();
    private static final SGrBasicGenDataPointTypeType STRING_VALUE_1000 = V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();

    static {
        SHORT_VALUE_256.setInt16((short)256);
        INT_VALUE_2048.setInt16U(2048);
        INT_VALUE_2049.setInt16U(2049);
        INT_VALUE_2050.setInt16U(2050);
        LONG_VALUE_20482048.setInt32U(20482048L);
        FLOAT_VALUE_4096_9999.setFloat32(4096.999f);
        DOUBLE_VALUE_4096_00009999.setFloat64(4096.00009999d);
        BIG_INT_VALUE_80449999.setInt32(new BigInteger("80449999"));
        STRING_VALUE_1000.setString("1000");
    }

    enum Expect {
        OK,
        THROWS
    }

    private static Stream<Arguments> checkRangeArguments() {
        return Stream.of(
                Arguments.of(new SGrBasicGenDataPointTypeType[]{SHORT_VALUE_256}, Comparator.MIN, new BigDecimal(256), Expect.OK),
                Arguments.of(new SGrBasicGenDataPointTypeType[]{SHORT_VALUE_256}, Comparator.MIN, new BigDecimal(257), Expect.THROWS),
                Arguments.of(new SGrBasicGenDataPointTypeType[]{SHORT_VALUE_256}, Comparator.MAX, new BigDecimal(256), Expect.OK),
                Arguments.of(new SGrBasicGenDataPointTypeType[]{SHORT_VALUE_256}, Comparator.MAX, new BigDecimal(255), Expect.THROWS),

                Arguments.of(new SGrBasicGenDataPointTypeType[]{INT_VALUE_2048}, Comparator.MIN, new BigDecimal(2048), Expect.OK),
                Arguments.of(new SGrBasicGenDataPointTypeType[]{INT_VALUE_2048}, Comparator.MIN, new BigDecimal(2049), Expect.THROWS),
                Arguments.of(new SGrBasicGenDataPointTypeType[]{INT_VALUE_2048}, Comparator.MAX, new BigDecimal(2048), Expect.OK),
                Arguments.of(new SGrBasicGenDataPointTypeType[]{INT_VALUE_2048}, Comparator.MAX, new BigDecimal(2047), Expect.THROWS),

                Arguments.of(new SGrBasicGenDataPointTypeType[]{LONG_VALUE_20482048}, Comparator.MIN, new BigDecimal(20482048), Expect.OK),
                Arguments.of(new SGrBasicGenDataPointTypeType[]{LONG_VALUE_20482048}, Comparator.MIN, new BigDecimal(20482049), Expect.THROWS),
                Arguments.of(new SGrBasicGenDataPointTypeType[]{LONG_VALUE_20482048}, Comparator.MAX, new BigDecimal(20482048), Expect.OK),
                Arguments.of(new SGrBasicGenDataPointTypeType[]{LONG_VALUE_20482048}, Comparator.MAX, new BigDecimal(20482047), Expect.THROWS),

                Arguments.of(new SGrBasicGenDataPointTypeType[]{FLOAT_VALUE_4096_9999}, Comparator.MIN, BigDecimal.valueOf(4096.999f), Expect.OK),
                Arguments.of(new SGrBasicGenDataPointTypeType[]{FLOAT_VALUE_4096_9999}, Comparator.MIN, BigDecimal.valueOf(4097.000f), Expect.THROWS),
                Arguments.of(new SGrBasicGenDataPointTypeType[]{FLOAT_VALUE_4096_9999}, Comparator.MAX, BigDecimal.valueOf(4096.999f), Expect.OK),
                Arguments.of(new SGrBasicGenDataPointTypeType[]{FLOAT_VALUE_4096_9999}, Comparator.MAX, BigDecimal.valueOf(4096.998f), Expect.THROWS),

                Arguments.of(new SGrBasicGenDataPointTypeType[]{DOUBLE_VALUE_4096_00009999}, Comparator.MIN, BigDecimal.valueOf(4096.00009999d), Expect.OK),
                Arguments.of(new SGrBasicGenDataPointTypeType[]{DOUBLE_VALUE_4096_00009999}, Comparator.MIN, BigDecimal.valueOf(4096.00010000d), Expect.THROWS),
                Arguments.of(new SGrBasicGenDataPointTypeType[]{DOUBLE_VALUE_4096_00009999}, Comparator.MAX, BigDecimal.valueOf(4096.00009999d), Expect.OK),
                Arguments.of(new SGrBasicGenDataPointTypeType[]{DOUBLE_VALUE_4096_00009999}, Comparator.MAX, BigDecimal.valueOf(4096.00009998d), Expect.THROWS),

                Arguments.of(new SGrBasicGenDataPointTypeType[]{BIG_INT_VALUE_80449999}, Comparator.MIN, new BigDecimal(80449999), Expect.OK),
                Arguments.of(new SGrBasicGenDataPointTypeType[]{BIG_INT_VALUE_80449999}, Comparator.MIN, new BigDecimal(80450000), Expect.THROWS),
                Arguments.of(new SGrBasicGenDataPointTypeType[]{BIG_INT_VALUE_80449999}, Comparator.MAX, new BigDecimal(80449999), Expect.OK),
                Arguments.of(new SGrBasicGenDataPointTypeType[]{BIG_INT_VALUE_80449999}, Comparator.MAX, new BigDecimal(80449998), Expect.THROWS),

                Arguments.of(new SGrBasicGenDataPointTypeType[]{STRING_VALUE_1000}, Comparator.MIN, new BigDecimal(1000), Expect.OK),
                Arguments.of(new SGrBasicGenDataPointTypeType[]{STRING_VALUE_1000}, Comparator.MIN, new BigDecimal(1001), Expect.OK),
                Arguments.of(new SGrBasicGenDataPointTypeType[]{STRING_VALUE_1000}, Comparator.MAX, new BigDecimal(1000), Expect.OK),
                Arguments.of(new SGrBasicGenDataPointTypeType[]{STRING_VALUE_1000}, Comparator.MAX, new BigDecimal(999), Expect.OK),

                Arguments.of(new SGrBasicGenDataPointTypeType[]{INT_VALUE_2048, INT_VALUE_2049, INT_VALUE_2050}, Comparator.MIN, new BigDecimal(2051), Expect.THROWS),
                Arguments.of(new SGrBasicGenDataPointTypeType[]{INT_VALUE_2048, INT_VALUE_2049, INT_VALUE_2050},Comparator.MAX, new BigDecimal(2048), Expect.THROWS)
        );
    }

    @ParameterizedTest
    @MethodSource("checkRangeArguments")
    void checkRange(SGrBasicGenDataPointTypeType[] values, Comparator comparator, BigDecimal limit, Expect expect) {

        SGrModbusDevice device = createSGrModbusDevice();

        if (expect.equals(Expect.THROWS)) {
            GenDriverException exception = assertThrows(GenDriverException.class, () -> device.checkOutOfRange(values, limit, comparator));
            LOG.info("Expected ERROR: {}", exception.getMessage());
        } else {
            assertDoesNotThrow(() ->device.checkOutOfRange(values, limit, comparator));
        }
    }



    /**
     * External interface description file SGr_04_0014_0000_WAGO_SmartMeterV0.2.1-GenericAttributes.xml
     * has the generic attributes structure as follows:
     * <p>
     * On device level:
     * - specQualityRequirement = METAS
     * - curtailment = 40                  ---> overwritten by functional profile
     * - maxLockTimeMinutes = 10
     * - minLoad = 20
     * - precision = 2.5                   ---> overwritten by data point
     * <p>
     * On functional profile "VoltageAC" level:
     * - curtailment = 30
     * <p>
     * On datapoint "VoltageL1" level:
     * - precision = 2.2
     * - minVal = 0.005
     * - maxVal = 380
     * <p>
     * This will result in:
     * --------------------
     * On device level:
     * - specQualityRequirement = METAS
     * - curtailment = 30
     * - maxLockTimeMinutes = 10
     * - precision = 2.2
     * - minVal = 0.005
     * - maxVal = 380
     */
    @Test
    void getGenAttributesByGDPType_device_and_profile_and_datapoint() throws Exception {

        SGrModbusDevice device = createSGrModbusDevice();

        SGrAttr4GenericType attributes = device.getGenAttributesByGDPType("VoltageAC", "VoltageL1");
        LOG.info("Received attributes {}", attributes);

        assertEquals("METAS", attributes.getSpecQualityRequirement());
        assertEquals(20, attributes.getMinLoad());
        assertEquals(30, attributes.getCurtailment());
        assertEquals(10, attributes.getMaxLockTimeMinutes());
        assertEquals(2.2, attributes.getPrecision());
        assertEquals("0.005", String.format("%.3f", attributes.getMinVal()));
        assertEquals("380.000", String.format("%.3f", attributes.getMaxVal()));
    }

    @Test
    void getGenAttributesByGDPType_device_and_profile() throws Exception {

        SGrModbusDevice device = createSGrModbusDevice();

        SGrAttr4GenericType attributes = device.getGenAttributesByGDPType("VoltageAC", null);
        LOG.info("Received attributes {}", attributes);

        assertEquals("METAS", attributes.getSpecQualityRequirement());
        assertEquals(30, attributes.getCurtailment());
        assertEquals(10, attributes.getMaxLockTimeMinutes());
        assertEquals(2.5, attributes.getPrecision());
    }

    @Test
    void getGenAttributesByGDPType_device_only() throws Exception {

        SGrModbusDevice device = createSGrModbusDevice();

        SGrAttr4GenericType attributes = device.getGenAttributesByGDPType(null, null);
        LOG.info("Received attributes {}", attributes);

        assertEquals("METAS", attributes.getSpecQualityRequirement());
        assertEquals(40, attributes.getCurtailment());
        assertEquals(10, attributes.getMaxLockTimeMinutes());
        assertEquals(2.5, attributes.getPrecision());
    }

    @Test
    void getGenAttributes() throws Exception {

        Map<String, String> expected = new HashMap<>();
        expected.put("specQualityRequirement", "METAS");
        expected.put("curtailment", "30.0");
        expected.put("maxLockTimeMinutes", "10.0");
        expected.put("minLoad", "20.0");
        expected.put("minVal", "0.005");
        expected.put("maxVal", "380.0");
        expected.put("precision", "2.2");
        expected.put("flexAssistance.assists", "AT_NetServiceable");
        expected.put("flexAssistance.obligedTo", "OL_SHALL");

        SGrModbusDevice device = createSGrModbusDevice();

        Map<String, String> attributes = device.getGenAttributes("VoltageAC", "VoltageL1");
        LOG.info("Received attributes {}", attributes);

        assertEquals(expected.size(), attributes.size());
        expected.keySet().forEach(key ->
                assertEquals(expected.get(key), attributes.get(key)));
    }

    private static SGrModbusDevice createSGrModbusDevice() {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        URL devDescUrl = classloader.getResource("SGr_04_0014_0000_WAGO_SmartMeterV0.2.1-GenericAttributes.xml");

        DeviceDescriptionLoader<SGrModbusDeviceFrame> loader = new DeviceDescriptionLoader<>();
        SGrModbusDeviceFrame devDesc = loader.load("", devDescUrl.getPath());

        return new SGrModbusDevice(devDesc, null);
    }
}
