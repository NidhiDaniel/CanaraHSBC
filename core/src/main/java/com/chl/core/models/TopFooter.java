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
public class TopFooter {
	private static final Logger LOG = LoggerFactory.getLogger(TopFooter.class);
	@Inject
	@Named("subfooter")
	private List<TopList> top;

	public List<TopList> getTop() {
		return top;
	}

	@Inject
	private String titleHeading;
	@Inject
	private String headingUrl;

	public String getTitleHeading() {
		return titleHeading;
	}

	public String getHeadingUrl() {
		if (headingUrl.contains(".")) {

			return headingUrl;

		}

		else {

			return headingUrl.concat(".html");

		}

	}

	

}