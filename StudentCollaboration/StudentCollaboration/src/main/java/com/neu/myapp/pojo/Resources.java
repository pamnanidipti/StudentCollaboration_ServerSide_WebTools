package com.neu.myapp.pojo;

import org.springframework.web.multipart.MultipartFile;

public class Resources {
	
	private int resourceId;
	private MultipartFile image;
	private String title;
	private String description;
	private float price;
	private boolean isUnderOffer;
	private float offerPrice;
	private String additionalDetail;
	private String information;
	private int soldCount;
	
	public Resources() {
		// TODO Auto-generated constructor stub
	}

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isUnderOffer() {
		return isUnderOffer;
	}

	public void setUnderOffer(boolean isUnderOffer) {
		this.isUnderOffer = isUnderOffer;
	}

	public float getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(float offerPrice) {
		this.offerPrice = offerPrice;
	}

	public String getAdditionalDetail() {
		return additionalDetail;
	}

	public void setAdditionalDetail(String additionalDetail) {
		this.additionalDetail = additionalDetail;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public int getSoldCount() {
		return soldCount;
	}

	public void setSoldCount(int soldCount) {
		this.soldCount = soldCount;
	}
	

}
