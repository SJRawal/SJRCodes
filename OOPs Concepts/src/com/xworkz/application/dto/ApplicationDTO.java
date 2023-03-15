package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class ApplicationDTO implements Serializable {
	private String name;
	private String developedBy;
	private double price;
	private LocalDate firstVersionReleaseDate;
	private LocalDate currentVersionReleaseDate;
	private LocalDate nextVersionReleaseDate;
	private int trialDays;
	private int minProcessorSpeed;
	private int minRamSpaceRequired;
	private boolean internetSpeed;
	private int ageLimit;
	private long noOfDownloads;
	private int rating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDevelopedBy() {
		return developedBy;
	}
	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getFirstVersionReleaseDate() {
		return firstVersionReleaseDate;
	}
	public void setFirstVersionReleaseDate(LocalDate firstVersionReleaseDate) {
		this.firstVersionReleaseDate = firstVersionReleaseDate;
	}
	public LocalDate getCurrentVersionReleaseDate() {
		return currentVersionReleaseDate;
	}
	public void setCurrentVersionReleaseDate(LocalDate currentVersionReleaseDate) {
		this.currentVersionReleaseDate = currentVersionReleaseDate;
	}
	public LocalDate getNextVersionReleaseDate() {
		return nextVersionReleaseDate;
	}
	public void setNextVersionReleaseDate(LocalDate nextVersionReleaseDate) {
		this.nextVersionReleaseDate = nextVersionReleaseDate;
	}
	public int getTrialDays() {
		return trialDays;
	}
	public void setTrialDays(int trialDays) {
		this.trialDays = trialDays;
	}
	public int getMinProcessorSpeed() {
		return minProcessorSpeed;
	}
	public void setMinProcessorSpeed(int minProcessorSpeed) {
		this.minProcessorSpeed = minProcessorSpeed;
	}
	public int getMinRamSpaceRequired() {
		return minRamSpaceRequired;
	}
	public void setMinRamSpaceRequired(int minRamSpaceRequired) {
		this.minRamSpaceRequired = minRamSpaceRequired;
	}
	public boolean isInternetSpeed() {
		return internetSpeed;
	}
	public void setInternetSpeed(boolean internetSpeed) {
		this.internetSpeed = internetSpeed;
	}
	public int getAgeLimit() {
		return ageLimit;
	}
	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}
	public long getNoOfDownloads() {
		return noOfDownloads;
	}
	public void setNoOfDownloads(long noOfDownloads) {
		this.noOfDownloads = noOfDownloads;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", developedBy=" + developedBy + ", price=" + price
				+ ", firstVersionReleaseDate=" + firstVersionReleaseDate + ", currentVersionReleaseDate="
				+ currentVersionReleaseDate + ", nextVersionReleaseDate=" + nextVersionReleaseDate + ", trialDays="
				+ trialDays + ", minProcessorSpeed=" + minProcessorSpeed + ", minRamSpaceRequired="
				+ minRamSpaceRequired + ", internetSpeed=" + internetSpeed + ", ageLimit=" + ageLimit
				+ ", noOfDownloads=" + noOfDownloads + ", rating=" + rating + "]";
	}

}
