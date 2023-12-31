package com.chl.core.models;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class RatingComponentModel {
private static final Logger LOG = LoggerFactory.getLogger(RatingComponentModel.class);
	@Inject
	private String text;

    @Inject
	private String ratingText;

    @Inject
	private String fileReference;

    @Inject
	private String altText;

    @Inject
	private String title;

    @Inject
	private String textField;

    @Inject
	private String buttonName;

    @Inject
	private String buttonLink;

	@Inject
	private String ratingMessage;


	public String getText() {
		return text;
	}

    public String getRatingText() {
		return ratingText;
	}

    public String getFileReference() {
		return fileReference;
	}

    public String getAltText() {
		return altText;
	}

	public String getTitle() {
		return title;
	}

    public String getTextField() {
		return textField;
	}

    public String getButtonName() {
		return buttonName;
	}

    public String getButtonLink() {
		if(buttonLink.contains(".com")){
			return buttonLink;
		}
		else{
			return buttonLink.concat(".html");
		}
	}
	public String getRatingMessage() {
		return ratingMessage;
	}
}