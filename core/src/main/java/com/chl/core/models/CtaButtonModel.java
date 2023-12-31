package com.chl.core.models;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class,defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class CtaButtonModel {
private static final Logger LOG = LoggerFactory.getLogger(CtaButtonModel.class);
	@Inject
	private String button;
	@Inject
	private String ctaButtonLink;
	@Inject
	private String ctaButtonTargetType;

	public String getButton() {
		return button;
	}
	public String getCtaButtonLink() {
		return ctaButtonLink.contains(".") ? ctaButtonLink : ctaButtonLink.concat(".html");
	}
	public String getCtaButtonTargetType() {
		return ctaButtonTargetType;
	}

}