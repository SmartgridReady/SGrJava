package communicator.common.impl;

import com.smartgridready.ns.v0.SGrAttr4GenericType;
import com.smartgridready.ns.v0.SGrBasicGenDataPointTypeType;
import com.smartgridready.ns.v0.SGrDataPointBaseType;
import com.smartgridready.ns.v0.SGrDeviceBaseType;
import com.smartgridready.ns.v0.SGrFunctionalProfileBaseType;
import com.smartgridready.ns.v0.V0Factory;
import com.smartgridready.ns.v0.V0Package;
import communicator.common.api.GenDeviceApi;
import communicator.common.runtime.GenDriverException;
import communicator.modbus.helper.GenType2StringConversion;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public abstract class SGrDeviceBase<
        D extends SGrDeviceBaseType,
        F extends SGrFunctionalProfileBaseType,
        P extends SGrDataPointBaseType> implements GenDeviceApi {

    protected final D device;

    public enum Comparator {
        MIN(((val, lim) -> val.compareTo(lim) < 0)),
        MAX(((val, lim) -> val.compareTo(lim) > 0));

        private final BiPredicate<BigDecimal, BigDecimal> cmpFunc;

        Comparator(BiPredicate<BigDecimal,BigDecimal> cmpFunc) {
           this.cmpFunc = cmpFunc;
        }

        BiPredicate<BigDecimal,BigDecimal> getCmpFunc() {
            return cmpFunc;
        }
    }

    protected SGrDeviceBase(D device) {
        this.device = device;
    }

    protected abstract Optional<F> findProfile(String profileName);

    protected abstract Optional<P> findDataPointForProfile(F functionalProfile, String datapointName);

    @Override
    public Map<String, String> getGenAttributes(String profileName, String dataPointName) throws GenDriverException {

        Map<String, String> result = new HashMap<>();

        SGrAttr4GenericType genericType = getGenAttributesByGDPType(profileName, dataPointName);
        getFeatureThatIsSet(genericType).forEach(feature ->
                result.putAll(featuresToStringMap(feature, genericType)));

        return result;
    }

    @Override
    public SGrAttr4GenericType getGenAttributesByGDPType(String profileName, String dataPointName) throws GenDriverException {

        // Merge all generic properties into one result
        SGrAttr4GenericType result = V0Factory.eINSTANCE.createSGrAttr4GenericType();

        if (profileName!=null && dataPointName!=null) {
            // Datapoint attributes have precedence over functional profile and device properties
            P dataPoint = findDatapoint(profileName, dataPointName);
            Optional<SGrAttr4GenericType> attrOpt = Optional.ofNullable(dataPoint.getGenAttribute());
            attrOpt.ifPresent(attr -> getFeatureThatIsSet(attr)
                    .forEach(feature -> result.eSet(feature, attr.eGet(feature))));
        }

        // Add additional properties that are set on functional profile level
        // Do not overwrite the attributes already set by the data point
        if (profileName!=null) {
            Optional<F> profileOpt = findProfile(profileName);
            profileOpt.ifPresent(profile -> {
                Optional<SGrAttr4GenericType> attrOpt = Optional.ofNullable(profile.getGenAttribute());
                attrOpt.ifPresent(attr -> mergeAttribute(result, attr));
            });
        }

        // Add additional properties that are set on device level
        // Do not overwrite the attributes already set by the functional profile
        Optional<SGrAttr4GenericType> attrOpt = Optional.ofNullable(device.getGenAttribute());
        attrOpt.ifPresent(attr -> mergeAttribute(result, attr));

        return result;
    }

    private void mergeAttribute(SGrAttr4GenericType result, SGrAttr4GenericType attr) {
        getFeatureThatIsSet(attr)
                .stream()
                .filter(feature -> !result.eIsSet(feature))
                .forEach(feature -> result.eSet(feature, attr.eGet(feature)));
    }

    protected P findDatapoint(String profileName, String datapointName) throws GenDriverException {
        Optional<F> functionalProfile = findProfile(profileName);
        if (functionalProfile.isPresent()) {
            Optional<P> dataPoint = findDataPointForProfile(functionalProfile.get(), datapointName);
            return dataPoint.orElseThrow(() ->
                    new GenDriverException("Data-point with name " + datapointName + " not found"));
        } else {
            throw new GenDriverException("Functional profile with name " + datapointName + " not found");
        }
    }

    public void checkOutOfRange(String value, SGrDataPointBaseType dataPoint)
        throws GenDriverException {

        SGrBasicGenDataPointTypeType genVal =
                GenType2StringConversion.format(value, dataPoint.getDataPoint().getBasicDataType());

        checkOutOfRange(new SGrBasicGenDataPointTypeType[]{genVal}, dataPoint);
    }

    public void checkOutOfRange(SGrBasicGenDataPointTypeType[] values, SGrDataPointBaseType dataPoint)
        throws GenDriverException {

        Optional<String> errorStr = Optional.ofNullable(dataPoint.getGenAttribute())
                .filter(SGrAttr4GenericType::isSetMaxVal)
                .flatMap(attr -> checkOutOfRange(values, BigDecimal.valueOf(attr.getMaxVal()), Comparator.MAX));

        if (errorStr.isPresent()) {
            throw new GenDriverException(errorStr.get());
        }

        errorStr = Optional.ofNullable(dataPoint.getGenAttribute())
                .filter(SGrAttr4GenericType::isSetMinVal)
                .flatMap(attr -> checkOutOfRange(values, BigDecimal.valueOf(attr.getMinVal()), Comparator.MIN));

        if (errorStr.isPresent()) {
            throw new GenDriverException(errorStr.get());
        }
    }

    protected Optional<String> checkOutOfRange(SGrBasicGenDataPointTypeType[] values, BigDecimal limit, Comparator comparator) {

        List<Double> outOfRangeValues = Arrays.stream(values)
                .flatMap(value -> getFeatureThatIsSet(value).stream()
                        .map(value::eGet)
                        .filter(Number.class::isInstance)
                        .map(Number.class::cast)
                        .map(Number::doubleValue)
                        .filter(val -> comparator.getCmpFunc().test(BigDecimal.valueOf(val), limit)))
                .collect(Collectors.toList());

        if (!outOfRangeValues.isEmpty()) {
            return Optional.of(
                    String.format("Values %s out of range. %s value=%s",
                            Arrays.toString(outOfRangeValues.toArray()), comparator.name(), limit));
        }
        return Optional.empty();
    }

    private List<EStructuralFeature> getFeatureThatIsSet(SGrAttr4GenericType genericAttribute) {

        EList<EStructuralFeature> features = V0Package.eINSTANCE.getSGrAttr4GenericType().getEStructuralFeatures();
        return features.stream().filter(genericAttribute::eIsSet).collect(Collectors.toList());
    }

    private List<EStructuralFeature> getFeatureThatIsSet(SGrBasicGenDataPointTypeType dataPoint) {

        EList<EStructuralFeature> features = V0Package.eINSTANCE.getSGrBasicGenDataPointTypeType().getEStructuralFeatures();
        return features.stream().filter(dataPoint::eIsSet).collect(Collectors.toList());
    }

    private static Map<String, String> featuresToStringMap(EStructuralFeature feature, EObject data) {

        Map<String, String> featureMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        diveInto(feature, data, sb, featureMap);

        return featureMap;
    }

    private static void diveInto(EStructuralFeature feature, EObject data, StringBuilder sb, Map<String, String> featureMap) {

        if (feature instanceof EReference) {
            sb.append(feature.getName()).append(".");
            List<EStructuralFeature> children = ((EReference) feature).getEReferenceType().getEStructuralFeatures();
            children.forEach(feat -> {
                StringBuilder sbld = new StringBuilder(sb);
                EObject dataObj = (EObject) data.eGet(feature);
                diveInto(feat, dataObj, sbld, featureMap);
            });
        } else {
            sb.append(feature.getName());
            featureMap.put(sb.toString(), data.eGet(feature).toString());
        }
    }
}
