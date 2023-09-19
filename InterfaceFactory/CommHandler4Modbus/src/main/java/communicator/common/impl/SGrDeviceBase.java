package communicator.common.impl;

import com.smartgridready.ns.v0.DataDirection;
import com.smartgridready.ns.v0.DataPointBase;
import com.smartgridready.ns.v0.DeviceFrame;
import com.smartgridready.ns.v0.FunctionalProfileBase;
import com.smartgridready.ns.v0.GenericAttributes;
import com.smartgridready.ns.v0.V0Factory;
import com.smartgridready.ns.v0.V0Package;
import communicator.common.api.GenDeviceApi;
import communicator.common.api.Value;
import communicator.common.runtime.GenDriverException;
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
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class SGrDeviceBase<
        D extends DeviceFrame,
        F extends FunctionalProfileBase,
        P extends DataPointBase> implements GenDeviceApi {

    protected final D device;

    public enum RwpDirections {
        READ(Stream.of(DataDirection.R, DataDirection.RW, DataDirection.RWP).collect(Collectors.toSet())),
        WRITE(Stream.of(DataDirection.W, DataDirection.RW, DataDirection.RWP).collect(Collectors.toSet()));

        private final Set<DataDirection> opAllowedTypes;
        RwpDirections(Set<DataDirection> opAllowedTypes) {
            this.opAllowedTypes = opAllowedTypes;
        }
    }

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

        GenericAttributes genericType = getGenAttributesByGDPType(profileName, dataPointName);
        getFeatureThatIsSet(genericType).forEach(feature ->
                result.putAll(featuresToStringMap(feature, genericType)));

        return result;
    }

    @Override
    public GenericAttributes getGenAttributesByGDPType(String profileName, String dataPointName) throws GenDriverException {

        // Merge all generic properties into one result
        GenericAttributes result = V0Factory.eINSTANCE.createGenericAttributes();

        if (profileName!=null && dataPointName!=null) {
            // Datapoint attributes have precedence over functional profile and device properties
            P dataPoint = findDatapoint(profileName, dataPointName);
            Optional<GenericAttributes> attrOpt = Optional.ofNullable(dataPoint.getGenericAttributes());
            attrOpt.ifPresent(attr -> getFeatureThatIsSet(attr)
                    .forEach(feature -> result.eSet(feature, attr.eGet(feature))));
        }

        // Add additional properties that are set on functional profile level
        // Do not overwrite the attributes already set by the data point
        if (profileName!=null) {
            Optional<F> profileOpt = findProfile(profileName);
            profileOpt.ifPresent(profile -> {
                Optional<GenericAttributes> attrOpt = Optional.ofNullable(profile.getGenericAttributes());
                attrOpt.ifPresent(attr -> mergeAttribute(result, attr));
            });
        }

        // Add additional properties that are set on device level
        // Do not overwrite the attributes already set by the functional profile
        Optional<GenericAttributes> attrOpt = Optional.ofNullable(device.getGenericAttributes());
        attrOpt.ifPresent(attr -> mergeAttribute(result, attr));

        return result;
    }

    private void mergeAttribute(GenericAttributes result, GenericAttributes attr) {
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

    public void checkOutOfRange(Value[] values, DataPointBase dataPoint)
        throws GenDriverException {

        Optional<String> errorStr = Optional.ofNullable(dataPoint.getGenericAttributes())
                .flatMap(attr -> checkOutOfRange(values, attr.getMaxVal(), Comparator.MAX));

        if (errorStr.isPresent()) {
            throw new GenDriverException(errorStr.get());
        }

        errorStr = Optional.ofNullable(dataPoint.getGenericAttributes())
                .flatMap(attr -> checkOutOfRange(values, attr.getMinVal(), Comparator.MIN));

        if (errorStr.isPresent()) {
            throw new GenDriverException(errorStr.get());
        }
    }

    public void checkReadWritePermission(DataPointBase dataPoint, RwpDirections direction) throws GenDriverException {

        DataDirection dRWPType = dataPoint.getDataPoint().getDataDirection();
        if (!direction.opAllowedTypes.contains(dRWPType)) {
            throw new GenDriverException(String.format(
                    "Operation %s not allowed on datapoint %s",
                    direction.name(),
                    dataPoint.getDataPoint().getDataPointName()));
        }
    }

    protected Optional<String> checkOutOfRange(Value[] values, BigDecimal limit, Comparator comparator) {

        List<Value> outOfRangeValues = Arrays.stream(values)
                        .filter(val -> comparator.getCmpFunc().test(BigDecimal.valueOf(val.getFloat64()), limit))
                        .collect(Collectors.toList());

        if (!outOfRangeValues.isEmpty()) {
            return Optional.of(
                    String.format("Values %s out of range. %s value=%s",
                            Arrays.toString(outOfRangeValues.toArray()), comparator.name(), limit));
        }
        return Optional.empty();
    }

    private List<EStructuralFeature> getFeatureThatIsSet(GenericAttributes genericAttribute) {

        EList<EStructuralFeature> features = V0Package.eINSTANCE.getGenericAttributes().getEStructuralFeatures();
        return features.stream().filter(genericAttribute::eIsSet).collect(Collectors.toList());
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
