package communicator.common.api;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

public abstract class NumberValue<T extends Number> extends Value {

    protected T value;
    @Override
    public byte getInt8() {
        checkInt8(value.longValue());
        return value.byteValue();
    }

    @Override
    public short getInt8U() {
        checkInt8U(value.longValue());
        return value.shortValue();
    }

    @Override
    public short getInt16() {
        checkInt16(value.longValue());
        return value.shortValue();
    }

    @Override
    public int getInt16U() {
        checkInt16U(value.longValue());
        return value.intValue();
    }

    @Override
    public int getInt32() {
        checkInt32(value.longValue());
        return value.intValue();
    }

    @Override
    public long getInt32U() {
        checkInt32U(value.longValue());
        return value.longValue();
    }

    @Override
    public boolean getBoolean() {
        return value.longValue() != 0;
    }

    @Override
    public EnumRecord getEnum() {
        throw new UnsupportedOperationException("Cannot convert numeric value to an enum.");
    }

    @Override
    public Map<String, Boolean> getBitmap() {
        throw new UnsupportedOperationException("Cannot convert numeric value to a bitmap.");
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
        checkFloat32(value.floatValue());
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
       return value.toString();
    }

    public NumberValue scaleDown(int mul, int powOf10) {

        if (mul != 1 || powOf10 !=0) {
            double dVal = value.doubleValue() / mul;
            return Float64Value.of(dVal * Math.pow(10.0, -powOf10));
        }
        return this;
    }

    public NumberValue scaleUp(int mul, int powOf10) {
        if(mul != 1 || powOf10 != 0) {
            double dVal = value.doubleValue() * Math.pow(10.0, powOf10);
            return Float64Value.of(dVal * mul);
        }
        return this;
    }

    protected abstract void setValue(double value);
}
