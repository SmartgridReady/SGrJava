package communicator.common.api;

import java.math.BigInteger;

public class EnumValue extends Value {


    static class EnumRecord {

        private final String literal;
        private final long ordinal;
        private final String description;

        public EnumRecord(String literal, long ordinal, String description) {
            this.literal = literal;
            this.ordinal = ordinal;
            this.description = description;
        }

        public String getLiteral() {
            return literal;
        }

        public long getOrdinal() {
            return ordinal;
        }

        public String getDescription() {
            return description;
        }
    }

    private final EnumRecord enumRecord;

    private EnumValue(EnumRecord enumRecord) {
        this.enumRecord = enumRecord;
    }


    @Override
    public byte getInt8() {
        return 0;
    }

    @Override
    public short getInt8U() {
        return 0;
    }

    @Override
    public short getInt16() {
        return 0;
    }

    @Override
    public int getInt16U() {
        return 0;
    }

    @Override
    public int getInt32() {
        return 0;
    }

    @Override
    public long getInt32U() {
        return 0;
    }

    @Override
    public long getInt64() {
        return 0;
    }

    @Override
    public BigInteger getInt64U() {
        return null;
    }

    @Override
    public float getFloat32() {
        return 0;
    }

    @Override
    public double getFloat64() {
        return 0;
    }

    @Override
    public String getString() {
        return null;
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

    }

    @Override
    public void scaleUp(int mul, int powOf10) {

    }

    @Override
    public void absValue() {

    }

    @Override
    public void roundToInt() {
    }

    public static EnumValue of(String literal, long ordinal, String description) {
        return new EnumValue(new EnumRecord(literal, ordinal, description));
    }
}
