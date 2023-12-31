package com.chl.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class LifeInsurance {
    @Inject
    private String title;
    @Inject
    private String description;
    @Inject
    private String fileReference;
    @Inject
    private String pathLink;
    @Inject
    private String checkbox;
    @Inject
    private String buttonName_insurance;
    @Inject
    private String buttonLink_insurance;
    @Inject
    private String targetType_insurance;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCheckbox() {
        return checkbox;
    }

    public String getPathLink() {
        return pathLink;
    }

    public String getFileReference() {
        return fileReference;
    }

    public String getButtonName_insurance() {
        return buttonName_insurance;
    }

    public String getButtonLink_insurance() {
        return buttonLink_insurance.contains(".") ? buttonLink_insurance : buttonLink_insurance.concat(".html");
    }

    public String getTargetType_insurance() {
        return targetType_insurance;
    }

}
