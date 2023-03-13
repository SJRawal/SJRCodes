package com.xworkz.application.boot;

import com.xworkz.application.dto.MarketDTO;

public class MarketData {

	public static void main(String[] args) {
		MarketDTO market = new MarketDTO();
		market.setMarketLocation("Market in K R Pura");
		market.setMarketName("K R Market");
		String owners[] = { "SJR", "Sumith", "SJ Rawal" };
		market.setMarketOwners(owners);
		market.setMarketSize(100);
		market.setMarketType("Food Eatable Food");

		System.out.println(market);

	}

}
