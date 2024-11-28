package com.smartgridready.communicator.common.api.values;

import com.smartgridready.ns.v0.DataTypeProduct;
import com.smartgridready.ns.v0.EmptyType;
import com.smartgridready.ns.v0.ModbusDataType;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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

    @Override
    public boolean equals(Object o) {
        if (this==o) return true;

        if (o==null || getClass()!=o.getClass()) return false;

        DataTypeInfo that = (DataTypeInfo) o;

        return new EqualsBuilder()
            .append(type, that.type)
            .append(range, that.range)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(range)
            .toHashCode();
    }
}