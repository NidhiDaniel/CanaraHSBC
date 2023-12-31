package com.chl.core.models;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.api.resource.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TestimonyCardMultifield {

    @ValueMapValue
    private String cardTitle;

    @ValueMapValue
    private String testimonyCardDescription;

    private static final Logger LOG = LoggerFactory.getLogger(TestimonyCardMultifield.class);

    public String getCardTitle() {
        return cardTitle;
    }

    public String getTestimonyCardDescription() {
        return testimonyCardDescription;
    }
}
