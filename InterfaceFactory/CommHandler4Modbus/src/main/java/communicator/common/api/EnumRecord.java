package communicator.common.api;

public class EnumRecord {

    private final String literal;
    private final Long ordinal;
    private final String description;

    public EnumRecord(String literal, Long ordinal, String description) {
        this.literal = literal;
        this.ordinal = ordinal;
        this.description = description;
    }

    public String getLiteral() {
        return literal;
    }

    public Long getOrdinal() {
        return ordinal;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return (literal!=null ? literal:"undef")
                + ":" + (ordinal!=null ? ordinal.toString():"undef")
                + " | " + (description!=null ? description:"");
    }
}
