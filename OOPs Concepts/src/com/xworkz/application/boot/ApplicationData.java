package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.consts.ApplicationLangUsed;
import com.xworkz.application.consts.ApplicationOsTypeSupported;
import com.xworkz.application.consts.ApplicationType;
import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.implee.ApplicationImplee;
import com.xworkz.application.service.ApplicationService;

public class ApplicationData {

	public static void main(String[] args) {
		ApplicationDTO applicationDTO = new ApplicationDTO("Chrome", "Google", ApplicationType.INFOTAINMENT, 1,
				LocalDate.of(2008, 9, 2), LocalDate.of(2023, 3, 7), LocalDate.of(2023, 4, 9), 29,
				ApplicationLangUsed.JS, 3, 6, true, 14, 99999999, 4, ApplicationOsTypeSupported.PIE);

		System.out.println(applicationDTO);

		ApplicationService applicationService = new ApplicationImplee();
		boolean saved = applicationService.validateAndSave(applicationDTO);
		System.out.println(saved);

	}

}
