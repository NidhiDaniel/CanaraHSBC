package com.chl.core.models;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MessageCardList {
    private static final Logger LOG = LoggerFactory.getLogger(MessageCardList.class);
    @Inject 
    private String fileReference;
    @Inject 
    private String altText;
    @Inject 
    private String name;
    @Inject 
    private String designation;
    @Inject 
    private String message;
    @Inject 
    private String mesageCTAbuttonname;
    @Inject 
    private String messgeCTAbuttonUrl;
    
    public String getFileReference() {
        return fileReference;
    }
    public String getAltText() {
        return altText;
    }
    public String getName() {
        return name;
    }
    public String getDesignation() {
        return designation;
    }
    public String getMessage() {
        return message;
    }
    public String getMesageCTAbuttonname() {
        return mesageCTAbuttonname;
    }
    public String getMessgeCTAbuttonUrl() {
        if(messgeCTAbuttonUrl.contains(".")) {  
            return messgeCTAbuttonUrl;
         }
         else {
            return messgeCTAbuttonUrl.concat(".html");
        }
    }
}