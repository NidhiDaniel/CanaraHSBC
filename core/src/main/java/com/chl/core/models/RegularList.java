package com.chl.core.models;

import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class RegularList {
    
    @Inject
	private String listText;
    @Inject
	private String listLink;

    public String getListText() {
        return listText;
    }
    public String getListLink() {
        return listLink.contains(".") ? listLink: listLink.concat(".html");
    }
}
