package com.smartgridready.communicator.common.api;

import com.smartgridready.ns.v0.ModbusBoolean;
import com.smartgridready.ns.v0.ModbusDataType;
import com.smartgridready.communicator.common.api.values.BooleanValue;
import com.smartgridready.communicator.common.api.values.Value;
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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS) // Needed to have a non static @MethodSource
class BooleanValueTest {

    private static final ModbusDataType modbusDataTypeBoolean = new ModbusDataType();
    static { modbusDataTypeBoolean.setBoolean(new ModbusBoolean());}

    private Value value;

    private static final class NumericFixture {

        boolean writeVal;
        Number readVal;
        Supplier<Number> getFunction;

        public NumericFixture(boolean writeVal, Number readVal, Supplier<Number> getFunction) {
            this.writeVal = writeVal;
            this.readVal = readVal;
            this.getFunction = getFunction;
        }
    }


    final Stream<NumericFixture> numericFunctions() {

        List<NumericFixture> fixtures = new ArrayList<>();
        fixtures.add(new NumericFixture(true, (byte)1, () -> value.getInt8()));
        fixtures.add(new NumericFixture(false, (byte)0, () -> value.getInt8()));
        fixtures.add(new NumericFixture(true,  (short)1, () -> value.getInt8U()));
        fixtures.add(new NumericFixture(false, (short)0, () -> value.getInt8U()));
        fixtures.add(new NumericFixture(true, (short)1, () -> value.getInt16()));
        fixtures.add(new NumericFixture(false, (short)0, () -> value.getInt16()));
        fixtures.add(new NumericFixture(true,  1, () -> value.getInt16U()));
        fixtures.add(new NumericFixture(false, 0, () -> value.getInt16U()));
        fixtures.add(new NumericFixture(true,  1, () -> value.getInt32()));
        fixtures.add(new NumericFixture(false, 0, () -> value.getInt32()));
        fixtures.add(new NumericFixture(true,  1L, () -> value.getInt32U()));
        fixtures.add(new NumericFixture(false, 0L, () -> value.getInt32U()));
        fixtures.add(new NumericFixture(true,  1L, () -> value.getInt64()));
        fixtures.add(new NumericFixture(false, 0L, () -> value.getInt64()));
        fixtures.add(new NumericFixture(true,  BigInteger.ONE,  () -> value.getInt64U()));
        fixtures.add(new NumericFixture(false, BigInteger.ZERO, () -> value.getInt64U()));
        return fixtures.stream();
    }

    @ParameterizedTest
    @MethodSource("numericFunctions")
    void conversionTest(NumericFixture fixture) {
        value = BooleanValue.of(fixture.writeVal);
        Number res = fixture.getFunction.get();
        assertEquals(fixture.readVal, res);
    }

    @Test
    void stringConversion() {
        value = BooleanValue.of(true);
        assertEquals("true", value.getString());

        value = BooleanValue.of(false);
        assertEquals("false", value.getString());
    }

    @Test
    void fromModbusConversion() {

        Value val = Value.fromDiscreteInput(modbusDataTypeBoolean, new boolean[]{true} );
        assertTrue(val.getBoolean());

        val = Value.fromDiscreteInput(modbusDataTypeBoolean, new boolean[]{false} );
        assertFalse(val.getBoolean());

        val = Value.fromModbusRegister(modbusDataTypeBoolean, new int[]{0x1});
        assertTrue(val.getBoolean());

        val = Value.fromModbusRegister(modbusDataTypeBoolean, new int[]{0x0});
        assertFalse(val.getBoolean());

    }

    @Test
    void toModbusConversion() {

        Value val = BooleanValue.of(true);
        assertArrayEquals(new byte[]{(byte)0x01}, val.toModbusDiscreteVal(modbusDataTypeBoolean));

        val = BooleanValue.of(false);
        assertArrayEquals(new byte[]{(byte)0x00}, val.toModbusDiscreteVal(modbusDataTypeBoolean));

        val = BooleanValue.of(true);
        assertArrayEquals(new int[]{1}, val.toModbusRegister(modbusDataTypeBoolean));

        val = BooleanValue.of(false);
        assertArrayEquals(new int[]{0}, val.toModbusRegister(modbusDataTypeBoolean));
    }
}
