package com.smartgridready.communicator.common.api.values;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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

    @Override
    public boolean equals(Object o) {
        if (this==o) return true;

        if (o==null || getClass()!=o.getClass()) return false;

        EnumRecord that = (EnumRecord) o;

        return new EqualsBuilder().append(literal, that.literal).append(ordinal, that.ordinal).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(literal).append(ordinal).toHashCode();
    }
}
