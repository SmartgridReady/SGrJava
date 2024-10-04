package com.smartgridready.communicator.common.api.dto;

import com.smartgridready.communicator.common.api.values.Value;

public class DataPointValue {

    private final String functionalProfileName;
    private final String dataPointName;
    private final Value value;

    public DataPointValue(String functionalProfileName, String dataPointName, Value value) {
        this.functionalProfileName = functionalProfileName;
        this.dataPointName = dataPointName;
        this.value = value;
    }

    public String getFunctionalProfileName() {
        return functionalProfileName;
    }

    public String getDataPointName() {
        return dataPointName;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("profile: %s, dataPoint: %s, value: %s", functionalProfileName, dataPointName, value);
    }

    public static DataPointValue of (String functionalProfileName, String dataPointName, Value value) {
        return new DataPointValue(functionalProfileName, dataPointName, value);
    }

}
