package communicator.common.api;

public class Int16UValue extends NumberValue<Integer> {

    private Int16UValue(int value) {
        this.value = value;
    }

    @Override
    public void scaleDown(int mul, int powOf10) {
        if (mul != 1 || powOf10 !=0) {
            Value.checkInt16U(value);
            double dVal = (double) value / mul;
            value = (int) (dVal * Math.pow(10.0, -powOf10));
        }
    }

    @Override
    public void scaleUp(int mul, int powOf10) {
        if (mul != 1 || powOf10 !=0) {
            double dVal = (value * Math.pow(10.0, powOf10));
            value = (int) (dVal * mul);
            Value.checkInt16U(value);
        }
    }

    @Override
    public void absValue() {
        value = Math.abs(value);
    }

    @Override
    public void roundToInt() {
    }

    public static Int16UValue of(int value) {
        return new Int16UValue(value);
    }

}
