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
public class BottomModel {
	private static final Logger LOG = LoggerFactory.getLogger(BottomModel.class);
	@Inject
	@Named("bottomfooter")
	private List<DisclaimerList> disclaimer;

	public List<DisclaimerList> getDisclaimer() {
		return disclaimer;
	}

	@Inject
	private String disclaimerTitle;
	@Inject
	private String disclaimerText;
	@Inject
	private String richText;
	@Inject
	private String richText1;
	@Inject
	private String copyRight;
	@Inject
	private String policyText;
	@Inject
	private String policyLink;
	@Inject
	private String footertargetType;

	public String getDisclaimerTitle() {
		return disclaimerTitle;
	}

	public String getDisclaimerText() {
		return disclaimerText;
	}

	public String getRichText() {
		return richText;
	}

	public String getRichText1() {
		return richText1;
	}

	public String getCopyRight() {
		return copyRight;
	}

	public String getPolicyText() {
		return policyText;
	}

	public String getPolicyLink() {
		if (policyLink.contains(".")) {

			return policyLink;

		}

		else {

			return policyLink.concat(".html");

		}
	}

	public String getFootertargetType() {
		return footertargetType;
	}

}