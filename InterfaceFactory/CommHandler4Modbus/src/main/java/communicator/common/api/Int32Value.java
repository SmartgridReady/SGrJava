package communicator.common.api;

public class Int32Value extends NumberValue<Integer> {

    private Int32Value(int value) {
        this.value = value;
    }

    @Override
    public void scaleDown(int mul, int powOf10) {
        if (mul != 1 || powOf10 !=0) {
            Value.checkInt32(value);
            double dVal = (double) value / mul;
            value = (int) (dVal * Math.pow(10.0, -powOf10));
        }
    }

    @Override
    public void scaleUp(int mul, int powOf10) {
        if (mul != 1 || powOf10 !=0) {
            double dVal = (value * Math.pow(10.0, powOf10));
            value = (int) dVal * mul;
            Value.checkInt32(value);
        }
    }

    public static Value of(int value) {
        return new Int32Value(value);
    }
}
