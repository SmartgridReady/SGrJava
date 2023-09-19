package communicator.common.impl;

import com.smartgridready.ns.v0.DeviceFrame;
import com.smartgridready.ns.v0.GenericAttributes;
import communicator.common.api.Float64Value;
import communicator.common.api.Int64Value;
import communicator.common.api.StringValue;
import communicator.common.api.Value;
import communicator.common.helper.DeviceDescriptionLoader;
import communicator.common.impl.SGrDeviceBase.Comparator;
import communicator.modbus.impl.SGrModbusDevice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SGrDeviceBaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(SGrDeviceBaseTest.class);

    private static final Value INTEGER_VALUE_20482048 = Int64Value.of(20482048L);
    private static final Value DOUBLE_VALUE_4096_00009999 = Float64Value.of(4096.00009999d);

    private static final Value STRING_VALUE_1000 = StringValue.of("1000");

    enum Expect {
        OK,
        ERROR
    }

    private static Stream<Arguments> checkRangeArguments() {
        return Stream.of(
                Arguments.of(new Value[]{INTEGER_VALUE_20482048}, Comparator.MIN, new BigDecimal(20482048), Expect.OK),
                Arguments.of(new Value[]{INTEGER_VALUE_20482048}, Comparator.MIN, new BigDecimal(20482049), Expect.ERROR),
                Arguments.of(new Value[]{INTEGER_VALUE_20482048}, Comparator.MAX, new BigDecimal(20482048), Expect.OK),
                Arguments.of(new Value[]{INTEGER_VALUE_20482048}, Comparator.MAX, new BigDecimal(20482047), Expect.ERROR),

                Arguments.of(new Value[]{DOUBLE_VALUE_4096_00009999}, Comparator.MIN, BigDecimal.valueOf(4096.00009999d), Expect.OK),
                Arguments.of(new Value[]{DOUBLE_VALUE_4096_00009999}, Comparator.MIN, BigDecimal.valueOf(4096.00010000d), Expect.ERROR),
                Arguments.of(new Value[]{DOUBLE_VALUE_4096_00009999}, Comparator.MAX, BigDecimal.valueOf(4096.00009999d), Expect.OK),
                Arguments.of(new Value[]{DOUBLE_VALUE_4096_00009999}, Comparator.MAX, BigDecimal.valueOf(4096.00009998d), Expect.ERROR),

                Arguments.of(new Value[]{STRING_VALUE_1000}, Comparator.MIN, new BigDecimal(1000), Expect.OK),
                Arguments.of(new Value[]{STRING_VALUE_1000}, Comparator.MIN, new BigDecimal(1001), Expect.ERROR),
                Arguments.of(new Value[]{STRING_VALUE_1000}, Comparator.MAX, new BigDecimal(1000), Expect.OK),
                Arguments.of(new Value[]{STRING_VALUE_1000}, Comparator.MAX, new BigDecimal(999),  Expect.ERROR)
        );
    }

    @ParameterizedTest
    @MethodSource("checkRangeArguments")
    void checkRange(Value[] values, Comparator comparator, BigDecimal limit, Expect expect) {

        SGrModbusDevice device = createSGrModbusDevice();

        Optional<String> error = device.checkOutOfRange(values, limit, comparator);
        if (expect.equals(Expect.ERROR)) {
            assertTrue(error.isPresent());
        } else {
            assertFalse(error.isPresent());
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

        GenericAttributes attributes = device.getGenAttributesByGDPType("VoltageAC", "VoltageL1");
        LOG.info("Received attributes {}", attributes);

        assertEquals("METAS", attributes.getSpecialQualityRequirement());
        assertEquals(Double.valueOf(20.0), attributes.getMinLoad());
        assertEquals(Double.valueOf(30.0), attributes.getCurtailment());
        assertEquals(10.0f, attributes.getMaxLockTimeMinutes());
        assertEquals(BigDecimal.valueOf(2.2), attributes.getPrecisionPercent());
        assertEquals("0.005", String.format("%.3f", attributes.getMinVal()));
        assertEquals("380.000", String.format("%.3f", attributes.getMaxVal()));
    }

    @Test
    void getGenAttributesByGDPType_device_and_profile() throws Exception {

        SGrModbusDevice device = createSGrModbusDevice();

        GenericAttributes attributes = device.getGenAttributesByGDPType("VoltageAC", null);
        LOG.info("Received attributes {}", attributes);

        assertEquals("METAS", attributes.getSpecialQualityRequirement());
        assertEquals(Double.valueOf(30), attributes.getCurtailment());
        assertEquals(10.0f, attributes.getMaxLockTimeMinutes());
        assertEquals(BigDecimal.valueOf(2.5), attributes.getPrecisionPercent());
    }

    @Test
    void getGenAttributesByGDPType_device_only() throws Exception {

        SGrModbusDevice device = createSGrModbusDevice();

        GenericAttributes attributes = device.getGenAttributesByGDPType(null, null);
        LOG.info("Received attributes {}", attributes);

        assertEquals("METAS", attributes.getSpecialQualityRequirement());
        assertEquals(Double.valueOf(40.0), attributes.getCurtailment());
        assertEquals(10.0f, attributes.getMaxLockTimeMinutes());
        assertEquals(BigDecimal.valueOf(2.5), attributes.getPrecisionPercent());
    }

    @Test
    void getGenAttributes() throws Exception {

        Map<String, String> expected = new HashMap<>();
        expected.put("specialQualityRequirement", "METAS");
        expected.put("curtailment", "30.0");
        expected.put("maxLockTimeMinutes", "10.0");
        expected.put("minLoad", "20.0");
        expected.put("minVal", "0.005");
        expected.put("maxVal", "380");
        expected.put("precisionPercent", "2.2");
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

        DeviceDescriptionLoader<DeviceFrame> loader = new DeviceDescriptionLoader<>();
        DeviceFrame devDesc = loader.load("", Optional.ofNullable(devDescUrl).map(URL::getPath).orElse(""));

        return new SGrModbusDevice(devDesc, null);
    }
}
