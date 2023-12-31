package com.chl.core.models;

import com.day.cq.wcm.api.components.Component;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = { SlingHttpServletRequest.class,
        Resource.class }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ComponentIdModel {

    @ScriptVariable
    private Component component;

    @SlingObject
    private Resource resource;

    private static final Logger LOG = LoggerFactory.getLogger(ComponentIdModel.class);

    public String getUniqueId() {
        return component.getName() + "-" + String.valueOf(Math.abs(resource.getPath().hashCode() - 1));
    }
}