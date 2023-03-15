package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.consts.WeaponType;
import com.xworkz.application.dto.WeaponDTO;
import com.xworkz.application.implee.WeaponServiceImpleee;
import com.xworkz.application.service.WeaponService;

public class WeaponData {

	public static void main(String[] args) {
		WeaponDTO weaponDTO = new WeaponDTO(51, "Automatic Machine Gun", WeaponType.MACHINE_GUN, 99999, "Carbon Steel",
				"Russia", "Kalashnikov", LocalDate.of(2011, 11, 11), "Rocky Bhai", "To Blowup Station", 999.999);
		System.out.println(weaponDTO);

		WeaponService weaponService = new WeaponServiceImpleee();
		boolean saved = weaponService.validateAndSave(weaponDTO);
		System.out.println(saved);

	}

}
