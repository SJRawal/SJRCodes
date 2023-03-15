package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.dto.ApplicationDTO;

public interface ApplicationService {
	boolean validateAndSave(ApplicationDTO appDto);

}
