package com.chl.core.models;

import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AccordionQueAns {
	private static final Logger LOG = LoggerFactory.getLogger(AccordionQueAns.class);
	@Inject
	private String question ;
	@Inject
	private String answer ;
	public String getQuestion() {
		return question;
	}
	public String getAnswer() {
		return answer;
	}

}