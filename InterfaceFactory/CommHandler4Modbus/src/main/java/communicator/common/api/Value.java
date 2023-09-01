package communicator.common.api;

import com.smartgridready.ns.v0.ModbusDataType;
import com.smartgridready.ns.v0.V0Package;
import communicator.common.helper.DataTypeHelper;
import communicator.modbus.helper.ConversionHelper;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public abstract class Value {

    static final BigInteger UNSIGNED_LONG_MASK = BigInteger.ONE.shiftLeft(Long.SIZE).subtract(BigInteger.ONE);

    abstract public byte getInt8();
    public abstract short getInt8U();
    public abstract short getInt16();
    public abstract int getInt16U();
    public abstract int getInt32();
    public abstract long getInt32U();
    public abstract long getInt64();
    public abstract  BigInteger getInt64U();
    public abstract float getFloat32();
    public abstract double getFloat64();
    public abstract String getString();
    // abstract int[] toModbusRegister(ModbusDataType modbusDataType, boolean bRegisterCmds);

    public abstract void scaleDown(int mul, int powOf10);

    public abstract void scaleUp(int mul, int powOf10);

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

        // TODO add other datatypes

        throw new IllegalArgumentException(String.format("Modbus type %s to Value.class conversion not supported.", DataTypeHelper.getModbusDataType(modbusDataType).getValue()));
    }

    public int[] toModbusRegister(ModbusDataType modbusDataType, boolean bRegisterCmds) {

        if ((modbusDataType.getFloat64() != null)  && bRegisterCmds) {
            return ConversionHelper.doubleToRegisters(getFloat64());
        }

        if ((modbusDataType.getFloat32() != null) && bRegisterCmds) {
            return ConversionHelper.floatToRegisters(getFloat32());
        }

        if ((modbusDataType.getInt64() != null) && bRegisterCmds) {
            return ConversionHelper.longToRegisters(getInt64());
        }

        if ((modbusDataType.getInt64U() != null) && bRegisterCmds) {
            return  ConversionHelper.longToRegisters(getInt64U().longValue());
        }

        if ((modbusDataType.getInt32()) != null && bRegisterCmds) {
            return ConversionHelper.intToRegisters(getInt32());
        }

        throw new IllegalArgumentException(String.format("Float32 to modbus %s conversion not supported.", DataTypeHelper.getModbusDataType(modbusDataType).getValue()));
    }

    static void checkInt8(double value) {
        if (value < Byte.MIN_VALUE || value > Byte.MAX_VALUE) {
            throw new IllegalArgumentException(String.format("Cannot convert value %f to int8. Value out of range", value));
        }
    }

    static void checkInt8U(double value) {
        if (value < 0 || value > 255) {
            throw new IllegalArgumentException(String.format("Cannot convert value %f to int8U. Value out of range", value));
        }
    }

    static void checkInt16(double value) {
        if (value < Short.MIN_VALUE || value > Short.MAX_VALUE) {
            throw new IllegalArgumentException(String.format("Cannot convert value %f to int16. Value out of range", value));
        }
    }

    static void checkInt16U(double value) {
        if (value < 0 || value > 65535) {
            throw new IllegalArgumentException(String.format("Cannot convert value %f to int16U. Value out of range", value));
        }
    }


    static void checkInt32(double value) {
        if (value < Integer.MIN_VALUE || value > Integer.MAX_VALUE) {
            throw new IllegalArgumentException(String.format("Cannot convert value %f to int32. Value out of range", value));
        }
    }

    static void checkInt32U(double value) {
        if (value < 0 || value > 4294967295l) {
            throw new IllegalArgumentException(String.format("Cannot convert value %f to int32U. Value out of range", value));
        }
    }

    static void checkInt64U(BigInteger value) {
        if (value.compareTo(BigInteger.ZERO) < 0  || value.compareTo(new BigInteger("18446744073709551615")) > 0) {
            throw new IllegalArgumentException(String.format("Cannot convert value %f to int64. Value out of range", value));
        }
    }

    static void ceckFloat32(double value) {
        if (value < -Float.MAX_VALUE || value > Float.MAX_VALUE) {
            throw new IllegalArgumentException(String.format("Cannot convert value %f to float32. Value out of range", value));
        }
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
        if (value < 0 && value > 4294967295l) {
            throw new IllegalArgumentException(String.format("Cannot convert value %d to int32U. Value out of range", value));
        }
    }

    static void checkInt64(long value) {
        if (value < Long.MIN_VALUE || value > Long.MAX_VALUE) {
            throw new IllegalArgumentException(String.format("Cannot convert value %d to int64. Value out of range", value));
        }
    }

    static void ceckFloat32(long value) {
        if (value > Float.MIN_VALUE || value < Float.MAX_VALUE) {
            throw new IllegalArgumentException(String.format("Cannot convert value %d to float32. Value out of range", value));
        }
    }

    static Set<Integer> floatFeatureTypes = new HashSet<>(
            V0Package.DATA_TYPE__FLOAT32,
            V0Package.DATA_TYPE__FLOAT64
    );
    static boolean isIntegerType(int feature) {
        return !floatFeatureTypes.contains(feature);
    }
}
