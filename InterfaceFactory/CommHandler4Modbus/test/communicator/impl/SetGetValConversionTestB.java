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
import org.mockito.internal.util.collections.Sets;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.SGrGDPTypeToNameMapper;

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

import static com.smartgridready.ns.v0.V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__BOOLEAN;
import static com.smartgridready.ns.v0.V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32;
import static com.smartgridready.ns.v0.V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64;
import static com.smartgridready.ns.v0.V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16;
import static com.smartgridready.ns.v0.V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16_U;
import static com.smartgridready.ns.v0.V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32;
import static com.smartgridready.ns.v0.V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32_U;
import static com.smartgridready.ns.v0.V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64;
import static com.smartgridready.ns.v0.V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64_U;
import static com.smartgridready.ns.v0.V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8;
import static com.smartgridready.ns.v0.V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8_U;
import static com.smartgridready.ns.v0.V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__STRING;
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
public class SetGetValConversionTestB {

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

    private static final Map<Integer, Map<Integer, Map<TEnumConversionFct, Fixture<String, String>>>>
            FIXT_TREE= new HashMap<>();

    static final class ValueProvider {
        Object zeroVal;
        Supplier<String> randomGen;
        static ValueProvider of(Object zeroVal, Supplier<String> randomGen) {
            ValueProvider vp = new ValueProvider();
            vp.zeroVal = zeroVal;
            vp.randomGen = randomGen;
            return vp;
        }
    }

    static final Random RANDOM = new Random();

    static final EnumSet<TEnumConversionFct> ENUM_CONVERSION_FCTS;

    static final Map<Integer, ValueProvider> NUMBER_FORMATS = new HashMap<>();
    static {
        // TODO V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8_U,
        NUMBER_FORMATS.put(
                SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16,
                ValueProvider.of(Short.valueOf((short) 0), () -> java.lang.String.valueOf(RANDOM.nextInt(Short.MAX_VALUE))));

        NUMBER_FORMATS.put(
                SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32,
                ValueProvider.of(BigInteger.valueOf(0),
                        () -> java.lang.String.valueOf(RANDOM.nextInt(1)==1 ? RANDOM.nextInt(Integer.MAX_VALUE):-RANDOM.nextInt(Integer.MAX_VALUE))));

        NUMBER_FORMATS.put(
                SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64,
                ValueProvider.of(Long.valueOf(0),
                        () -> java.lang.String.valueOf(RANDOM.nextInt(1)==1 ? RANDOM.nextLong():-RANDOM.nextLong())));

        // TODO V0Package.SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8_U,

        NUMBER_FORMATS.put(
                SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16_U,
                ValueProvider.of(Integer.valueOf((int) 0), () -> java.lang.String.valueOf(RANDOM.nextInt(2*Short.MAX_VALUE))));

        NUMBER_FORMATS.put(
                SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32_U,
                ValueProvider.of(Long.valueOf(0), () -> java.lang.String.valueOf(RANDOM.nextInt())));

        NUMBER_FORMATS.put(
                SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64_U,
                ValueProvider.of(BigInteger.valueOf(0l), () -> java.lang.String.valueOf(RANDOM.nextLong())));

        NUMBER_FORMATS.put(
                SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32,
                ValueProvider.of(Float.valueOf(0), () -> java.lang.String.valueOf(100*RANDOM.nextFloat())));

        NUMBER_FORMATS.put(
                SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64,
                ValueProvider.of(Double.valueOf(0), () -> java.lang.String.valueOf(100*RANDOM.nextDouble())));

        ENUM_CONVERSION_FCTS = EnumSet.allOf(TEnumConversionFct.class);
        ENUM_CONVERSION_FCTS.remove(TEnumConversionFct.CHANGE_BIT_ORDER); // not implemented yet

        createFixtureTree();
    };


