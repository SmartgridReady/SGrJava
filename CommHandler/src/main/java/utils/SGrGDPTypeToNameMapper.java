package utils;

import com.smartgridready.ns.v0.DataTypeProduct;
import com.smartgridready.ns.v0.V0Package;
import communicator.common.api.dto.DataType;
import communicator.common.api.values.*;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;

import java.math.BigInteger;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SGrGDPTypeToNameMapper {

    private SGrGDPTypeToNameMapper() {
    }

    static final Map<Integer, String> SGR_MODBUS_TYPE_TO_NAME = new HashMap<>();

    static {

        // Modbus IF types
        SGR_MODBUS_TYPE_TO_NAME.put(V0Package.MODBUS_DATA_TYPE__BITMAP, "BITMAP");
        SGR_MODBUS_TYPE_TO_NAME.put(V0Package.MODBUS_DATA_TYPE__BOOLEAN, "BOOL");
        SGR_MODBUS_TYPE_TO_NAME.put(V0Package.MODBUS_DATA_TYPE__INT8, "INT8");
        SGR_MODBUS_TYPE_TO_NAME.put(V0Package.MODBUS_DATA_TYPE__INT16, "INT16");
        SGR_MODBUS_TYPE_TO_NAME.put(V0Package.MODBUS_DATA_TYPE__INT32, "INT32");
        SGR_MODBUS_TYPE_TO_NAME.put(V0Package.MODBUS_DATA_TYPE__INT64, "INT64");
        SGR_MODBUS_TYPE_TO_NAME.put(V0Package.MODBUS_DATA_TYPE__INT8_U, "INT8_U");
        SGR_MODBUS_TYPE_TO_NAME.put(V0Package.MODBUS_DATA_TYPE__INT16_U, "INT16_U");
        SGR_MODBUS_TYPE_TO_NAME.put(V0Package.MODBUS_DATA_TYPE__INT32_U, "INT32_U");
        SGR_MODBUS_TYPE_TO_NAME.put(V0Package.MODBUS_DATA_TYPE__INT64_U, "INT64_U");
        SGR_MODBUS_TYPE_TO_NAME.put(V0Package.MODBUS_DATA_TYPE__FLOAT32, "FLOAT32");
        SGR_MODBUS_TYPE_TO_NAME.put(V0Package.MODBUS_DATA_TYPE__FLOAT64, "FLOAT64");
        SGR_MODBUS_TYPE_TO_NAME.put(V0Package.MODBUS_DATA_TYPE__ENUM, "ENUM");
        SGR_MODBUS_TYPE_TO_NAME.put(V0Package.MODBUS_DATA_TYPE__DATE_TIME, "DATE_TIME");
        SGR_MODBUS_TYPE_TO_NAME.put(V0Package.MODBUS_DATA_TYPE__STRING, "STRING");
    }

    static final Map<Integer, Function<DataTypeProduct, DataType>> SGR_GENERIC_TYPE_TO_NAME = new HashMap<>();

    static {
        // Generic IF types
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__BOOLEAN, SGrGDPTypeToNameMapper::booleanMapper);
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__INT8,    SGrGDPTypeToNameMapper::int8Mapper);
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__INT8_U,  SGrGDPTypeToNameMapper::int8UMapper);
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__INT16, SGrGDPTypeToNameMapper::int16Mapper);
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__INT16_U, SGrGDPTypeToNameMapper::int16UMapper);
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__INT32, SGrGDPTypeToNameMapper::int32Mapper);
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__INT32_U, SGrGDPTypeToNameMapper::int32UMapper);
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__INT64, SGrGDPTypeToNameMapper::int64Mapper);
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__INT64_U, SGrGDPTypeToNameMapper::int64UMapper);
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__FLOAT32, SGrGDPTypeToNameMapper::float32Mapper);
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__FLOAT64, SGrGDPTypeToNameMapper::float64Mapper);
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__ENUM, SGrGDPTypeToNameMapper::enumMapper);
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__STRING, SGrGDPTypeToNameMapper::stringMapper);
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__BITMAP, SGrGDPTypeToNameMapper::bitmapMapper);
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__DATE_TIME, SGrGDPTypeToNameMapper::dateTimeMapper);
    }


    public static String getModbusName(int aGDPType) {
        return SGR_MODBUS_TYPE_TO_NAME.get(aGDPType);
    }

    public static String getGenericName(int aGenType) {
        return SGR_GENERIC_TYPE_TO_NAME.get(aGenType).apply(null).getTypeName();
    }

    public static List<String> getGenericNamesOfValuesSet(DataTypeProduct dataTypeProduct) {
        return mapToDataTypeDto(dataTypeProduct).stream()
                .map(DataType::getTypeName)
                .collect(Collectors.toUnmodifiableList());
    }

    public static List<DataType> mapToDataTypeDto(DataTypeProduct dataTypeProduct) {

        final List<DataType> featureNameWithValuesSet = new ArrayList<>();
        if (dataTypeProduct != null) {
            EList<EStructuralFeature> features = V0Package.eINSTANCE.getDataTypeProduct().getEStructuralFeatures();
            features.stream()
                    .filter(dataTypeProduct::eIsSet)
                    .forEach(feature -> featureNameWithValuesSet.add(
                            mapGenericDataType(feature.getFeatureID(), dataTypeProduct)));
        }
        return featureNameWithValuesSet;
    }

    private static DataType mapGenericDataType(int featureId, DataTypeProduct dataTypeProduct) {
        var mappingFunction = SGR_GENERIC_TYPE_TO_NAME.get(featureId);
        if (mappingFunction != null) {
            return mappingFunction.apply(dataTypeProduct);
        }
        return new DataType("UNKNOWN", List.of());
    }

    private static DataType booleanMapper(DataTypeProduct dataTypeProduct) {
        return new DataType("BOOLEAN", List.of(BooleanValue.of(true), BooleanValue.of(false)));
    }

    private static DataType int8Mapper(DataTypeProduct dataTypeProduct) {
        return new DataType("INT8", List.of(Int8Value.of(Byte.MIN_VALUE), Int8Value.of(Byte.MAX_VALUE)));
    }

    private static DataType int8UMapper(DataTypeProduct dataTypeProduct) {
        return new DataType("INT8U", List.of(Int8UValue.of((short) 0), Int8UValue.of((short)255)));
    }

    private static DataType int16Mapper(DataTypeProduct dataTypeProduct) {
        return new DataType("INT16", List.of(Int16Value.of(Short.MIN_VALUE), Int16Value.of(Short.MAX_VALUE)));
    }

    private static DataType int16UMapper(DataTypeProduct dataTypeProduct) {
        return new DataType("INT16U", List.of(Int16UValue.of(0), Int16UValue.of(65535)));
    }

    private static DataType int32Mapper(DataTypeProduct dataTypeProduct) {
        return new DataType("INT32", List.of(Int32Value.of(Integer.MIN_VALUE), Int32Value.of(Integer.MAX_VALUE)));
    }

    private static DataType int32UMapper(DataTypeProduct dataTypeProduct) {
        return new DataType("INT32U", List.of(Int32UValue.of(0), Int32UValue.of(4294967295L)));
    }

    private static DataType int64Mapper(DataTypeProduct dataTypeProduct) {
        return new DataType("INT64", List.of(Int64Value.of(Long.MIN_VALUE), Int64Value.of(Long.MAX_VALUE)));
    }

    private static DataType int64UMapper(DataTypeProduct dataTypeProduct) {
        return new DataType("INT64U", List.of(Int64UValue.of(BigInteger.ZERO), Int64UValue.of(new BigInteger("18446744073709551615"))));
    }

    private static DataType float32Mapper(DataTypeProduct dataTypeProduct) {
        return new DataType("FLOAT32", List.of(Float32Value.of(-Float.MAX_VALUE), Float32Value.of(Float.MAX_VALUE)));
    }

    private static DataType float64Mapper(DataTypeProduct dataTypeProduct) {
        return new DataType("FLOAT64", List.of(Float64Value.of(-Double.MAX_VALUE), Float64Value.of(Double.MAX_VALUE)));
    }

    private static DataType stringMapper(DataTypeProduct dataTypeProduct) {
        return new DataType("STRING", List.of());
    }

    private static DataType dateTimeMapper(DataTypeProduct dataTypeProduct) {
        return new DataType("DATE_TIME", List.of());
    }

    private static DataType enumMapper(DataTypeProduct dataTypeProduct) {
        List<Value> definedValues = new ArrayList<>();
        Optional.ofNullable(dataTypeProduct)
                .ifPresent(dataTypeProd -> dataTypeProd.getEnum().getEnumEntry()
                        .forEach(entry -> definedValues.add(
                                EnumValue.of(
                                        entry.getLiteral(),
                                        (long)entry.getOrdinal(),
                                        entry.getDescription()))));

        return new DataType("ENUM", definedValues);
    }

    private static DataType bitmapMapper(DataTypeProduct dataTypeProduct) {
        List<Value> definedValues = new ArrayList<>();
        Optional.ofNullable(dataTypeProduct)
                .ifPresent(dataTypeProd -> dataTypeProd.getBitmap().getBitmapEntry()
                        .forEach(entry -> definedValues.add(StringValue.of(entry.getLiteral()))));
        return new DataType("BITMAP", definedValues);
    }
}
