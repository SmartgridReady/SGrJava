package communicator.common.api.dto;

import communicator.common.api.values.Value;

import java.util.List;

public class DataType {
    String typeName;
    List<Value> range = List.of();

    @SuppressWarnings("unused")
    public DataType(String typeName) {
        this.typeName = typeName;
    }

    public DataType(String typeName, List<Value> range) {
        this.typeName = typeName;
        this.range = range;
    }

    public String getTypeName() {
        return typeName;
    }

    public List<Value> getRange() {
        return range;
    }
}
