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
public class FooterDetails {
	private static final Logger LOG = LoggerFactory.getLogger(FooterDetails.class);
	@Inject
	private String title112;
	@Inject
	private String titleUrl12;

	public String getTitle112() {
		return title112;
	}

	public String getTitleUrl12() {
	 	if (titleUrl12.contains(".")) {

			return titleUrl12;

		}

	 	else {

	 		return titleUrl12.concat(".html");

	 	}

	 }

}