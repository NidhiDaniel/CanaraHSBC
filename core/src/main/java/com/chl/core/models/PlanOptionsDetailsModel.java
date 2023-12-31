
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
public class PlanOptionsDetailsModel {

	private static final Logger LOG = LoggerFactory.getLogger(PlanOptionsModel.class);

    @Inject
	@Named("multifield")
	private List <PlanOptionDetailsListBean> planOptionDetailsList;
	
	public List<PlanOptionDetailsListBean> getPlanOptionDetailsList() {
		return planOptionDetailsList;
	}

	

@Inject
private String heading;



public String getHeading() {
		return heading;
	}

	
    

}
