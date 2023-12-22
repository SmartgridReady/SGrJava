package utils;

import com.smartgridready.ns.v0.DataTypeProduct;
import com.smartgridready.ns.v0.V0Package;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SGrGDPTypeToNameMapper {

    private SGrGDPTypeToNameMapper() {}

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

    static final Map<Integer, String> SGR_GENERIC_TYPE_TO_NAME = new HashMap<>();
    static {
        // Generic IF types
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__INT8, "INT8");
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__INT8_U, "INT8U");
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__INT16, "INT16");
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__INT16_U, "INT16U");
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__INT32, "INT32");
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__INT32_U, "INT32U");
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__INT64, "INT64");
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__INT64_U, "INT64U");
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__FLOAT32, "FLOAT32");
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__FLOAT64, "FLOAT64");
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__ENUM, "ENUM");
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__STRING, "STRING");
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__BITMAP, "BITMAP");
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT__DATE_TIME, "DATE_TIME");
        SGR_GENERIC_TYPE_TO_NAME.put(V0Package.DATA_TYPE_PRODUCT_FEATURE_COUNT, "FEATURE_COUNT");
    }


    public static String getModbusName(int aGDPType) {
        return SGR_MODBUS_TYPE_TO_NAME.get(aGDPType);
    }

    public static String getGenericName(int aGenType) {
        return SGR_GENERIC_TYPE_TO_NAME.get(aGenType);
    }

    public static List<String> getGenericNamesOfValuesSet(DataTypeProduct dataTypeProduct) {
        final List<String> featureNamesWithValuesSet = new ArrayList<>();

        if (dataTypeProduct != null) {
            EList<EStructuralFeature> features = V0Package.eINSTANCE.getDataTypeProduct().getEStructuralFeatures();
            features.stream()
                    .filter(dataTypeProduct::eIsSet)
                    .forEach(feature -> featureNamesWithValuesSet.add(getGenericName(feature.getFeatureID())));
        }
        return featureNamesWithValuesSet;
    }
}
