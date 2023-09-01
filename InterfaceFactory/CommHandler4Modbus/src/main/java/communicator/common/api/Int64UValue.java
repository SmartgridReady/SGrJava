package communicator.common.api;

import com.smartgridready.ns.v0.ModbusDataType;
import communicator.common.helper.DataTypeHelper;
import communicator.modbus.helper.ConversionHelper;

import java.math.BigInteger;

public class Int64UValue extends Value {

    BigInteger value;

    public Int64UValue(BigInteger value) {
        this.value = value;
    }

    @Override
    public byte getInt8() {
        Value.checkInt8(value.longValue());
        return (byte)value.longValue();
    }

    @Override
    public short getInt8U() {
        Value.checkInt8U(value.longValue());
        return (short)value.longValue();
    }

    @Override
    public short getInt16() {
        Value.checkInt16(value.longValue());
        return (short)value.longValue();
    }

    @Override
    public int getInt16U() {
        Value.checkInt16U(value.longValue());
        return (int)value.longValue();
    }

    @Override
    public int getInt32() {
        Value.checkInt32(value.longValue());
        return (int)value.longValue();
    }

    @Override
    public long getInt32U() {
        Value.checkInt32U(value.longValue());
        return (int)value.longValue();
    }

    @Override
    public long getInt64() {
        Value.checkInt64(value.longValue());
        return value.longValue();
    }

    @Override
    public BigInteger getInt64U() {
        Value.checkInt64U(value);
        return value;
    }

    @Override
    public float getFloat32() {
        Value.ceckFloat32(value.doubleValue());
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

    @Override
    public void scaleDown(int mul, int powOf10) {
        BigInteger val = value.divide(BigInteger.valueOf(mul));
        val = val.multiply(BigInteger.valueOf((long)Math.pow(10.0, -powOf10)));
        Value.checkInt64U(val);
        value = val;
    }

    @Override
    public void scaleUp(int mul, int powOf10) {
        BigInteger val = value.multiply(BigInteger.valueOf(mul));
        val = val.multiply(BigInteger.valueOf((long)Math.pow(10.0, powOf10)));
        Value.checkInt64U(val);
        value = val;
    }

    public static Value of(BigInteger value) {
        return new Int64UValue(value);
    }
}
