// 
// Decompiled by Procyon v0.5.36
// 

package com.chl.core.beans;

import org.apache.commons.io.FilenameUtils;

public class PageBean
{
    private String pagePath;
    private String pageName;
    private String pageDesc;
    
    public PageBean(final String pagePath, final String pageName) {
        this.pagePath = pagePath;
        this.pageName = pageName;
        this.pageDesc = null;
    }
    
    
    
    public PageBean(String pageName, String pagePath, String pageDesc) {
		super();
		this.pagePath = pagePath;
		this.pageName = pageName;
		this.pageDesc = pageDesc;
	}



	public String getPagePath() {
		
		
		
			return this.pagePath;
		
        
    }
    
    public String getPageName() {
        return this.pageName;
    }

	public String getPageDesc() {
		return pageDesc;
	}
    
    
}
