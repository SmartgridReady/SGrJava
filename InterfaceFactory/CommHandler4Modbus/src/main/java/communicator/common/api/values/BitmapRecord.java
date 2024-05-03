package communicator.common.api.values;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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

    @Override
    public boolean equals(Object o) {
        if (this==o) return true;

        if (o==null || getClass()!=o.getClass()) return false;

        BitmapRecord that = (BitmapRecord) o;

        return new EqualsBuilder().append(value, that.value).append(literal, that.literal).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(literal).append(value).toHashCode();
    }
}
