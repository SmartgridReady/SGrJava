package communicator.impl;

import com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType;
import com.smartgridready.ns.v0.SGrDataPointDescriptionType;
import com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType;
import com.smartgridready.ns.v0.SGrModbusDataPointType;
import com.smartgridready.ns.v0.SGrModbusDeviceFrame;
import com.smartgridready.ns.v0.SGrModbusFunctionalProfileType;
import com.smartgridready.ns.v0.SGrModbusInterfaceDescriptionType;
import com.smartgridready.ns.v0.SGrProfileDescriptionType;
import com.smartgridready.ns.v0.SGrRWPType;
import com.smartgridready.ns.v0.TEnumConversionFct;
import com.smartgridready.ns.v0.TEnumObjectType;
import com.smartgridready.ns.v0.TSGrModbusRegisterRef;
import com.smartgridready.ns.v0.V0Factory;
import com.smartgridready.ns.v0.V0Package;
import com.smartgridready.ns.v0.impl.SGrBasicGenDataPointTypeTypeImpl;
import communicator.api.GenDeviceApi4Modbus;
import communicator.common.runtime.GenDriverAPI4Modbus;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.SGrGDPTypeToNameMapper;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Test the data type conversions by writing a value to the modbus mock, read
 * the written value back and verify the read value.
 *
 * TODO Current issues with the SGrModbus device must be fixed and tested:
 * <ul>
 *     <li>When converting from int type to int tpye, a double value is used as intermediate type.
 *     This leads to floating point precision deviations between written and read values.</li>
 *     <li>Several U8 type conversions are missing in setVal() and probably in getVal() too</li>
 * </ul>
 *
 */
@ExtendWith(MockitoExtension.class)
public class SetGetValConversionTestA {

    private static final Logger LOG = LoggerFactory.getLogger(SetGetValConversionTestB.class);

    @Mock
    SGrModbusDeviceFrame modbusDeviceFrame;

    @Mock
    GenDriverAPI4Modbus genDriverAPI4Modbus;

    @Mock
    GenDeviceApi4Modbus genDeviceApi4Modbus;

    @Captor
    ArgumentCaptor<int[]> intArrayCaptor = ArgumentCaptor.forClass(int[].class);

    @Captor
    ArgumentCaptor<Integer> intCaptor = ArgumentCaptor.forClass(int.class);

    private static class Fixture<W,R> {

        W writeValue;

        R readValue;
        int[] expectedModbusValue;

        String testName;

        SGrModbusDeviceFrame modbusDeviceFrame;

        public Fixture(W writeValue,
                       R readValue,
                       int[] expectedModbusValue,
                       SGrModbusDeviceFrame modbusDeviceFrame) {
            this.writeValue = writeValue;
            this.expectedModbusValue = expectedModbusValue;
            this.modbusDeviceFrame = modbusDeviceFrame;
            this.readValue = readValue;
        }

        public W getWriteValue() {
            return writeValue;
        }

        public R getReadValue() {
            return readValue;
        }

        public int[] getExpectedModbusValue() {
            return expectedModbusValue;
        }

        public SGrModbusDeviceFrame getModbusDeviceFrame() {
            return modbusDeviceFrame;
        }

        @Override
        public String toString() {
            return modbusDeviceFrame.getDeviceName();
        }
    }

