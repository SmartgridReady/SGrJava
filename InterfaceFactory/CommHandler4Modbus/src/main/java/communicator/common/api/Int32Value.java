package communicator.common.api;

public class Int32Value extends NumberValue<Integer> {

    private Int32Value(int value) {
        this.value = value;
    }

    protected void setValue(double value) {
        checkInt32((long)value);
        this.value = (int)value;
    }

    @Override
    public void absValue() {
        value = Math.abs(value);
    }

    @Override
    public void roundToInt() {
        // not available
    }

    public static Int32Value of(int value) {
        return new Int32Value(value);
    }
}
