package com.chl.core.models;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Footer {
	private static final Logger LOG = LoggerFactory.getLogger(Footer.class);
	@Inject
	private String title113;
	@Inject
	private String titleUrl13;

	public String getTitle113() {
		return title113;
	}

	public String getTitleUrl13() {
		if (titleUrl13.contains(".")) {

			return titleUrl13;

		}

		else {

			return titleUrl13.concat(".html");

		}

	}

}