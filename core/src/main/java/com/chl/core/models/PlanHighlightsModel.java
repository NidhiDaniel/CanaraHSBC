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
public class PlanHighlightsModel {
private static final Logger LOG = LoggerFactory.getLogger(PlanHighlightsModel.class);
	@Inject
	private String text;

    @Inject
	private String subTitle;

    @Inject
	private String fileReference;

    @Inject
	private String altText;

    @Inject
	private String checkBox;

	@Inject
	@Named("textbox")
	private List<PlanHighlightsList>planHighlights;
	
	public String getText() {
		return text;
	}

    public String getSubTitle() {
		return subTitle;
	}

    public String getFileReference() {
		return fileReference;
	}

    public String getAltText() {
		return altText;
	}

	public String getCheckBox() {
		return checkBox;
	}

	public List<PlanHighlightsList> getPlanHighlights(){
		return planHighlights;
	}
}
