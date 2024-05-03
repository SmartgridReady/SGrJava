package communicator.common.impl;

import com.smartgridready.ns.v0.ContactFunctionalProfile;
import com.smartgridready.ns.v0.DataPointBase;
import com.smartgridready.ns.v0.FunctionalProfileBase;
import com.smartgridready.ns.v0.GenericFunctionalProfile;
import com.smartgridready.ns.v0.GenericFunctionalProfileList;
import com.smartgridready.ns.v0.MessagingFunctionalProfile;
import com.smartgridready.ns.v0.ModbusFunctionalProfile;
import com.smartgridready.ns.v0.RestApiFunctionalProfile;
import com.smartgridready.ns.v0.V0Factory;
import org.eclipse.emf.common.util.EList;

class FunctionalProfileWithDatapoints {

    private final EList<? extends DataPointBase> dataPoints;

    private FunctionalProfileWithDatapoints(FunctionalProfileBase functionalProfile) {

        if (functionalProfile instanceof ModbusFunctionalProfile)  {
            dataPoints = ((ModbusFunctionalProfile)functionalProfile).getDataPointList().getDataPointListElement();
        }
        else if (functionalProfile instanceof RestApiFunctionalProfile && ((RestApiFunctionalProfile) functionalProfile).getDataPointList() instanceof EList<?>)  {
            dataPoints =  ((RestApiFunctionalProfile)functionalProfile).getDataPointList().getDataPointListElement();
        }
        else if (functionalProfile instanceof MessagingFunctionalProfile) {
            dataPoints =  ((MessagingFunctionalProfile)functionalProfile).getDataPointList().getDataPointListElement();
        }
        else if (functionalProfile instanceof ContactFunctionalProfile) {
            dataPoints = ((ContactFunctionalProfile)functionalProfile).getDataPointList().getDataPointListElement();
        }
        else if (functionalProfile instanceof GenericFunctionalProfileList) {
            dataPoints = ((GenericFunctionalProfile)functionalProfile).getDataPointList().getDataPointListElement();
        }
        else {
            dataPoints =  V0Factory.eINSTANCE.createModbusDataPointList().getDataPointListElement();
        }
    }

    public static FunctionalProfileWithDatapoints of (FunctionalProfileBase functionalProfile) {
        return new FunctionalProfileWithDatapoints(functionalProfile);
    }

    @SuppressWarnings("unchecked")
    public EList<DataPointBase> getDataPoints() {
        return (EList<DataPointBase>) dataPoints;
    }
}
