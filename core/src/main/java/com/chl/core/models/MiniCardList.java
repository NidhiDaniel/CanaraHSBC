
package com.chl.core.models;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MiniCardList {
	private static final Logger LOG = LoggerFactory.getLogger(MiniCardList.class);
	@Inject
	private String status;
	@Inject
	private String iconImage;
	@Inject
	private String altText;
    @Inject
	private String title;
    @Inject
	private String cardUrlTargetType;
	
	public String getStatus() {
		return status;
	}
	
	public String getIconImage() {
		return iconImage;
	}
	
	public String getAltText() {
		return altText;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getCardUrlTargetType() {

        if(cardUrlTargetType.contains(".")){  

           return cardUrlTargetType;

        }else{

            return cardUrlTargetType.concat(".html");

    }
	
}
}
