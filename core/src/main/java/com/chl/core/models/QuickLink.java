package com.chl.core.models;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class QuickLink {
	@Inject
	private String title;
	@Inject
	private String popupTargetType;
	@Inject
	@Named("quicklinks")
	private List<QuickLinkList> quickLink;
	@Inject
	@Named("multifield")
	private List<QuickLinkModel> quickLinkModel;
	public String getTitle() {
		return title;
	}
	public String getPopupTargetType() {
		return popupTargetType;
	}
	public List<QuickLinkList> getQuickLink() {
		return quickLink;
	}
	public List<QuickLinkModel> getQuickLinkModel() {
		return quickLinkModel;
	}
}
