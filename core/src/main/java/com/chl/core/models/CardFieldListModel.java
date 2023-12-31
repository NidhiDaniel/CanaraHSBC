package com.chl.core.models;

import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CardFieldListModel {
	private static final Logger LOG = LoggerFactory.getLogger(CardFieldListModel.class);
	@Inject
	private String fileReference;

	@Inject
	private String cardtilealtText;

	@Inject
	private String cardTitle;

	@Inject
	private String text;

	@Inject
	private String cardtilebuttonText;

	@Inject
	private String cardtilebuttonLink;

	public String getFileReference() {
		return fileReference;
	}

	public String getCardtilealtText() {
		return cardtilealtText;
	}

	public String getCardTitle() {
		return cardTitle;
	}

	public String getText() {
		return text;
	}

	public String getCardtilebuttonText() {
		return cardtilebuttonText;
	}

	public String getCardtilebuttonLink() {
		if(cardtilebuttonLink.contains(".")){
            return cardtilebuttonLink;
        }
        else{
            return cardtilebuttonLink.concat(".html");
        }
	}
	
}