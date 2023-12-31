package com.chl.core.models;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Model(adaptables = Resource.class,  resourceType ={ "canarahsbclife/components/content/footer" } ,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class FooterModel {
	private static final Logger LOG = LoggerFactory.getLogger(FooterModel.class);
	@Inject
	@Named("multifield")
	private List<FooterList> footerlist;

	public List<FooterList> getFooterlist() {
		return footerlist;
	}

	@Inject
	@Named("multifield1")
	private List<FooterDetails> details;

	public List<FooterDetails> getDetails() {
		return details;
	}

	@Inject
	@Named("multifield2")
	private List<Footer> footer;

	public List<Footer> getFooter() {
		return footer;
	}

	@Inject
	@Named("multifield3")
	private List<FooterTitle> title;

	public List<FooterTitle> getTitle() {
		return title;
	}

	@Inject
	@Named("logo")
	private List<LogoList> logolist;

	public List<LogoList> getLogolist() {
		return logolist;
	}

	@Inject
	@Named("footertop")
	private List<TopDetails> list;
	

	public List<TopDetails> getList() {	
		return list;	
	}
	

	@Inject
	private String heading11;
	@Inject
	private String url11;
	@Inject
	private String heading12;
	@Inject
	private String url12;
	@Inject
	private String heading13;
	@Inject
	private String url13;
	@Inject
	private String heading14;
	@Inject
	private String url14;

	@Inject
	private String contactTitle;
	@Inject
	private String locationLogo;
	@Inject
	private String addressText;
	@Inject
	private String phoneTitle;
	@Inject
	private String phoneLogo;
	
	@Inject
	private String phoneNumber;
	@Inject
	private String emailTitle;
	@Inject
	private String emailLogo;
	
	@Inject
	private String emailAddress;

	@Inject
	private String heading;
	@Inject
	private String logoType;

	public String getHeading11() {

		return heading11;
	}

	public String getUrl11() {
		if (url11.contains(".")) {

			return url11;

		} else {
			return url11.concat(".html");
		}

	}

	public String getHeading12() {
		return heading12;
	}

	public String getUrl12() {
		if (url12.contains(".")) {

			return url12;

		} else {
			return url12.concat(".html");
		}

	}

	public String getHeading13() {
		return heading13;
	}

	public String getUrl13() {
		if (url13.contains(".")) {

			return url13;

		} else {
			return url13.concat(".html");
		}

	}

	public String getHeading14() {
		return heading14;
	}

	public String getUrl14() {
		if (url14.contains(".")) {

			return url14;

		} else {
			return url14.concat(".html");
		}

	}

	public String getContactTitle() {
		return contactTitle;
	}

	public String getLocationLogo() {
		return locationLogo;
	}

	public String getAddressText() {
		return addressText;
	}

	public String getPhoneTitle() {
		return phoneTitle;
	}

	public String getPhoneLogo() {
		return phoneLogo;
	}

	

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmailTitle() {
		return emailTitle;
	}

	public String getEmailLogo() {
		return emailLogo;
	}

	

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getHeading() {
		return heading;
	}
	public String getLogoType() {
		return logoType;
	}
}
