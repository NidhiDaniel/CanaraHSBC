/*
 *  Copyright 2015 Adobe Systems Incorporated
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.chl.core.models;

import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BlockTileList {
	private static final Logger LOG = LoggerFactory.getLogger(BlockTileList.class);
	@Inject
	private String fileReference;
	
	@Inject
	private String altText;
	@Inject
	private String richText;

	@Inject
	private String subTitle;

	public String getRichText() {
		return richText;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public String getFileReference() {
		return fileReference;
	}

	public String getAltText() {
		return altText;
	}
}
	