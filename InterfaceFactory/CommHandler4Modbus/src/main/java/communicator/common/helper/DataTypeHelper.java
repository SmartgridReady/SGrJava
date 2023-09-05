package communicator.common.helper;

import com.smartgridready.ns.v0.DataType;
import com.smartgridready.ns.v0.ModbusDataType;
import com.smartgridready.ns.v0.V0Package;
import com.smartgridready.ns.v0.impl.DataTypeImpl;
import com.smartgridready.ns.v0.impl.ModbusDataTypeImpl;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.IntPredicate;

public class DataTypeHelper {

    private DataTypeHelper() {
        // Utility class
    }

    static final Map<Integer, String> genFeatures = new HashMap<>();
    static {
        genFeatures.put(V0Package.DATA_TYPE__BOOLEAN, "BOOLEAN");
        genFeatures.put(V0Package.DATA_TYPE__INT8,  "INT8");
        genFeatures.put(V0Package.DATA_TYPE__INT16, "INT16");
        genFeatures.put(V0Package.DATA_TYPE__INT32, "INT32");
        genFeatures.put(V0Package.DATA_TYPE__INT64, "INT64");
        genFeatures.put(V0Package.DATA_TYPE__INT8_U, "INT8_U");
        genFeatures.put(V0Package.DATA_TYPE__INT16_U, "INT16_U");
        genFeatures.put(V0Package.DATA_TYPE__INT32_U, "INT32_U");
        genFeatures.put(V0Package.DATA_TYPE__INT64_U, "INT64_U");
        genFeatures.put(V0Package.DATA_TYPE__FLOAT32, "FLOAT32");
        genFeatures.put(V0Package.DATA_TYPE__FLOAT64, "FLOAT64");
        genFeatures.put(V0Package.DATA_TYPE__DATE_TIME, "DATE_TIME");
        genFeatures.put(V0Package.DATA_TYPE__STRING, "STRING");
        genFeatures.put(V0Package.DATA_TYPE__ENUM, "ENUM");
        genFeatures.put(V0Package.DATA_TYPE__ENUM2BITMAP_INDEX, "ENUM2BITMAP_INDEX");
    }

    static final Map<Integer, String> modbusFeatures = new HashMap<>();
    static {
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__BOOLEAN, "BOOLEAN");
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__INT8,    "INT8");
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__INT16,  "INT16");
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__INT32, "INT32");
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__INT64, "INT64");
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__INT8_U, "INT8_U");
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__INT16_U, "INT16_U");
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__INT32_U, "INT32_U");
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__INT64_U, "INT64_U");
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__FLOAT32, "FLOAT32");
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__FLOAT64, "FLOAT64");
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__DATE_TIME, "DATE_TIME");
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__STRING, "STRING");
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__ENUM, "ENUM");
        modbusFeatures.put(V0Package.MODBUS_DATA_TYPE__ENUM2BITMAP_INDEX, "ENUM2BITMAP_INDEX");
    }

    public static Map.Entry<Integer, String> getGenDataType(DataType genDataType) {
        Iterator<Map.Entry<Integer, String >> it = genFeatures.entrySet().iterator();
        return getActiveFeature(it, feature -> (((DataTypeImpl)genDataType).eIsSet(feature)));
    }

    public static Map.Entry<Integer, String> getModbusDataType(ModbusDataType modbusDataType) {
        Iterator<Map.Entry<Integer, String>> it = modbusFeatures.entrySet().iterator();
        return getActiveFeature(it, feature -> (((ModbusDataTypeImpl)modbusDataType).eIsSet(feature)));
    }

    private static Map.Entry<Integer, String > getActiveFeature(Iterator<Map.Entry<Integer, String>> it, IntPredicate checkFunction) {
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            if (checkFunction.test(entry.getKey())) {
                return entry;
            }
        }
        return new AbstractMap.SimpleEntry<>(-1, "UNDEFINED");
    }

}
