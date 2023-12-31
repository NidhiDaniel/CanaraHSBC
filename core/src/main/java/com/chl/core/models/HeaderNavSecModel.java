package com.chl.core.models;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderNavSecModel {
    @Inject
	private String section1Title;
	@Inject
	private String section1Url;
	@Inject
	@Named("subNavSecOneMulti")
	private List<SubNavigation> subNavSecOneMulti;
	@Inject
	private String section2Title;
	@Inject
	private String section2Url;
	@Inject
	@Named("subNavSecTwoMulti")
	private List<SubNavigation> subNavSecTwoMulti;
	@Inject
	private String section3Title;
	@Inject
	private String section3Url;
	@Inject
	@Named("subNavSecThreeMulti")
	private List<SubNavigation> subNavSecThreeMulti;
	@Inject
	private String section4Title;
	@Inject
	private String section4Url;
	@Inject
	@Named("subNavSecFourMulti")
	private List<SubNavigation> subNavSecFourMulti;
	@Inject
	private String section5Title;
	@Inject
	private String section5Url;
	@Inject
	@Named("subNavSecFiveMulti")
	private List<SubNavigation> subNavSecFiveMulti;
	@Inject
	private String section6Title;
	@Inject
	private String section6Url;
	@Inject
	@Named("subNavSecSixMulti")
	private List<SubNavigation> subNavSecSixMulti;
	
	public String getSection1Title() {
		return section1Title;
	}
	public String getSection1Url() {
		return section1Url.contains(".") ? section1Url: section1Url.concat(".html");
	}
	public List<SubNavigation> getSubNavSecOneMulti() {
		return subNavSecOneMulti;
	}
	public String getSection2Title() {
		return section2Title;
	}
	public String getSection2Url() {
		return section2Url.contains(".") ? section2Url: section2Url.concat(".html");
	}
	public List<SubNavigation> getSubNavSecTwoMulti() {
		return subNavSecTwoMulti;
	}
	public String getSection3Title() {
		return section3Title;
	}
	public String getSection3Url() {
		return section3Url.contains(".") ? section3Url: section3Url.concat(".html");
	}
	public List<SubNavigation> getSubNavSecThreeMulti() {
		return subNavSecThreeMulti;
	}
	public String getSection4Title() {
		return section4Title;
	}
	public String getSection4Url() {
		return section4Url.contains(".") ? section4Url: section4Url.concat(".html");
	}
	public List<SubNavigation> getSubNavSecFourMulti() {
		return subNavSecFourMulti;
	}
	public String getSection5Title() {
		return section5Title;
	}
	public String getSection5Url() {
		return section5Url.contains(".") ? section5Url: section5Url.concat(".html");
	}
	public List<SubNavigation> getSubNavSecFiveMulti() {
		return subNavSecFiveMulti;
	}
	public String getSection6Title() {
		return section6Title;
	}
	public String getSection6Url() {
		return section6Url.contains(".") ? section6Url: section6Url.concat(".html");
	}
	public List<SubNavigation> getSubNavSecSixMulti() {
		return subNavSecSixMulti;
	}  
}

