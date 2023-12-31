package com.chl.core.models;

import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DocumentList {
	private static final Logger LOG = LoggerFactory.getLogger(DocumentList.class);
	@Inject
	private String documentTitle;
	@Inject
	private String fileLink;
	public String getImagePath() {
		if (getFileLink().contains(".pdf")) {
            return "/content/dam/canarahsbclife/in/en/why-buy/pdf.png";
        }
		else if (getFileLink().contains(".docx")) {
            return "/content/dam/canarahsbclife/in/en/why-buy/word.jpg";
        }
		else if (getFileLink().contains(".xlsx")) {
            return "/content/dam/canarahsbclife/in/en/why-buy/excel.png";
        }else {
            return "/content/dam/canarahsbclife/in/en/why-buy/link.png";
        }
	}
	public String getDownloadImage() {
		return "/content/dam/canarahsbclife/in/en/why-buy/download.svg";
	}
	public String getDocumentTitle() {
		return documentTitle;
	}
	public String getFileLink() {
		if (fileLink.contains(".pdf")) {
            return fileLink;
        }
		else if (fileLink.contains(".docx")) {
            return fileLink;
        }
		else if (fileLink.contains(".xlsx")) {
            return fileLink;
        }
		else {
		return fileLink.concat(".html");
		}
	}
}