package communicator.common.impl;

import com.smartgridready.ns.v0.SGrAttr4GenericType;
import com.smartgridready.ns.v0.SGrDataPointBaseType;
import com.smartgridready.ns.v0.SGrDeviceBaseType;
import com.smartgridready.ns.v0.SGrFunctionalProfileBaseType;
import com.smartgridready.ns.v0.V0Factory;
import com.smartgridready.ns.v0.V0Package;
import communicator.common.api.GenDeviceApi;
import communicator.common.helper.EmfFeaturesHelper;
import communicator.common.runtime.GenDriverException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class SGrDeviceBase<
        D extends SGrDeviceBaseType,
        F extends SGrFunctionalProfileBaseType,
        P extends SGrDataPointBaseType> implements GenDeviceApi {

    protected final D device;

    protected SGrDeviceBase(D device) {
        this.device = device;
    }

    protected abstract Optional<F> findProfile(String profileName);

    protected abstract Optional<P> findDataPointForProfile(F functionalProfile, String datapointName);

    @Override
    public Map<String, String> getGenAttributes(String profileName, String dataPointName) throws GenDriverException {

        Map<String, String> result = new HashMap<>();

        SGrAttr4GenericType genericType = getGenAttributesByGDPType(profileName, dataPointName);
        getFeaturesThatAreSet(genericType).forEach(feature ->
                result.putAll(EmfFeaturesHelper.featuresToStringMap(feature, genericType)));

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
            attrOpt.ifPresent(attr -> getFeaturesThatAreSet(attr)
                    .forEach(feature -> result.eSet(feature, attr.eGet(feature))));
        }

        // Add additional properties that are set on functional profile level
        // Do not overwrite the attributes already set by the data point
        if (profileName!=null) {
            Optional<F> profileOpt = findProfile(profileName);
            profileOpt.ifPresent(profile -> {
                Optional<SGrAttr4GenericType> attrOpt = Optional.ofNullable(profile.getGenAttribute());
                attrOpt.ifPresent(attr ->
                        getFeaturesThatAreSet(attr)
                                .stream()
                                .filter(feature -> !result.eIsSet(feature))
                                .forEach(feature -> result.eSet(feature, attr.eGet(feature))));
            });
        }

        // Add additional properties that are set on device level
        // Do not overwrite the attributes already set by the functional profile
        Optional<SGrAttr4GenericType> attrOpt = Optional.ofNullable(device.getGenAttribute());
        attrOpt.ifPresent(attr ->
                getFeaturesThatAreSet(attr)
                        .stream()
                        .filter(feature -> !result.eIsSet(feature))
                        .forEach(feature -> result.eSet(feature, attr.eGet(feature))));

        return result;
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
    private List<EStructuralFeature> getFeaturesThatAreSet(SGrAttr4GenericType genericAttribute) {

        EList<EStructuralFeature> features = V0Package.eINSTANCE.getSGrAttr4GenericType().getEStructuralFeatures();
        return features.stream().filter(genericAttribute::eIsSet).collect(Collectors.toList());
    }
}
