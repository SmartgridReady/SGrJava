package com.smartgridready.communicator.common.api.dto;

import com.smartgridready.ns.v0.FunctionalProfileCategory;

import java.util.List;

public class FunctionalProfile {

    private final String name;
    private final String profileType;
    private final FunctionalProfileCategory category;

    private final List<GenericAttribute> genericAttributes;
    private final List<DataPoint> dataPoints;

    public FunctionalProfile(String name, String profileType, FunctionalProfileCategory category, List<GenericAttribute> genericAttributes, List<DataPoint> dataPoints) {
        this.name = name;
        this.profileType = profileType;
        this.category = category;
        this.genericAttributes = genericAttributes;
        this.dataPoints = dataPoints;
    }

    public String getName() {
        return name;
    }

    public String getProfileType() {
        return profileType;
    }

    public FunctionalProfileCategory getCategory() {
        return category;
    }

    public List<GenericAttribute> getGenericAttributes() {
        return genericAttributes;
    }

    public List<DataPoint> getDataPoints() {
        return dataPoints;
    }
}
