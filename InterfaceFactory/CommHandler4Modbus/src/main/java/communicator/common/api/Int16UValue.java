package communicator.common.api;

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
    }

    public static Int16UValue of(int value) {
        return new Int16UValue(value);
    }
}
