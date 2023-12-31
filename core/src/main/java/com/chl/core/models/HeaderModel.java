package com.chl.core.models;

import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderModel {
	private static final Logger LOG = LoggerFactory.getLogger(BlockTile.class);
	@Inject
	private String phoneIcon;
	@Inject
	private String phoneLabel;
	@Inject
	private String phoneLink;
	@Inject
	private String emailIcon;
	@Inject
	private String emailLabel;
	@Inject
	private String locationIcon;
	@Inject
	private String locationLabel;
	@Inject
	private String locationLink;

	public String getPhoneIcon() {
		return phoneIcon;
	}
	public String getPhoneLabel() {
		return phoneLabel;
	}
	public String getPhoneLink() {
		return phoneLink;
	}
	public String getEmailIcon() {
		return emailIcon;
	}
	public String getEmailLabel() {
		return emailLabel;
	}
	public String getLocationIcon() {
		return locationIcon;
	}
	public String getLocationLabel() {
		return locationLabel;
	}
	public String getLocationLink() {
		return locationLink.contains(".") ? locationLink: locationLink.concat(".html");
	}	
}	