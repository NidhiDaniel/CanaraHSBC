package com.chl.core.models;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class SubNavigation {
	private static final Logger LOG = LoggerFactory.getLogger(SubNavigation.class);
	@Inject
	@Named("multifield2")
	private List<CardList> cardList;
	@Inject
	@Named("multifield3")
	private List<ImageCardList> imagecardList;
	@Inject
	@Named("multifield4")
	private List<RegularList> regularList;
	@Inject
	private String subHeading;
	@Inject
	private String subHeadingUrl;
	@Inject
	private String itemCategory;
	@Inject
	private String linkoutside;
	@Inject
	private String customList;
	@Inject
	private String fileReferenceImage1;
	@Inject
	private String link1;
	@Inject
	private String linkView;
	@Inject
	private String viewLink;
	@Inject
	private String viewText;
	@Inject
	private String fileReferenceBannerImage;
	@Inject
	private String bannerImageAltText;
	@Inject
	private String image1AltText;
	@Inject
	private String image2AltText;
	@Inject
	private String image3AltText;
	@Inject
	private String cardImageLink;
	@Inject
	private String fileReferenceImage3;
	@Inject
	private String link3;

	private String customList1;
	private String customList2;
	private boolean customListCount5;
	private List<String> customListForCountFivePlus;


	public String getSubHeading() {
		return subHeading;
	}

	public String getSubHeadingUrl() {
		return subHeadingUrl.contains(".") ? subHeadingUrl: subHeadingUrl.concat(".html");
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public List<CardList> getCardList() {
		return cardList;
	}

	public List<ImageCardList> getImagecardList() {
		return imagecardList;
	}

	public String getCustomList() {
		return customList;
	}

	public String getFileReferenceImage1() {
		return fileReferenceImage1;
	}

	public String getLink1() {
		return link1.contains(".") ? link1: link1.concat(".html");
	}

	public String getLinkView() {
		return linkView;
	}

	public String getViewLink() {
		return viewLink.contains(".") ? viewLink: viewLink.concat(".html");
	}

	public String getViewText() {
		return viewText;
	}

	public String getLinkoutside() {
		return linkoutside.contains(".") ? linkoutside: linkoutside.concat(".html");
	}

	public String getFileReferenceBannerImage() {
		return fileReferenceBannerImage;
	}

	public String getCardImageLink() {
		return cardImageLink.contains(".") ? cardImageLink: cardImageLink.concat(".html");
	}

	public List<RegularList> getRegularList() {
		return regularList;
	}

	public String getFileReferenceImage3() {
		return fileReferenceImage3;
	}

	public String getLink3() {
		return link3.contains(".") ? link3: link3.concat(".html");
	}

	public String getBannerImageAltText() {
		return bannerImageAltText;
	}

	public String getImage1AltText() {
		return image1AltText;
	}

	public String getImage2AltText() {
		return image2AltText;
	}

	public String getImage3AltText() {
		return image3AltText;
	}
	public List<String> getCustomListForCountFivePlus(){
		int count = 0;
		int index = -1;
		String input = customList;
		while ((index = customList.indexOf("<li>", index + 1)) != -1) {
			count++;
		}
		if (count > 5) {
			input = input.replaceAll("<ul>", "").replaceAll("</ul>", "");
		
			int numFirst = count / 2;
			int numSecond = count % 2;
		
			String[] liArray = input.split("<li>");
		
			String firstString = "<ul>\n";
			for (int i = 1; i <= numFirst; i++) {
				firstString += "<li>" + liArray[i] + "</li>\n";
			}
			firstString += "</ul>";
		
			String secondString = "<ul>\n";
			for (int i = numFirst + 1; i <= numFirst * 2 + numSecond; i++) {
				secondString += "<li>" + liArray[i] + "</li>\n";
			}
			secondString += "</ul>";
			customListForCountFivePlus = new ArrayList<>();
			customListForCountFivePlus.add(0, firstString);
			customListForCountFivePlus.add(1,secondString);
			
		}
        
		return customListForCountFivePlus;
	}
    
	public String getCustomList1() {
		if(getCustomListForCountFivePlus() != null)
			customList1 = getCustomListForCountFivePlus().get(0);
		return customList1;
	}

	public String getCustomList2() {
		if(getCustomListForCountFivePlus() != null)
			customList2 = getCustomListForCountFivePlus().get(1);
		return customList2;
	}

	public boolean getCustomListCount5() {
		int count = 0;
		int index = -1;

		while ((index = customList.indexOf("<li>", index + 1)) != -1) {
			count++;
		}
		if (count > 5)
			customListCount5 = true;
		else
			customListCount5 = false;
		return customListCount5;
	}
}
