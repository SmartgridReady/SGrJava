package communicator.common.api.values;

public class Float64Value extends NumberValue<Double> {

    private Float64Value(double value) {
        this.value = value;
    }

    protected void setValue(double value) {
        this.value = value;
    }

    @Override
    public void absValue() {
        value = Math.abs(value);
    }

    @Override
    public void roundToInt() {
        value = (double)Math.round(value);
    }

    public static Float64Value of(double value) {
        return new Float64Value(value);
    }
}
