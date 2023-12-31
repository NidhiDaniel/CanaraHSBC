
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
public class TopList {
	private static final Logger LOG = LoggerFactory.getLogger(TopList.class);
	@Inject
	private String subTitle;
	@Inject
	private String link;

	public String getSubTitle() {
		return subTitle;
	}

	public String getLink() {
		if (link.contains(".")) {

			return link;

		}

		else {

			return link.concat(".html");

		}

	}

}