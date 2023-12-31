package com.chl.core.models;

import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ContactFormMultifield {

    @Inject
    private String fieldName;

    @Inject
    private String fieldType;

    @Inject
    private String checkMandatory;

    @Inject
    private String file;
    private static final Logger LOG = LoggerFactory.getLogger(ContactFormMultifield.class);

    public String getFile() {

        return file;
    }

    public String getFieldName() {

        return fieldName;
    }

    public String getFieldType() {

        return fieldType;
    }

    public String getCheckMandatory() {

        return checkMandatory;
    }
}