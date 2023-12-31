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
public class AccordionModel {
	private static final Logger LOG = LoggerFactory.getLogger(AccordionModel.class);
	@Inject
	private String title ;
	@Inject
	private String hideInactiveItem ;
	@Inject
	private String initialNumItems ;
	@Inject
	private String displayShowMore ;
	@Inject
	private String itemPerLoad ;
	@Inject
	private String showMoreButton ;
	@Inject
	private String showLessButton ;
	@Inject
	@Named("multifield")
	private List<AccordionQueAns> accordionQueAns;
	
	public List<AccordionQueAns> getAccordionQueAns() {
		return accordionQueAns;
	}
	public String getTitle() {
		return title;
	}
	public String getHideInactiveItem() {
		return hideInactiveItem;
	}
	public String getInitialNumItems() {
		return initialNumItems;
	}
	public String getDisplayShowMore() {
		return displayShowMore;
	}
	public String getItemPerLoad() {
		return itemPerLoad;
	}
	public String getShowMoreButton() {
		return showMoreButton;
	}
	public String getShowLessButton() {
		return showLessButton;
	}
	
}