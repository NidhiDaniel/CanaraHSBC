package com.chl.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class VideoModel {
    @Inject
    private String pathLink;
    @Inject
    private String fileReference;

    @Inject
    private String checkBox;
    private String style;

    public String getCheckBox() {
        return checkBox;
    }

    public String getPathLink() {
        return getCheckBox().equalsIgnoreCase("true")?pathLink:pathLink.concat("?autoplay=1;enablejsapi=1&version=3&playerapiid=ytplayer");
    }

    public String getFileReference() {
        return fileReference;
    }

    public String getStyle() {
        return style;
    }

}
