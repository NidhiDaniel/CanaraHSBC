package com.chl.core.models;

import com.day.cq.wcm.api.Page;

import com.day.cq.wcm.api.PageManager;

import java.util.List;

import javax.inject.Inject;

import org.apache.commons.lang.StringUtils;
import org.apache.sling.api.resource.Resource;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;


@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PlanHighlightsList {
	@Inject
	private String title;
	
	@Inject
	private String iconImage;

	public String getTitle() {
	
	  return title;
	}
    public String getIconImage() {
		return iconImage;
	}
}
