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
public class MiniCard {
	private static final Logger LOG = LoggerFactory.getLogger(MiniCard.class);
	@Inject
	@Named("multifield")
	private List<MiniCardList> miniCard;
	@Inject
	private String text;
	@Inject
	private String miniButtonText;
	@Inject
	private String miniButton;
	@Inject
	private String miniTargetType;
	public List<MiniCardList> getMiniCard() {
		return miniCard;
	}
	public String getText() {
		return text;
	}
	
	public String getMiniButtonText() {
		return miniButtonText;
	}
	public String getMiniButton() {
		return miniButton;
	}
	public String getMiniTargetType() {
		return miniTargetType;
	}
	

}