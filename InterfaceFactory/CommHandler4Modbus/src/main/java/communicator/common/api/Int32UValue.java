package communicator.common.api;

public class Int32UValue extends NumberValue<Long> {
    private Int32UValue(long value) {
        this.value = value;
    }

    @Override
    public void scaleDown(int mul, int powOf10) {
        if (mul != 1 || powOf10 !=0) {
            Value.checkInt32U(value);
            double dVal = (double) value / mul;
            value = (long) (dVal * Math.pow(10.0, -powOf10));
        }
    }

    @Override
    public void scaleUp(int mul, int powOf10) {
        if (mul != 1 || powOf10 !=0) {
            double dVal = (value * Math.pow(10.0, powOf10));
            value = (long) dVal * mul;
            Value.checkInt32U(value);
        }
    }

    @Override
    public void absValue() {
        value = Math.abs(value);
    }

    @Override
    public void roundToInt() {
    }

    public static Int32UValue of(long value) {
        return new Int32UValue(value);
    }
}
