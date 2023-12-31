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
public class DocumentListModel {
	private static final Logger LOG = LoggerFactory.getLogger(DocumentListModel.class);
	@Inject
	private String title ;
	@Inject
	private String subtitle ;
	@Inject
	private String seeMoreButton ;
	@Inject
	@Named("multifield")
	private List<DocumentList> documentList;
	@Inject
	private String multilangTitle ;
	@Inject
	@Named("documentLang")
	private List<DocumentListLanguages> docLang;
	
	public List<DocumentListLanguages> getDocLang() {
		return docLang;
	}
	public String getMultilangTitle() {
		return multilangTitle;
	}
	public String getTitle() {
		return title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public String getSeeMoreButton() {
		return seeMoreButton;
	}
	public List<DocumentList> getDocumentList() {
		return documentList;
	}
}
