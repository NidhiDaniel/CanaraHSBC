package com.chl.core.models;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ClaimRegisterModel {
private static final Logger LOG = LoggerFactory.getLogger(ClaimRegisterModel.class);
	@Inject
	private String text ;
	@Inject
	private String richtext ;
	@Inject
	private String fileReference ;
    @Inject
	private String imageAltText ;
	@Inject
	private String description ;
	@Inject
	private String buttonname ;
    @Inject
	private String claimRegisterLink ;
	@Inject
	private String claimRegisterTargetType ;

	public String getText() {
		return text;
	}
	public String getRichtext() {
		return richtext;
	}
	public String getFileReference() {
		return fileReference;
	}
	public String getImageAltText() {
		return imageAltText;
	}
	public String getDescription() {
		return description;
	}
	public String getButtonname() {
		return buttonname;
	}
	public String getClaimRegisterLink() {
		if(claimRegisterLink.contains(".")){
			return claimRegisterLink;
		}
		else{
			return claimRegisterLink.concat(".html");
		}
	}
	public String getClaimRegisterTargetType() {
		return claimRegisterTargetType;
	}
}
