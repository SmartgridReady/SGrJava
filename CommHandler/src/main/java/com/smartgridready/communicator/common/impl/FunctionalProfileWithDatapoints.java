package com.smartgridready.communicator.common.impl;

import java.util.List;

import com.smartgridready.ns.v0.ContactFunctionalProfile;
import com.smartgridready.ns.v0.DataPointBase;
import com.smartgridready.ns.v0.FunctionalProfileBase;
import com.smartgridready.ns.v0.GenericFunctionalProfile;
import com.smartgridready.ns.v0.MessagingFunctionalProfile;
import com.smartgridready.ns.v0.ModbusFunctionalProfile;
import com.smartgridready.ns.v0.RestApiFunctionalProfile;
import com.smartgridready.ns.v0.V0Factory;

class FunctionalProfileWithDatapoints {

    private final List<? extends DataPointBase> dataPoints;

    private FunctionalProfileWithDatapoints(FunctionalProfileBase functionalProfile) {

        if (functionalProfile instanceof ModbusFunctionalProfile) {
            dataPoints = ((ModbusFunctionalProfile)functionalProfile).getDataPointList().getDataPointListElement();
        }
        else if (functionalProfile instanceof RestApiFunctionalProfile) {
            dataPoints = ((RestApiFunctionalProfile)functionalProfile).getDataPointList().getDataPointListElement();
        }
        else if (functionalProfile instanceof MessagingFunctionalProfile) {
            dataPoints = ((MessagingFunctionalProfile)functionalProfile).getDataPointList().getDataPointListElement();
        }
        else if (functionalProfile instanceof ContactFunctionalProfile) {
            dataPoints = ((ContactFunctionalProfile)functionalProfile).getDataPointList().getDataPointListElement();
        }
        else if (functionalProfile instanceof GenericFunctionalProfile) {
            dataPoints = ((GenericFunctionalProfile)functionalProfile).getDataPointList().getDataPointListElement();
        }
        else {
            dataPoints = V0Factory.eINSTANCE.createGenericDataPointList().getDataPointListElement();
        }
    }

    public static FunctionalProfileWithDatapoints of (FunctionalProfileBase functionalProfile) {
        return new FunctionalProfileWithDatapoints(functionalProfile);
    }

    @SuppressWarnings("unchecked")
    public List<DataPointBase> getDataPoints() {
        return (List<DataPointBase>) dataPoints;
    }
}
