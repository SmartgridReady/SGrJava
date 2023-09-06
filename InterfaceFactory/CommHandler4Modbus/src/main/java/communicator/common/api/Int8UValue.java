package communicator.common.api;

public class Int8UValue extends NumberValue<Short> {

    private Int8UValue(short value) {
        this.value = value;
    }

    @Override
    public void scaleDown(int mul, int powOf10) {
        if (mul != 1 || powOf10 !=0) {
            Value.checkInt8U(value);
            double dVal = (double) value / mul;
            value = (short) (dVal * Math.pow(10.0, -powOf10));
        }
    }

    @Override
    public void scaleUp(int mul, int powOf10) {
        if (mul != 1 || powOf10 !=0) {
            double dVal = (value * Math.pow(10.0, powOf10));
            value = (short) (dVal * mul);
            Value.checkInt8U(value);
        }
    }

    @Override
    public void absValue() {
        value = (short)Math.abs(value);
    }

    @Override
    public void roundToInt() {
        // is already an int
    }

    public static Int8UValue of(short value) {
        return new Int8UValue(value);
    }
}