    private static final List<Fixture<String, String >> FIXTURES = new ArrayList<>();
    static {
        FIXTURES.add(
                new Fixture<>("2.718", "2.718", new int[]{16389, 48758, 49152, 0},
                        deviceFrame(true, com.smartgridready.ns.v0.TEnumConversionFct.BIG_ENDIAN,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32, Float.valueOf(0f),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64, Double.valueOf(0f))));
        FIXTURES.add(
                new Fixture<>("219.990", "219.990", new int[]{17243, 64881},
                        deviceFrame(true, com.smartgridready.ns.v0.TEnumConversionFct.BIG_ENDIAN,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32, Float.valueOf(0f),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32, Float.valueOf(0f))));
        FIXTURES.add(
                new Fixture<>("64.320","64.320", new int[]{17024, 41943},
                        deviceFrame(true, com.smartgridready.ns.v0.TEnumConversionFct.BIG_ENDIAN,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64, Double.valueOf(0f),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32, Float.valueOf(0f))));
        FIXTURES.add(
                new Fixture<>("64.640", "64.640", new int[]{16464, 10485, 49807, 23593},
                        deviceFrame(true, com.smartgridready.ns.v0.TEnumConversionFct.BIG_ENDIAN,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64, Double.valueOf(0f),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64, Double.valueOf(0f))));
        FIXTURES.add(
                new Fixture<>("2.718", "2.718", new int[]{1344, 30398, 192, 0},
                        deviceFrame(true, com.smartgridready.ns.v0.TEnumConversionFct.CHANGE_BYTE_ORDER,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32, Float.valueOf(0f),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64, Double.valueOf(0f))));
        FIXTURES.add(
                new Fixture<>("219.990", "219.990", new int[]{23363, 29181},
                        deviceFrame(true, com.smartgridready.ns.v0.TEnumConversionFct.CHANGE_BYTE_ORDER,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32, Float.valueOf(0f),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32, Float.valueOf(0f))));
        FIXTURES.add(
                new Fixture<>("64.320","64.320", new int[]{32834, 55203},
                        deviceFrame(true, com.smartgridready.ns.v0.TEnumConversionFct.CHANGE_BYTE_ORDER,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64, Double.valueOf(0f),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32, Float.valueOf(0f))));
        FIXTURES.add(
                new Fixture<>("64.640", "64.640", new int[]{20544, 62760, 36802, 10588},
                        deviceFrame(true, com.smartgridready.ns.v0.TEnumConversionFct.CHANGE_BYTE_ORDER,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64, Double.valueOf(0f),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64, Double.valueOf(0f))));
        FIXTURES.add(
                new Fixture<>("2.718", "2.718", new int[]{48758, 16389, 0, 49152 },
                        deviceFrame(true, com.smartgridready.ns.v0.TEnumConversionFct.CHANGE_WORD_ORDER,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32, Float.valueOf(0f),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64, Double.valueOf(0f))));
        FIXTURES.add(
                new Fixture<>("219.990", "219.990", new int[]{64881, 17243},
                        deviceFrame(true, com.smartgridready.ns.v0.TEnumConversionFct.CHANGE_WORD_ORDER,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32, Float.valueOf(0f),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32, Float.valueOf(0f))));
        FIXTURES.add(
                new Fixture<>("64.320","64.320", new int[]{41943, 17024},
                        deviceFrame(true, com.smartgridready.ns.v0.TEnumConversionFct.CHANGE_WORD_ORDER,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64, Double.valueOf(0f),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32, Float.valueOf(0f))));
        FIXTURES.add(
                new Fixture<>("64.640", "64.640", new int[]{10485, 16464, 23593, 49807},
                        deviceFrame(true, TEnumConversionFct.CHANGE_WORD_ORDER,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64, Double.valueOf(0f),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64, Double.valueOf(0f))));

        FIXTURES.add(
                new Fixture<>("2.718", "2.718", new int[]{ 49152, 0, 16389, 48758},
                        deviceFrame(true, TEnumConversionFct.CHANGE_DWORD_ORDER,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32, Float.valueOf(0f),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64, Double.valueOf(0f))));
        FIXTURES.add(
                new Fixture<>("219.990", "219.990", new int[]{17243, 64881},
                        deviceFrame(true, TEnumConversionFct.CHANGE_DWORD_ORDER,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32, Float.valueOf(0f),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32, Float.valueOf(0f))));
        FIXTURES.add(
                new Fixture<>("64.320","64.320", new int[]{17024, 41943},
                        deviceFrame(true, TEnumConversionFct.CHANGE_DWORD_ORDER,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64, Double.valueOf(0f),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32, Float.valueOf(0f))));
        FIXTURES.add(
                new Fixture<>("64.640", "64.640", new int[]{49807, 23593, 16464, 10485},
                        deviceFrame(true, TEnumConversionFct.CHANGE_DWORD_ORDER,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64, Double.valueOf(0f),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64, Double.valueOf(0f))));


        // Implementation for generic type INT8 missing in SGrModbusDevice
        // FIXTURES.add(
        //        new Fixture<>("88", new int[]{0, 0, 0, 0},
        //                deviceFrame(true, TEnumConversionFct.BIG_ENDIAN,
        //                        V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8, Byte.valueOf((byte)0),
        //                        V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8, Byte.valueOf((byte)0))));
        //FIXTURES.add(
        //        new Fixture<>("800160", new int[]{0, 0, 0, 0},
        //                deviceFrame(true, TEnumConversionFct.BIG_ENDIAN,
        //                        V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8, Byte.valueOf((byte)0),
        //                        V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((short)0))));
        //FIXTURES.add(
        //        new Fixture<>("800320", new int[]{0, 0, 0, 0},
        //                deviceFrame(true, TEnumConversionFct.BIG_ENDIAN,
        //                        V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8, Byte.valueOf((byte)0),
        //                        V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32, BigInteger.valueOf(0))));
        //FIXTURES.add(
        //        new Fixture<>("800640", new int[]{0, 0, 0, 0},
        //                deviceFrame(true, TEnumConversionFct.BIG_ENDIAN,
        //                        V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8, Byte.valueOf((byte)0),
        //                        V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64, Long.valueOf(0))));

        // setVal() for modbus TYPE INT8 not supported yet
        // FIXTURES.add(
        //        new Fixture<>("168", new int[]{0, 0, 0, 0},
        //                deviceFrame(true, TEnumConversionFct.BIG_ENDIAN,
        //                        V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0),
        //                        V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8, Byte.valueOf((byte)0))));

        // Both INT signed
        FIXTURES.add(
                new Fixture<>("1616", "1616", new int[]{1616},
                        deviceFrame(true, TEnumConversionFct.BIG_ENDIAN,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0))));
        FIXTURES.add(
                new Fixture<>("1632", "1616", new int[]{0, 1632},
                        deviceFrame(true, TEnumConversionFct.BIG_ENDIAN,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32, BigInteger.valueOf((byte)0))));

