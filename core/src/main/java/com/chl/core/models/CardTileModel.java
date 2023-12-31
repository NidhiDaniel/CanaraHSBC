package com.chl.core.models;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class CardTileModel {
	private static final Logger LOG = LoggerFactory.getLogger(CardTileModel.class);
	@Inject
	private String title;
	@Inject
	private String subTitle;
	@Inject
	private String cardtilebuttonTarget;
	@Inject
	@Named("cardTile")
	private List<CardFieldListModel> cardTile;
	public String getTitle() {
		return title;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public List<CardFieldListModel> getCardTile() {
		return cardTile;
	}
	public String getCardtilebuttonTarget() {
		return cardtilebuttonTarget;
	}
}