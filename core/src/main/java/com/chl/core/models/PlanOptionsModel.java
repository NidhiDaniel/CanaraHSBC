
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
public class PlanOptionsModel {
	private static final Logger LOG = LoggerFactory.getLogger(PlanOptionsModel.class);

    @Inject
	@Named("multifield")
	private List <PlanOptionListBean> planOptionList;
	
	public List<PlanOptionListBean> getPlanOptionList() {
		return planOptionList;
	}



@Inject
private String heading;

@Inject
private String subheading;

public String getHeading() {
		return heading;
	}

	public String getSubheading() {
		return subheading;
	}
    

}
