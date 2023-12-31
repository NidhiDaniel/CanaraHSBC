package com.chl.core.models;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CardList {
	private static final Logger LOG = LoggerFactory.getLogger(CardList.class);

	@Inject
	private String cardTitle;
	@Inject
	private String statusText;
	@Inject
	private String bulletList;
	@Inject
	private String ctaButton1;
	@Inject
	private String ctaLink1;
	@Inject
	private String ctaButton2;
	@Inject
	private String ctaLink2;

	public String getCardTitle() {
		return cardTitle;
	}

	public String getStatusText() {
		return statusText;
	}

	public String getBulletList() {
		return bulletList;
	}

	public String getCtaButton1() {
		return ctaButton1;
	}

	public String getCtaLink1() {
		return ctaLink1.contains(".") ? ctaLink1: ctaLink1.concat(".html") ;
	}

	public String getCtaButton2() {
		return ctaButton2;
	}

	public String getCtaLink2() {
		return ctaLink2.contains(".") ? ctaLink2 :ctaLink2.concat(".html") ;
	}

}