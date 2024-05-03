package communicator.common.api.dto;

import com.smartgridready.ns.v0.DataDirectionProduct;
import com.smartgridready.ns.v0.Units;

import java.util.List;

public class DataPoint {

    private final String name;
    private final String dataType;
    private final Units unit;
    private final DataDirectionProduct permissions;
    private final Double minimumValue;
    private final Double maximumValue;
    private final Integer arrayLen;
    private final List<GenericAttribute> genericAttributes;

    @SuppressWarnings("java:S107")
    public DataPoint(String name,
                     String dataType,
                     Units unit,
                     DataDirectionProduct permissions,
                     Double minimumValue,
                     Double maximumValue,
                     Integer arrayLen,
                     List<GenericAttribute> genericAttributes) {
        this.name = name;
        this.dataType = dataType;
        this.unit = unit;
        this.permissions = permissions;
        this.minimumValue = minimumValue;
        this.maximumValue = maximumValue;
        this.arrayLen = arrayLen;
        this.genericAttributes = genericAttributes;
    }

    public String getName() {
        return name;
    }

    public String getDataType() {
        return dataType;
    }

    public Units getUnit() {
        return unit;
    }

    public DataDirectionProduct getPermissions() {
        return permissions;
    }

    public Double getMinimumValue() {
        return minimumValue;
    }

    public Double getMaximumValue() {
        return maximumValue;
    }

    public Integer getArrayLen() {
        return arrayLen;
    }

    public List<GenericAttribute> getGenericAttributes() {
        return genericAttributes;
    }
}