        FIXTURES.add(
                new Fixture<>("1664", "1664", new int[]{0, 0, 0, 1664},
                        deviceFrame(true, TEnumConversionFct.BIG_ENDIAN,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64, Long.valueOf((byte)0))));
        FIXTURES.add(
                new Fixture<>("1615", "1615", new int[]{20230},
                        deviceFrame(true, TEnumConversionFct.CHANGE_BYTE_ORDER,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0))));
        FIXTURES.add(
                new Fixture<>("1632", "1632", new int[]{0, 24582},
                        deviceFrame(true, TEnumConversionFct.CHANGE_BYTE_ORDER,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32, BigInteger.valueOf((byte)0))));
        FIXTURES.add(
                new Fixture<>("1664", "1664", new int[]{0, 0, 0, 32774},
                        deviceFrame(true, TEnumConversionFct.CHANGE_BYTE_ORDER,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64, Long.valueOf((byte)0))));
        FIXTURES.add(
                new Fixture<>("1616", "1616", new int[]{1616},
                        deviceFrame(true, TEnumConversionFct.CHANGE_WORD_ORDER,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0))));
        FIXTURES.add(
                new Fixture<>("1632", "1632", new int[]{1632, 0},
                        deviceFrame(true, TEnumConversionFct.CHANGE_WORD_ORDER,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32, BigInteger.valueOf((byte)0))));
        FIXTURES.add(
                new Fixture<>("1664", "1664", new int[]{0, 0, 1664, 0},
                        deviceFrame(true, TEnumConversionFct.CHANGE_WORD_ORDER,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64, Long.valueOf((byte)0))));
        FIXTURES.add(
                new Fixture<>("1632", "1632", new int[]{0, 1632},
                        deviceFrame(true, TEnumConversionFct.CHANGE_DWORD_ORDER,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32, BigInteger.valueOf((byte)0))));
        FIXTURES.add(
                new Fixture<>("1664", "1664", new int[]{0, 1664, 0, 0},
                        deviceFrame(true, TEnumConversionFct.CHANGE_DWORD_ORDER,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64, Long.valueOf((byte)0))));
        // negative integer numbers
        FIXTURES.add(
                new Fixture<>("-1616", "-1616", new int[]{-1616},
                        deviceFrame(true, TEnumConversionFct.BIG_ENDIAN,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0))));
        FIXTURES.add(
                new Fixture<>("-1632", "-1632", new int[]{-1, 2*(Short.MAX_VALUE + 1) - 1632},
                        deviceFrame(true, TEnumConversionFct.BIG_ENDIAN,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32, BigInteger.valueOf((byte)0))));
        FIXTURES.add(
                new Fixture<>("-1664", "-1664", new int[]{-1, -1, -1, 2*(Integer.MAX_VALUE + 1) -1664},
                        deviceFrame(true, TEnumConversionFct.BIG_ENDIAN,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64, Long.valueOf((byte)0))));

        // Generic IF unsigned INT
        FIXTURES.add(
                new Fixture<>("1616", "1616", new int[]{1616},
                        deviceFrame(true, TEnumConversionFct.BIG_ENDIAN,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16_U, Integer.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0))));
        FIXTURES.add(
                new Fixture<>("1632", "1632", new int[]{0, 1632},
                        deviceFrame(true, TEnumConversionFct.BIG_ENDIAN,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16_U, Integer.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32, BigInteger.valueOf((byte)0))));
        FIXTURES.add(
                new Fixture<>("1664", "1624", new int[]{0, 0, 0, 1664},
                        deviceFrame(true, TEnumConversionFct.BIG_ENDIAN,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16_U, Integer.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64, Long.valueOf((byte)0))));
        FIXTURES.add(
                new Fixture<>("1616", "1616", new int[]{1616},
                        deviceFrame(true, TEnumConversionFct.BIG_ENDIAN,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16_U, Integer.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0))));
        FIXTURES.add(
                new Fixture<>("1632", "1632", new int[]{0, 1632},
                        deviceFrame(true, TEnumConversionFct.BIG_ENDIAN,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16_U, Integer.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32, BigInteger.valueOf((byte)0))));
        FIXTURES.add(
                new Fixture<>("1664", "1664", new int[]{0, 0, 0, 1664},
                        deviceFrame(true, TEnumConversionFct.BIG_ENDIAN,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16_U, Integer.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64, Long.valueOf((byte)0))));
        FIXTURES.add(
                new Fixture<>("1616", "1616", new int[]{1616},
                        deviceFrame(true, TEnumConversionFct.BIG_ENDIAN,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16_U, Integer.valueOf((byte)0))));
        FIXTURES.add(
                new Fixture<>("1632", "1632", new int[]{0, 1632},
                        deviceFrame(true, TEnumConversionFct.BIG_ENDIAN,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32_U, Long.valueOf((byte)0))));
        FIXTURES.add(
                new Fixture<>("1664", "1624", new int[]{0, 0, 0, 1664},
                        deviceFrame(true, TEnumConversionFct.BIG_ENDIAN,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((byte)0),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64_U, BigInteger.valueOf((byte)0))));

        // Generic int 32




        // 64bit signed to 64bit signed
        Fixture<String, String> fixture = new Fixture<>(
                "-6067173106999844172", "-6067173106999843840", new int[]{52651, 13330, 30806, 164},
                deviceFrame(true, TEnumConversionFct.CHANGE_BYTE_ORDER,
                        V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64, Long.valueOf((byte)0),
                        V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64, Long.valueOf((byte)0)));


    }

    private static Stream<Fixture<String, String>> fixtures() {
        return FIXTURES.stream();
    }

    @ParameterizedTest
    @MethodSource("fixtures")
    void testSetValStringConversion(Fixture<String, String> fixture) throws Exception {

        when(genDriverAPI4Modbus.ReadHoldingRegisters(anyInt(), anyInt())).thenReturn(fixture.expectedModbusValue);

        SGrModbusDevice modbusDevice = new SGrModbusDevice(
                fixture.getModbusDeviceFrame(),           // model
                genDriverAPI4Modbus);                     // mock

        modbusDevice.setVal("ActivePowerAC", "ActivePowerACL1", fixture.getWriteValue());
        verify(genDriverAPI4Modbus, atLeast(0)).WriteMultipleRegisters(anyInt(), intArrayCaptor.capture());
        verify(genDriverAPI4Modbus, atLeast(0)).WriteSingleRegister(anyInt(), intCaptor.capture());
        LOG.info("Modbus write multiple registers: {}", intArrayCaptor.getAllValues().isEmpty() ? "-" : intArrayCaptor.getValue());
        LOG.info("Modbus write single   register : {}", intCaptor.getAllValues().isEmpty() ? "-" : intCaptor.getValue());

        if (!intArrayCaptor.getAllValues().isEmpty()) {
            int[] modbusreg = Arrays.copyOfRange(intArrayCaptor.getValue(), 0, fixture.getExpectedModbusValue().length);
            LOG.info("Modbus read registers: {}", modbusreg);
            assertArrayEquals(fixture.getExpectedModbusValue(), modbusreg);
            when(genDriverAPI4Modbus.ReadHoldingRegisters(anyInt(), anyInt())).thenReturn(modbusreg);
        } else if (!intCaptor.getAllValues().isEmpty()){
            LOG.info("Modbus read single register: {}", intCaptor.getValue());
            assertEquals(fixture.getExpectedModbusValue()[0], intCaptor.getValue());
            when(genDriverAPI4Modbus.ReadHoldingRegisters(anyInt(), anyInt())).thenReturn(new int[]{intCaptor.getValue()});
        }

        String res = modbusDevice.getVal("ActivePowerAC", "ActivePowerACL1");
        LOG.info("Modbus read value: {}", res);
        assertEquals(fixture.writeValue, res.trim());
    }

    @Test
    void testSingleFixture() throws Exception {

        Fixture<String, String>fixture =
                new Fixture<>("2718", "2718", new int[]{16549, 15360, 0, 0},
                        deviceFrame(true, TEnumConversionFct.BIG_ENDIAN,
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16, Short.valueOf((short) 0f),
                                V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64, Double.valueOf(0f)));

        when(genDriverAPI4Modbus.ReadHoldingRegisters(anyInt(), anyInt())).thenReturn(fixture.expectedModbusValue);

        SGrModbusDevice modbusDevice = new SGrModbusDevice(
                fixture.getModbusDeviceFrame(),           // model
                genDriverAPI4Modbus);                     // mock

        LOG.info("Modbus write value: {}", fixture.getWriteValue());
        modbusDevice.setVal("ActivePowerAC", "ActivePowerACL1", fixture.getWriteValue());
        verify(genDriverAPI4Modbus, atLeast(0)).WriteMultipleRegisters(anyInt(), intArrayCaptor.capture());
        verify(genDriverAPI4Modbus, atLeast(0)).WriteSingleRegister(anyInt(), intCaptor.capture());
        LOG.info("Modbus write multiple registers: {}", intArrayCaptor.getAllValues().isEmpty() ? "-" : intArrayCaptor.getValue());
        LOG.info("Modbus write single   register : {}", intCaptor.getAllValues().isEmpty() ? "-" : intCaptor.getValue());

        if (!intArrayCaptor.getAllValues().isEmpty()) {
            int[] modbusreg = Arrays.copyOfRange(intArrayCaptor.getValue(), 0, fixture.getExpectedModbusValue().length);
            LOG.info("Modbus read registers: {}", modbusreg);
            assertArrayEquals(fixture.getExpectedModbusValue(), modbusreg);
            when(genDriverAPI4Modbus.ReadHoldingRegisters(anyInt(), anyInt())).thenReturn(modbusreg);
        } else if (!intCaptor.getAllValues().isEmpty()){
            LOG.info("Modbus read single register: {}", intCaptor.getValue());
            assertEquals(fixture.getExpectedModbusValue()[0], intCaptor.getValue());
            when(genDriverAPI4Modbus.ReadHoldingRegisters(anyInt(), anyInt())).thenReturn(new int[]{intCaptor.getValue()});
        }

        String res = modbusDevice.getVal("ActivePowerAC", "ActivePowerACL1");
        LOG.info("Modbus read value: {}", res);
        assertEquals(fixture.getReadValue(), res.trim());
    }

    private static SGrModbusDeviceFrame deviceFrame(boolean firstRegOne,
                                                    TEnumConversionFct conversionFct,
                                                    int genericType, Object genericValue,
                                                    int modbusType, Object modbusValue) {

        SGrModbusDeviceFrame deviceFrame = V0Factory.eINSTANCE.createSGrModbusDeviceFrame();
        deviceFrame.setDeviceName(createDeviceName(conversionFct, genericType, modbusType));

        deviceFrame.setModbusInterfaceDesc(modbDevDesc(firstRegOne, conversionFct));

        SGrModbusFunctionalProfileType functionalProfileType =
                V0Factory.eINSTANCE.createSGrModbusFunctionalProfileType();

        SGrProfileDescriptionType profileDescriptionType = V0Factory.eINSTANCE.createSGrProfileDescriptionType();
        profileDescriptionType.setProfileName("ActivePowerAC");
        functionalProfileType.setFunctionalProfile(profileDescriptionType);

        functionalProfileType.getDpListElement().add(modbDp(genericType, genericValue, modbusType, modbusValue));
        deviceFrame.getFpListElement().add(functionalProfileType);
        return deviceFrame;
    }


    private static SGrModbusInterfaceDescriptionType modbDevDesc(
            boolean firstRegisterIsOne,
            TEnumConversionFct modbusConversionScheme) {

        SGrModbusInterfaceDescriptionType mbDesc = V0Factory.eINSTANCE.createSGrModbusInterfaceDescriptionType();

        mbDesc.setFirstRegisterAddressIsOne(false);
        mbDesc.getConversionScheme().add(modbusConversionScheme);

        return mbDesc;
    }


    private static SGrModbusDataPointType modbDp(int genericType, Object genValue, int modbusType, Object modbValue) {

        SGrModbusDataPointType modbDp = V0Factory.eINSTANCE.createSGrModbusDataPointType();
        modbDp.setDataPoint(genDpDesc(genericType, genValue));
        modbDp.getModbusDataPoint().add(dpModbDesc(modbusType, modbValue));
        return modbDp;
    }

    private static SGrModbusDataPointDescriptionType dpModbDesc(int modbusType, Object modbValue) {

        SGrModbusDataPointDescriptionType modbDpDesc = V0Factory.eINSTANCE.createSGrModbusDataPointDescriptionType();

        TSGrModbusRegisterRef firstRegRef = V0Factory.eINSTANCE.createTSGrModbusRegisterRef();
        firstRegRef.setAddr(BigInteger.valueOf(2000));
        firstRegRef.setRegisterType(TEnumObjectType.HOLD_REGISTER);
        firstRegRef.setBitRank((short) 0);
        modbDpDesc.setModbusFirstRegisterReference(firstRegRef);
        modbDpDesc.setModbusDataType(basicDP(modbusType, modbValue));
        modbDpDesc.setDpSizeNrRegisters(getModbusBufferSize(modbusType));

        return modbDpDesc;
    }

    private static SGrDataPointDescriptionType genDpDesc(int genType, Object genValue) {

        SGrDataPointDescriptionType genDpDesc = V0Factory.eINSTANCE.createSGrDataPointDescriptionType();
        genDpDesc.setDatapointName("ActivePowerACL1");
        genDpDesc.setBasicDataType(basicDP(genType, genValue));
        genDpDesc.setRwpDatadirection(SGrRWPType.RW);
        return genDpDesc;
    }

    private static SGrBasicGenDataPointTypeType basicDP(int v0PackageType, Object genValue) {

        SGrBasicGenDataPointTypeTypeImpl dp = (SGrBasicGenDataPointTypeTypeImpl) V0Factory.eINSTANCE.createSGrBasicGenDataPointTypeType();
        dp.eSet(v0PackageType, genValue);
        return dp;
    }

    private static int getModbusBufferSize(int modbusType) {

        if (modbusType == V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64
                || modbusType == V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64_U
                || modbusType == V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64 )
        {
            return 4;
        } else if (   modbusType == V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8
                || modbusType == V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8_U
                || modbusType == V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16
                || modbusType == V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16_U) {
            return 1;
        }
        return 2;
    }

    private static String createDeviceName(TEnumConversionFct convFun, int genType, int modbusType) {
        return SGrGDPTypeToNameMapper.getName(genType) + " - "
                + SGrGDPTypeToNameMapper.getName(modbusType) + " - "
                + convFun.getName();
    }
}
