package com.chl.core.models;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BannerList {
    private static final Logger LOG = LoggerFactory.getLogger(BannerList.class);
    @Inject
	@Named("bannerList")
	private List <BannerModel> bannerList;
    
    @Inject
    private String delay;
    @Inject
    private String autopauseDisabled;
    
    public String getDelay() {
        return delay;
    }
    public String getAutopauseDisabled() {
        return autopauseDisabled;
    }
    

    public List<BannerModel> getBannerList() {
        return bannerList;
    }
}
