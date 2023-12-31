
package com.chl.core.models;

import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables =Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MainHeaderModel {
	private static final Logger LOG = LoggerFactory.getLogger(MainHeaderModel.class);
	@Inject
	private String logo;
	@Inject
	private String logoAltText;
	@Inject
	private String logoUrl;
    @Inject
	private String searchIcon;
    @Inject
	private String userLoginIcon;
	@Inject
	private String userLoginLink;
	@Inject
	private String searchRedirectUrl;
	public String getLogo() {
		return logo;
	}
	
	public String getLogoAltText() {
		return logoAltText;
	}
	
	public String getLogoUrl() {
		return logoUrl.contains(".") ? logoUrl: logoUrl.concat(".html");
	}
	
	public String getSearchIcon() {
		return searchIcon;
	}
	public String getUserLoginIcon() {
		return userLoginIcon;
	}
	public String getUserLoginLink() {
		return userLoginLink.contains(".") ? userLoginLink: userLoginLink.concat(".html");
	}
	public String getSearchRedirectUrl() {
		return searchRedirectUrl.contains(".") ? searchRedirectUrl: searchRedirectUrl.concat(".html");
	}
}
