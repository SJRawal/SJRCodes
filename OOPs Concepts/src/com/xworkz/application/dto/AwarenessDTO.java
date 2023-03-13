package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class AwarenessDTO implements Serializable {
	private String awarenessTopic;
	private LocalDate campaignStartDate;
	private LocalDate campaignEndDate;
	private String targetAudience;
	private String campaignDescription;

	public AwarenessDTO() {
		System.out.println("Running no-arg Constructor");
	}

	public String getAwarenessTopic() {
		return awarenessTopic;
	}

	public void setAwarenessTopic(String awarenessTopic) {
		this.awarenessTopic = awarenessTopic;
	}

	public LocalDate getCampaignStartDate() {
		return campaignStartDate;
	}

	public void setCampaignStartDate(LocalDate campaignStartDate) {
		this.campaignStartDate = campaignStartDate;
	}

	public LocalDate getCampaignEndDate() {
		return campaignEndDate;
	}

	public void setCampaignEndDate(LocalDate campaignEndDate) {
		this.campaignEndDate = campaignEndDate;
	}

	public String getTargetAudience() {
		return targetAudience;
	}

	public void setTargetAudience(String targetAudience) {
		this.targetAudience = targetAudience;
	}

	public String getCampaignDescription() {
		return campaignDescription;
	}

	public void setCampaignDescription(String campaignDescription) {
		this.campaignDescription = campaignDescription;
	}

	@Override
	public String toString() {
		return "AwarenessDTO [Awareness Topic=" + awarenessTopic + ", Campaign StartDate=" + campaignStartDate
				+ ", Campaign EndDate=" + campaignEndDate + ", Target Audience=" + targetAudience
				+ ", Campaign Description=" + campaignDescription + "]";
	}

}
