package com.chl.core.models;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderToggle {
    private static final Logger LOG = LoggerFactory.getLogger(HeaderToggle.class);

    @ScriptVariable
    private Page currentPage;
    @Inject
    private SlingHttpServletRequest request;
    private String hindiPagePath;
    private String englishPagePath;
    private boolean englishPage;

    @PostConstruct
    protected void init() {
        String currentPagePath = currentPage.getPath();
        englishPage = currentPagePath.contains("/en");
        String searchResource = currentPagePath.replace("/en", "/hi");
        englishPagePath = currentPagePath.replace("/hi", "/en").concat(".html");
        PageManager pageManager = request.getResourceResolver().adaptTo(PageManager.class);
        Page hindiPage = pageManager.getPage(searchResource);
        hindiPagePath = (hindiPage == null) ? "pagenotfound" : searchResource.concat(".html");
    }
    public String getHindiPagePath() {
        return hindiPagePath;
    }

    public String getEnglishPagePath() {
        return englishPagePath;
    }
    public boolean isEnglishPage() {
        return englishPage;
    }
}
