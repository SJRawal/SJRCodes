package com.xworkz.objectsmethods.boot;

import com.xworkz.objectsmethods.data.ChiefMinister;

public class CheifMiniterData {

	public static void main(String[] args) {
		ChiefMinister cm = new ChiefMinister("Basavraj Bommai", "Bharatiya Janata Party (BJP)", "Karnataka", 63, 'M',
				"Hindu", true, "BE in Civil Engg", 1960, 2021, 2024, 85.6f, 3);
		ChiefMinister cm2 = new ChiefMinister("Y.S. Jaganmohan Reddy", " Yuvajana Sramika Rythu Congress Party (YSRCP)",
				"Andhra Pradesh", 49, 'M', "Hindu", true, "Bachelor of Commerce", 1974, 2019, 2023, 90.1f, 5);

		System.out.println(cm.equals(cm2));
		ChiefMinister cm3 = new ChiefMinister("Basavraj Bommai", "Bharatiya Janata Party (BJP)", "Karnataka", 63, 'M',
				"Hindu", true, "BE in Civil Engg", 1960, 2021, 2024, 85.6f, 3);
		System.out.println(cm.equals(cm3));
	}

}
