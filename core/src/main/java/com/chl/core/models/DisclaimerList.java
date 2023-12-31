package com.chl.core.models;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DisclaimerList {
	private static final Logger LOG = LoggerFactory.getLogger(DisclaimerList.class);
	@Inject
	private String title;
	@Inject
	private String content;
	

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}
	

}	