    static final void createFixtureTree() {
        // Start with all genTypes
        NUMBER_FORMATS.entrySet().forEach( entry -> FIXT_TREE.put(entry.getKey(), createModbus(entry.getKey())));
    }

    static final Map<Integer, Map<TEnumConversionFct, Fixture<String,String>>> createModbus(int genType) {
        Map<Integer, Map<TEnumConversionFct, Fixture<String,String>>> modbusTypesMap =
            new HashMap<>();
        NUMBER_FORMATS.entrySet().forEach(entry -> modbusTypesMap.put(entry.getKey(), createFixtures(genType, entry.getKey())));
        return modbusTypesMap;
    }

    private static Map<TEnumConversionFct, Fixture<String, String>> createFixtures(int genType, int modbusType) {

        Map<TEnumConversionFct, Fixture<String, String>> fixtureMap = new HashMap<>();

        ENUM_CONVERSION_FCTS.forEach( convType ->
                fixtureMap.put(convType, createFixture(genType, modbusType, convType)));

        return fixtureMap;
    }

    private static Fixture<String, String> createFixture(int genType, int modbusType, TEnumConversionFct convType) {

        String usedVal =createTestNumber(genType, modbusType);

        return new Fixture<>(usedVal, usedVal, new int[getModbusBufferSize(modbusType)],
                    deviceFrame(true, convType,
                            genType, NUMBER_FORMATS.get(genType).zeroVal,
                            modbusType, NUMBER_FORMATS.get(modbusType).zeroVal));
    }

    private static String createTestNumber(int genType, int modbusType) {

        final Set<Integer> floatTypes = Sets.newSet(
                SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT32,
                SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64);

        final Set<Integer> unsignedTypes = Sets.newSet(
                SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8_U,
                SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16_U,
                SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32_U,
                SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64_U
        );

        String genVal = NUMBER_FORMATS.get(genType).randomGen.get();
        String modbVal = NUMBER_FORMATS.get(modbusType).randomGen.get();

        double genDouble = Double.parseDouble(genVal);
        double modbDouble = Double.parseDouble(modbVal);

        double usedDouble = genDouble;
        if (Math.abs(genDouble) > Math.abs(modbDouble)) {
            usedDouble = modbDouble;
        }

        if (unsignedTypes.contains(genType) || unsignedTypes.contains(modbusType)) {
            // one of the types is unsigned, modify the selected value to be positive
            usedDouble = Math.abs(usedDouble);
        }

        if (!floatTypes.contains(genType) || !floatTypes.contains(modbusType)) {
            // one of them is an integer.
            return String.valueOf(Math.round(usedDouble));
        }
        return String.valueOf(usedDouble);
    }


    static  Stream<Fixture<String, String>> streamFixtureTree() {

        createFixtureTree();

        final List<Fixture<String, String>> fixtures = new ArrayList<>();

        FIXT_TREE.values().forEach(
             modbusType -> modbusType.values().forEach(
                     convType -> convType.values().forEach(
                            fixture -> fixtures.add(fixture)
                     )
             )
        );
        return fixtures.stream();
    }

    @ParameterizedTest
    @MethodSource("streamFixtureTree")
    void testCompleteConversion(Fixture<String, String> fixture) throws Exception {

        if ("INT64 - INT32 - ChangeByteOrder".equals(fixture.getModbusDeviceFrame().getDeviceName())) {
            LOG.info("Hit breakpoint");
        }

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
            //assertArrayEquals(fixture.getExpectedModbusValue(), modbusreg);
            when(genDriverAPI4Modbus.ReadHoldingRegisters(anyInt(), anyInt())).thenReturn(modbusreg);
        } else if (!intCaptor.getAllValues().isEmpty()){
            LOG.info("Modbus read single register: {}", intCaptor.getValue());
            //assertEquals(fixture.getExpectedModbusValue()[0], intCaptor.getValue());
            when(genDriverAPI4Modbus.ReadHoldingRegisters(anyInt(), anyInt())).thenReturn(new int[]{intCaptor.getValue()});
        }

