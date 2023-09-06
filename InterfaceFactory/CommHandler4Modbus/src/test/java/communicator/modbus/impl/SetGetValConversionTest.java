package communicator.modbus.impl;

import com.smartgridready.ns.v0.DataType;
import com.smartgridready.ns.v0.SGrDataPointDescriptionType;
import com.smartgridready.ns.v0.SGrModbusDataPointDescriptionType;
import com.smartgridready.ns.v0.SGrModbusDataPointType;
import com.smartgridready.ns.v0.SGrModbusDeviceFrame;
import com.smartgridready.ns.v0.SGrModbusFunctionalProfileType;
import com.smartgridready.ns.v0.SGrModbusInterfaceDescriptionType;
import com.smartgridready.ns.v0.SGrProfileDescriptionType;
import com.smartgridready.ns.v0.SGrRWPType;
import com.smartgridready.ns.v0.SGrTimeSyncBlockNotificationType;
import com.smartgridready.ns.v0.TEnumConversionFct;
import com.smartgridready.ns.v0.TEnumObjectType;
import com.smartgridready.ns.v0.TSGrModbusRegisterRef;
import com.smartgridready.ns.v0.V0Factory;
import com.smartgridready.ns.v0.impl.DataTypeImpl;
import com.smartgridready.ns.v0.impl.ModbusDataTypeImpl;
import communicator.common.api.BooleanValue;
import communicator.common.api.Float32Value;
import communicator.common.api.Float64Value;
import communicator.common.api.Int16UValue;
import communicator.common.api.Int16Value;
import communicator.common.api.Int32UValue;
import communicator.common.api.Int32Value;
import communicator.common.api.Int64UValue;
import communicator.common.api.Int64Value;
import communicator.common.api.Int8Value;
import communicator.common.api.StringValue;
import communicator.common.api.Value;
import communicator.common.runtime.GenDriverAPI4Modbus;
import communicator.common.runtime.GenDriverException;
import communicator.common.runtime.GenDriverModbusException;
import communicator.common.runtime.GenDriverSocketException;
import communicator.modbus.helper.CacheRecord;
import communicator.modbus.helper.ModbusReaderResponse;
import io.vavr.Tuple2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.ReflectionUtils;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.internal.util.collections.Sets;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.SGrGDPTypeToNameMapper;

import java.lang.reflect.Field;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static com.smartgridready.ns.v0.V0Package.DATA_TYPE__ENUM;
import static com.smartgridready.ns.v0.V0Package.DATA_TYPE__FLOAT32;
import static com.smartgridready.ns.v0.V0Package.DATA_TYPE__FLOAT64;
import static com.smartgridready.ns.v0.V0Package.DATA_TYPE__INT16;
import static com.smartgridready.ns.v0.V0Package.DATA_TYPE__INT16_U;
import static com.smartgridready.ns.v0.V0Package.DATA_TYPE__INT32;
import static com.smartgridready.ns.v0.V0Package.DATA_TYPE__INT32_U;
import static com.smartgridready.ns.v0.V0Package.DATA_TYPE__INT64;
import static com.smartgridready.ns.v0.V0Package.DATA_TYPE__INT64_U;
import static com.smartgridready.ns.v0.V0Package.DATA_TYPE__INT8;
import static com.smartgridready.ns.v0.V0Package.DATA_TYPE__INT8_U;
import static com.smartgridready.ns.v0.V0Package.DATA_TYPE__STRING;
import static com.smartgridready.ns.v0.V0Package.MODBUS_DATA_TYPE__BOOLEAN;
import static com.smartgridready.ns.v0.V0Package.MODBUS_DATA_TYPE__ENUM;
import static com.smartgridready.ns.v0.V0Package.MODBUS_DATA_TYPE__FLOAT32;
import static com.smartgridready.ns.v0.V0Package.MODBUS_DATA_TYPE__FLOAT64;
import static com.smartgridready.ns.v0.V0Package.MODBUS_DATA_TYPE__INT16;
import static com.smartgridready.ns.v0.V0Package.MODBUS_DATA_TYPE__INT16_U;
import static com.smartgridready.ns.v0.V0Package.MODBUS_DATA_TYPE__INT32;
import static com.smartgridready.ns.v0.V0Package.MODBUS_DATA_TYPE__INT32_U;
import static com.smartgridready.ns.v0.V0Package.MODBUS_DATA_TYPE__INT64;
import static com.smartgridready.ns.v0.V0Package.MODBUS_DATA_TYPE__INT64_U;
import static com.smartgridready.ns.v0.V0Package.MODBUS_DATA_TYPE__INT8;
import static com.smartgridready.ns.v0.V0Package.MODBUS_DATA_TYPE__INT8_U;
import static com.smartgridready.ns.v0.V0Package.MODBUS_DATA_TYPE__STRING;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Test the data type conversions by writing a value to the modbus mock, read
 * the written value back and verify the read value.
 * <br>
 * <ul>
 *     <li>When converting from int type to int type, a double value is used as intermediate type.
 *     This leads to floating point precision deviations between written and read values.</li>
 *     <li>Several U8 type conversions are missing in setVal() and probably in getVal() too</li>
 * </ul>
 *
 */
