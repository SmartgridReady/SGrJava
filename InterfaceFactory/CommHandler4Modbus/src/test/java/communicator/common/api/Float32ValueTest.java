package communicator.common.api;

import com.smartgridready.ns.v0.DataType;
import com.smartgridready.ns.v0.ModbusDataType;
import com.smartgridready.ns.v0.V0Factory;
import communicator.modbus.helper.ConversionHelper;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Float32ValueTest {

    private static final Logger LOG = LoggerFactory.getLogger(Float32ValueTest.class);

    private static final DataType genTypeFloat32 = V0Factory.eINSTANCE.createDataType();
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
        fixtures.add( new Fixture("F32 - F64+",  Float32Value.of( 3.1415927f),            modbusTypeFloat64, false, new int[]{0x4009, 0x21FB, 0x6000, 0x0000})); // 0x6000 0x0000 due to float32 precision
        fixtures.add( new Fixture("F32 - F64-",  Float32Value.of(-3.1415927f),            modbusTypeFloat64, false, new int[]{0xc009, 0x21fb, 0x6000, 0x0000}));
        fixtures.add( new Fixture("F32 - F32+",  Float32Value.of( 3.1415927f),            modbusTypeFloat32, false, new int[]{0x4049, 0x0FDB}));
        fixtures.add( new Fixture("F32 - F32-",  Float32Value.of(-3.1415927f),            modbusTypeFloat32, false, new int[]{0xc049, 0x0fdb}));
        fixtures.add( new Fixture("F32 - I64+",  Float32Value.of(922337203685477.5807f),  modbusTypeInt64,   true,  new int[]{0x0003, 0x46dc, 0x5c00, 0x0000}));
        fixtures.add( new Fixture("F32 - I64-",  Float32Value.of(-218.2345f),             modbusTypeInt64,   true,  new int[]{0xffff, 0xffff, 0xffff, 0xff26}));
        fixtures.add( new Fixture("F32 - I64U",  Float32Value.of(922337203685477f),       modbusTypeInt64U,  true,  new int[]{0x0003, 0x46dc, 0x5c00, 0x0000}));


        return fixtures.stream();
    }

    @ParameterizedTest
    @MethodSource("testParams")
    void writeAndReadBackNumbers(Fixture fixture) {

        int[] modbusValue = fixture.testValue.toModbusRegister(fixture.modbusType, true);
        assertArrayEquals(fixture.modbusValue, modbusValue);

        Value readValue = Value.fromModbusRegister(fixture.modbusType, modbusValue);

        if (fixture.modbusIsInt) {
            assertEquals(fixture.testValue.getInt64(), readValue.getInt64());
        } else {
            assertEquals(fixture.testValue.getFloat32(), readValue.getFloat32());
        }

        LOG.info("Test {}: write={}, read={}", fixture.testName, fixture.testValue.getString(), readValue.getString());
    }

    @Test
    @Ignore
    void basicConversion() {

        // registers to long
        /*
        ByteBuffer bb = ByteBuffer.allocate(8);
        int[] number =  new int[]{0x0000ffff, 0x0000ffff, 0x0000ffff, 0x0000ff26};
        for (int i=0; i<number.length; i++) {
            bb.putShort((short)(number[i] & 0xffff));
        }
        bb.rewind();
        System.out.println(bb.getLong());
        */

        // long to registers
        int[] res = new int[4];
        ByteBuffer bb1 = ByteBuffer.allocate(8);
        bb1.putLong(-218);
        bb1.rewind();
        for (int i=0; i<res.length; i++) {
            res[i] = bb1.getShort() & 0x0000ffff;
        }

        System.out.println(String.format("int[] = %04x %04x %04x %04x", res[0], res[1], res[2], res[3]));

        long val = ConversionHelper.byteBufFromRegisters(res).getLong();
        System.out.println("long: " + val);

    }

}
