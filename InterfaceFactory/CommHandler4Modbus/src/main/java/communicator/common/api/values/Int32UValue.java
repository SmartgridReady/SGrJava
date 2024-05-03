package communicator.common.api.values;

public class Int32UValue extends NumberValue<Long> {
    private Int32UValue(long value) {
        this.value = value;
    }

    @Override
    protected void setValue(double value) {
        checkInt32U((long)value);
        this.value = (long)value;
    }

    @Override
    public void absValue() {
        value = Math.abs(value);
    }

    @Override
    public void roundToInt() {
        // is already an int
    }

    public static Int32UValue of(long value) {
        return new Int32UValue(value);
    }
}
