package com.chl.core.models;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class LogoList {
	private static final Logger LOG = LoggerFactory.getLogger(LogoList.class);
	@Inject
	private String image;
	@Inject
	private String imageUrl;
	

	public String getImage() {
		return image;
	}

	public String getImageUrl() {
		if (imageUrl.contains(".")) {

			return imageUrl;

		}

		else {

			return imageUrl.concat(".html");

		}

	}

	
}