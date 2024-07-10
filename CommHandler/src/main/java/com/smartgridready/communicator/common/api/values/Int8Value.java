package com.smartgridready.communicator.common.api.values;

public class Int8Value extends NumberValue<Byte> {

    private Int8Value(byte value) {
        this.value = value;
    }

    protected void setValue(double value) {
        checkInt8((long) value);
        this.value = (byte)value;
    }

    @Override
    public void absValue() {
        value = (byte)Math.abs(value);
    }

    @Override
    public void roundToInt() {
        // is already int
    }

    public static Int8Value of(byte value) {
        return new Int8Value(value);
    }
}
