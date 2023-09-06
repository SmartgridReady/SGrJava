package communicator.common.api;

public class Int8Value extends NumberValue<Byte> {

    private Int8Value(byte value) {
        this.value = value;
    }

    @Override
    public void scaleDown(int mul, int powOf10) {
        if (mul != 1 || powOf10 !=0) {
            Value.checkInt8(value);
            double dVal = (double) value / mul;
            value = (byte) (dVal * Math.pow(10.0, -powOf10));
        }
    }

    @Override
    public void scaleUp(int mul, int powOf10) {
        if (mul != 1 || powOf10 !=0) {
            double dVal = (value * Math.pow(10.0, powOf10));
            value = (byte) (dVal * mul);
            Value.checkInt8(value);
        }
    }

    @Override
    public void absValue() {
        value = (byte)Math.abs(value);
    }

    @Override
    public void roundToInt() {
    }

    public static Int8Value of(byte value) {
        return new Int8Value(value);
    }
}
