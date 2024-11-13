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

public class DataType {

    public static final DataType BOOLEAN = new DataType("BOOLEAN", DataTypeProduct::getBoolean, ModbusDataType::getBoolean, DataTypeProduct::setBoolean, null, List.of(BooleanValue.of(true), BooleanValue.of(false)));
    public static final DataType INT8 = new DataType("INT8", DataTypeProduct::getInt8, ModbusDataType::getInt8, DataTypeProduct::setInt8, ModbusDataType::setInt8, List.of(Int8Value.of(Byte.MIN_VALUE), Int8Value.of(Byte.MAX_VALUE)));
    public static final DataType INT16 = new DataType("INT16", DataTypeProduct::getInt16, ModbusDataType::getInt16, DataTypeProduct::setInt16, ModbusDataType::setInt16, List.of(Int16Value.of(Short.MIN_VALUE), Int16Value.of(Short.MAX_VALUE)));
    public static final DataType INT32 = new DataType("INT32", DataTypeProduct::getInt32, ModbusDataType::getInt32, DataTypeProduct::setInt32, ModbusDataType::setInt32, List.of(Int32Value.of(Integer.MIN_VALUE), Int32Value.of(Integer.MAX_VALUE)));
    public static final DataType INT64 = new DataType("INT64", DataTypeProduct::getInt64, ModbusDataType::getInt64, DataTypeProduct::setInt64, ModbusDataType::setInt64, List.of(Int64Value.of(Long.MIN_VALUE), Int64Value.of(Long.MAX_VALUE)));
    public static final DataType INT8U = new DataType("INT8U", DataTypeProduct::getInt8U, ModbusDataType::getInt8U, DataTypeProduct::setInt8U, ModbusDataType::setInt8U, List.of(Int8UValue.of((short) 0), Int8UValue.of((short) 255)));
    public static final DataType INT16U = new DataType("INT16U", DataTypeProduct::getInt16U, ModbusDataType::getInt16U, DataTypeProduct::setInt16U, ModbusDataType::setInt16U, List.of(Int16UValue.of(0), Int16UValue.of(65535)));
    public static final DataType INT32U = new DataType("INT32U", DataTypeProduct::getInt32U, ModbusDataType::getInt32U, DataTypeProduct::setInt32U, ModbusDataType::setInt32U, List.of(Int32UValue.of(0), Int32UValue.of(4294967295L)));
    public static final DataType INT64U = new DataType("INT64U", DataTypeProduct::getInt64U, ModbusDataType::getInt64U, DataTypeProduct::setInt64U, ModbusDataType::setInt64U, List.of(Int64UValue.of(BigInteger.ZERO), Int64UValue.of(new BigInteger("18446744073709551615"))));
    public static final DataType FLOAT32 = new DataType("FLOAT32", DataTypeProduct::getFloat32, ModbusDataType::getFloat32, DataTypeProduct::setFloat32, ModbusDataType::setFloat32, List.of(Float32Value.of(-Float.MAX_VALUE), Float32Value.of(Float.MAX_VALUE)));
    public static final DataType FLOAT64 = new DataType("FLOAT64", DataTypeProduct::getFloat64, ModbusDataType::getFloat64, DataTypeProduct::setFloat64, ModbusDataType::setFloat64, List.of(Float64Value.of(-Double.MAX_VALUE), Float64Value.of(Double.MAX_VALUE)));
    public static final DataType STRING = new DataType("STRING", DataTypeProduct::getString, ModbusDataType::getString, DataTypeProduct::setString, ModbusDataType::setString, List.of());
    public static final DataType DATE_TIME = new DataType("DATE_TIME", DataTypeProduct::getDateTime, ModbusDataType::getDateTime, DataTypeProduct::setDateTime, ModbusDataType::setDateTime, List.of());
    public static final DataType ENUM = new DataType("ENUM", DataTypeProduct::getEnum, ModbusDataType::getEnum, null, null, List.of());
    public static final DataType BITMAP = new DataType("BITMAP", DataTypeProduct::getBitmap, ModbusDataType::getBitmap, null, null, List.of());
    public static final DataType UNKNOWN = new DataType("UNKNOWN", val -> null, val -> null, null, null, List.of());

    private static final DataType[] DATA_TYPES = new DataType[]{BOOLEAN, INT8, INT16, INT32, INT64, INT8U, INT16U, INT32U, INT64U, FLOAT32, FLOAT64, STRING, DATE_TIME, ENUM, BITMAP, UNKNOWN};

    private final String name;
    private final List<Value> range;

    private final Function<DataTypeProduct, Object> getGenValMethod;
    private final Function<ModbusDataType, Object> getModbusValMethod;
    private final BiConsumer<DataTypeProduct, EmptyType> setGenValMethod;
    private final BiConsumer<ModbusDataType, EmptyType> setModbusValMethod;

    private DataType(
             String name,
             Function<DataTypeProduct, Object> getGenValMethod,
             Function<ModbusDataType, Object> getModbusValMethod,
             BiConsumer<DataTypeProduct, EmptyType> setGenValMethod,
             BiConsumer<ModbusDataType, EmptyType> setModbusValMethod,
             List<Value> range) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public List<Value> getRange() {
        return range;
    }

    public boolean isOfType(DataType dataType) {
        return this.name.equals(dataType.name);
    }

    public static Optional<DataType> toDataType(DataTypeProduct dataTypeProduct) {
        if (dataTypeProduct == null) {
            return Optional.empty();
        }

        // Handle ENUM and BITMAP datatypes, since their range is not static and defined within the device
        // specific EI-XML.
        Optional<DataType> dataTypeOpt = Arrays.stream(DATA_TYPES).filter(en -> en.getGenValMethod.apply(dataTypeProduct) != null).findFirst();
        if (dataTypeOpt.isPresent() && dataTypeOpt.get() == ENUM) {
            // Clone the ENUM datatype and enhance it with the range given by the datapoint read from the EI-XML
            dataTypeOpt = Optional.of(cloneUsingRange(dataTypeOpt.get(), getEnumRange(dataTypeProduct)));
        } else if (dataTypeOpt.isPresent() && dataTypeOpt.get() == BITMAP) {
            // Clone the BITMAP datatype and enhance it with the range given by datapoint read from the EI-XML
            dataTypeOpt = Optional.of(cloneUsingRange(dataTypeOpt.get(), getBitmapRange(dataTypeProduct)));
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
        return toDataType(dataTypeProduct).map(DataType::getName).orElse(DataType.UNKNOWN.name);
    }

    public static String getModbusDataTypeName(ModbusDataType modbusDataType) {
        return toDataType(modbusDataType).map(DataType::getName).orElse(DataType.UNKNOWN.name);
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

    private static DataType cloneUsingRange(DataType dataType, List<Value> range) {
        return new DataType(dataType.name, dataType.getGenValMethod, dataType.getModbusValMethod, dataType.setGenValMethod, dataType.setModbusValMethod, range);
    }
}