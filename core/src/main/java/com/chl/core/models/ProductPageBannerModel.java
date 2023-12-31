package com.chl.core.models;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class,defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class ProductPageBannerModel {
private static final Logger LOG = LoggerFactory.getLogger(ProductPageBannerModel.class);
	@Inject
	private String fileReferenceLogo;
	@Inject
	private String logoAltText;
	@Inject
	private String fileReferenceDesktop;
	@Inject
	private String altText;
	@Inject
	private String fileReferenceMobile;
	@Inject
	private String mobileAltText;
	@Inject
	private String text;
	@Inject
	private String description;
	@Inject
	private String button;
	@Inject
	private String productBannerLink;
	@Inject
	private String productBannerTargetType;
	@Inject
	private String ctaButton;
	@Inject
	private String pageBannerLink;
	@Inject
	private String pageBannerTargetType;
	@Inject
	private String titleCheckbox;

	public String getFileReferenceLogo() {
		return fileReferenceLogo;
	}
	public String getLogoAltText() {
		return logoAltText;
	}
	public String getFileReferenceDesktop() {
		return fileReferenceDesktop;
	}
	public String getAltText() {
		return altText;
	}
	public String getFileReferenceMobile() {
		return fileReferenceMobile;
	}
	public String getMobileAltText() {
		return mobileAltText;
	}
	public String getText() {
		return text;
	}
	public String getDescription() {
		return description;
	}
	public String getButton() {
		return button;
	}
	public String getProductBannerLink() {
		return productBannerLink.contains(".") ? productBannerLink : productBannerLink.concat(".html");
		}
	public String getProductBannerTargetType() {
		return productBannerTargetType;
	}
	public String getCtaButton() {
		return ctaButton;
	}
	public String getPageBannerLink() {
		return pageBannerLink.contains(".") ? pageBannerLink : pageBannerLink.concat(".html");
		}
	public String getPageBannerTargetType() {
		return pageBannerTargetType;
	}
	public String getTitleCheckbox() {
		return titleCheckbox;
	}

}
