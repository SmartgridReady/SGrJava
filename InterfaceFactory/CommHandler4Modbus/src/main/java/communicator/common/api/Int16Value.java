package communicator.common.api;

public class Int16Value extends NumberValue<Short> {

    private Int16Value(short value) {
        this.value = value;
    }

    @Override
    public void scaleDown(int mul, int powOf10) {
        if (mul != 1 || powOf10 !=0) {
            Value.checkInt16(value);
            double dVal = (double) value / mul;
            value = (short) (dVal * Math.pow(10.0, -powOf10));
        }
    }

    @Override
    public void scaleUp(int mul, int powOf10) {
        if (mul != 1 || powOf10 !=0) {
            double dVal = (value * Math.pow(10.0, powOf10));
            value = (short) (dVal * mul);
            Value.checkInt16(value);
        }
    }

    public static Value of(short value) {
        return new Int16Value(value);
    }
}