@ExtendWith(MockitoExtension.class)
class SetGetValConversionTest {

    private static final Logger LOG = LoggerFactory.getLogger(SetGetValConversionTest.class);

    public static final int TIME_SYNC_BLOCK_SIZE = 6;
    public static final int TIME_SYNC_BLOCK_ADDRESS = 2000;

    @Mock
    GenDriverAPI4Modbus genDriverAPI4Modbus;

    @Captor
    ArgumentCaptor<int[]> intArrayCaptor = ArgumentCaptor.forClass(int[].class);

    @Captor
    ArgumentCaptor<Integer> intCaptor = ArgumentCaptor.forClass(int.class);

    @Captor
    ArgumentCaptor<Boolean> booleanCaptor = ArgumentCaptor.forClass(Boolean.class);
    
    private static class Fixture<T> {

        Value writeValue;
        Value readValue;
        T expectedModbusValue;

        SGrModbusDeviceFrame modbusDeviceFrame;

        public Fixture(Value writeValue,
                       Value readValue,
                       T expectedModbusValue,
                       SGrModbusDeviceFrame modbusDeviceFrame) {
            this.writeValue = writeValue;
            this.expectedModbusValue = expectedModbusValue;
            this.modbusDeviceFrame = modbusDeviceFrame;
            this.readValue = readValue;
        }

        public Value getWriteValue() {
            return writeValue;
        }

