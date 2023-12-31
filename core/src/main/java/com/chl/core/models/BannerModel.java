package com.chl.core.models;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BannerModel {
    private static final Logger LOG = LoggerFactory.getLogger(BannerModel.class);
    @Inject
    private String imageCheck;
    @Inject
    private String tagImage1DesktopAltText;
    @Inject
    private String tagImage1MobileAltText;
    @Inject
    private String tagImage2DesktopAltText;
    @Inject
    private String tagImage2MobileAltText;
    @Inject
    private String fileReferenceLogoImage;
    @Inject
    private String fileReferenceTagImage1Desktop;
    @Inject
    private String fileReferenceTagImage2Desktop;
    @Inject
    private String fileReferenceTagImage1Mobile;
    @Inject
    private String fileReferenceTagImage2Mobile;
    @Inject
    private String tagImage1Description;
    @Inject
    private String tagImage2Description;
    @Inject
    private String fileReferenceDesktop;
    @Inject
    private String fileReferenceMobile;
    @Inject
    private String logoAltText;
    @Inject
    private String desktopAltText;
    @Inject
    private String mobileAltText;
    @Inject
    private String coverDescription;
    @Inject
    private String button1Text;
    @Inject
    private String button2Text;
    @Inject
    private String button1Link;
    @Inject
    private String button2Link;
    @Inject
    private String button1Target;
    @Inject
    private String button2Target;
    @Inject
    private String infoText;
    @Inject
    private String imageLink;
    @Inject
    private String imageTarget;
    @Inject
    private String checkBox;

    public String getCheckBox() {
        return checkBox;
    }

    public String getImageCheck() {
        return imageCheck;
    }

    public String getTagImage1DesktopAltText() {
        return tagImage1DesktopAltText;
    }

    public String getTagImage1MobileAltText() {
        return tagImage1MobileAltText;
    }

    public String getTagImage2DesktopAltText() {
        return tagImage2DesktopAltText;
    }

    public String getTagImage2MobileAltText() {
        return tagImage2MobileAltText;
    }

    public String getFileReferenceTagImage1Desktop() {
        return fileReferenceTagImage1Desktop;
    }

    public String getFileReferenceTagImage2Desktop() {
        return fileReferenceTagImage2Desktop;
    }

    public String getFileReferenceTagImage1Mobile() {
        return fileReferenceTagImage1Mobile;
    }

    public String getFileReferenceTagImage2Mobile() {
        return fileReferenceTagImage2Mobile;
    }

    public String getTagImage1Description() {
        return tagImage1Description;
    }

    public String getTagImage2Description() {
        return tagImage2Description;
    }

    public String getImageLink() {
        if(imageLink.contains(".")){  

            return imageLink;
 
         }else{
 
             return imageLink.concat(".html");
 
     }
     
    }

    public String getImageTarget() {
        return imageTarget;
    }

    public String getInfoText() {
        return infoText;
    }

    public String getButton1Target() {
        return button1Target;
    }

    public String getButton2Target() {
        return button2Target;
    }

    public String getButton1Text() {
        return button1Text;
    }

    public String getButton2Text() {
        return button2Text;
    }

    public String getButton1Link() {
       
        if(button1Link.contains(".")){  

            return button1Link;
 
         }else{
 
             return button1Link.concat(".html");
 
     }
     
    }

    public String getButton2Link() {
       
        if(button2Link.contains(".")){  

            return button2Link;
 
         }else{
 
             return button2Link.concat(".html");
 
     }
     

    }

    public String getCoverDescription() {
        return coverDescription;
    }

    public String getFileReferenceLogoImage() {
        return fileReferenceLogoImage;
    }

    public String getFileReferenceDesktop() {
        return fileReferenceDesktop;
    }

    public String getFileReferenceMobile() {
        return fileReferenceMobile;

    }

    public String getLogoAltText() {
        return logoAltText;
    }

    public String getDesktopAltText() {
        return desktopAltText;
    }

    public String getMobileAltText() {
        return mobileAltText;
    }

}
