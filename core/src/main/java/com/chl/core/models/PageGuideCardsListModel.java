package com.chl.core.models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PageGuideCardsListModel {
	private static final Logger LOG = LoggerFactory.getLogger(PageGuideCardsListModel.class);

	@Self
	Resource resource;

	private String thumbnail = "/content/dam/canarahsbclife/in/en/global/No-Image-Found-400x264.png";
	private String date;

	public String getThumbnail() {
		try {
			PageManager pm = resource.getResourceResolver().adaptTo(PageManager.class);
			Page currentPage = pm.getPage(getPageguidepageUrl().replace(".html", ""));
			thumbnail = currentPage.getProperties().get("./image/fileReference", thumbnail);

		} catch (Exception e) {
			LOG.error("getThumbnail{} : " + e.getMessage());
		}
		return thumbnail;

	}

	public String getDate() {
		PageManager pm = resource.getResourceResolver().adaptTo(PageManager.class);
		Page currentPage = pm.getPage(getPageguidepageUrl().replace(".html", ""));
		Date dateobj = currentPage.getLastModified().getTime();
		String pattern = "MMMMM dd, yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, new Locale("en", "DE"));
		String date = simpleDateFormat.format(dateobj);
		String output = date.substring(0, 1).toUpperCase() + date.substring(1);
		return output;
	}

	@Inject
	private String views;

	@Inject
	@Default(values = "title")
	private String title;

	@Inject
	@Default(values = "description")
	private String description;

	@Inject
	private String pageguidebuttonText;

	@Inject
	private String pageguidepageUrl;

	public String getViews() {
		return views;
	}

	public String getTitle() {
		if (title.equals("title")) {
			PageManager pm = resource.getResourceResolver().adaptTo(PageManager.class);
			Page currentPage = pm.getPage(getPageguidepageUrl().replace(".html", ""));
			title = currentPage.getPageTitle().toString();
		}
		return title;

	}

	public String getDescription() {
		if (description.equals("description")) {
			PageManager pm = resource.getResourceResolver().adaptTo(PageManager.class);
			Page currentPage = pm.getPage(getPageguidepageUrl().replace(".html", ""));
			description = currentPage.getDescription().toString();
		}
		return description;
	}

	public String getPageguidebuttonText() {
		return pageguidebuttonText;
	}

	public String getPageguidepageUrl() {
		if (pageguidepageUrl.contains(".")) {
			return pageguidepageUrl;
		} else {
			return pageguidepageUrl.concat(".html");
		}
	}

}