        public T getExpectedModbusValue() {
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

    private static final Map<Integer, Map<Integer, Map<TEnumConversionFct, Fixture<int[]>>>>
            FIXT_TREE= new HashMap<>();

    static final class ValueProvider {

        Supplier<Value> randomGen;
        static ValueProvider of( Supplier<communicator.common.api.Value> randomGen) {
            ValueProvider vp = new ValueProvider();
            vp.randomGen = randomGen;
            return vp;
        }
    }

    static final Random RANDOM = new Random();

    static final EnumSet<TEnumConversionFct> ENUM_CONVERSION_FCTS;

    static final Map<Integer, ValueProvider> MODBUS_NUMBER_FORMATS = new HashMap<>();

    static final Map<Integer, ValueProvider> GEN_NUMBER_FORMATS = new HashMap<>();


    static {
        GEN_NUMBER_FORMATS.put(
                DATA_TYPE__INT8,
                ValueProvider.of(() -> Int8Value.of((byte)(RANDOM.nextInt(2)==1 ? RANDOM.nextInt(127):-RANDOM.nextInt(127)))));

        GEN_NUMBER_FORMATS.put(
                DATA_TYPE__INT16,
                ValueProvider.of(() -> Int16Value.of((short) RANDOM.nextInt(Short.MAX_VALUE))));

        GEN_NUMBER_FORMATS.put(
                DATA_TYPE__INT32,
                ValueProvider.of(() -> Int32Value.of(RANDOM.nextInt(2)==1 ? RANDOM.nextInt(Integer.MAX_VALUE):-RANDOM.nextInt(Integer.MAX_VALUE))));

        GEN_NUMBER_FORMATS.put(
                DATA_TYPE__INT64,
                ValueProvider.of(() -> Int64Value.of(RANDOM.nextInt(2)==1 ? RANDOM.nextLong():-RANDOM.nextLong())));

        GEN_NUMBER_FORMATS.put(
                DATA_TYPE__INT8_U,
                ValueProvider.of(() -> Int8Value.of((byte)RANDOM.nextInt(127))));

        GEN_NUMBER_FORMATS.put(
                DATA_TYPE__INT16_U,
                ValueProvider.of(() -> Int16UValue.of(RANDOM.nextInt(2*Short.MAX_VALUE))));

        GEN_NUMBER_FORMATS.put(
                DATA_TYPE__INT32_U,
                ValueProvider.of(() -> Int32UValue.of(RANDOM.nextInt())));

        GEN_NUMBER_FORMATS.put(
                DATA_TYPE__INT64_U,
                ValueProvider.of(() -> Int64Value.of(RANDOM.nextLong())));

        GEN_NUMBER_FORMATS.put(
                DATA_TYPE__FLOAT32,
                ValueProvider.of(() -> Float32Value.of(100*RANDOM.nextFloat())));

        GEN_NUMBER_FORMATS.put(
                DATA_TYPE__FLOAT64,
                ValueProvider.of(() -> Float64Value.of(100*RANDOM.nextDouble())));

        //=========================================================

        MODBUS_NUMBER_FORMATS.put(
                MODBUS_DATA_TYPE__INT8,
                ValueProvider.of(() -> Int8Value.of((byte)(RANDOM.nextInt(2)==1 ? RANDOM.nextInt(127):-RANDOM.nextInt(127)))));

        MODBUS_NUMBER_FORMATS.put(
                MODBUS_DATA_TYPE__INT16,
                ValueProvider.of(() -> Int16Value.of((short)RANDOM.nextInt(Short.MAX_VALUE))));

        MODBUS_NUMBER_FORMATS.put(
                MODBUS_DATA_TYPE__INT32,
                ValueProvider.of(() -> Int32Value.of(RANDOM.nextInt(2)==1 ? RANDOM.nextInt(Integer.MAX_VALUE):-RANDOM.nextInt(Integer.MAX_VALUE))));

        MODBUS_NUMBER_FORMATS.put(
                MODBUS_DATA_TYPE__INT64,
                ValueProvider.of(
                        () -> Int64Value.of(RANDOM.nextInt(2)==1 ? RANDOM.nextLong():-RANDOM.nextLong())));

        MODBUS_NUMBER_FORMATS.put(
                MODBUS_DATA_TYPE__INT16_U,
                ValueProvider.of(() -> Int16UValue.of(RANDOM.nextInt(2*Short.MAX_VALUE))));

        MODBUS_NUMBER_FORMATS.put(
                MODBUS_DATA_TYPE__INT32_U,
                ValueProvider.of(() -> Int32UValue.of(RANDOM.nextInt())));

        MODBUS_NUMBER_FORMATS.put(
                MODBUS_DATA_TYPE__INT64_U,
                ValueProvider.of(() -> Int64UValue.of(BigInteger.valueOf(RANDOM.nextLong()))));

        MODBUS_NUMBER_FORMATS.put(
                MODBUS_DATA_TYPE__FLOAT32,
                ValueProvider.of(() -> Float32Value.of(100*RANDOM.nextFloat())));

        MODBUS_NUMBER_FORMATS.put(
                MODBUS_DATA_TYPE__FLOAT64,
                ValueProvider.of(() -> Float64Value.of(100*RANDOM.nextDouble())));

        ENUM_CONVERSION_FCTS = EnumSet.allOf(TEnumConversionFct.class);
        ENUM_CONVERSION_FCTS.remove(TEnumConversionFct.CHANGE_BIT_ORDER); // not implemented yet

        createFixtureTree();
    }


    static void createFixtureTree() {
        // Start with all genTypes
        GEN_NUMBER_FORMATS.forEach((key, genValueProvider) -> FIXT_TREE.put(key, createModbus(key)));
    }

    static Map<Integer, Map<TEnumConversionFct, Fixture<int[]>>> createModbus(int genType) {
        Map<Integer, Map<TEnumConversionFct, Fixture<int[]>>> modbusTypesMap =
            new HashMap<>();
        MODBUS_NUMBER_FORMATS.forEach((key, value) -> modbusTypesMap.put(key, createFixtures(genType, key)));
        return modbusTypesMap;
    }

    private static Map<TEnumConversionFct, Fixture<int[]>> createFixtures(int genType, int modbusType) {

        Map<TEnumConversionFct, Fixture<int[]>> fixtureMap = new HashMap<>();

        ENUM_CONVERSION_FCTS.forEach( convType ->
                fixtureMap.put(convType, createFixture(genType, modbusType, convType)));

        return fixtureMap;
    }

    private static Fixture<int[]> createFixture(int genType, int modbusType, TEnumConversionFct convType) {

        Value usedVal = createTestNumber(genType, modbusType);

        return new Fixture<>(usedVal, usedVal, new int[getModbusBufferSize(modbusType)],
                    deviceFrame(true, convType, genType, modbusType));
    }

    private static Value createTestNumber(int genType, int modbusType) {

        final Set<Integer> genFloatTypes = Sets.newSet(
                DATA_TYPE__FLOAT32,
                DATA_TYPE__FLOAT64
        );

        final Set<Integer> genUnsignedTypes = Sets.newSet(
                DATA_TYPE__INT8_U,
                DATA_TYPE__INT16_U,
                DATA_TYPE__INT32_U,
                DATA_TYPE__INT64_U
        );

        final Set<Integer> modbusFloatTypes = Sets.newSet(
                MODBUS_DATA_TYPE__FLOAT32,
                MODBUS_DATA_TYPE__FLOAT64);

        final Set<Integer> modbusUnsignedTypes = Sets.newSet(
                MODBUS_DATA_TYPE__INT8_U,
                MODBUS_DATA_TYPE__INT16_U,
                MODBUS_DATA_TYPE__INT32_U,
                MODBUS_DATA_TYPE__INT64_U
        );


        Value genVal = GEN_NUMBER_FORMATS.get(genType).randomGen.get();
        Value modbVal = MODBUS_NUMBER_FORMATS.get(modbusType).randomGen.get();

        Value usedVal = genVal;
        if (Math.abs(genVal.getFloat64()) > Math.abs(modbVal.getFloat64())) {
            usedVal = modbVal;
        }

        if (genUnsignedTypes.contains(genType) || modbusUnsignedTypes.contains(modbusType)) {
            // one of the types is unsigned, modify the selected value to be positive
            usedVal.absValue();
        }

        if ( !genFloatTypes.contains(genType) || !modbusFloatTypes.contains(modbusType)) {
            // one of them is an integer.
            usedVal.roundToInt();
        }
        return usedVal;
    }


    static  Stream<Fixture<int[]>> streamFixtureTree() {

        createFixtureTree();

        final List<Fixture<int[]>> fixtures = new ArrayList<>();

        FIXT_TREE.values().forEach(
             modbusType -> modbusType.values().forEach(convType -> fixtures.addAll(convType.values()))
        );
        return fixtures.stream();
    }

    @ParameterizedTest
    @MethodSource("streamFixtureTree")
    void testCompleteConversion(Fixture<int[]> fixture) throws Exception {

        doTestWriteAndReadBack(fixture);
    }

    @Test
    void testSingleFixture() throws Exception {

        Fixture<int[]> fixture =
                new Fixture<>(Int16UValue.of(-18), Int16UValue.of(-18), new int[]{ -16334, -16334, -16334, -16334},
                        deviceFrame(true, TEnumConversionFct.BIG_ENDIAN, DATA_TYPE__INT64, MODBUS_DATA_TYPE__INT64));

        doTestWriteAndReadBack(fixture);
    }

    @Test
    void testConvertString() throws Exception{

        Fixture<int[]> fixture =
                new Fixture<>(StringValue.of("Hello@SGr"), StringValue.of("Hello@SGr"), new int[]{0x4865, 0x6C6C, 0x6F40,0x5347, 0x7200},
                        deviceFrame(true, TEnumConversionFct.BIG_ENDIAN, DATA_TYPE__STRING, MODBUS_DATA_TYPE__STRING));

        doTestWriteAndReadBack(fixture);
    }


    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    void testBooleanRegisterConversion(boolean bVal)  throws Exception {
        Fixture<int[]> fixture =
                new Fixture<>(BooleanValue.of(bVal), BooleanValue.of(bVal), bVal ? new int[]{0x1} : new int[]{0x0},
                        deviceFrame(true, TEnumConversionFct.BIG_ENDIAN, MODBUS_DATA_TYPE__BOOLEAN, MODBUS_DATA_TYPE__BOOLEAN));

        doTestWriteAndReadBack(fixture);
    }

    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    void testBooleanDiscreteValConversion(boolean bVal)  throws Exception {
        Fixture<int[]> fixture =
                new Fixture<>(BooleanValue.of(bVal), BooleanValue.of(bVal), bVal ? new int[]{0x1} : new int[]{0x0},
                        deviceFrame(true, TEnumConversionFct.BIG_ENDIAN, MODBUS_DATA_TYPE__BOOLEAN, MODBUS_DATA_TYPE__BOOLEAN));

        doTestWriteAndReadBack(fixture);
    }


    static Stream<Tuple2<TEnumConversionFct, Boolean>> booleanConversions() {

        List<Tuple2<TEnumConversionFct, Boolean>> testParams = new ArrayList<>();

        testParams.add(new Tuple2<>(TEnumConversionFct.BIG_ENDIAN, true));
        testParams.add(new Tuple2<>(TEnumConversionFct.BIG_ENDIAN, false));
        testParams.add(new Tuple2<>(TEnumConversionFct.CHANGE_BIT_ORDER, true));
        testParams.add(new Tuple2<>(TEnumConversionFct.CHANGE_BIT_ORDER, false));
        testParams.add(new Tuple2<>(TEnumConversionFct.CHANGE_WORD_ORDER, true));
        testParams.add(new Tuple2<>(TEnumConversionFct.CHANGE_WORD_ORDER, false));
        testParams.add(new Tuple2<>(TEnumConversionFct.CHANGE_DWORD_ORDER, true));
        testParams.add(new Tuple2<>(TEnumConversionFct.CHANGE_DWORD_ORDER, false));
        return  testParams.stream();
    }


    @ParameterizedTest
    @MethodSource("booleanConversions")
    void readWriteCoilsTest(Tuple2<TEnumConversionFct, Boolean> testParam) throws Exception {

        SGrModbusDeviceFrame deviceFrame = deviceFrame(
                false,
                testParam._1(),
                MODBUS_DATA_TYPE__BOOLEAN,
                MODBUS_DATA_TYPE__BOOLEAN);

        deviceFrame.getFpListElement().get(0)
                .getDpListElement().get(0)
                .getModbusDataPoint().get(0)
                .getModbusFirstRegisterReference().setRegisterType(TEnumObjectType.COIL);

        Fixture<boolean[]> fixture = new Fixture<>(BooleanValue.of(testParam._2), BooleanValue.of(testParam._2),
                new boolean[]{testParam._2()}, deviceFrame);

        when(genDriverAPI4Modbus.ReadCoils(anyInt(), anyInt())).thenReturn(new boolean[]{testParam._2} );

        SGrModbusDevice modbusDevice = new SGrModbusDevice(
                fixture.getModbusDeviceFrame(),           // model
                genDriverAPI4Modbus);                     // mock

        modbusDevice.setVal("ActivePowerAC", "ActivePowerACL1", fixture.getWriteValue());
        verify(genDriverAPI4Modbus).WriteSingleCoil(anyInt(), booleanCaptor.capture());

        LOG.info("Modbus write coils: {}", booleanCaptor.getAllValues().isEmpty() ? "-" : booleanCaptor.getValue());
        assertEquals(fixture.getExpectedModbusValue()[0], booleanCaptor.getValue());
        when(genDriverAPI4Modbus.ReadCoils(anyInt(), anyInt())).thenReturn(new boolean[]{booleanCaptor.getValue()});

        Value res = modbusDevice.getVal("ActivePowerAC", "ActivePowerACL1");

        verify(genDriverAPI4Modbus).ReadCoils(anyInt(), anyInt());
        LOG.info("Modbus read value: {}", res.getBoolean());
        assertEquals(fixture.readValue.getBoolean(), res.getBoolean());
    }


    /*
    @Test
    void testEnumConversion() throws Exception {

        SGrEnumListType genType = V0Factory.eINSTANCE.createSGrEnumListType();
        genType.setSgrPowerSource(SGrPowerSourceType.BATTERY);

        SGrEnumListType modbType = V0Factory.eINSTANCE.createSGrEnumListType();
        genType.setSgrPowerSource(SGrPowerSourceType.BATTERY);

        SGrModbusDeviceFrame deviceFrame = deviceFrame(false, TEnumConversionFct.BIG_ENDIAN, DATA_TYPE__ENUM, MODBUS_DATA_TYPE__ENUM);

        String expectedValue = SGrPowerSourceType.BATTERY.getName();

        SGrModbusDevice modbusDevice = new SGrModbusDevice(
                deviceFrame,
                genDriverAPI4Modbus);

        modbusDevice.setVal("ActivePowerAC", "ActivePowerACL1", expectedValue);
        verify(genDriverAPI4Modbus).WriteSingleRegister(anyInt(), intCaptor.capture());

        if (!intCaptor.getAllValues().isEmpty()) {
            LOG.info("Modbus read enum: {}",
                    Optional.ofNullable(
                            SGrPowerSourceType.get(Optional.ofNullable(intCaptor.getValue()).orElse(-1)))
                            .map(SGrPowerSourceType::getName)
                            .orElse("undefined"));

            assertEquals(SGrPowerSourceType.BATTERY.getValue(), intCaptor.getValue());
            when(genDriverAPI4Modbus.ReadHoldingRegisters(anyInt(),anyInt())).thenReturn(new int[]{intCaptor.getValue()});
        }

        String res = modbusDevice.getVal("ActivePowerAC", "ActivePowerACL1");
        LOG.info("Modbus read value: {}", res);
        assertEquals(expectedValue, res.trim());
    }
     */

    @Test
    void testSetValGetValArray() throws Exception {

        SGrModbusDeviceFrame deviceFrame =
                        deviceFrame(false, TEnumConversionFct.CHANGE_BYTE_ORDER, DATA_TYPE__FLOAT32, MODBUS_DATA_TYPE__FLOAT32);

        Value[] expectedValues = new Value[]{Float32Value.of(219.923f),Float32Value.of(220.000f), Float32Value.of(220.128f)};
        int[] expectedModbusValues = new int[]{23363, 19180, 23619, 0, 23619, -15072};


        when(genDriverAPI4Modbus.ReadHoldingRegisters(anyInt(), anyInt())).thenReturn(expectedModbusValues);

        SGrModbusDevice modbusDevice = new SGrModbusDevice(
                deviceFrame,                              // model
                genDriverAPI4Modbus);                     // mock

        modbusDevice.setValArr("ActivePowerAC", "ActivePowerAC-ARRAY", expectedValues);
        verify(genDriverAPI4Modbus, atLeast(1)).WriteMultipleRegisters(anyInt(), intArrayCaptor.capture());

        if (!intArrayCaptor.getAllValues().isEmpty()) {
            int[] modbusreg = intArrayCaptor.getValue();
            assertEquals(getModbusBufferSize(
                    MODBUS_DATA_TYPE__FLOAT32) * expectedValues.length, modbusreg.length,
                    "Invalid length of values written to the modbus registers.");

            modbusreg = adjustSign(modbusreg);
            LOG.info("Modbus write-read-back registers: {}", intArrayToShortHex(modbusreg));
            assertArrayEquals(expectedModbusValues, modbusreg);
            when(genDriverAPI4Modbus.ReadHoldingRegisters(anyInt(), anyInt())).thenReturn(modbusreg);
        }

        Value[] res = modbusDevice.getValArr("ActivePowerAC", "ActivePowerAC-ARRAY");
        LOG.info("Modbus read values: {}", Arrays.toString(res));
        assertArrayEquals(
                Arrays.stream(expectedValues).map(Value::toString).toArray(),
                Arrays.stream(res).map(Value::toString).toArray());
    }

    @Test
    void testSetValGetValBlocktransfer() throws Exception {

        SGrModbusDeviceFrame deviceFrame =
                deviceFrame(false, TEnumConversionFct.CHANGE_BYTE_ORDER, DATA_TYPE__FLOAT32, MODBUS_DATA_TYPE__FLOAT32);

        Value expectedValue = Float32Value.of(220.220f);
        int[] expectedModbusValues = new int[]{23619, 21048, 23619, 21048, 23619, 21048};


        SGrModbusDevice modbusDevice = new SGrModbusDevice(
                deviceFrame,                              // model
                genDriverAPI4Modbus);                     // mock


        modbusDevice.setVal("ActivePowerAC", "ActivePowerAC-BLOCK", expectedValue);
        verify(genDriverAPI4Modbus).WriteMultipleRegisters(anyInt(), intArrayCaptor.capture());
        LOG.info("Modbus write multiple registers (single value): {}", intArrayCaptor.getAllValues().isEmpty() ? "-" : intArrayToShortHex(intArrayCaptor.getValue()));

        if (!intArrayCaptor.getAllValues().isEmpty()) {
            int[] modbusreg = intArrayCaptor.getValue();
            assertEquals(getModbusBufferSize(MODBUS_DATA_TYPE__FLOAT32), modbusreg.length,
                    "Invalid length of values written to the modbus registers.");

            IntBuffer intBuf = IntBuffer.allocate(TIME_SYNC_BLOCK_SIZE);

            for (int i=0; i<TIME_SYNC_BLOCK_SIZE/getModbusBufferSize(MODBUS_DATA_TYPE__FLOAT32); i++) {
                intBuf.put(modbusreg);
            }

            int[] modbusregRead = intBuf.array();
            assertArrayEquals(expectedModbusValues, modbusregRead);
            modbusregRead = adjustSign(modbusregRead);
            LOG.info("Modbus read multiple registers: {}", intArrayToShortHex(modbusregRead));
            when(genDriverAPI4Modbus.ReadHoldingRegisters(anyInt(), anyInt())).thenReturn(modbusregRead);
        }

        // Mock the read cache before doing the read test.
        Field timeSyncBlockCache = ReflectionUtils.findFields(SGrModbusDevice.class,
                f -> f.getName().equals("myTimeSyncBlockReadCache"),
                ReflectionUtils.HierarchyTraversalMode.TOP_DOWN).get(0);
        timeSyncBlockCache.setAccessible(true);

        Map<SGrTimeSyncBlockNotificationType, CacheRecord<ModbusReaderResponse>> cacheRecords = new HashMap<>();
        timeSyncBlockCache.set(modbusDevice, cacheRecords);

        // Test the block read.
        Value res = modbusDevice.getVal("ActivePowerAC", "ActivePowerAC-BLOCK");
        verify(genDriverAPI4Modbus).ReadHoldingRegisters(TIME_SYNC_BLOCK_ADDRESS, TIME_SYNC_BLOCK_SIZE);

        assertEquals(1, cacheRecords.size(), "Cache has not been written during modbus read.");

        cacheRecords.values().forEach(value -> assertArrayEquals(expectedModbusValues, value.getValue().getMbregresp(),
                "Cache record does not contain the expected modbus response (3* the given float value)"));

        LOG.info("Read cache content: {}", cacheRecords);
        LOG.info("Modbus read value: {}", res);
        assertEquals(expectedValue.getString(), res.getString().trim());

    }

    private void doTestWriteAndReadBack(Fixture<int[]> fixture) throws GenDriverException, GenDriverSocketException, GenDriverModbusException {
        // given
        SGrModbusDevice modbusDevice = new SGrModbusDevice(
                fixture.getModbusDeviceFrame(),           // model
                genDriverAPI4Modbus);                     // mock

        // when
        LOG.info("Modbus write value: {}", fixture.getWriteValue());
        modbusDevice.setVal("ActivePowerAC", "ActivePowerACL1", fixture.getWriteValue());

        // then
        verify(genDriverAPI4Modbus, atLeast(0)).WriteMultipleRegisters(anyInt(), intArrayCaptor.capture());
        verify(genDriverAPI4Modbus, atLeast(0)).WriteSingleRegister(anyInt(), intCaptor.capture());

        if (!intArrayCaptor.getAllValues().isEmpty()) {
            int[] modbusRegReceived = intArrayCaptor.getValue();
            LOG.info("Modbus write-read-back multiple registers: {}", intArrayToShortHex(modbusRegReceived));

            assertEquals(fixture.getExpectedModbusValue().length, modbusRegReceived.length,
                    "Invalid length of values written to the modbus registers.");

            when(genDriverAPI4Modbus.ReadHoldingRegisters(anyInt(), anyInt())).thenReturn(modbusRegReceived);

        } else if (!intCaptor.getAllValues().isEmpty()){
            LOG.info("Modbus write-read-back single register: {}", Integer.toHexString(intCaptor.getValue()));
            when(genDriverAPI4Modbus.ReadHoldingRegisters(anyInt(), anyInt())).thenReturn(new int[]{intCaptor.getValue()});
        }

        Value resVal = modbusDevice.getVal("ActivePowerAC", "ActivePowerACL1");
        LOG.info("Modbus read value: {}", resVal);

        // We need to normalize the String values to compare, since the values can be mixed int/float typed.
        if (resVal instanceof StringValue || resVal instanceof BooleanValue) {
            assertEquals(fixture.getWriteValue().getString(), resVal.getString());
        } else {
            Double expected = Double.parseDouble(fixture.getWriteValue().getString());
            String expStr = String.format("%.4f", expected);
            Double result = Double.parseDouble(resVal.getString());
            String resStr = String.format("%.4f", result);
            assertEquals(expStr, resStr);
        }
    }


    private static SGrModbusDeviceFrame deviceFrame(boolean firstRegOne,
                                                    TEnumConversionFct conversionFct,
                                                    int genericType,
                                                    int modbusType) {

        SGrModbusDeviceFrame deviceFrame = V0Factory.eINSTANCE.createSGrModbusDeviceFrame();
        deviceFrame.setDeviceName(createDeviceName(conversionFct, genericType, modbusType));

        deviceFrame.setModbusInterfaceDesc(modbDevDesc(firstRegOne, conversionFct));

        SGrModbusFunctionalProfileType functionalProfileType =
                V0Factory.eINSTANCE.createSGrModbusFunctionalProfileType();

        SGrProfileDescriptionType profileDescriptionType = V0Factory.eINSTANCE.createSGrProfileDescriptionType();
        profileDescriptionType.setProfileName("ActivePowerAC");
        functionalProfileType.setFunctionalProfile(profileDescriptionType);

        functionalProfileType.getDpListElement().add(modbDp(genericType, modbusType, "ActivePowerACL1", 1));

        if (genericType != DATA_TYPE__ENUM) {
            // This does not work with enums. The genericValue and modbusValue of the previous datapoint will be set to <null>
            functionalProfileType.getDpListElement().add(modbDp(genericType, modbusType, "ActivePowerAC-ARRAY", 3));
            functionalProfileType.getDpListElement().add(blockDp(genericType, modbusType,"ActivePowerAC-BLOCK", "ActivePowerAC-BLOCK", 1));
            deviceFrame.getTimeSyncBlockNotification().add(timeSyncBlock("ActivePowerAC-BLOCK"));
        }
        deviceFrame.getFpListElement().add(functionalProfileType);
        return deviceFrame;
    }


    private static SGrModbusInterfaceDescriptionType modbDevDesc(boolean firstRegisterOne,
            TEnumConversionFct modbusConversionScheme) {

        SGrModbusInterfaceDescriptionType mbDesc = V0Factory.eINSTANCE.createSGrModbusInterfaceDescriptionType();

        mbDesc.setFirstRegisterAddressIsOne(firstRegisterOne);
        mbDesc.getConversionScheme().add(modbusConversionScheme);

        return mbDesc;
    }

    private static SGrModbusDataPointType modbDp(int genericType, int modbusType, String dpName, int arrLen) {

        SGrModbusDataPointType modbDp = V0Factory.eINSTANCE.createSGrModbusDataPointType();
        modbDp.setDataPoint(genDpDesc(genericType, dpName, arrLen));
        modbDp.getModbusDataPoint().add(dpModbDesc(modbusType));
        return modbDp;
    }

    private static SGrModbusDataPointType blockDp(int genericType, int modbusType, String dpName, String blockId, int arrLen) {
        SGrModbusDataPointType blockDp = modbDp(genericType, modbusType, dpName, arrLen);
        blockDp.setBlockCacheId(blockId);
        return blockDp;
    }

    private static SGrModbusDataPointDescriptionType dpModbDesc(int modbusType) {

        SGrModbusDataPointDescriptionType modbDpDesc = V0Factory.eINSTANCE.createSGrModbusDataPointDescriptionType();

        TSGrModbusRegisterRef firstRegRef = V0Factory.eINSTANCE.createTSGrModbusRegisterRef();
        firstRegRef.setAddr(BigInteger.valueOf(2000));
        firstRegRef.setRegisterType(TEnumObjectType.HOLD_REGISTER);
        firstRegRef.setBitRank((short) 0);
        modbDpDesc.setModbusFirstRegisterReference(firstRegRef);
        modbDpDesc.setModbusDataType(modbusDP(modbusType));
        modbDpDesc.setDpSizeNrRegisters(getModbusBufferSize(modbusType));

        return modbDpDesc;
    }

    private static SGrDataPointDescriptionType genDpDesc(int genType, String dpName, int arrLen) {

        SGrDataPointDescriptionType genDpDesc = V0Factory.eINSTANCE.createSGrDataPointDescriptionType();
        genDpDesc.setDatapointName(dpName);
        genDpDesc.setDataType(basicDP(genType));
        genDpDesc.setRwpDatadirection(SGrRWPType.RW);
        genDpDesc.setArrayLength(arrLen);
        return genDpDesc;
    }

    private static DataType basicDP(int v0PackageType) {

        DataTypeImpl dp = (DataTypeImpl) V0Factory.eINSTANCE.createDataType();
        dp.eSet(v0PackageType, V0Factory.eINSTANCE.createEmptyType());
        return dp;
    }

    private static ModbusDataTypeImpl modbusDP(int v0PackageType) {

        ModbusDataTypeImpl dp = (ModbusDataTypeImpl) V0Factory.eINSTANCE.createModbusDataType();
        dp.eSet(v0PackageType, V0Factory.eINSTANCE.createEmptyType());
        return dp;
    }


    private static SGrTimeSyncBlockNotificationType timeSyncBlock(String blockId) {

        SGrTimeSyncBlockNotificationType tsBlock = V0Factory.eINSTANCE.createSGrTimeSyncBlockNotificationType();
        tsBlock.setFirstAddr(BigInteger.valueOf(TIME_SYNC_BLOCK_ADDRESS));
        tsBlock.setBlockCacheId(blockId);
        tsBlock.setRegisterType(TEnumObjectType.HOLD_REGISTER);
        tsBlock.setTimeToLiveMs(200);
        tsBlock.setSize(TIME_SYNC_BLOCK_SIZE);
        return tsBlock;
    }

    private static int getModbusBufferSize(int modbusType) {

        if (modbusType == MODBUS_DATA_TYPE__FLOAT64
                || modbusType == MODBUS_DATA_TYPE__INT64_U
                || modbusType == MODBUS_DATA_TYPE__INT64)
        {
            return 4;
        } else if (   modbusType == MODBUS_DATA_TYPE__INT8
                   || modbusType == MODBUS_DATA_TYPE__INT8_U
                   || modbusType == MODBUS_DATA_TYPE__INT16
                   || modbusType == MODBUS_DATA_TYPE__INT16_U
                   || modbusType == MODBUS_DATA_TYPE__BOOLEAN
                   || modbusType == MODBUS_DATA_TYPE__ENUM) {
            return 1;
        } else if ( modbusType == MODBUS_DATA_TYPE__STRING) {
            return 5;
        }
        return 2;
    }

    private static String createDeviceName(TEnumConversionFct convFun, int genType, int modbusType) {
        return SGrGDPTypeToNameMapper.getGenericName(genType) + " - "
                + SGrGDPTypeToNameMapper.getModbusName(modbusType) + " - "
                + convFun.getName();
    }

    private static int[] adjustSign(int[] registers) {
        IntBuffer buffer = IntBuffer.allocate(registers.length);
        for (int reg : registers) {
            buffer.put(adjustSign(reg));
        }
        return buffer.array();
    }

    private static int adjustSign(int register) {
        if ( (register & 0x8000) != 0) {
            return register | 0xFFFF0000;
        }
        return register;
    }

    @Test
    void testAdjustSign() {

        byte[] regPos = new byte[]{(byte)0x00, (byte)0x00, (byte)0x7F, (byte)0xAA};
        byte[] regNeg = new byte[]{(byte)0x00, (byte)0x00, (byte)0xAF, (byte)0xBB};
        byte[] regNegExpect = new byte[]{(byte)0xFF, (byte)0xFF, (byte)0xAF, (byte)0xBB};

        assertEquals(ByteBuffer.wrap(regPos).getInt(),  adjustSign(ByteBuffer.wrap(regPos).getInt()));

        assertEquals(ByteBuffer.wrap(regNegExpect).getInt(),  adjustSign(ByteBuffer.wrap(regNeg).getInt()));
    }

    private static String intArrayToShortHex(int[] values) {
        StringBuilder sb = new StringBuilder("[");
        Arrays.stream(values).forEach(
                val -> sb.append(Integer.toHexString(val)).append(",")
        );
        sb.delete(sb.length() -1, sb.length()).append("]");
        return sb.toString();
    }
}
