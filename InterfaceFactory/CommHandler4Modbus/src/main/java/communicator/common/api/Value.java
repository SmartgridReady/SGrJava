package communicator.common.api;

import com.smartgridready.ns.v0.ModbusDataType;
import communicator.common.helper.DataTypeHelper;
import communicator.modbus.helper.ConversionHelper;

import java.math.BigInteger;

public abstract class Value {
    public static final BigInteger UNSIGNED_LONG_MASK = BigInteger.ONE.shiftLeft(Long.SIZE).subtract(BigInteger.ONE);

    public abstract byte getInt8();
    public abstract short getInt8U();
    public abstract short getInt16();
    public abstract int getInt16U();
    public abstract int getInt32();
    public abstract long getInt32U();
    public abstract long getInt64();
    public abstract BigInteger getInt64U();
    public abstract float getFloat32();
    public abstract double getFloat64();
    public abstract String getString();
    public abstract void scaleDown(int mul, int powOf10);
    public abstract void scaleUp(int mul, int powOf10);

    public int[] toModbusRegister(ModbusDataType modbusDataType, boolean bRegisterCmds) {

        if (bRegisterCmds) {
             return convertToNumberToModbusRegister(modbusDataType);
        }
        throw new IllegalArgumentException(
        String.format("Value to modbus type %s conversion not supported.",
                DataTypeHelper.getModbusDataType(modbusDataType).getValue()));
    }

    private int[] convertToNumberToModbusRegister(ModbusDataType modbusDataType) {

        if (modbusDataType.getFloat64()!=null) {
            return ConversionHelper.doubleToRegisters(getFloat64());
        }
        if (modbusDataType.getFloat32()!=null) {
            return ConversionHelper.floatToRegisters(getFloat32());
        }
        if (modbusDataType.getInt64()!=null) {
            return ConversionHelper.longToRegisters(getInt64());
        }
        if (modbusDataType.getInt64U()!=null) {
            return ConversionHelper.unsignedLongToRegister(getInt64U());
        }
        if (modbusDataType.getInt32()!=null) {
            return ConversionHelper.intToRegisters(getInt32());
        }
        if (modbusDataType.getInt32U()!=null) {
            return ConversionHelper.uintToRegisters(getInt32U());
        }
        if (modbusDataType.getInt16()!=null) {
            return ConversionHelper.shortToRegister(getInt16());
        }
        if (modbusDataType.getInt16U()!=null) {
            return ConversionHelper.shortToRegister((short) getInt16U());
        }
        if (modbusDataType.getInt8()!=null) {
            return ConversionHelper.shortToRegister(getInt8());
        }
        if (modbusDataType.getInt8U()!=null) {
            return ConversionHelper.shortToRegister(getInt8U());
        }

        throw new IllegalArgumentException(
                String.format("Number conversion to modbus type %s conversion not supported.",
                        DataTypeHelper.getModbusDataType(modbusDataType).getValue()));
    }

    public static Value fromModbusRegister(ModbusDataType modbusDataType, int[] buffer) {

        if (modbusDataType.getFloat64() != null) {
            return Float64Value.of(ConversionHelper.byteBufFromRegisters(buffer).getDouble());
        }
        if (modbusDataType.getFloat32() != null) {
            return Float32Value.of(ConversionHelper.byteBufFromRegisters(buffer).getFloat());
        }
        if (modbusDataType.getInt64() != null) {
            return Int64Value.of(ConversionHelper.byteBufFromRegisters(buffer).getLong());
        }
        if (modbusDataType.getInt64U() != null) {
            long signedLong = ConversionHelper.byteBufFromRegisters(buffer).getLong();
            return Int64UValue.of(BigInteger.valueOf(signedLong).and(UNSIGNED_LONG_MASK));
        }
        if (modbusDataType.getInt32() != null) {
            return Int32Value.of(ConversionHelper.byteBufFromRegisters(buffer).getInt());
        }
        if (modbusDataType.getInt32U() != null) {
            return Int32UValue.of(Integer.toUnsignedLong(ConversionHelper.byteBufFromRegisters(buffer).getInt()));
        }
        if (modbusDataType.getInt16() != null) {
            return Int16Value.of(ConversionHelper.byteBufFromRegisters(buffer).getShort());
        }
        if (modbusDataType.getInt16U() != null) {
            return Int16UValue.of(ConversionHelper.byteBufFromRegisters(buffer).getShort() & 0xFFFF);
        }
        if (modbusDataType.getInt8() != null) {
            return Int8Value.of((byte)ConversionHelper.byteBufFromRegisters(buffer).getShort());
        }
        if (modbusDataType.getInt8U() != null) {
            return Int8UValue.of(ConversionHelper.byteBufFromRegisters(buffer).getShort());
        }

        throw new IllegalArgumentException(String.format("Modbus type %s to Value.class conversion not supported.", DataTypeHelper.getModbusDataType(modbusDataType).getValue()));
    }

    static void checkInt8(long value) {
        if (value < Byte.MIN_VALUE || value > Byte.MAX_VALUE) {
            throw new IllegalArgumentException(String.format("Cannot convert value %d to int8. Value out of range", value));
        }
    }

    static void checkInt8U(long value) {
        if (value < 0 || value > 255) {
            throw new IllegalArgumentException(String.format("Cannot convert value %d to int8U. Value out of range", value));
        }
    }

    static void checkInt16(long value) {
        if (value < Short.MIN_VALUE || value > Short.MAX_VALUE) {
            throw new IllegalArgumentException(String.format("Cannot convert value %d to int16. Value out of range", value));
        }
    }

    static void checkInt16U(long value) {
        if (value < 0 || value > 65535) {
            throw new IllegalArgumentException(String.format("Cannot convert value %d to int16U. Value out of range", value));
        }
    }

    static void checkInt32(long value) {
        if (value < Integer.MIN_VALUE || value > Integer.MAX_VALUE) {
            throw new IllegalArgumentException(String.format("Cannot convert value %d to int32. Value out of range", value));
        }
    }

    static void checkInt32U(long value) {
        if (value < 0 || value > 4294967295L) {
            throw new IllegalArgumentException(String.format("Cannot convert value %d to int32U. Value out of range", value));
        }
    }

    static void checkInt64(BigInteger value) {
        if (value.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0  || value.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
            throw new IllegalArgumentException(String.format("Cannot convert value %d to int64. Value out of range", value));
        }
    }

    static void checkInt64U(BigInteger value) {
        if (value.compareTo(BigInteger.ZERO) < 0  || value.compareTo(new BigInteger("18446744073709551615")) > 0) {
            throw new IllegalArgumentException(String.format("Cannot convert value %f to int64. Value out of range", value.doubleValue()));
        }
    }

    static void ceckFloat32(double value) {
        if (value < -Float.MAX_VALUE || value > Float.MAX_VALUE) {
            throw new IllegalArgumentException(String.format("Cannot convert value %f to float32. Value out of range", value));
        }
    }
}
