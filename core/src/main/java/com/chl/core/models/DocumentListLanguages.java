package com.chl.core.models;



import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DocumentListLanguages {
	private static final Logger LOG = LoggerFactory.getLogger(DocumentListLanguages.class);
	@Inject
	private String languageList ;
	@Inject
	private String langFileLink ;
	public String getImage() {
		if (getLangFileLink().contains(".pdf")) {
            return "/content/dam/canarahsbclife/in/en/why-buy/pdf.png";
        }
		else if (getLangFileLink().contains(".docx")) {
            return "/content/dam/canarahsbclife/in/en/why-buy/word.jpg";
        }
		else if (getLangFileLink().contains(".xlsx")) {
            return "/content/dam/canarahsbclife/in/en/why-buy/excel.png";
        }else {
            return "/content/dam/canarahsbclife/in/en/why-buy/link.png";
        }
	}
	public String getDownload() {
		return "/content/dam/canarahsbclife/in/en/why-buy/download.svg";
	}
	public String getLangFileLink() {
		if (langFileLink.contains(".pdf")) {
            return langFileLink;
        }
		else if (langFileLink.contains(".docx")) {
            return langFileLink;
        }
		else if (langFileLink.contains(".xlsx")) {
            return langFileLink;
        }
		else {
		return langFileLink.concat(".html");
		}
	}
	public String getLanguageList() {
		return languageList;
	}
	
	
	
}
