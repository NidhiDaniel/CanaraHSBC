package com.chl.core.models;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class PageGuideCardsModel {
	private static final Logger LOG = LoggerFactory.getLogger(PageGuideCardsModel.class);
	@Inject
	private String heading;
	@Inject
	private String subTitle;
	@Inject
	private String pageguidebuttonTarget;
	@Inject
	private String pageguideTimer;
	@Inject
	@Named("pageguideCards")
	private List<PageGuideCardsListModel> pageguideCards;
	public String getHeading() {
		return heading;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public String getPageguidebuttonTarget() {
		return pageguidebuttonTarget;
	}
	public String getPageguideTimer() {
		return pageguideTimer;
	}
	public List<PageGuideCardsListModel> getPageguideCards() {
		return pageguideCards;
	}
}
