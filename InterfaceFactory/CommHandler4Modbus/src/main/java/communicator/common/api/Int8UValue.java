package communicator.common.api;

public class Int8UValue extends NumberValue<Short> {

    private Int8UValue(short value) {
        this.value = value;
    }

    @Override
    protected void setValue(double value) {
        checkInt8U((long) value);
        this.value = (short)value;
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
