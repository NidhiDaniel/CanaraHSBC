package com.chl.core.models;


import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PlanOptionListBean {

	private static final Logger LOG = LoggerFactory.getLogger(PlanOptionsModel.class);

	@Inject
	private String fileReference;
	@Inject
	private String altText;
    @Inject
	private String title;

    @Inject
	private String description;
	@Inject
	private String cta;

    @Inject
	private String eflink;

	@Inject
	private String efheading;

	
	
	public String getEfheading() {
		return efheading;
	}

	public String getEflink() {
		return eflink;
	}
    public String getTitle() {
		return title;
	}

    public String getCta() {
		return cta;
	}

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