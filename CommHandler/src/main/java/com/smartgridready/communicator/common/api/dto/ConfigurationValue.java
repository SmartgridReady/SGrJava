package com.smartgridready.communicator.common.api.dto;

import com.smartgridready.communicator.common.api.values.DataTypeInfo;
import com.smartgridready.communicator.common.api.values.Value;
import com.smartgridready.ns.v0.Language;

import java.util.Map;

public class ConfigurationValue {

    private final String name;
    private final Value defaultValue;
    private final DataTypeInfo dataType;

    private final Map<Language, String> descriptions;

    public ConfigurationValue(String name, Value defaultValue, DataTypeInfo dataType, Map<Language, String> descriptions) {
        this.name = name;
        this.defaultValue = defaultValue;
        this.dataType = dataType;
        this.descriptions = descriptions;
    }

    public String getName() {
        return name;
    }

    public Value getDefaultValue() {
        return defaultValue;
    }

    public DataTypeInfo getDataType() {
        return dataType;
    }

    public Map<Language, String> getDescriptions() {
        return descriptions;
    }
}
