package com.smartgridready.communicator.common.api.values;

public class Float32Value extends NumberValue<Float> {

    private Float32Value(float value) {
        this.value = value;
    }


    @Override
    protected void setValue(double value) {
        checkFloat32(value);
        this.value = (float)value;
    }

    @Override
    public void absValue() {
        value = Math.abs(value);
    }

    @Override
    public void roundToInt() {
        value = (float)Math.round(value);
    }

    public static Float32Value of(float value) {
        return new Float32Value(value);
    }


}
