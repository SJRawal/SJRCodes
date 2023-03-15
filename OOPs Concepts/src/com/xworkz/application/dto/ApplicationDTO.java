package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.application.consts.ApplicationLangUsed;
import com.xworkz.application.consts.ApplicationOsTypeSupported;
import com.xworkz.application.consts.ApplicationType;

public class ApplicationDTO implements Serializable {
	private String name;
	private String developedBy;
	private ApplicationType type;
	private double price;
	private LocalDate firstVersionReleaseDate;
	private LocalDate currentVersionReleaseDate;
	private LocalDate nextVersionReleaseDate;
	private int trialDays;
	private ApplicationLangUsed langUsed;
	private int minProcessorSpeed;
	private int minRamSpaceRequired;
	private boolean internetSpeed;
	private int ageLimit;
	private long noOfDownloads;
	private int rating;
	private ApplicationOsTypeSupported osTypeSupported;

	public ApplicationDTO() {
		System.out.println("Application DTO no-arg Started");
	}

	public ApplicationDTO(String name, String developedBy, ApplicationType type, double price,
			LocalDate firstVersionReleaseDate, LocalDate currentVersionReleaseDate, LocalDate nextVersionReleaseDate,
			int trialDays, ApplicationLangUsed langUsed, int minProcessorSpeed, int minRamSpaceRequired,
			boolean internetSpeed, int ageLimit, long noOfDownloads, int rating,
			ApplicationOsTypeSupported osTypeSupported) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.type = type;
		this.price = price;
		this.firstVersionReleaseDate = firstVersionReleaseDate;
		this.currentVersionReleaseDate = currentVersionReleaseDate;
		this.nextVersionReleaseDate = nextVersionReleaseDate;
		this.trialDays = trialDays;
		this.langUsed = langUsed;
		this.minProcessorSpeed = minProcessorSpeed;
		this.minRamSpaceRequired = minRamSpaceRequired;
		this.internetSpeed = internetSpeed;
		this.ageLimit = ageLimit;
		this.noOfDownloads = noOfDownloads;
		this.rating = rating;
		this.osTypeSupported = osTypeSupported;
	}

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

	public ApplicationType getType() {
		return type;
	}

	public void setType(ApplicationType type) {
		this.type = type;
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

	public ApplicationLangUsed getLangUsed() {
		return langUsed;
	}

	public void setLangUsed(ApplicationLangUsed langUsed) {
		this.langUsed = langUsed;
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

	public ApplicationOsTypeSupported getOsTypeSupported() {
		return osTypeSupported;
	}

	public void setOsTypeSupported(ApplicationOsTypeSupported osTypeSupported) {
		this.osTypeSupported = osTypeSupported;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", developedBy=" + developedBy + ", type=" + type + ", price=" + price
				+ ", firstVersionReleaseDate=" + firstVersionReleaseDate + ", currentVersionReleaseDate="
				+ currentVersionReleaseDate + ", nextVersionReleaseDate=" + nextVersionReleaseDate + ", trialDays="
				+ trialDays + ", langUsed=" + langUsed + ", minProcessorSpeed=" + minProcessorSpeed
				+ ", minRamSpaceRequired=" + minRamSpaceRequired + ", internetSpeed=" + internetSpeed + ", ageLimit="
				+ ageLimit + ", noOfDownloads=" + noOfDownloads + ", rating=" + rating + ", osTypeSupported="
				+ osTypeSupported + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ageLimit, currentVersionReleaseDate, developedBy, firstVersionReleaseDate, internetSpeed,
				langUsed, minProcessorSpeed, minRamSpaceRequired, name, nextVersionReleaseDate, noOfDownloads,
				osTypeSupported, price, rating, trialDays, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationDTO other = (ApplicationDTO) obj;
		return ageLimit == other.ageLimit && Objects.equals(currentVersionReleaseDate, other.currentVersionReleaseDate)
				&& Objects.equals(developedBy, other.developedBy)
				&& Objects.equals(firstVersionReleaseDate, other.firstVersionReleaseDate)
				&& internetSpeed == other.internetSpeed && langUsed == other.langUsed
				&& minProcessorSpeed == other.minProcessorSpeed && minRamSpaceRequired == other.minRamSpaceRequired
				&& Objects.equals(name, other.name)
				&& Objects.equals(nextVersionReleaseDate, other.nextVersionReleaseDate)
				&& noOfDownloads == other.noOfDownloads && osTypeSupported == other.osTypeSupported
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && rating == other.rating
				&& trialDays == other.trialDays && type == other.type;
	}

}
