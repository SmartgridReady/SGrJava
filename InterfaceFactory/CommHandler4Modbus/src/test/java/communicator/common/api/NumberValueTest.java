package communicator.common.api;

import com.smartgridready.ns.v0.DataTypeProduct;
import com.smartgridready.ns.v0.ModbusDataType;
import com.smartgridready.ns.v0.V0Factory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberValueTest {

    private static final Logger LOG = LoggerFactory.getLogger(NumberValueTest.class);


    private static final DataTypeProduct genTypeFloat32 = V0Factory.eINSTANCE.createDataTypeProduct();
    static { genTypeFloat32.setFloat32(V0Factory.eINSTANCE.createEmptyType());}

    private static final ModbusDataType modbusTypeFloat64 = V0Factory.eINSTANCE.createModbusDataType();
    static { modbusTypeFloat64.setFloat64(V0Factory.eINSTANCE.createEmptyType()); }

    private static final ModbusDataType modbusTypeFloat32 = V0Factory.eINSTANCE.createModbusDataType();
    static { modbusTypeFloat32.setFloat32(V0Factory.eINSTANCE.createEmptyType()); }

    private static final ModbusDataType modbusTypeInt64 = V0Factory.eINSTANCE.createModbusDataType();
    static { modbusTypeInt64.setInt64(V0Factory.eINSTANCE.createEmptyType()); }

    private static final ModbusDataType modbusTypeInt64U = V0Factory.eINSTANCE.createModbusDataType();
    static { modbusTypeInt64U.setInt64U(V0Factory.eINSTANCE.createEmptyType()); }

    private static final ModbusDataType modbusTypeInt32 = V0Factory.eINSTANCE.createModbusDataType();
    static { modbusTypeInt32.setInt32(V0Factory.eINSTANCE.createEmptyType()); }

    private static final ModbusDataType modbusTypeInt32U = V0Factory.eINSTANCE.createModbusDataType();
    static { modbusTypeInt32U.setInt32U(V0Factory.eINSTANCE.createEmptyType()); }

    private static final ModbusDataType modbusTypeInt16 = V0Factory.eINSTANCE.createModbusDataType();
    static { modbusTypeInt16.setInt16(V0Factory.eINSTANCE.createEmptyType()); }

    private static final ModbusDataType modbusTypeInt16U = V0Factory.eINSTANCE.createModbusDataType();
    static { modbusTypeInt16U.setInt16U(V0Factory.eINSTANCE.createEmptyType()); }

    private static final ModbusDataType modbusTypeInt8 = V0Factory.eINSTANCE.createModbusDataType();
    static { modbusTypeInt8.setInt8(V0Factory.eINSTANCE.createEmptyType()); }

    private static final ModbusDataType modbusTypeInt8U = V0Factory.eINSTANCE.createModbusDataType();
    static { modbusTypeInt8U.setInt8U(V0Factory.eINSTANCE.createEmptyType()); }

    public static final Map<Value, String> VALUE_TYPES = new HashMap<>();
    static {
        VALUE_TYPES.put(Float32Value.of(3.1415927f), "F32-");
    }

    private static class Fixture {

        public Value testValue;
        public ModbusDataType modbusType;
        public int[] modbusValue;
        String testName;

        boolean modbusIsInt;

        public Fixture(String testName, Value testValue, ModbusDataType modbusType, boolean modbusIsInt, int[] modbusValue) {
            this.testName = testName;
            this.testValue = testValue;
            this.modbusType = modbusType;
            this.modbusIsInt = modbusIsInt;
            this.modbusValue = modbusValue;
        }

        public String toString() {
            return testName;
        }
    }

    static Stream<Fixture> testParams() {

        List<Fixture> fixtures = new ArrayList<>();
        //                                 testName,      testValue                                      modbusType,                          expected modbusValue
        fixtures.add( new Fixture("F64 - F64+",  Float64Value.of( 3.14159265359e20d),    modbusTypeFloat64, false, new int[]{0x4431, 0x07d5, 0xeb5b, 0x5ce0}));
        fixtures.add( new Fixture("F64 - F64-",  Float64Value.of(-3.14159265359e20d),    modbusTypeFloat64, false, new int[]{0xC431, 0x07D5, 0xEB5B, 0x5CE0}));
        fixtures.add( new Fixture("F64 - F32+",  Float32Value.of( 3.1415927f),           modbusTypeFloat32, false, new int[]{0x4049, 0x0FDB}));
        fixtures.add( new Fixture("F64 - F32-",  Float32Value.of(-3.1415927f),           modbusTypeFloat32, false, new int[]{0xc049, 0x0fdb}));
        fixtures.add( new Fixture("F64 - I64+",  Float64Value.of(7223372036854775803d),  modbusTypeInt64,   false, new int[]{0x643e, 0x9298, 0xb138, 0x0000}));
        fixtures.add( new Fixture("F64 - I64-",  Float64Value.of(-7223372036854775803d), modbusTypeInt64,   false, new int[]{0x9BC1, 0x6D67, 0x4EC8, 0x0000}));
        fixtures.add( new Fixture("F64 - I64U",  Float64Value.of(1022337203685477e4d),   modbusTypeInt64U,  false, new int[]{0x8DE0, 0xB6B3, 0xA763, 0xE950}));
        fixtures.add( new Fixture("F64 - I32+",  Float64Value.of(1847483647d),           modbusTypeInt32,   false, new int[]{0x6E1E, 0x5CFF}));
        fixtures.add( new Fixture("F64 - I32-",  Float64Value.of(-1847483647d),          modbusTypeInt32,   false, new int[]{0x91E1, 0xA301}));
        fixtures.add( new Fixture("F64 - I32U",  Float64Value.of(3247483647d),           modbusTypeInt32U,  false, new int[]{0xC190, 0xAAFF}));
        fixtures.add( new Fixture("F64 - I16+",  Float64Value.of(30123d),                modbusTypeInt16,   false, new int[]{0X75AB}));
        fixtures.add( new Fixture("F64 - I16-",  Float64Value.of(-30123d),               modbusTypeInt16,   false, new int[]{0x8A55}));
        fixtures.add( new Fixture("F64 - I16U",  Float64Value.of(46536d),                modbusTypeInt16U,  false, new int[]{0xB5C8}));
        fixtures.add( new Fixture("F64 - I8+",   Float64Value.of(112d),                  modbusTypeInt8,    false, new int[]{0x0070}));
        fixtures.add( new Fixture("F64 - I8-",   Float64Value.of(-112d),                 modbusTypeInt8,    false, new int[]{0xFF90}));
        fixtures.add( new Fixture("F64 - I8U",   Float64Value.of(243d),                  modbusTypeInt8U,   false, new int[]{0x00F3}));

        fixtures.add( new Fixture("F32 - F64+",  Float32Value.of( 3.1415927f),            modbusTypeFloat64, false, new int[]{0x4009, 0x21FB, 0x6000, 0x0000})); // 0x6000 0x0000 due to float32 precision
        fixtures.add( new Fixture("F32 - F64-",  Float32Value.of(-3.1415927f),            modbusTypeFloat64, false, new int[]{0xc009, 0x21fb, 0x6000, 0x0000}));
        fixtures.add( new Fixture("F32 - F32+",  Float32Value.of( 3.1415927f),            modbusTypeFloat32, false, new int[]{0x4049, 0x0FDB}));
        fixtures.add( new Fixture("F32 - F32-",  Float32Value.of(-3.1415927f),            modbusTypeFloat32, false, new int[]{0xc049, 0x0fdb}));
        fixtures.add( new Fixture("F32 - I64+",  Float32Value.of(922337203685477.5807f),  modbusTypeInt64,   true,  new int[]{0x0003, 0x46dc, 0x5c00, 0x0000}));
        fixtures.add( new Fixture("F32 - I64-",  Float32Value.of(-218.2345f),             modbusTypeInt64,   true,  new int[]{0xffff, 0xffff, 0xffff, 0xff26}));
        fixtures.add( new Fixture("F32 - I64U",  Float32Value.of(922337203685477f),       modbusTypeInt64U,  true,  new int[]{0x0003, 0x46dc, 0x5c00, 0x0000}));
        fixtures.add( new Fixture("F32 - I32+",  Float32Value.of(2047483),                modbusTypeInt32,   true,  new int[]{0x001F, 0x3DFB}));
        fixtures.add( new Fixture("F32 - I32-",  Float32Value.of(-2047483),               modbusTypeInt32,   true,  new int[]{0xFFE0, 0xC205}));
        fixtures.add( new Fixture("F32 - I32U",  Float32Value.of(4147483647f),            modbusTypeInt32U,  true,  new int[]{0xF735, 0x9400}));
        fixtures.add( new Fixture("F32 - I16+",  Float32Value.of(22767f),                 modbusTypeInt16,   true,  new int[]{0x58EF}));
        fixtures.add( new Fixture("F32 - I16+",  Float32Value.of(-22767f),                modbusTypeInt16,   true,  new int[]{0xA711}));
        fixtures.add( new Fixture("F32 - I16U",  Float32Value.of(40000f),                 modbusTypeInt16U,  true,  new int[]{0x9C40}));
        fixtures.add( new Fixture("F32 - I8+",   Float32Value.of(120.0f),                 modbusTypeInt8,    true,  new int[]{0x0078}));
        fixtures.add( new Fixture("F32 - I8+",   Float32Value.of(-120.0f),                modbusTypeInt8,    true,  new int[]{0xFF88}));
        fixtures.add( new Fixture("F32 - I8U",   Float32Value.of(220),                    modbusTypeInt8U,   true,  new int[]{0x0DC}));

        fixtures.add( new Fixture("I64 - F64+",  Int64Value.of( 7223372036854776000L),    modbusTypeFloat64, false, new int[]{0x43d9, 0x0fa4, 0xa62c, 0x4e00}));
        fixtures.add( new Fixture("I64 - F64-",  Int64Value.of(-7223372036854776000L),    modbusTypeFloat64, false, new int[]{0xc3d9, 0x0fa4, 0xa62c, 0x4e00}));
        fixtures.add( new Fixture("I64 - F32+",  Int64Value.of( 2047483),                 modbusTypeFloat32, false, new int[]{0x49f9, 0xefd8}));
        fixtures.add( new Fixture("I64 - F32-",  Int64Value.of(-2047483),                 modbusTypeFloat32, false, new int[]{0xc9f9, 0xefd8}));
        fixtures.add( new Fixture("I64 - I64+",  Int64Value.of(922337203685477L),         modbusTypeInt64,   true,  new int[]{0x0003, 0x46dc, 0x5d63, 0x8865}));
        fixtures.add( new Fixture("I64 - I64-",  Int64Value.of(-218),                     modbusTypeInt64,   true,  new int[]{0xffff, 0xffff, 0xffff, 0xff26}));
        fixtures.add( new Fixture("I64 - I64U",  Int64Value.of(922337203685477L),         modbusTypeInt64U,  true,  new int[]{0x0003, 0x46DC, 0x5D63, 0x8865}));
        fixtures.add( new Fixture("I64 - I32+",  Int64Value.of( 882337203685775807L),     modbusTypeInt64,   false, new int[]{0xC3E,  0xB103, 0x0DCD, 0x59BF}));
        fixtures.add( new Fixture("I64 - I32-",  Int64Value.of(-882337203685775807L),     modbusTypeInt64,   false, new int[]{0xF3C1, 0x4EFC, 0xF232, 0xA641}));
        fixtures.add( new Fixture("I64 - I32U",  Int64Value.of(1222337203685775807L),     modbusTypeInt64U,  false, new int[]{0x10F6, 0x9D35, 0xE56F, 0x59BF}));
        fixtures.add( new Fixture("I64 - I16+",  Int64Value.of(22767),                    modbusTypeInt16,   true,  new int[]{0x58EF}));
        fixtures.add( new Fixture("I64 - I16+",  Int64Value.of(-22767),                   modbusTypeInt16,   true,  new int[]{0xA711}));
        fixtures.add( new Fixture("I64 - I16U",  Int64Value.of(40000),                    modbusTypeInt16U,  true,  new int[]{0x9C40}));
        fixtures.add( new Fixture("I64 - I8+",   Int64Value.of(120),                      modbusTypeInt8,    true,  new int[]{0x0078}));
        fixtures.add( new Fixture("I64 - I8+",   Int64Value.of(-120),                     modbusTypeInt8,    true,  new int[]{0xFF88}));
        fixtures.add( new Fixture("I64 - I8U",   Int64Value.of(220),                      modbusTypeInt8U,   true,  new int[]{0x0DC}));

        fixtures.add( new Fixture("I64U - F64+",  Int64UValue.of(BigInteger.valueOf(7223372036854776000L)),     modbusTypeFloat64, false, new int[]{0x43d9, 0x0fa4, 0xa62c, 0x4e00}));
        fixtures.add( new Fixture("I64U - F64-",  Int64UValue.of(BigInteger.valueOf(-7223372036854776000L)),    modbusTypeFloat64, false, new int[]{0xc3d9, 0x0fa4, 0xa62c, 0x4e00}));
        fixtures.add( new Fixture("I64U - F32+",  Int64UValue.of(BigInteger.valueOf(2047483)),                  modbusTypeFloat32, false, new int[]{0x49f9, 0xefd8}));
        fixtures.add( new Fixture("I64U - F32-",  Int64UValue.of(BigInteger.valueOf(-2047483)),                 modbusTypeFloat32, false, new int[]{0xc9f9, 0xefd8}));
        fixtures.add( new Fixture("I64U - I64+",  Int64UValue.of(BigInteger.valueOf(922337203685477L)),         modbusTypeInt64,   true,  new int[]{0x0003, 0x46dc, 0x5d63, 0x8865}));
        fixtures.add( new Fixture("I64U - I64-",  Int64UValue.of(BigInteger.valueOf(-218)),                     modbusTypeInt64,   true,  new int[]{0xffff, 0xffff, 0xffff, 0xff26}));
        fixtures.add( new Fixture("I64U - I64U",  Int64UValue.of(BigInteger.valueOf(922337203685477L)),         modbusTypeInt64U,  true,  new int[]{0x0003, 0x46dc, 0x5d63, 0x8865}));
        fixtures.add( new Fixture("I64U - I32+",  Int64UValue.of(BigInteger.valueOf(2047483)),                  modbusTypeInt32,   true,  new int[]{0x001F, 0x3DFB}));
        fixtures.add( new Fixture("I64U - I32-",  Int64UValue.of(BigInteger.valueOf(-2047483)),                 modbusTypeInt32,   true,  new int[]{0xFFE0, 0xC205}));
        fixtures.add( new Fixture("I64U - I32U",  Int64UValue.of(BigInteger.valueOf(4147483647L)),              modbusTypeInt32U,  true,  new int[]{0xF735, 0x93FF}));
        fixtures.add( new Fixture("I64U - I16+",  Int64UValue.of(BigInteger.valueOf(22767)),                    modbusTypeInt16,   true,  new int[]{0x58EF}));
        fixtures.add( new Fixture("I64U - I16+",  Int64UValue.of(BigInteger.valueOf(-22767)),                   modbusTypeInt16,   true,  new int[]{0xA711}));
        fixtures.add( new Fixture("I64U - I16U",  Int64UValue.of(BigInteger.valueOf(40000L)),                   modbusTypeInt16U,  true,  new int[]{0x9C40}));
        fixtures.add( new Fixture("I64U - I8+",   Int64UValue.of(BigInteger.valueOf(120L)),                     modbusTypeInt8,    true,  new int[]{0x0078}));
        fixtures.add( new Fixture("I64U - I8+",   Int64UValue.of(BigInteger.valueOf(-120L)),                    modbusTypeInt8,    true,  new int[]{0xFF88}));
        fixtures.add( new Fixture("I64U - I8U",   Int64UValue.of(BigInteger.valueOf(220)),                      modbusTypeInt8U,   true,  new int[]{0x0DC}));

        return fixtures.stream();
    }

    @ParameterizedTest
    @MethodSource("testParams")
    void writeAndReadBackNumbers(Fixture fixture) {

        int[] modbusValue = fixture.testValue.toModbusRegister(fixture.modbusType);
        assertArrayEquals(fixture.modbusValue, modbusValue);

        Value readValue = Value.fromModbusRegister(fixture.modbusType, modbusValue);

        if (fixture.modbusIsInt) {
            assertEquals(fixture.testValue.getInt64(), readValue.getInt64());
        } else {
            assertEquals(fixture.testValue.getFloat32(), readValue.getFloat32());
        }

        LOG.info("Test {}: write={}, read={}", fixture.testName, fixture.testValue.getString(), readValue.getString());
    }


    private static final class ScalingFixture<T> {

        public T  inputVal;
        public Value scaleUpVal;
        public Value scaleDownVal;
        public int mul;
        public int powOf10;

        String testName;

        public ScalingFixture(T inputVal, int mul, int powOf10, Value scaleUpVal, Value scaleDownVal, String testName) {
            this.inputVal = inputVal;
            this.mul = mul;
            this.powOf10 = powOf10;
            this.scaleUpVal = scaleUpVal;
            this.scaleDownVal = scaleDownVal;
            this.testName = testName;
        }

        @Override
        public String toString() {
            return testName;
        }
    }

    private static Stream<ScalingFixture<?>> scalingFixtureStream() {
        List<ScalingFixture<?>> fixtures = new ArrayList<>();
        fixtures.add(new ScalingFixture<>(Float32Value.of(0.0034f), 1, 0, Float32Value.of(0.0034f), Float32Value.of(0.0034f), "F32 - m1 - p0"));
        fixtures.add(new ScalingFixture<>(Float32Value.of(0.0034f), 2, 0, Float32Value.of(0.0068f), Float32Value.of(0.0017f), "F32 - m2 - p1"));
        fixtures.add(new ScalingFixture<>(Float32Value.of(0.0034f), 1, 2, Float32Value.of(0.34f), Float32Value.of(0.000034f),"F32 - m1 - p0" ));

        fixtures.add(new ScalingFixture<>(Float64Value.of(0.84e-2d), 1, 0, Float64Value.of(0.84e-2d), Float64Value.of(0.84e-2d), "F64 - m1 - p0"));
        fixtures.add(new ScalingFixture<>(Float64Value.of(0.84e-2d), 2, 0, Float64Value.of(1.68e-2d), Float64Value.of(0.42e-2d), "F64 - m2 - p1"));
        fixtures.add(new ScalingFixture<>(Float64Value.of(0.84e-2d), 1, 2, Float64Value.of(0.84d), Float64Value.of(0.84e-4d), "F64 - m1 - p0" ));

        fixtures.add(new ScalingFixture<>(Int64Value.of(24000000), 1, 0, Int64Value.of(24000000), Int64Value.of(24000000), "I64 - m1 - p0"));
        fixtures.add(new ScalingFixture<>(Int64Value.of(24000000), 2, 0, Int64Value.of(48000000), Int64Value.of(12000000), "I64 - m2 - p1"));
        fixtures.add(new ScalingFixture<>(Int64Value.of(24000000), 1, 2, Int64Value.of(2400000000L), Int64Value.of(240000), "I64 - m1 - p0" ));

        fixtures.add(new ScalingFixture<>(Int32Value.of(32005), 1, 0, Int32Value.of(32005), Int32Value.of(32005), "I32 - m1 - p0"));
        fixtures.add(new ScalingFixture<>(Int32Value.of(32005), 2, 0, Int32Value.of(64010), Float32Value.of(16002.5f), "I32 - m2 - p1"));
        fixtures.add(new ScalingFixture<>(Int32Value.of(32005), 1, 2, Int32Value.of(3200500), Float32Value.of(320.05f), "I32 - m1 - p0"));

        fixtures.add(new ScalingFixture<>(Int32UValue.of(32005), 1, 0, Int32UValue.of(32005), Int32UValue.of(32005), "I32U - m1 - p0"));
        fixtures.add(new ScalingFixture<>(Int32UValue.of(32005), 2, 0, Int32UValue.of(64010), Float32Value.of(16002.5f), "I32U - m2 - p1"));
        fixtures.add(new ScalingFixture<>(Int32UValue.of(32005), 1, 2, Int32UValue.of(3200500), Float32Value.of(320.05f), "I32U - m1 - p0"));

        fixtures.add(new ScalingFixture<>(Int16Value.of((short)255), 1, 0, Int16Value.of((short)255), Int16Value.of((short)255), "I16 - m1 - p0"));
        fixtures.add(new ScalingFixture<>(Int16Value.of((short)255), 2, 0, Int16Value.of((short)510), Float32Value.of(127.5f), "I16 - m2 - p1"));
        fixtures.add(new ScalingFixture<>(Int16Value.of((short)255), 1, 2, Int16Value.of((short)25500), Float32Value.of(2.55f), "I16 - m1 - p0"));

        fixtures.add(new ScalingFixture<>(Int16UValue.of((short)255), 1, 0, Int16UValue.of((short)255), Int16UValue.of((short)255), "I16U - m1 - p0"));
        fixtures.add(new ScalingFixture<>(Int16UValue.of((short)255), 2, 0, Int16UValue.of((short)510), Float32Value.of(127.5f), "I16U - m2 - p1"));
        fixtures.add(new ScalingFixture<>(Int16UValue.of((short)255), 1, 2, Int16UValue.of((short)25500), Float32Value.of(2.55f), "I16U - m1 - p0"));

        fixtures.add(new ScalingFixture<>(Int8Value.of((byte)35), 1, 0, Int8Value.of((byte)35),   Int8Value.of((byte)35), "I8 - m1 - p0"));
        fixtures.add(new ScalingFixture<>(Int8Value.of((byte)35), 2, 0, Int8Value.of((byte)70),   Float32Value.of(17.5f), "I8 - m2 - p1"));
        fixtures.add(new ScalingFixture<>(Int8Value.of((byte)1), 1, 2,  Int8Value.of((byte)100),  Float32Value.of(0.01f), "I8 - m1 - p0"));

        fixtures.add(new ScalingFixture<>(Int8UValue.of((byte)35), 1, 0, Int8UValue.of((byte)35),   Int8UValue.of((byte)35), "I8U - m1 - p0"));
        fixtures.add(new ScalingFixture<>(Int8UValue.of((byte)35), 2, 0, Int8UValue.of((byte)70),   Float32Value.of(17.5f), "I8U - m2 - p1"));
        fixtures.add(new ScalingFixture<>(Int8UValue.of((byte)1), 1, 2,  Int8UValue.of((byte)100),  Float32Value.of(0.01f),  "I8U - m1 - p0"));

        return fixtures.stream();
    }

    private static Stream<ScalingFixture<Int64UValue>> int64UScalingFixtureStream() {
        List<ScalingFixture<Int64UValue>> fixtures = new ArrayList<>();
        fixtures.add(new ScalingFixture<>(Int64UValue.of(BigInteger.valueOf(24000000)), 1, 0, Int64UValue.of(BigInteger.valueOf(24000000)), Int64UValue.of(BigInteger.valueOf(24000000)), "I64U - m1 - p0"));
        fixtures.add(new ScalingFixture<>(Int64UValue.of(BigInteger.valueOf(24000000)), 2, 0, Int64UValue.of(BigInteger.valueOf(48000000)), Int64UValue.of(BigInteger.valueOf(12000000)), "I64U - m2 - p1"));
        fixtures.add(new ScalingFixture<>(Int64UValue.of(BigInteger.valueOf(24000000)), 1, 2, Int64UValue.of(BigInteger.valueOf(2400000000L)), Int64UValue.of(BigInteger.valueOf(240000)), "I64U - m1 - p0"));
        return  fixtures.stream();
    }

    @ParameterizedTest
    @MethodSource("scalingFixtureStream")
    void scaleUp(ScalingFixture<NumberValue<?>> fixture) {

        NumberValue<?> value = fixture.inputVal;
        Value scaledValue = value.scaleUp(fixture.mul, fixture.powOf10);
        assertEquals(
                String.format("%.4f", fixture.scaleUpVal.getFloat64()),
                String.format("%.4f", scaledValue.getFloat64()));
    }

    @ParameterizedTest
    @MethodSource("scalingFixtureStream")
    void scaleDown(ScalingFixture<NumberValue<?>> fixture) {

        NumberValue<?> value = fixture.inputVal;
        Value scaledValue = value.scaleDown(fixture.mul, fixture.powOf10);
        assertEquals(
                String.format("%.4f", fixture.scaleDownVal.getFloat64()),
                String.format("%.4f", scaledValue.getFloat64()));
    }

    @ParameterizedTest
    @MethodSource("int64UScalingFixtureStream")
    void int64UScaleUp(ScalingFixture<Int64UValue> fixture) {
        Int64UValue value = fixture.inputVal;
        Value scaledValue = value.scaleUp(fixture.mul, fixture.powOf10);
        assertEquals(
                String.format("%.4f", fixture.scaleUpVal.getFloat64()),
                String.format("%.4f", scaledValue.getFloat64()));
    }

    @ParameterizedTest
    @MethodSource("int64UScalingFixtureStream")
    void int64UScaleDown(ScalingFixture<Int64UValue> fixture) {

        Int64UValue value = fixture.inputVal;
        Value scaledValue = value.scaleDown(fixture.mul, fixture.powOf10);
        assertEquals(
                String.format("%.4f", fixture.scaleDownVal.getFloat64()),
                String.format("%.4f", scaledValue.getFloat64()));
    }

}