        String res = modbusDevice.getVal("ActivePowerAC", "ActivePowerACL1");
        LOG.info("Modbus read value: {}", res);

        String testName = fixture.getModbusDeviceFrame().getDeviceName();
        if (testName.contains("FLOAT64") || testName.contains("FLOAT32")) {
            fixture.writeValue = normalizeNumberFormat(fixture.writeValue);
            res = normalizeNumberFormat(res);
        }

        assertEquals(fixture.writeValue, res);
    }

    @Test
    void testSingleFixture() throws Exception {

        Fixture<String, String>fixture =
                new Fixture<>("-400255274", "-400255274", new int[]{ 16429, 62390},
                        deviceFrame(true, TEnumConversionFct.CHANGE_BYTE_ORDER,
                                SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64, Long.valueOf(0),
                                SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT32, BigInteger.valueOf(0)));

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
            modbusreg = adjustSign(modbusreg);
            LOG.info("Modbus read registers: {}", modbusreg);
            //assertArrayEquals(fixture.getExpectedModbusValue(), modbusreg);
            when(genDriverAPI4Modbus.ReadHoldingRegisters(anyInt(), anyInt())).thenReturn(modbusreg);
        } else if (!intCaptor.getAllValues().isEmpty()){
            int val = adjustSign(intCaptor.getValue());
            LOG.info("Modbus read single register: {}", val);
            assertEquals(fixture.getExpectedModbusValue()[0], val);
            when(genDriverAPI4Modbus.ReadHoldingRegisters(anyInt(), anyInt())).thenReturn(new int[]{val});
        }

        String res = modbusDevice.getVal("ActivePowerAC", "ActivePowerACL1");
        LOG.info("Modbus read value: {}", res);
        assertEquals(fixture.getReadValue(), res.trim());
    }

    @Test
    void testConvertString() throws Exception{

        Fixture<String, String>fixture =
                new Fixture<>("Hello@SGr", "Hello@SGr", new int[]{0x4865, 0x6C6C, 0x6F40,0x5347, 0x7200},
                        deviceFrame(true, TEnumConversionFct.BIG_ENDIAN,
                                SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__STRING, "",
                                SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__STRING, ""));

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
            modbusreg = adjustSign(modbusreg);
            LOG.info("Modbus read registers: {}", modbusreg);
            //assertArrayEquals(fixture.getExpectedModbusValue(), modbusreg);
            when(genDriverAPI4Modbus.ReadHoldingRegisters(anyInt(), anyInt())).thenReturn(modbusreg);
        } else if (!intCaptor.getAllValues().isEmpty()){
            int val = adjustSign(intCaptor.getValue());
            LOG.info("Modbus read single register: {}", val);
            assertEquals(fixture.getExpectedModbusValue()[0], val);
            when(genDriverAPI4Modbus.ReadHoldingRegisters(anyInt(), anyInt())).thenReturn(new int[]{val});
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

        if (modbusType == SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__FLOAT64
                || modbusType == SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64_U
                || modbusType == SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT64 )
        {
            return 4;
        } else if (   modbusType == SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8
                   || modbusType == SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT8_U
                   || modbusType == SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16
                   || modbusType == SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__INT16_U) {
            return 1;
        } else if ( modbusType == SGR_BASIC_GEN_DATA_POINT_TYPE_TYPE__STRING) {
            return 5;
        }
        return 2;
    }

    private static String createDeviceName(TEnumConversionFct convFun, int genType, int modbusType) {
        return SGrGDPTypeToNameMapper.getName(genType) + " - "
                + SGrGDPTypeToNameMapper.getName(modbusType) + " - "
                + convFun.getName();
    }

    private static String normalizeNumberFormat(String number) {
        double d = Double.valueOf(number);
        String norm = String.format("%10.3f", d);
        return norm.trim();
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
}
