package communicator.common.api;

import com.smartgridready.ns.v0.V0Package;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public abstract class NumberValue<T extends Number> extends Value {

    protected T value;
    @Override
    public byte getInt8() {
        Value.checkInt8(value.longValue());
        return value.byteValue();
    }

    @Override
    public short getInt8U() {
        Value.checkInt8U(value.longValue());
        return value.shortValue();
    }

    @Override
    public short getInt16() {
        Value.checkInt16(value.longValue());
        return value.shortValue();
    }

    @Override
    public int getInt16U() {
        Value.checkInt16U(value.longValue());
        return value.intValue();
    }

    @Override
    public int getInt32() {
        Value.checkInt32(value.longValue());
        return value.intValue();
    }

    @Override
    public long getInt32U() {
        Value.checkInt32U(value.longValue());
        return value.longValue();
    }

    @Override
    public long getInt64() {
        return value.longValue();
    }

    @Override
    public BigInteger getInt64U() {
        if (value instanceof BigInteger) {
            return (BigInteger) value;
        } else if (value instanceof  Float || value instanceof Double) {
            BigDecimal bd = BigDecimal.valueOf(value.doubleValue());
            return bd.toBigInteger().and(UNSIGNED_LONG_MASK);
        } else {
            return BigInteger.valueOf(value.longValue());
        }
    }

    @Override
    public float getFloat32() {
        Value.ceckFloat32(value.floatValue());
        return value.floatValue();
    }

    @Override
    public double getFloat64() {
        return value.doubleValue();
    }

    @Override
    public String getString() {
        return value.toString();
    }

    public String toString() {
        return getString();
    }

    static Set<Integer> floatFeatureTypes = new HashSet<>(
            V0Package.DATA_TYPE__FLOAT32,
            V0Package.DATA_TYPE__FLOAT64
    );
    static boolean isIntegerType(int feature) {
        return !floatFeatureTypes.contains(feature);
    }
}
