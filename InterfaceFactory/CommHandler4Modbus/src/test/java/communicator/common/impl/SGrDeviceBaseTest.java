package communicator.common.impl;

import com.smartgridready.ns.v0.DeviceFrame;
import communicator.common.api.Float64Value;
import communicator.common.api.GenericAttribute;
import communicator.common.api.Int64Value;
import communicator.common.api.StringValue;
import communicator.common.api.Value;
import communicator.common.helper.DeviceDescriptionLoader;
import communicator.common.impl.SGrDeviceBase.Comparator;
import communicator.common.runtime.GenDriverException;
import communicator.modbus.impl.SGrModbusDevice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
                Arguments.of(new Value[]{INTEGER_VALUE_20482048}, Comparator.MIN, 20482048d, Expect.OK),
                Arguments.of(new Value[]{INTEGER_VALUE_20482048}, Comparator.MIN, 20482049d, Expect.ERROR),
                Arguments.of(new Value[]{INTEGER_VALUE_20482048}, Comparator.MAX, 20482048d, Expect.OK),
                Arguments.of(new Value[]{INTEGER_VALUE_20482048}, Comparator.MAX, 20482047d, Expect.ERROR),

                Arguments.of(new Value[]{DOUBLE_VALUE_4096_00009999}, Comparator.MIN, 4096.00009999d, Expect.OK),
                Arguments.of(new Value[]{DOUBLE_VALUE_4096_00009999}, Comparator.MIN, 4096.00010000d, Expect.ERROR),
                Arguments.of(new Value[]{DOUBLE_VALUE_4096_00009999}, Comparator.MAX, 4096.00009999d, Expect.OK),
                Arguments.of(new Value[]{DOUBLE_VALUE_4096_00009999}, Comparator.MAX, 4096.00009998d, Expect.ERROR),

                Arguments.of(new Value[]{STRING_VALUE_1000}, Comparator.MIN, 1000d, Expect.OK),
                Arguments.of(new Value[]{STRING_VALUE_1000}, Comparator.MIN, 1001d, Expect.ERROR),
                Arguments.of(new Value[]{STRING_VALUE_1000}, Comparator.MAX, 1000d, Expect.OK),
                Arguments.of(new Value[]{STRING_VALUE_1000}, Comparator.MAX, 999d,  Expect.ERROR)
        );
    }

    @ParameterizedTest
    @MethodSource("checkRangeArguments")
    void checkRange(Value[] values, Comparator comparator, double limit, Expect expect) {

        SGrModbusDevice device = createSGrModbusDevice();

        if (expect.equals(Expect.ERROR)) {
            assertThrows(GenDriverException.class, () -> device.checkOutOfRange(values, limit, comparator));
        } else {
            assertDoesNotThrow(() -> device.checkOutOfRange(values, limit, comparator));
        }
    }

    @Test
    void getGenAttributesByGDPType_device_and_profile_and_datapoint() throws Exception {

        String expectedStringValue = "[\n" +
                "\tname: Curtailment | value: 40.5 | type : FLOAT32 | unit : PERCENT | level: DEVICE, \n" +
                "\tname: FlexDirManagement | level: DEVICE\t\t\n" +
                "\t\tname: assists | value: TNO | type : STRING | unit : NONE | level: DEVICE\t\t\n" +
                "\t\tname: obligedTo | value: SHALL | type : STRING | unit : NONE | level: DEVICE, \n" +
                "\tname: LoadReduction | value: 20.5 | type : FLOAT32 | unit : PERCENT | level: FUNCTIONAL_PROFILE, \n" +
                "\tname: PercisionPercent | value: 2.2 | type : FLOAT32 | unit : PERCENT | level: DATA_POINT, \n" +
                "\tname: SpecialQualityRequirement | value: METAS | type : STRING | unit : NONE | level: DEVICE]";

        SGrModbusDevice device = createSGrModbusDevice();

        List<GenericAttribute> attributes = device.getGenAttributes("VoltageAC", "VoltageL1");
        attributes.sort(java.util.Comparator.comparing(GenericAttribute::getName));
        LOG.info("Received attributes {}", attributes);
        assertEquals(expectedStringValue, attributes.toString());

        GenericAttribute curtailement = attributes.get(0);
        assertEquals("Curtailment", curtailement.getName());
        assertEquals(40.5d, curtailement.getValue().getFloat64());
        assertEquals("FLOAT32", curtailement.getDataType());
        assertEquals("PERCENT", curtailement.getUnit().getName());
        assertEquals("DEVICE", curtailement.getLevel().name());
        assertEquals(0, curtailement.getChildren().size());

        GenericAttribute flexDirManagement = attributes.get(1);
        assertEquals("FlexDirManagement", flexDirManagement.getName());

        Set<String> flexDirAttrs = flexDirManagement.getChildren().stream().map(GenericAttribute::getName).collect(Collectors.toSet());
        assertTrue(flexDirAttrs.contains("assists"));
        assertTrue(flexDirAttrs.contains("obligedTo"));
    }

    @Test
    void getGenAttributesByGDPType_device_and_profile() throws Exception {

        String expectedStringValue = "[\n" +
                "\tname: Curtailment | value: 40.5 | type : FLOAT32 | unit : PERCENT | level: DEVICE, \n" +
                "\tname: FlexDirManagement | level: DEVICE\t\t\n" +
                "\t\tname: assists | value: TNO | type : STRING | unit : NONE | level: DEVICE\t\t\n" +
                "\t\tname: obligedTo | value: SHALL | type : STRING | unit : NONE | level: DEVICE, \n" +
                "\tname: LoadReduction | value: 20.5 | type : FLOAT32 | unit : PERCENT | level: FUNCTIONAL_PROFILE, \n" +
                "\tname: SpecialQualityRequirement | value: METAS | type : STRING | unit : NONE | level: DEVICE]";

        SGrModbusDevice device = createSGrModbusDevice();
        List<GenericAttribute> attributes = device.getGenAttributes("VoltageAC", null);
        attributes.sort(java.util.Comparator.comparing(GenericAttribute::getName));
        LOG.info("Received attributes {}", attributes);
        assertEquals(expectedStringValue, attributes.toString());
    }

    @Test
    void getGenAttributesByGDPType_device_only() throws Exception {

        String expectedStringValue = "[\n" +
                "\tname: Curtailment | value: 40.5 | type : FLOAT32 | unit : PERCENT | level: DEVICE, \n" +
                "\tname: FlexDirManagement | level: DEVICE\t\t\n" +
                "\t\tname: assists | value: TNO | type : STRING | unit : NONE | level: DEVICE\t\t\n" +
                "\t\tname: obligedTo | value: SHALL | type : STRING | unit : NONE | level: DEVICE, \n" +
                "\tname: SpecialQualityRequirement | value: METAS | type : STRING | unit : NONE | level: DEVICE]";

        SGrModbusDevice device = createSGrModbusDevice();
        List<GenericAttribute> attributes = device.getGenAttributes(null, null);
        attributes.sort(java.util.Comparator.comparing(GenericAttribute::getName));
        LOG.info("Received attributes {}", attributes);

        assertEquals(expectedStringValue, attributes.toString());
    }

    private static SGrModbusDevice createSGrModbusDevice() {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        URL devDescUrl = classloader.getResource("SGr_04_0014_0000_WAGO_SmartMeterV0.2.1-GenericAttributes.xml");

        DeviceDescriptionLoader<DeviceFrame> loader = new DeviceDescriptionLoader<>();
        DeviceFrame devDesc = loader.load("", Optional.ofNullable(devDescUrl).map(URL::getPath).orElse(""));

        return new SGrModbusDevice(devDesc, null);
    }
}
