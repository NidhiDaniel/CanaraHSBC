package com.chl.core.models;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TestimonyCardModel {

    @ValueMapValue
    private String title;

    @Inject
	@Named("testimonyCardMultiField")
    private List<TestimonyCardMultifield> testimonyCardList;

    private static final Logger LOG = LoggerFactory.getLogger(TestimonyCardModel.class);
    
    public String getTitle() {
        return title;
    }

    public List<TestimonyCardMultifield> getTestimonyCardList() {
        return testimonyCardList;
    }
}
