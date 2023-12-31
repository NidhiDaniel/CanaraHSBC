// package com.chl.core.models;
// import java.util.List;
// import javax.inject.Inject;
// import javax.inject.Named;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.apache.sling.api.resource.Resource;
// import org.apache.sling.models.annotations.DefaultInjectionStrategy;
// import org.apache.sling.models.annotations.Model;
// @Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
// public class MainNavigation {
// 	private static final Logger LOG = LoggerFactory.getLogger(MainNavigation.class);
// 	@Inject
// 	@Named("submulti")
// 	private List<SubNavigation> subNavigation;
// 	@Inject
// 	private String heading;
// 	@Inject
// 	private String headingLink;
	
// 	public List<SubNavigation> getSubNavigation() {
// 		return subNavigation;
// 	}
// 	public String getHeading() {
// 		return heading;
// 	}
	
// 	public String getHeadingLink() {
// 		return headingLink;
// 	}
	

// }