package com.chl.core.utils.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

import com.chl.core.utils.SearchConfig;

@Component(service = { SearchConfig.class })
@Designate(ocd = SearchConfigImpl.Config.class)
public class SearchConfigImpl implements SearchConfig {

    private String rootPath;

    @Activate
    protected void activate(final Config config) {

        this.rootPath = config.RootPath();
    }

    @Override
    public String getRootPath() {
        return this.rootPath;
    }

    @ObjectClassDefinition(name = "Search Configuration", description = "")
    public @interface Config {

        @AttributeDefinition(name = "Root Path ", description = "Root Path for search")
        String RootPath() default "/content/canarahsbclife/in/en";

    }
}
