package communicator.common.api;

import com.smartgridready.ns.v0.EnumEntryProductRecord;
import com.smartgridready.ns.v0.EnumMapProduct;

import java.math.BigInteger;
import java.nio.ByteBuffer;

public class EnumValue extends Value {


    private final EnumRecord enumRecord;

    private EnumValue(EnumRecord enumRecord) {
        this.enumRecord = enumRecord;
    }


    @Override
    public Int64Value enumToOrdinalValue(EnumMapProduct enumMapProduct) {

        if (enumRecord.getOrdinal() != null) {
            // validate ordinal
            EnumEntryProductRecord enumEntry = enumMapProduct.getEnumEntry().stream()
                    .filter(rec -> rec.getOrdinal() == enumRecord.getOrdinal())
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException(
                            String.format("Invalid ordinal=%d provided for enum.", enumRecord.getOrdinal())));

            return Int64Value.of(enumEntry.getOrdinal());
        }

        if (enumRecord.getLiteral()!=null) {
            // validate against enumMap and convert
            EnumEntryProductRecord enumEntry = enumMapProduct.getEnumEntry().stream()
                    .filter(rec -> rec.getLiteral().equals(enumRecord.getLiteral()))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException(
                            String.format("Invalid literal=%s provided for enum.", enumRecord.getLiteral())));

            return Int64Value.of(enumEntry.getOrdinal());
        }
        throw new IllegalArgumentException( String.format("Invalid literal=%s provided for enum.", enumRecord.getLiteral()));
    }

    private static EnumValue enumFromOrdinalValue(long ordinalValue, EnumMapProduct enumMapProduct) {

        byte[] hexMask = enumMapProduct.getHexMask();

        if (hexMask == null) {
            hexMask = new byte[]{
                    (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF
            };
        } else if (hexMask.length < 8) {
            byte[] int64Mask = new byte[8];
            System.arraycopy(hexMask, 0, int64Mask, 8 - hexMask.length, hexMask.length);
            hexMask = int64Mask;
        } else if (hexMask.length > 8) {
            byte[] int64Mask = new byte[8];
            System.arraycopy(hexMask, hexMask.length - 8, int64Mask, 0, 8);
            hexMask = int64Mask;
        }

        ordinalValue &= ByteBuffer.wrap(hexMask).getLong();

        for (EnumEntryProductRecord rec : enumMapProduct.getEnumEntry()) {
            if (rec.getOrdinal() == ordinalValue) {
                return EnumValue.of(rec.getLiteral(), (long) rec.getOrdinal(), rec.getDescription());
            }
        }

        return EnumValue.of("UNDEFINED", 0L, String.format("Invalid enumeration ordinal=%d returned from modbus.", ordinalValue));
    }

    @Override
    public byte getInt8() {
        if (enumRecord.getOrdinal() != null) {
            checkInt8(enumRecord.getOrdinal());
            return enumRecord.getOrdinal().byteValue();
        }
        return (byte)-1;
    }

    @Override
    public short getInt8U() {
        if (enumRecord.getOrdinal() != null) {
            checkInt8U(enumRecord.getOrdinal());
            return enumRecord.getOrdinal().shortValue();
        }
        return (short)0;
    }

    @Override
    public short getInt16() {
        if (enumRecord.getOrdinal() != null) {
            checkInt16(enumRecord.getOrdinal());
            return enumRecord.getOrdinal().shortValue();
        }
        return (byte)-1;
    }

    @Override
    public int getInt16U() {
        if (enumRecord.getOrdinal() != null) {
            checkInt16U(enumRecord.getOrdinal());
            return enumRecord.getOrdinal().intValue();
        }
        return (byte)0;
    }

    @Override
    public int getInt32() {
        if (enumRecord.getOrdinal() != null) {
            checkInt32(enumRecord.getOrdinal());
            return enumRecord.getOrdinal().intValue();
        }
        return (byte)-1;
    }

    @Override
    public long getInt32U() {
        if (enumRecord.getOrdinal() != null) {
            checkInt32U(enumRecord.getOrdinal());
            return enumRecord.getOrdinal();
        }
        return (byte)0;
    }

    @Override
    public long getInt64() {
        if (enumRecord.getOrdinal() != null) {
            return enumRecord.getOrdinal();
        }
        return (byte)0;
    }

    @Override
    public BigInteger getInt64U() {
        if (enumRecord.getOrdinal() != null) {
            return BigInteger.valueOf(enumRecord.getOrdinal());
        }
        return null;
    }

    @Override
    public float getFloat32() {
        if (enumRecord.getOrdinal() != null) {
            return enumRecord.getOrdinal();
        }
        return -1;
    }

    @Override
    public double getFloat64() {
        return getFloat32();
    }

    @Override
    public String getString() {
        return enumRecord.getLiteral();
    }

    @Override
    public boolean getBoolean() {
        return false;
    }

    @Override
    public EnumRecord getEnum() {
        return enumRecord;
    }

    @Override
    public void scaleDown(int mul, int powOf10) {
        // not available
    }

    @Override
    public void scaleUp(int mul, int powOf10) {
        // not available
    }

    @Override
    public void absValue() {
        // not available
    }

    @Override
    public void roundToInt() {
        // not available
    }

    public static EnumValue of(String literal) {
        return of(literal, null, null);
    }

    public static EnumValue of(long ordinal) {
        return of(null, ordinal, null);
    }

    public static EnumValue of(String literal, Long ordinal, String description) {
        return new EnumValue(new EnumRecord(literal, ordinal, description));
    }

    public static EnumValue of(Long ordinal, EnumMapProduct enumMapProduct) {
        return enumFromOrdinalValue(ordinal, enumMapProduct);
    }

    @Override
    public String toString() {
        return enumRecord.toString();
    }
}
