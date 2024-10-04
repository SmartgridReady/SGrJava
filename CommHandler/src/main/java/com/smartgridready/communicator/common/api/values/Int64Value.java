package com.smartgridready.communicator.common.api.values;

public class Int64Value extends NumberValue<Long> {

    private Int64Value(long value) {
        this.value = value;
    }

    @Override
    protected void setValue(double value) {
        this.value = (long)value;
    }

    @Override
    public void absValue() {
        value = Math.abs(value);
    }

    @Override
    public void roundToInt() {
        // is already int
    }

    public static Int64Value of(long value) {
        return new Int64Value(value);
    }
}
