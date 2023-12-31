package com.chl.core.models;



import javax.inject.Inject;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.sling.api.resource.Resource;

@Model(adaptables =  Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BreadcrumbModel {
    private static final Logger LOG = LoggerFactory.getLogger(BreadcrumbModel.class);
    @Inject
    private String fileReference;
    @Inject
    private String homepageText;
    @Inject
    private String homepageLink;

    public String getFileReference() {
        return fileReference;
    }

    public String getHomepageText() {
        return homepageText;
    }

    public String getHomepageLink() {
        if(!homepageLink.contains(".") && !homepageLink.contains("#"))
		{
			return homepageLink.concat(".html");
		}
		else{
			return homepageLink;
		}
    }

}
