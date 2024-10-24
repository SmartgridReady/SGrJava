package com.smartgridready.communicator.common.api.values;

public class Int16Value extends NumberValue<Short> {

    private Int16Value(short value) {
        this.value = value;
    }

    @Override
    protected void setValue(double value) {
        checkInt16((long) value);
        this.value = (short)value;
    }

    @Override
    public Int16Value[] asArray() {
        return new Int16Value[]{this};
    }

    @Override
    public void absValue() {
        value = (short)Math.abs(value);
    }

    @Override
    public void roundToInt() {
        // not available
    }

    public static Int16Value of(short value) {
        return new Int16Value(value);
    }
}
