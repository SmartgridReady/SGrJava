package communicator.common.api;

import com.smartgridready.ns.v0.ModbusDataType;
import com.smartgridready.ns.v0.V0Factory;
import communicator.common.api.values.StringValue;
import communicator.common.api.values.Value;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS) // Needed to have a non static @MethodSource
class StringValueTest {

    private static final ModbusDataType modbusDataTypeString = V0Factory.eINSTANCE.createModbusDataType();
    static { modbusDataTypeString.setString(V0Factory.eINSTANCE.createEmptyType());
    }

    final static class Fixture {
        String strValue;
        Number expectedValue;
        Supplier<Number> getFunction;

        public Fixture(String strValue, Number expectedValue, Supplier<Number> getFunction) {
            this.strValue = strValue;
            this.expectedValue = expectedValue;
            this.getFunction = getFunction;
        }

        @Override
        public String toString() {
            return  strValue;
        }
    }

    @Test
    void modbusReadWrite() {

        final int[] modbusVal = new int[]{0x4865, 0x6C6C, 0x6F40,0x5347, 0x7200};

        StringValue value = StringValue.of("Hello@SGr");
        int[] modbusRes = value.toModbusRegister(modbusDataTypeString);
        assertArrayEquals(modbusVal, modbusRes);

        Value resVal = Value.fromModbusRegister(modbusDataTypeString, modbusRes);
        assertTrue(resVal instanceof StringValue);
        assertEquals("Hello@SGr", resVal.getString());
    }

    private StringValue value;

    private Stream<Fixture> getConversions() {

        List<Fixture> fixtureList = new ArrayList<>();
        fixtureList.add(new Fixture("3.14159", 3.14159f, () -> value.getFloat32()));
        fixtureList.add(new Fixture("3.14159e10", 3.14159e10d, () -> value.getFloat64()));
        fixtureList.add(new Fixture("-9",    (byte)-9,   () -> value.getInt8()));
        fixtureList.add(new Fixture("17",    (short)17,  () -> value.getInt8U()));
        fixtureList.add(new Fixture("125",   (short)125, () -> value.getInt16()));
        fixtureList.add(new Fixture("244",   244,   () -> value.getInt16U()));
        fixtureList.add(new Fixture("44000", 44000, () -> value.getInt32()));
        fixtureList.add(new Fixture("88000", 88000L,   () -> value.getInt32U()));
        fixtureList.add(new Fixture("55544000", 55544000L, () -> value.getInt64()));
        fixtureList.add(new Fixture("6688000", new BigInteger("6688000"),   () -> value.getInt64U()));
        return fixtureList.stream();
    }

    @ParameterizedTest
    @MethodSource("getConversions")
    void convertToNumber(Fixture fixture) {

        value = StringValue.of(fixture.strValue);
        Number resVal = fixture.getFunction.get();
        assertEquals(fixture.expectedValue, resVal);
    }

    private Stream<Fixture> scaleDowns() {
        List<Fixture> fixtureList = new ArrayList<>();
        fixtureList.add(new Fixture("1000", 0.5f, () -> value.getFloat32()));
        fixtureList.add(new Fixture("2000", 1.0d, () -> value.getFloat64()));
        return fixtureList.stream();
    }

    @ParameterizedTest
    @MethodSource("scaleDowns")
    void scaleDown(Fixture fixture) {

        value = StringValue.of(fixture.strValue);
        value.scaleDown(2, 3);
        Number resVal = fixture.getFunction.get();
        assertEquals(fixture.expectedValue, resVal);

    }

    private Stream<Fixture> scaleUps() {
        List<Fixture> fixtureList = new ArrayList<>();
        fixtureList.add(new Fixture("1000", 2000000.0f, () -> value.getFloat32()));
        fixtureList.add(new Fixture("2000", 4000000.0d, () -> value.getFloat64()));
        return fixtureList.stream();
    }

    @ParameterizedTest
    @MethodSource("scaleUps")
    void scaleUp(Fixture fixture) {

        value = StringValue.of(fixture.strValue);
        value.scaleUp(2, 3);
        Number resVal = fixture.getFunction.get();
        assertEquals(fixture.expectedValue, resVal);
    }

    @Test
    void absValue() {
        value = StringValue.of("-3.14159");
        value.absValue();
        assertEquals(3.14159f, value.getFloat32());
    }
}
