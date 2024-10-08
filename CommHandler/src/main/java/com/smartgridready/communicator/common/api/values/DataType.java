package com.smartgridready.communicator.common.api.values;

import com.smartgridready.ns.v0.DataTypeProduct;
import com.smartgridready.ns.v0.EmptyType;
import com.smartgridready.ns.v0.ModbusDataType;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;

public enum DataType {

    BOOLEAN(DataTypeProduct::getBoolean, ModbusDataType::getBoolean, DataTypeProduct::setBoolean, null, List.of(BooleanValue.of(true), BooleanValue.of(false))),
    INT8(DataTypeProduct::getInt8, ModbusDataType::getInt8, DataTypeProduct::setInt8, ModbusDataType::setInt8, List.of(Int8Value.of(Byte.MIN_VALUE), Int8Value.of(Byte.MAX_VALUE))),
    INT16(DataTypeProduct::getInt16, ModbusDataType::getInt16, DataTypeProduct::setInt16, ModbusDataType::setInt16, List.of(Int16Value.of(Short.MIN_VALUE), Int16Value.of(Short.MAX_VALUE))),
    INT32(DataTypeProduct::getInt32, ModbusDataType::getInt32, DataTypeProduct::setInt32, ModbusDataType::setInt32, List.of(Int32Value.of(Integer.MIN_VALUE), Int32Value.of(Integer.MAX_VALUE))),
    INT64(DataTypeProduct::getInt64, ModbusDataType::getInt64, DataTypeProduct::setInt64, ModbusDataType::setInt64, List.of(Int64Value.of(Long.MIN_VALUE), Int64Value.of(Long.MAX_VALUE))),
    INT8U(DataTypeProduct::getInt8U, ModbusDataType::getInt8U, DataTypeProduct::setInt8U, ModbusDataType::setInt8U, List.of(Int8UValue.of((short) 0), Int8UValue.of((short) 255))),
    INT16U(DataTypeProduct::getInt16U, ModbusDataType::getInt16U, DataTypeProduct::setInt16U, ModbusDataType::setInt16U, List.of(Int16UValue.of(0), Int16UValue.of(65535))),
    INT32U(DataTypeProduct::getInt32U, ModbusDataType::getInt32U, DataTypeProduct::setInt32U, ModbusDataType::setInt32U, List.of(Int32UValue.of(0), Int32UValue.of(4294967295L))),
    INT64U(DataTypeProduct::getInt64U, ModbusDataType::getInt64U, DataTypeProduct::setInt64U, ModbusDataType::setInt64U, List.of(Int64UValue.of(BigInteger.ZERO), Int64UValue.of(new BigInteger("18446744073709551615")))),
    FLOAT32(DataTypeProduct::getFloat32, ModbusDataType::getFloat32, DataTypeProduct::setFloat32, ModbusDataType::setFloat32, List.of(Float32Value.of(-Float.MAX_VALUE), Float32Value.of(Float.MAX_VALUE))),
    FLOAT64(DataTypeProduct::getFloat64, ModbusDataType::getFloat64, DataTypeProduct::setFloat64, ModbusDataType::setFloat64, List.of(Float64Value.of(-Double.MAX_VALUE), Float64Value.of(Double.MAX_VALUE))),
    STRING(DataTypeProduct::getString, ModbusDataType::getString, DataTypeProduct::setString, ModbusDataType::setString, List.of()),
    DATE_TIME(DataTypeProduct::getDateTime, ModbusDataType::getDateTime, DataTypeProduct::setDateTime, ModbusDataType::setDateTime, List.of()),
    ENUM(DataTypeProduct::getEnum, ModbusDataType::getEnum, null, null, List.of()),
    BITMAP(DataTypeProduct::getBitmap, ModbusDataType::getBitmap, null, null, List.of()),
    UNKNOWN(val -> null, val -> null, null, null, List.of());

    private final Function<DataTypeProduct, Object> getGenValMethod;
    private final Function<ModbusDataType, Object> getModbusValMethod;
    private final BiConsumer<DataTypeProduct, EmptyType> setGenValMethod;
    private final BiConsumer<ModbusDataType, EmptyType> setModbusValMethod;
    private List<Value> range;

    DataType(Function<DataTypeProduct, Object> getGenValMethod,
             Function<ModbusDataType, Object> getModbusValMethod,
             BiConsumer<DataTypeProduct, EmptyType> setGenValMethod,
             BiConsumer<ModbusDataType, EmptyType> setModbusValMethod,
             List<Value> range) {
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

    public List<Value> getRange() {
        return range;
    }

    public static Optional<DataType> toDataType(DataTypeProduct dataTypeProduct) {
        if (dataTypeProduct == null) {
            return Optional.empty();
        }

        var enums = DataType.class.getEnumConstants();
        Optional<DataType> dataTypeOpt = Arrays.stream(enums).filter(en -> en.getGenValMethod.apply(dataTypeProduct) != null).findFirst();
        if (dataTypeOpt.isPresent() && dataTypeOpt.get() == ENUM) {
            dataTypeOpt.get().range = getEnumRange(dataTypeProduct);
        } else if (dataTypeOpt.isPresent() && dataTypeOpt.get() == BITMAP) {
            dataTypeOpt.get().range = getBitmapRange(dataTypeProduct);
        }
        return dataTypeOpt;
    }

    public static Optional<DataType> toDataType(ModbusDataType modbusDataType) {
        if (modbusDataType == null) {
            return Optional.empty();
        }

        var enums = DataType.class.getEnumConstants();
        return Arrays.stream(enums).filter(en -> en.getModbusValMethod.apply(modbusDataType) != null).findFirst();
    }

    public static String getGenDataTypeName(DataTypeProduct dataTypeProduct) {
        return toDataType(dataTypeProduct).map(Enum::name).orElse("UNKNOWN");
    }

    public static String getModbusDataTypeName(ModbusDataType modbusDataType) {
        return toDataType(modbusDataType).map(Enum::name).orElse("UNKNOWN");
    }

    private static List<Value> getEnumRange(DataTypeProduct dataTypeProduct) {

        List<Value> definedValues = new ArrayList<>();
        Optional.ofNullable(dataTypeProduct)
                .ifPresent(dataTypeProd -> dataTypeProd.getEnum().getEnumEntry()
                        .forEach(entry -> definedValues.add(
                                EnumValue.of(
                                        entry.getLiteral(),
                                        (long) entry.getOrdinal(),
                                        entry.getDescription()))));
        return definedValues;
    }

    private static List<Value> getBitmapRange(DataTypeProduct dataTypeProduct) {
        List<Value> definedValues = new ArrayList<>();
        Optional.ofNullable(dataTypeProduct)
                .ifPresent(dataTypeProd -> dataTypeProd.getBitmap().getBitmapEntry()
                        .forEach(entry -> definedValues.add(StringValue.of(entry.getLiteral()))));
        return definedValues;
    }
}