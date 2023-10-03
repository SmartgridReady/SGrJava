package communicator.common.api;

public class BitmapRecord {

    String literal;
    boolean value;
    String description;

    public BitmapRecord(String literal, boolean value, String description) {
        this.literal = literal;
        this.value = value;
        this.description = description;
    }

    public String getLiteral() {
        return literal;
    }

    public boolean getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return (literal!=null ? literal:"undef")
                + ":" + value
                + " | " + (description!=null ? description:"");
    }
}
