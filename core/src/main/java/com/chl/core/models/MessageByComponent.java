package com.chl.core.models;
import javax.inject.Inject;
import java.util.List;
import javax.inject.Named;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MessageByComponent {
    private static final Logger LOG = LoggerFactory.getLogger(MessageByComponent.class);
    @Inject 
    private String title;
    @Inject 
    private String  tickforvariation;
    @Inject 
    private String messgeCTAbuttonTargetType;
    @Inject
    @Named("multifield")
    private List<MessageCardList> cardList;
    public String getTitle() {
        return title;
    }
    public String getTickforvariation() {
        return tickforvariation;
    }
    public String getMessgeCTAbuttonTargetType() {
        return messgeCTAbuttonTargetType;
    }   
    public List<MessageCardList> getCardList() {
        return cardList;
    }
}
