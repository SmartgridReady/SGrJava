package com.smartgridready.communicator.common.api.dto;

import com.smartgridready.ns.v0.DataTypeProduct;
import com.smartgridready.ns.v0.GenericAttributeListProductEnd;
import com.smartgridready.ns.v0.GenericAttributeProduct;
import com.smartgridready.ns.v0.GenericAttributeProductEnd;
import com.smartgridready.ns.v0.Units;
import com.smartgridready.communicator.common.api.values.Value;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.eclipse.emf.common.util.EList;
import com.smartgridready.utils.SGrGDPTypeToNameMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
        this.dataType = SGrGDPTypeToNameMapper.getGenericNamesOfValuesSet(dataType).stream().filter(Objects::nonNull).findFirst().orElse("UNDEFINED");
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
                genAttribute.isSetUnit() ? genAttribute.getUnit() : null,
                children
        );
    }

    public static GenericAttribute of(GenericAttributeProductEnd genAttributeChild) {
        return new GenericAttribute(
                genAttributeChild.getName(),
                genAttributeChild.getValue(),
                genAttributeChild.getDataType(),
                genAttributeChild.isSetUnit() ? genAttributeChild.getUnit() : null,
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
        StringBuilder sb = new StringBuilder();
                sb.append("\n")
                        .append(insertTabs).append("name: ").append(name)
                        .append(value!=null ?    " | value: " + value.getString():"")
                        .append(dataType!=null ? " | type : " + dataType:"")
                        .append(unit!=null ?     " | unit : " + unit.getName():"");

        return sb.toString();
    }

    public static List<GenericAttribute> mapGenericAttributes(EList<GenericAttributeProductEnd> genericAttributeProducts) {
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

        if (! new EqualsBuilder()
                .append(name, that.name)
                .append(value, that.value)
                .append(dataType, that.dataType)
                .append(unit, that.unit)
                .isEquals()) {
        	return false;
        }
        
        for (int i = 0; i < children.size(); i++) {
        	if (! EqualsBuilder.reflectionEquals(children.get(i), that.children.get(i))) {
        		return false;
        	}
        }
        
        return children.size() == that.children.size();
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
