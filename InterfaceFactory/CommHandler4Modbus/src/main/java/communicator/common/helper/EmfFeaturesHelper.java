package communicator.common.helper;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmfFeaturesHelper {

    private EmfFeaturesHelper() {}

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

    public static Map<String, String> featuresToStringMap(EStructuralFeature feature, EObject data) {

        Map<String, String> featureMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        diveInto(feature, data, sb, featureMap);

        return featureMap;
    }

}
