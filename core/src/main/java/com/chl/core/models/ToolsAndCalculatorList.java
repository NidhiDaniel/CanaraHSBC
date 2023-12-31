package com.chl.core.models;

import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ToolsAndCalculatorList {
    private static final Logger LOG = LoggerFactory.getLogger(ToolsAndCalculatorList.class);
    @Inject
    private String iconImage;
    @Inject
    private String altText;

    @Inject
    private String cardTitle;
    @Inject
    private String btnText;
    @Inject
    private String btnLink;
    

    public String getBtnText() {
        return btnText;
    }

    public String getBtnLink() {
        if(btnLink.contains(".")){  

            return btnLink;
 
         }else{
 
             return btnLink.concat(".html");
 
     }
    }

    

    public String getCardTitle() {
        return cardTitle;
    }
    public String getAltText() {

        return altText;
    }

    public String getIconImage() {
        return iconImage;
    }

}
