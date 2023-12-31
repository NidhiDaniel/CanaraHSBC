package com.chl.core.models;


import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PlanOptionDetailsListBean {

	private static final Logger LOG = LoggerFactory.getLogger(PlanOptionsModel.class); 

	@Inject
	private String fileReference;
	@Inject
	private String altText;
    

    @Inject
	private String description;
	
	
	

	
    public String getDescription() {
		return description;
	}

    public String getAltText() {
		return altText;
	}

    public String getFileReference() {
		return fileReference;
	}
	

}	