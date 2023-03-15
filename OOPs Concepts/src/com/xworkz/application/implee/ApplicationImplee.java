package com.xworkz.application.implee;

import java.time.LocalDate;

import com.xworkz.application.consts.ApplicationLangUsed;
import com.xworkz.application.consts.ApplicationOsTypeSupported;
import com.xworkz.application.consts.ApplicationType;
import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.service.ApplicationService;

public class ApplicationImplee implements ApplicationService {

	@Override
	public boolean validateAndSave(ApplicationDTO appDto) {
		if (appDto != null) {

			System.out.println("Application Validation Start");

			String name = appDto.getName();
			String developedBy = appDto.getDevelopedBy();
			ApplicationType type = appDto.getType();
			double price = appDto.getPrice();
			LocalDate firstVersionReleaseDate = appDto.getFirstVersionReleaseDate();
			LocalDate currentVersionReleaseDate = appDto.getCurrentVersionReleaseDate();
			LocalDate nextVersionReleaseDate = appDto.getNextVersionReleaseDate();
			int trialDays = appDto.getTrialDays();
			ApplicationLangUsed langUsed = appDto.getLangUsed();
			int minProcessorSpeed = appDto.getMinProcessorSpeed();
			int minRamSpaceRequired = appDto.getMinRamSpaceRequired();
			boolean internetSpeed = appDto.isInternetSpeed();
			int ageLimit = appDto.getAgeLimit();
			long noOfDownloads = appDto.getNoOfDownloads();
			int rating = appDto.getRating();
			ApplicationOsTypeSupported osTypeSupported = appDto.getOsTypeSupported();

			boolean validName = false;
			boolean validDevelopedBy = false;
			boolean validType = false;
			boolean validPrice = false;
			boolean validFirstVersionReleaseDate = false;
			boolean validCurrentVersionReleaseDate = false;
			boolean validNextVersionReleaseDate = false;
			boolean validTrialDays = false;
			boolean validLangUsed = false;
			boolean validMinProcessorSpeed = false;
			boolean validMinRamSpaceRequired = false;
			boolean validInternetSpeed = false;
			boolean validAgeLimit = false;
			boolean validNoOfDownloads = false;
			boolean validRating = false;
			boolean validOsTypeSupported = false;

			if (name != null && name.length() > 3 && name.length() < 30 && name.matches("[A-Z][a-z]*")) {
				System.out.println("Valid Name");
				validName = true;
			} else {
				System.err.println("Invalid Name");
				return false;
			}
			if (developedBy != null && developedBy.length() > 1 && developedBy.length() < 30
					&& developedBy.matches("[A-Z][a-z]*")) {
				System.out.println("Valid Developer");
				validDevelopedBy = true;
			} else {
				System.err.println("Invalid Developer");
				return false;
			}
			if (type != null) {
				System.out.println("Type is valid");
				validType = true;
			} else {
				System.err.println("Inavalid Type");
				return false;
			}
			if (price > 0 && price < 1000) {
				System.out.println("Valid Price");
				validPrice = true;
			} else {
				System.err.println("Invalid Price");
				return false;
			}
			LocalDate tmrw = LocalDate.now().plusDays(1);
			LocalDate today = LocalDate.of(2005, 1, 1);
			if (firstVersionReleaseDate.isBefore(tmrw) && firstVersionReleaseDate.isAfter(today)) {
				System.out.println("Valid first Version Release Date");
				validFirstVersionReleaseDate = true;
			} else {
				System.err.println("Invalid first Version Release Date");
				return false;
			}

			LocalDate after = LocalDate.of(2005, 1, 1);
			LocalDate before = LocalDate.now().plusDays(1);
			if (currentVersionReleaseDate.isAfter(after) && currentVersionReleaseDate.isBefore(before)) {
				System.out.println("Valid current Version Release Date");
				validCurrentVersionReleaseDate = true;
			} else {
				System.err.println("Invalid current Version Release Date");
				return false;
			}

			LocalDate future = LocalDate.now().plusDays(1);
			LocalDate end = LocalDate.of(2100, 12, 31);
			if (nextVersionReleaseDate.isAfter(future) && nextVersionReleaseDate.isBefore(end)) {
				System.out.println("Valid next Version Release Date");
				validNextVersionReleaseDate = true;
			} else {
				System.err.println("inValid next Version Release Date");
				return false;
			}
			if (trialDays > 0 && trialDays < 30) {
				System.out.println("Valid trial Days");
				validTrialDays = true;
			} else {
				System.err.println("Inavalid trial Days");
				return false;
			}
			if (langUsed != null) {
				System.out.println("Language Used Validate done");
				validTrialDays = true;
			} else {
				System.err.println("Invalid Language Used");
				return false;
			}
			if (minProcessorSpeed > 2 && minProcessorSpeed < 6) {
				System.out.println("Valid Processor Speed");
				validMinProcessorSpeed = true;
			} else {
				System.err.println("Invalid Processor Speed");
				return false;
			}
			if (minRamSpaceRequired > 4 && minRamSpaceRequired < 12) {
				System.out.println("Valid Ram Space Required done");
				validMinRamSpaceRequired = true;
			} else {
				System.err.println("Not valid Ram Space");
				return false;
			}
			if (internetSpeed == true) {
				System.out.println("Valid Internet speed");
				validInternetSpeed = true;
			} else {
				System.err.println("Invalid Internet Speed");
				return false;
			}
			if (ageLimit > 13) {
				System.out.println("Valid Age limit done");
				validAgeLimit = true;
			} else {
				System.err.println("Invalid Age limit done");
				return false;
			}
			if (noOfDownloads > 0 && noOfDownloads < 100000000000L) {
				System.out.println("Valid no Of Downloads");
				validNoOfDownloads = true;
			} else {
				System.err.println("Invalid no Of Downloads");
				return false;
			}
			if (rating > 0 && rating < 100000000000L) {
				System.out.println("Valid no Of Downloads");
				validNoOfDownloads = true;
			} else {
				System.err.println("Invalid no Of Downloads");
				return false;
			}
			if (osTypeSupported != null) {
				System.out.println("OS support validation done");
				validOsTypeSupported = true;
			} else {
				System.err.println("Invalid OS support");
				return false;
			}

		}
		return true;
	}

}
