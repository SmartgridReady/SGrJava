package com.smartgridready.communicator.common.helper;

import com.smartgridready.ns.v0.DataTypeProduct;
import com.smartgridready.ns.v0.ModbusDataType;
import com.smartgridready.ns.v0.V0Package;
import com.smartgridready.ns.v0.impl.DataTypeProductImpl;
import com.smartgridready.ns.v0.impl.ModbusDataTypeImpl;
import com.smartgridready.communicator.common.api.values.Float32Value;
import com.smartgridready.communicator.common.api.values.Float64Value;
import com.smartgridready.communicator.common.api.values.Int16UValue;
import com.smartgridready.communicator.common.api.values.Int16Value;
import com.smartgridready.communicator.common.api.values.Int32UValue;
import com.smartgridready.communicator.common.api.values.Int32Value;
import com.smartgridready.communicator.common.api.values.Int64UValue;
import com.smartgridready.communicator.common.api.values.Int64Value;
import com.smartgridready.communicator.common.api.values.Int8UValue;
import com.smartgridready.communicator.common.api.values.Int8Value;
import com.smartgridready.communicator.common.api.values.StringValue;
import com.smartgridready.communicator.common.api.values.Value;

import java.math.BigInteger;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntPredicate;

public class DataTypeHelper {

    private DataTypeHelper() {
        // Utility class
    }

    static final class DataTypeRecord {
        String name;
        Function<Object, Value> factoryMeth;

        public DataTypeRecord(String name, Function<Object, Value> factoryMeth) {
            this.name = name;
            this.factoryMeth = factoryMeth;
        }
    }

    static final Map<Integer, DataTypeRecord> genFeatures = new HashMap<>();
    static {
        genFeatures.put(V0Package.DATA_TYPE_PRODUCT__BOOLEAN, new DataTypeRecord("BOOLEAN", value -> null));
        genFeatures.put(V0Package.DATA_TYPE_PRODUCT__INT8,    new DataTypeRecord("INT8", value -> Int8Value.of((byte)value)));
        genFeatures.put(V0Package.DATA_TYPE_PRODUCT__INT16,   new DataTypeRecord("INT16", value -> Int16Value.of((short)value)));
        genFeatures.put(V0Package.DATA_TYPE_PRODUCT__INT32,   new DataTypeRecord("INT32", value -> Int32Value.of((int)value)));
        genFeatures.put(V0Package.DATA_TYPE_PRODUCT__INT64,   new DataTypeRecord("INT64", value -> Int64Value.of((long)value)));
        genFeatures.put(V0Package.DATA_TYPE_PRODUCT__INT8_U,  new DataTypeRecord("INT8_U", value -> Int8UValue.of((short)value)));
        genFeatures.put(V0Package.DATA_TYPE_PRODUCT__INT16_U, new DataTypeRecord("INT16_U", value -> Int16UValue.of((int)value)));
        genFeatures.put(V0Package.DATA_TYPE_PRODUCT__INT32_U, new DataTypeRecord("INT32_U", value -> Int32UValue.of((long)value)));
        genFeatures.put(V0Package.DATA_TYPE_PRODUCT__INT64_U, new DataTypeRecord("INT64_U", value -> Int64UValue.of(BigInteger.valueOf((long)value))));
        genFeatures.put(V0Package.DATA_TYPE_PRODUCT__FLOAT32, new DataTypeRecord("FLOAT32", value -> Float32Value.of((float)value)));
        genFeatures.put(V0Package.DATA_TYPE_PRODUCT__FLOAT64, new DataTypeRecord("FLOAT64", value -> Float64Value.of((double)value)));
        genFeatures.put(V0Package.DATA_TYPE_PRODUCT__DATE_TIME, new DataTypeRecord("DATE_TIME", value -> null));
        genFeatures.put(V0Package.DATA_TYPE_PRODUCT__STRING, new DataTypeRecord("STRING", value -> StringValue.of((String)value)));
        genFeatures.put(V0Package.DATA_TYPE_PRODUCT__ENUM,   new DataTypeRecord("ENUM", value -> null));
        genFeatures.put(V0Package.DATA_TYPE_PRODUCT__BITMAP, new DataTypeRecord("BITMAP", value -> null));
    }

    static final Map<Integer, DataTypeRecord> modbusFeatures = new HashMap<>();
    static {
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__BOOLEAN, new DataTypeRecord("BOOLEAN", value -> null));
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__INT8,    new DataTypeRecord("INT8", value -> Int8Value.of((byte)value)));
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__INT16,   new DataTypeRecord("INT16", value -> Int16Value.of((short)value)));
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__INT32,   new DataTypeRecord("INT32", value -> Int32Value.of((int)value)));
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__INT64,   new DataTypeRecord("INT64", value -> Int64Value.of((long)value)));
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__INT8_U,  new DataTypeRecord("INT8_U", value -> Int8UValue.of((short)value)));
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__INT16_U, new DataTypeRecord("INT16_U", value -> Int16UValue.of((int)value)));
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__INT32_U, new DataTypeRecord("INT32_U", value -> Int32UValue.of((long)value)));
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__INT64_U, new DataTypeRecord("INT64_U", value -> Int64UValue.of(BigInteger.valueOf((long)value))));
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__FLOAT32, new DataTypeRecord("FLOAT32", value -> Float32Value.of((float)value)));
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__FLOAT64, new DataTypeRecord("FLOAT64", value -> Float64Value.of((double)value)));
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__DATE_TIME, new DataTypeRecord("DATE_TIME", value -> null));
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__STRING, new DataTypeRecord("STRING", value -> StringValue.of((String)value)));
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__ENUM, new DataTypeRecord("ENUM", value -> null));
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__BITMAP, new DataTypeRecord("BITMAP", value -> null));
    }

    public static Value genValueFor(int genDataTypeId, Object value) {
        DataTypeRecord rec = genFeatures.get(genDataTypeId);
        if (rec == null) {
            return null;
        }
        return rec.factoryMeth.apply(value);
    }

    public static Value modbusValueFor(int modbusDataTypeId, Object value) {
        DataTypeRecord rec = modbusFeatures.get(modbusDataTypeId);
        if (rec == null) {
            return null;
        }
        return rec.factoryMeth.apply(value);
    }

    public static String getGenDataTypeName(DataTypeProduct genDataType) {
        Iterator<Map.Entry<Integer, DataTypeRecord >> it = genFeatures.entrySet().iterator();
        return getActiveFeature(it, feature -> (((DataTypeProductImpl)genDataType).eIsSet(feature))).getValue().name;
    }

    public static String getModbusDataTypeName(ModbusDataType modbusDataType) {
        Iterator<Map.Entry<Integer, DataTypeRecord>> it = modbusFeatures.entrySet().iterator();
        return getActiveFeature(it, feature -> (((ModbusDataTypeImpl)modbusDataType).eIsSet(feature))).getValue().name;
    }

    private static Map.Entry<Integer, DataTypeRecord > getActiveFeature(Iterator<Map.Entry<Integer, DataTypeRecord>> it, IntPredicate checkFunction) {
        while (it.hasNext()) {
            Map.Entry<Integer, DataTypeRecord> entry = it.next();
            if (checkFunction.test(entry.getKey())) {
                return entry;
            }
        }

        // TODO remove value -> null lambda
        return new AbstractMap.SimpleEntry<>(-1, new DataTypeRecord("UNDEFINED", value -> null));
    }

}
