package com.chl.core.models;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class QuickLinkModel {
	@Inject
	private String text;
	@Inject
	private String textLink;
	
	public String getText() {
		return text;
	}

	public String getTextLink() 
	{
		if(!textLink.contains("."))
		{
			return textLink.concat(".html");
			}
		else{
			return textLink;
		}
	}
	}
