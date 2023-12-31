package com.chl.core.models;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TickerComponent {
    private static final Logger LOG = LoggerFactory.getLogger(TickerComponent.class);
    @Inject
    private String richText;
    @Inject
    private String layoutSpeed;

    public String getRichText() {
        return richText;
    }
	public String getLayoutSpeed() {
        return layoutSpeed;
    }
}

