package com.smartgridready.communicator.common.api;

import com.smartgridready.communicator.common.api.values.ArrayValue;
import com.smartgridready.communicator.common.api.values.Float32Value;
import com.smartgridready.communicator.common.api.values.Value;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(value = MockitoExtension.class)
class ArrayValueTest {

    private static final Set<Function<Value, Object>> VALUE_GETTERS = new HashSet<>();
    static {
        VALUE_GETTERS.add(Value::getInt8);
        VALUE_GETTERS.add(Value::getInt8U);
        VALUE_GETTERS.add(Value::getInt16);
        VALUE_GETTERS.add(Value::getInt16U);
        VALUE_GETTERS.add(Value::getInt32);
        VALUE_GETTERS.add(Value::getInt32U);
        VALUE_GETTERS.add(Value::getInt64);
        VALUE_GETTERS.add(Value::getInt64U);
        VALUE_GETTERS.add(Value::getFloat32);
        VALUE_GETTERS.add(Value::getFloat64);
    }

    @Mock
    private GenDeviceApi deviceApi;

    @Test
    void arrayValue() throws Exception {

        when(deviceApi.getVal(any(), any())).thenReturn(createArrayValue());

        // API usage:
        // Return the value as regular value type
        Value value = deviceApi.getVal("VoltageAC", "VoltageAC_L1");

        // Still can read the first value of the array as usual
        assertEquals(-1.24f, value.getFloat32());

        // Usage of value as array:
        Value[] arrayValue = value.asArray(); // Will return only the first element for primitive types
                                              // Will return all values for array types

        // Values as float
        assertEquals(-1.24f, arrayValue[0].getFloat32());
        assertEquals(-2.34f, arrayValue[1].getFloat32());

        // Values as double[]
        double[] doubles = Arrays.stream(arrayValue).mapToDouble(Value::getFloat64).toArray();
        assertEquals(-1.24f, doubles[0]);
        assertEquals(-2.34f, doubles[1]);


        // Values as string
        assertEquals("-1.24", arrayValue[0].getString());
        assertEquals("-2.34", arrayValue[1].getString());
    }


    @Test
    void gettersWithValue() {

        VALUE_GETTERS.forEach( getFunction -> {
            var val = ArrayValue.of(Float32Value.of(42));
            var res = getFunction.apply(val);
            assertEquals("42", res.toString().substring(0,2));
        });
    }

    @Test
    void gettersWhenNullValue() {

        VALUE_GETTERS.forEach(getFunction -> {
            var val = ArrayValue.of((Value[]) null);
            var res = getFunction.apply(val);
            if (res != null) {
                assertEquals("0", res.toString().substring(0,1));
            }
        });
    }

    @Test
    void absValue() {

        var arrayValue = createArrayValue();
        arrayValue.absValue();

        assertEquals("1.24", String.format("%.2f", arrayValue.asArray()[0].getFloat32()));
        assertEquals("2.34", String.format("%.2f", arrayValue.asArray()[1].getFloat32()));
    }

    @Test
    void round() {
        var arrayValue = createArrayValue();
        arrayValue.roundToInt();

        assertEquals(-1.0, arrayValue.asArray()[0].getFloat32());
        assertEquals(-2.0, arrayValue.asArray()[1].getFloat32());
    }


    private Value createArrayValue() {

        var val0 = Float32Value.of(-1.24f);
        var val1 = Float32Value.of(-2.34f);

        // new value type, extends from value
        return ArrayValue.of(val0, val1);
    }

}
