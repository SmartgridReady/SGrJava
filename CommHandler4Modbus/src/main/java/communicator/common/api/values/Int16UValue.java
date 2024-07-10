package communicator.common.api.values;

public class Int16UValue extends NumberValue<Integer> {

    private Int16UValue(int value) {
        this.value = value;
    }

    @Override
    protected void setValue(double value) {
        checkInt16U((long) value);
        this.value = (int)value;
    }

    @Override
    public void absValue() {
        value = Math.abs(value);
    }

    @Override
    public void roundToInt() {
        // is already an int
    }

    public static Int16UValue of(int value) {
        return new Int16UValue(value);
    }
}
