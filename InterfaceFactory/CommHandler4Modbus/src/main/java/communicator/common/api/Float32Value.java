package communicator.common.api;

public class Float32Value extends NumberValue<Float> {

    private Float32Value(float value) {
        this.value = value;
    }

    @Override
    public void scaleDown(int mul, int powOf10) {
        if (mul != 1 || powOf10 !=0) {
            double dVal = value / mul;
            dVal = dVal * Math.pow(10.0, -powOf10);
            Value.ceckFloat32(dVal);
            value = (float) dVal;
        }
    }

    @Override
    public void scaleUp(int mul, int powOf10) {
        if (mul != 1 || powOf10 != 0) {
            double dVal = (value * Math.pow(10.0, powOf10));
            dVal = dVal * mul;
            Value.ceckFloat32(dVal);
            value = (float) dVal;
        }
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
