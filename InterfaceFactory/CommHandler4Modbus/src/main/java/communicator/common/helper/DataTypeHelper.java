package communicator.common.helper;

import com.smartgridready.ns.v0.DataType;
import com.smartgridready.ns.v0.ModbusDataType;
import com.smartgridready.ns.v0.V0Package;
import com.smartgridready.ns.v0.impl.DataTypeImpl;
import com.smartgridready.ns.v0.impl.ModbusDataTypeImpl;
import communicator.common.api.Float32Value;
import communicator.common.api.Float64Value;
import communicator.common.api.Int16UValue;
import communicator.common.api.Int16Value;
import communicator.common.api.Int32UValue;
import communicator.common.api.Int32Value;
import communicator.common.api.Int64UValue;
import communicator.common.api.Int64Value;
import communicator.common.api.Int8UValue;
import communicator.common.api.Int8Value;
import communicator.common.api.Value;

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
        genFeatures.put(V0Package.DATA_TYPE__BOOLEAN, new DataTypeRecord("BOOLEAN", value -> null));
        genFeatures.put(V0Package.DATA_TYPE__INT8,    new DataTypeRecord("INT8", value -> Int8Value.of((byte)value)));
        genFeatures.put(V0Package.DATA_TYPE__INT16,   new DataTypeRecord("INT16", value -> Int16Value.of((short)value)));
        genFeatures.put(V0Package.DATA_TYPE__INT32,   new DataTypeRecord("INT32", value -> Int32Value.of((int)value)));
        genFeatures.put(V0Package.DATA_TYPE__INT64,   new DataTypeRecord("INT64", value -> Int64Value.of((long)value)));
        genFeatures.put(V0Package.DATA_TYPE__INT8_U,  new DataTypeRecord("INT8_U", value -> Int8UValue.of((short)value)));
        genFeatures.put(V0Package.DATA_TYPE__INT16_U, new DataTypeRecord("INT16_U", value -> Int16UValue.of((int)value)));
        genFeatures.put(V0Package.DATA_TYPE__INT32_U, new DataTypeRecord("INT32_U", value -> Int32UValue.of((long)value)));
        genFeatures.put(V0Package.DATA_TYPE__INT64_U, new DataTypeRecord("INT64_U", value -> Int64UValue.of(BigInteger.valueOf((long)value))));
        genFeatures.put(V0Package.DATA_TYPE__FLOAT32, new DataTypeRecord("FLOAT32", value -> Float32Value.of((float)value)));
        genFeatures.put(V0Package.DATA_TYPE__FLOAT64, new DataTypeRecord("FLOAT64", value -> Float64Value.of((double)value)));
        genFeatures.put(V0Package.DATA_TYPE__DATE_TIME, new DataTypeRecord("DATE_TIME", value -> null));
        genFeatures.put(V0Package.DATA_TYPE__STRING, new DataTypeRecord("STRING", value -> null));
        genFeatures.put(V0Package.DATA_TYPE__ENUM, new DataTypeRecord("ENUM", value -> null));
        genFeatures.put(V0Package.DATA_TYPE__ENUM2BITMAP_INDEX, new DataTypeRecord("ENUM2BITMAP_INDEX", value -> null));
    }

    static final Map<Integer, DataTypeRecord> modbusFeatures = new HashMap<>();
    static {
        modbusFeatures.put(V0Package.DATA_TYPE__INT8,    new DataTypeRecord("INT8", value -> Int8Value.of((byte)value)));
        modbusFeatures.put(V0Package.DATA_TYPE__INT16,   new DataTypeRecord("INT16", value -> Int16Value.of((short)value)));
        modbusFeatures.put(V0Package.DATA_TYPE__INT32,   new DataTypeRecord("INT32", value -> Int32Value.of((int)value)));
        modbusFeatures.put(V0Package.DATA_TYPE__INT64,   new DataTypeRecord("INT64", value -> Int64Value.of((long)value)));
        modbusFeatures.put(V0Package.DATA_TYPE__INT8_U,  new DataTypeRecord("INT8_U", value -> Int8UValue.of((short)value)));
        modbusFeatures.put(V0Package.DATA_TYPE__INT16_U, new DataTypeRecord("INT16_U", value -> Int16UValue.of((int)value)));
        modbusFeatures.put(V0Package.DATA_TYPE__INT32_U, new DataTypeRecord("INT32_U", value -> Int32UValue.of((long)value)));
        modbusFeatures.put(V0Package.DATA_TYPE__INT64_U, new DataTypeRecord("INT64_U", value -> Int64UValue.of(BigInteger.valueOf((long)value))));
        modbusFeatures.put(V0Package.DATA_TYPE__FLOAT32, new DataTypeRecord("FLOAT32", value -> Float32Value.of((float)value)));
        modbusFeatures.put(V0Package.DATA_TYPE__FLOAT64, new DataTypeRecord("FLOAT64", value -> Float64Value.of((double)value)));
        modbusFeatures.put(V0Package.DATA_TYPE__DATE_TIME, new DataTypeRecord("DATE_TIME", value -> null));
        modbusFeatures.put(V0Package.DATA_TYPE__STRING, new DataTypeRecord("STRING", value -> null));
        modbusFeatures.put(V0Package.DATA_TYPE__ENUM, new DataTypeRecord("ENUM", value -> null));
        modbusFeatures.put(V0Package.DATA_TYPE__ENUM2BITMAP_INDEX, new DataTypeRecord("ENUM2BITMAP_INDEX", value -> null));
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

    public static Map.Entry<Integer, DataTypeRecord> getGenDataType(DataType genDataType) {
        Iterator<Map.Entry<Integer, DataTypeRecord >> it = genFeatures.entrySet().iterator();
        return getActiveFeature(it, feature -> (((DataTypeImpl)genDataType).eIsSet(feature)));
    }

    public static Map.Entry<Integer, DataTypeRecord> getModbusDataType(ModbusDataType modbusDataType) {
        Iterator<Map.Entry<Integer, DataTypeRecord>> it = modbusFeatures.entrySet().iterator();
        return getActiveFeature(it, feature -> (((ModbusDataTypeImpl)modbusDataType).eIsSet(feature)));
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
