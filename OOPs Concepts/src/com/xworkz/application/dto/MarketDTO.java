package com.xworkz.application.dto;

import java.io.Serializable;
import java.util.Arrays;

public class MarketDTO implements Serializable {
	private String marketName;
	private String marketLocation;
	private int marketSize;
	private String marketType;
	private String[] marketOwners;

	public MarketDTO() {
		System.out.println("Market DTO no-arg Constructor");
	}

	public String getMarketName() {
		return marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	public String getMarketLocation() {
		return marketLocation;
	}

	public void setMarketLocation(String marketLocation) {
		this.marketLocation = marketLocation;
	}

	public int getMarketSize() {
		return marketSize;
	}

	public void setMarketSize(int marketSize) {
		this.marketSize = marketSize;
	}

	public String getMarketType() {
		return marketType;
	}

	public void setMarketType(String marketType) {
		this.marketType = marketType;
	}

	public String[] getMarketOwners() {
		return marketOwners;
	}

	public void setMarketOwners(String[] marketOwners) {
		this.marketOwners = marketOwners;
	}

	@Override
	public String toString() {
		return "MarketDTO [Market Name=" + marketName + ", Market Location=" + marketLocation + ", Market Size="
				+ marketSize + ", Market Type=" + marketType + ", Market Owners=" + Arrays.toString(marketOwners) + "]";
	}

}
