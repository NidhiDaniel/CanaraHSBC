package com.chl.core.models;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables =  Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ContactFormModel {
    private static final Logger LOG = LoggerFactory.getLogger(ContactFormModel.class);
    @ValueMapValue
    private String title;

    @ValueMapValue
    private String cta;

    @ValueMapValue
    private String ctaLink;

    @ValueMapValue
    private String termsAndConditions;

    @Inject
    @Named("formMultiField")
    private List<ContactFormMultifield> formFieldList;

    public String getTitle() {
        return title;
    }

    public String getCta() {
        return cta;
    }

    public String getCtaLink() {
        return ctaLink.contains(".") ? ctaLink: ctaLink.concat(".html");
    }

    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    public List<ContactFormMultifield> getFormFieldList() {
        return formFieldList;
    }
}


