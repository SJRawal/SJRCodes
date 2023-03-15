package com.xworkz.application.service;

import java.time.LocalDate;

public interface ApplicationService {
	String getApplicationByName(String name);

	String getApplicationByDeveloper(String developer);

	double getApplicationByPrice(double price);

	LocalDate getApplicationByFirstVersionReleaseDate(LocalDate date);

	LocalDate getApplicationByCurrentVersionReleaseDate(LocalDate date);

	LocalDate getApplicationByNextVersionReleaseDate(LocalDate date);

	int getApplicationByTrialDays(int days);

	int getApplicationByMinProcessorSpeed(int speed);

	int getApplicationByMinRamSpaceRequired(int space);

	boolean getApplicationByInternetSpeed(boolean hasHighSpeed);

	int getApplicationByAgeLimit(int age);

	long getApplicationByNoOfDownloads(long downloads);

	int getApplicationByRating(int rating);

}
