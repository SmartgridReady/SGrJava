package communicator.common.api;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Float32Value extends Value {

    private float value;

    private Float32Value(float value) {
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
        Value.checkInt32U((long)value);
        return (long) value;
    }

    @Override
    public long getInt64() {
        Value.checkInt64((long)value);
        return (long) value;
    }

    @Override
    public BigInteger getInt64U() {
        BigDecimal bd = BigDecimal.valueOf(value);
        return bd.setScale(0, RoundingMode.HALF_UP).toBigInteger();
    }

    @Override
    public float getFloat32() {
        return value;
    }

    @Override
    public double getFloat64() {
        return value;
    }

    @Override
    public String getString() {
        return String.format("%f", value);
    }

    @Override
    public void scaleDown(int mul, int powOf10) {
        double dVal = value /  mul;
        dVal = dVal * Math.pow(10.0, -powOf10);
        Value.ceckFloat32(dVal);
        value = (float) dVal;
    }

    @Override
    public void scaleUp(int mul, int powOf10) {
        double dVal = (value * Math.pow(10.0, powOf10));
        dVal = dVal * mul;
        Value.ceckFloat32(dVal);
        value = (float) dVal;
    }

    public static Value of(float value) {
        return new Float32Value(value);
    }
}
