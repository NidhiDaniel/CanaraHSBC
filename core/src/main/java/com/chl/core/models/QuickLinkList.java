package com.chl.core.models;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class QuickLinkList {
	@Inject
	private String ctaIcon;
	@Inject
	private String ctaText;
	@Inject
	private String ctaTextUrl;
	@Inject
	private String checkBox;  
	@Inject
	private String ctaTextTargetType;
	public String getCtaIcon() {
		return ctaIcon;
	}
	public String getCtaText() {
		return ctaText;
	}
	public String getCheckBox() {
		return checkBox ;
	}
	public String getCtaTextUrl() {
		if(!ctaTextUrl.contains(".") && !ctaTextUrl.contains("#"))
		{
			return ctaTextUrl.concat(".html");
		}
		else{
			return ctaTextUrl;
		}
	}
	public String getCtaTextTargetType() {
		return ctaTextTargetType;
	}
}


