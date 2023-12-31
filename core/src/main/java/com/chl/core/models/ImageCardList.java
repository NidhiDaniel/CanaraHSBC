package com.chl.core.models;

import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ImageCardList {
	private static final Logger LOG = LoggerFactory.getLogger(ImageCardList.class);
	
	@Inject
	private String fileReferenceImage2;
	@Inject
	private String description;
	@Inject
	private String image2AltText;
	
	public String getFileReferenceImage2() {
		return fileReferenceImage2;
	}
	public String getDescription() {
		return description;
	}
	public String getImage2AltText() {
		return image2AltText;
	}
	
	

}