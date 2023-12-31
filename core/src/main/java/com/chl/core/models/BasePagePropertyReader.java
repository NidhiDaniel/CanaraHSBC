package com.chl.core.models;

import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import com.day.cq.wcm.api.Page;

@Model(adaptables = SlingHttpServletRequest.class)
public class BasePagePropertyReader {

	@ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
	private String pageDate;

	@ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
	private String cardDescription;

	@ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
	private String quickLinkxfPath;

	@Inject
	Page currentPage;

	public String getPageDate() {
		return pageDate;
	}

	public String getCardDescription() {
		return cardDescription;
	}

	public String getQuickLinkxfPath() {
		return quickLinkxfPath;

	}

	public Page getCurrentPage() {
		return currentPage;
	}

}
