package com.chl.core.models;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FooterTitle {
	private static final Logger LOG = LoggerFactory.getLogger(FooterTitle.class);
	@Inject
	private String title114;
	@Inject
	private String titleUrl14;

	public String getTitle114() {
		return title114;
	}

	public String getTitleUrl14() {
		if (titleUrl14.contains(".")) {

			return titleUrl14;

		}

		else {

			return titleUrl14.concat(".html");

		}

	}

}