package com.chl.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class VariationTitleModel {
    @Inject
    private String title;

    @Inject
    private String subTitle;

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

}
