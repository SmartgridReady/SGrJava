package communicator.common.api;

public class Float64Value extends NumberValue<Double> {

    private Float64Value(double value) {
        this.value = value;
    }

    @Override
    public void scaleDown(int mul, int powOf10) {
        if (mul != 1 || powOf10 !=0) {
            double dVal = value / mul;
            value = (dVal * Math.pow(10.0, -powOf10));
        }
    }

    @Override
    public void scaleUp(int mul, int powOf10) {
        if (mul !=1 || powOf10 !=0) {
            double dVal = (value * Math.pow(10.0, powOf10));
            value = dVal * mul;
        }
    }

    @Override
    public void absValue() {
        value = Math.abs(value);
    }

    @Override
    public void roundToInt() {
        value = (double)Math.round(value);
    }

    public static Float64Value of(double value) {
        return new Float64Value(value);
    }
}
