package com.chl.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BackToTopModel {
	@Inject
	private String pathIcon ;

	@Inject
	private String altText ;

	public String getPathIcon() {
		return pathIcon;
	}


	public String getAltText() {
		return altText;
	}

}