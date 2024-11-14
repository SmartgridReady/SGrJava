package com.smartgridready.communicator.common.api.values;

import com.smartgridready.ns.v0.DataTypeProduct;
import com.smartgridready.ns.v0.EmptyType;
import com.smartgridready.ns.v0.ModbusDataType;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class DataTypeInfo {

    private final DataType type;
    private final List<Value> range;

    private final Function<DataTypeProduct, Object> getGenValMethod;
    private final Function<ModbusDataType, Object> getModbusValMethod;
    private final BiConsumer<DataTypeProduct, EmptyType> setGenValMethod;
    private final BiConsumer<ModbusDataType, EmptyType> setModbusValMethod;

    public DataTypeInfo(
            DataType type,
            Function<DataTypeProduct, Object> getGenValMethod,
            Function<ModbusDataType, Object> getModbusValMethod,
            BiConsumer<DataTypeProduct, EmptyType> setGenValMethod,
            BiConsumer<ModbusDataType, EmptyType> setModbusValMethod,
            List<Value> range) {
        this.type = type;
        this.getGenValMethod = getGenValMethod;
        this.getModbusValMethod = getModbusValMethod;
        this.setGenValMethod = setGenValMethod;
        this.setModbusValMethod = setModbusValMethod;
        this.range = range;
    }

    @SuppressWarnings("unused")
    public Function<DataTypeProduct, Object> getGetGenValMethod() {
        return getGenValMethod;
    }

    @SuppressWarnings("unused")
    public Function<ModbusDataType, Object> getGetModbusValMethod() {
        return getModbusValMethod;
    }

    public BiConsumer<DataTypeProduct, EmptyType> getSetGenValMethod() {
        return setGenValMethod;
    }

    public BiConsumer<ModbusDataType, EmptyType> getSetModbusValMethod() {
        return setModbusValMethod;
    }

    public DataType getType() {
        return type;
    }

    public String getTypeName() {
        return type.name();
    }

    public List<Value> getRange() {
        return range;
    }
}