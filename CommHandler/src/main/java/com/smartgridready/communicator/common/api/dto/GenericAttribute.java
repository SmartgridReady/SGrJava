package com.smartgridready.communicator.common.api.dto;

import com.smartgridready.communicator.common.api.values.DataType;
import com.smartgridready.ns.v0.DataTypeProduct;
import com.smartgridready.ns.v0.GenericAttributeListProductEnd;
import com.smartgridready.ns.v0.GenericAttributeProduct;
import com.smartgridready.ns.v0.GenericAttributeProductEnd;
import com.smartgridready.ns.v0.Units;
import com.smartgridready.communicator.common.api.values.Value;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GenericAttribute {
    private final String name;
    private final Value value;
    private final String dataType;
    private final Units unit;
    private final List<GenericAttribute> children;

    public GenericAttribute(
            String name,
            String value,
            DataTypeProduct dataType,
            Units unit,
            List<GenericAttribute> children) {
        this.name = name;
        this.value = (dataType != null && value != null) ? Value.fromString(dataType, value) : null;
        this.dataType = DataType.getGenDataTypeName(dataType);
        this.unit = unit;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public Value getValue() {
        return value;
    }

    public String getDataType() {
        return dataType;
    }

    public Units getUnit() {
        return unit;
    }

    @SuppressWarnings("unused")
    public List<GenericAttribute> getChildren() {
        return children;
    }

    public static GenericAttribute of(GenericAttributeProduct genAttribute) {

        List<GenericAttribute> children = Optional.ofNullable(genAttribute.getGenericAttributeList())
                .map(GenericAttributeListProductEnd::getGenericAttributeListElement)
                .map(GenericAttribute::mapGenericAttributes).orElse(new ArrayList<>());

        return new GenericAttribute(
                genAttribute.getName(),
                genAttribute.getValue(),
                genAttribute.getDataType(),
                genAttribute.getUnit(),
                children
        );
    }

    public static GenericAttribute of(GenericAttributeProductEnd genAttributeChild) {
        return new GenericAttribute(
                genAttributeChild.getName(),
                genAttributeChild.getValue(),
                genAttributeChild.getDataType(),
                genAttributeChild.getUnit(),
                null);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString("\t"));

        Optional.ofNullable(children).ifPresent(childList ->
                childList.forEach(child -> sb.append("\t\t").append(child.toString("\t\t"))));

        return sb.toString();
    }

    private String toString(String insertTabs) {
        return "\n" + insertTabs +
                        ("name: ") + name +
                        (value!=null ?    " | value: " + value.getString() : "") +
                        (dataType!=null ? " | type : " + dataType:"") +
                        (unit!=null ?     " | unit : " + unit.name():"");
    }

    public static List<GenericAttribute> mapGenericAttributes(List<GenericAttributeProductEnd> genericAttributeProducts) {
        ArrayList<GenericAttribute> genericAttributes = new ArrayList<>();
        genericAttributeProducts.forEach(genericAttributeProduct ->
                genericAttributes.add(GenericAttribute.of(genericAttributeProduct)));

        return genericAttributes.stream()
                .sorted(java.util.Comparator.comparing(GenericAttribute::getName))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public boolean equals(Object o) {
        if (this==o) return true;

        if (o==null || getClass()!=o.getClass()) return false;

        GenericAttribute that = (GenericAttribute) o;

        return new EqualsBuilder()
                .append(name, that.name)
                .append(value, that.value)
                .append(dataType, that.dataType)
                .append(unit, that.unit)
                .isEquals() && EqualsBuilder.reflectionEquals(children, that.children);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(name)
                .append(value)
                .append(dataType)
                .append(unit)
                .append(children)
                .toHashCode();
    }
}
