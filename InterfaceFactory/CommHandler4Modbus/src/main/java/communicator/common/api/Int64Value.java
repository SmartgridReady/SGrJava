package communicator.common.api;

import java.math.BigInteger;

public class Int64Value extends Value {

    private long value;

    private Int64Value(long value) {
        this.value = value;
    }

    @Override
    public byte getInt8() {
        Value.checkInt8(value);
        return (byte) value;
    }

    @Override
    public short getInt8U() {
        Value.checkInt8U(value);
        return (short) value;
    }

    @Override
    public short getInt16() {
        Value.checkInt16(value);
        return (short) value;
    }

    @Override
    public int getInt16U() {
        Value.checkInt16U(value);
        return (int) value;
    }

    @Override
    public int getInt32() {
        Value.checkInt32(value);
        return (int) value;
    }

    @Override
    public long getInt32U() {
        Value.checkInt32U(value);
        return value;
    }

    @Override
    public long getInt64() {
        return value;
    }

    @Override
    public BigInteger getInt64U() {
        return BigInteger.valueOf(value);
    }

    @Override
    public float getFloat32() {
        Value.ceckFloat32(value);
        return value;
    }

    @Override
    public double getFloat64() {
        return value;
    }

    @Override
    public String getString() {
        return String.format("%d", value);
    }

    @Override
    public void scaleDown(int mul, int powOf10) {
        double dVal = (double) value /  mul;
        value = (long) (dVal * Math.pow(10.0, -powOf10));
    }

    @Override
    public void scaleUp(int mul, int powOf10) {
        double dVal = (value * Math.pow(10.0, powOf10));
        value = (long) dVal * mul;
    }

    public static Value of(long value) {
        return new Int64Value(value);
    }
}
