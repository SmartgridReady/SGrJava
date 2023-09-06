package communicator.common.api;

public class Int64Value extends NumberValue<Long> {

    private Int64Value(long value) {
        this.value = value;
    }

    @Override
    public void scaleDown(int mul, int powOf10) {
        if (mul != 1 || powOf10 !=0) {
            double dVal = (double) value / mul;
            value = (long) (dVal * Math.pow(10.0, -powOf10));
        }
    }

    @Override
    public void scaleUp(int mul, int powOf10) {
        if (mul != 1 || powOf10 !=0) {
            double dVal = (value * Math.pow(10.0, powOf10));
            value = (long) dVal * mul;
        }
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
