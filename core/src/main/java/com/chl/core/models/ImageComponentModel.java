package com.chl.core.models;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class,defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class ImageComponentModel {
private static final Logger LOG = LoggerFactory.getLogger(ImageComponentModel.class);
    @Inject
	private String fileReference;
	@Inject
	private String imageLink;
	@Inject 
	private String bannerCheck;
	@Inject
	private String imageTargetType;
	@Inject
	private String altText;

	public String getFileReference() {
		return fileReference;
	}
	public String getImageLink() {
		return imageLink.contains(".") ? imageLink : imageLink.concat(".html");
		}
	public String getBannerCheck() {
		return bannerCheck;
	}
	public String getImageTargetType() {
		return imageTargetType;
	}
	public String getAltText() {
		return altText;
	}

}