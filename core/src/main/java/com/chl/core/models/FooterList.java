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
public class FooterList {
	private static final Logger LOG = LoggerFactory.getLogger(FooterList.class);
	@Inject
	private String title111;
	@Inject
	private String titleUrl111;

	public String getTitle111() {
		return title111;
	}

	public String getTitleUrl111() {
		if (titleUrl111.contains(".")) {

			return titleUrl111;

		}

		else {

			return titleUrl111.concat(".html");

		}

	}

}