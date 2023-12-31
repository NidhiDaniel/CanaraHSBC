// 
// Decompiled by Procyon v0.5.36
// 

package com.chl.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.chl.core.utils.SearchConfig;
import com.chl.core.utils.SearchService;

@Component(service = { Servlet.class }, property = { "service.description=Search servlet", "sling.servlet.methods=GET", "sling.servlet.paths=/bin/choicesearchresult" , "sling.servlet.extensions=json" })
public class SearchServlet extends SlingAllMethodsServlet
{
    private static final long serialVersionUID = 1L;
    @Reference
    private SearchConfig searchConfig;
    
    
    protected void doGet(final SlingHttpServletRequest request, final SlingHttpServletResponse response) throws ServletException, IOException {
    	
      try {
		 
            String param = request.getParameter("fulltext");
    	String start = request.getParameter("start");
    	String limit = request.getParameter("limit");
        final String rootPath = this.searchConfig.getRootPath();
		
		 
        final ResourceResolver resourceResolver = request.getResourceResolver();
        int s = 0, l = 25;
        try {
        	s=Integer.parseInt(start);
        	l=Integer.parseInt(limit);
        	
        }catch(NumberFormatException e) {}
      
        SearchService.doSearch(response, resourceResolver, rootPath,param,s,l);
        final Resource resource = request.getResource();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
