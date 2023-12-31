//
// Decompiled by Procyon v0.5.36
//

package com.chl.core.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.commons.json.JSONException;

import com.day.cq.wcm.api.Page;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import com.chl.core.beans.PageBean;

public class SearchService {
	public static String rootPath;
	public static JsonObject json = new JsonObject();

	static List<PageBean> blogArray;
	static List<PageBean> pdtArray;
	static List<PageBean> toolsArray;
	static List<PageBean> catArray;
	static List<PageBean> similarArray;
	static List<PageBean> finalArray;

	/*
	 * public static void searchServletCall() throws IOException {
	 * try {
	 * SearchServlet.doSearchServlet(request,response);
	 * }
	 * catch (Exception e) {
	 * e.printStackTrace();
	 * }
	 * }
	 */

	public static void doSearch(final SlingHttpServletResponse response, final ResourceResolver resourceResolver,
			final String rootPath, final String param, int start, int limit) throws IOException {
		try {
			if (response != null) {
				response.setContentType("text/plain");

			}

			SearchService.rootPath = rootPath;

			blogArray = new ArrayList<PageBean>();
			pdtArray = new ArrayList<PageBean>();
			toolsArray = new ArrayList<PageBean>();
			catArray = new ArrayList<PageBean>();
			similarArray = new ArrayList<PageBean>();
			finalArray = new ArrayList<PageBean>();

			getPages(response, resourceResolver, param);

			finalArray.addAll(pdtArray);
			finalArray.addAll(toolsArray);
			finalArray.addAll(catArray);
			finalArray.addAll(blogArray);

			if (finalArray.size() < 0) {
				finalArray.addAll(similarArray);
			}

			limit = start + limit;
			if (finalArray.size() < limit) {
				limit = finalArray.size();
			}
			// response.getWriter().write(finalArray.size() + " start =" + start + " limit
			// =" + limit);
			finalArray = finalArray.subList(start, limit);

			/*
			 * json.put("blogResult", blogArray); json.put("toolsResult", toolsArray);
			 * json.put("pdtResult", pdtArray); message = json.toString();
			 */
			response.setContentType("application/json");

			response.getWriter().write(new Gson().toJson(finalArray));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getPages(final SlingHttpServletResponse response, final ResourceResolver resourceResolver,
			final String param) throws JSONException {
		try {

			if (!StringUtils.isBlank((CharSequence) SearchService.rootPath)) {
				final Resource rootNode = resourceResolver.getResource(SearchService.rootPath);
				if (rootNode.hasChildren()) {
					final Iterator<Resource> childNodeIterator = (Iterator<Resource>) rootNode.listChildren();
					while (childNodeIterator.hasNext()) {
						final Resource child = childNodeIterator.next();
						if (!StringUtils.equals((CharSequence) child.getName(), (CharSequence) "jcr:content")) {

							syncPage(response, resourceResolver, child, param);
						}
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void syncPage(final SlingHttpServletResponse response, final ResourceResolver resourceResolver,
			final Resource currentNodeRes, final String param) throws IOException, JSONException {
		if (null != currentNodeRes.getChild("jcr:content")) {
			final Resource pageJcr = currentNodeRes.getChild("jcr:content");
			final ValueMap properties = (ValueMap) pageJcr.adaptTo((Class) ValueMap.class);

			getPageDetails(response, resourceResolver, currentNodeRes, param);
			final Iterator<Resource> childNodeRes = (Iterator<Resource>) currentNodeRes.listChildren();

			while (childNodeRes.hasNext()) {
				final Resource subChild = childNodeRes.next();
				syncPage(response, resourceResolver, subChild, param);
			}
		}
	}

	public static void getPageDetails(final SlingHttpServletResponse response, final ResourceResolver resourceResolver,
			final Resource currentNodeRes, final String param) throws IOException, JSONException {
		try {

			final String pagePath = currentNodeRes.getPath();

			// final String productPagePath = pagePath.replace("/content/choice/in/en", "");
			final Resource pageJcr = currentNodeRes.getChild("jcr:content");
			final ValueMap properties = (ValueMap) pageJcr.adaptTo((Class) ValueMap.class);
			final String desc = properties.getOrDefault("jcr:description", "").toString();
			String pageName = properties.getOrDefault("pageTitle", "").toString();
			boolean exclude = false;
			exclude = Boolean.valueOf(properties.getOrDefault("hideinsearch", "").toString());
			if (!exclude) {
				if (pageName.isEmpty()) {
					pageName = currentNodeRes.getName();
				}
				String tempParam = param.replaceAll("-", " ");
				final Iterator<Resource> childNodeRes = (Iterator<Resource>) currentNodeRes.listChildren();
				try {
					// double similarityPagePath = findSimilarity(pagePath, param);
					double similarityPageName = findSimilarity(pageName, tempParam);

					PageBean pb = new PageBean(pageName, pagePath, desc);

					if (pagePath.toLowerCase().contains("/content/canarahsbclife/in/en/blog")
							&& pageName.toLowerCase().contains(tempParam.toLowerCase())) {
						blogArray.add(pb);

					} else if (pagePath.toLowerCase().contains("/content/canarahsbclife/in/en/tools-and-calculators")
							&& pageName.toLowerCase().contains(tempParam.toLowerCase())) {
						toolsArray.add(pb);

					} else if ((pageName.toLowerCase().contains(tempParam.toLowerCase()))) {
						pdtArray.add(pb);

					} else if (childNodeRes.hasNext() && pageName.toLowerCase().contains(tempParam.toLowerCase())) {
						catArray.add(pb);
					}

					else if (similarityPageName > 0.6) {
						similarArray.add(pb);

					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static int getLevenshteinDistance(String X, String Y) {
		int m = X.length();
		int n = Y.length();

		int[][] T = new int[m + 1][n + 1];
		for (int i = 1; i <= m; i++) {
			T[i][0] = i;
		}
		for (int j = 1; j <= n; j++) {
			T[0][j] = j;
		}

		int cost;
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				cost = X.charAt(i - 1) == Y.charAt(j - 1) ? 0 : 1;
				T[i][j] = Integer.min(Integer.min(T[i - 1][j] + 1, T[i][j - 1] + 1),
						T[i - 1][j - 1] + cost);
			}
		}

		return T[m][n];
	}

	public static double findSimilarity(String x, String y) {
		if (x == null || y == null) {
			throw new IllegalArgumentException("Strings must not be null");
		}

		double maxLength = Double.max(x.length(), y.length());
		if (maxLength > 0) {
			// optionally ignore case if needed
			return (maxLength - getLevenshteinDistance(x, y)) / maxLength;
		}
		return 1.0;
	}

}
