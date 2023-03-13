package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.AwarenessDTO;

public class AwarenessData {

	public static void main(String[] args) {
		AwarenessDTO awareness = new AwarenessDTO();
		awareness.setAwarenessTopic("Importance of Cycling");
		awareness.setCampaignDescription(
				"A presentation on the benefits of cycling and how it can help the environment then our body as well");
		awareness.setCampaignStartDate(LocalDate.of(2014, 11, 30));
		awareness.setCampaignEndDate(LocalDate.of(2015, 11, 30));
		awareness.setTargetAudience("All people who can ride Cycle");

		System.out.println(awareness);
	}

}
