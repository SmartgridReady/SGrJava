package communicator.common.api.dto;

import com.smartgridready.ns.v0.Language;

import java.util.Map;

public class ConfigurationValue {

    private final String name;
    private final String dataType;

    private final Map<Language, String> descriptions;

    public ConfigurationValue(String name, String dataType, Map<Language, String> descriptions) {
        this.name = name;
        this.dataType = dataType;
        this.descriptions = descriptions;
    }

    public String getName() {
        return name;
    }

    public String getDataType() {
        return dataType;
    }

    public Map<Language, String> getDescriptions() {
        return descriptions;
    }
}
