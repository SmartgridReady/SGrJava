package communicator.common.api;

import com.smartgridready.ns.v0.DataTypeProduct;
import com.smartgridready.ns.v0.GenericAttributeListProductEnd;
import com.smartgridready.ns.v0.GenericAttributeProduct;
import com.smartgridready.ns.v0.GenericAttributeProductEnd;
import com.smartgridready.ns.v0.Units;
import org.eclipse.emf.common.util.EList;
import utils.SGrGDPTypeToNameMapper;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class GenericAttribute {

    GenericAtributeLevel level;
    String name;
    Value value;
    String dataType;
    Units unit;
    Set<GenericAttribute> children;

    public GenericAttribute(
            GenericAtributeLevel level,
            String name,
            String value,
            DataTypeProduct dataType,
            Units unit,
            Set<GenericAttribute> children) {
        this.level = level;
        this.name = name;
        this.value = (dataType != null && value != null) ? Value.fromString(dataType, value) : null;
        this.dataType = SGrGDPTypeToNameMapper.getGenericNamesOfValuesSet(dataType).stream().findFirst().orElse(null);
        this.unit = unit;
        this.children = children;
    }

    public GenericAtributeLevel getLevel() {
        return level;
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

    public Set<GenericAttribute> getChildren() {
        return children;
    }

    public static GenericAttribute of(GenericAttributeProduct genAttribute, GenericAtributeLevel level) {

        Set<GenericAttribute> children = Optional.ofNullable(genAttribute.getGenericAttributeList())
                .map(GenericAttributeListProductEnd::getGenericAttributeListElement)
                .map(attrListElem -> mapGenericAttributes(attrListElem, level)).orElse(new HashSet<>());

        return new GenericAttribute(
                level,
                genAttribute.getName(),
                genAttribute.getValue(),
                genAttribute.getDataType(),
                genAttribute.isSetUnit() ? genAttribute.getUnit() : null,
                children
        );
    }

    public static GenericAttribute of(GenericAttributeProductEnd genAttributeChild, GenericAtributeLevel level) {
        return new GenericAttribute(
                level,
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
        String sb = "\n" +
                insertTabs +         "name: " + name +
                (value!=null ?    " | value: " + value.getString():"") +
                (dataType!=null ? " | type : " + dataType:"") +
                (unit!=null ?     " | unit : " + unit.getName():"") +
                (level!=null ?    " | level: " + level:"");
        return sb;
    }

    private static Set<GenericAttribute> mapGenericAttributes(EList<GenericAttributeProductEnd> genericAttributeProducts, GenericAtributeLevel level) {
        LinkedHashSet<GenericAttribute> genericAttributes = new LinkedHashSet<>();
        genericAttributeProducts.forEach(genericAttributeProduct ->
                genericAttributes.add(GenericAttribute.of(genericAttributeProduct, level)));

        return genericAttributes.stream()
                .sorted(java.util.Comparator.comparing(GenericAttribute::getName))
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
