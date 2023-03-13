package com.xworkz.application.boot;

import com.xworkz.application.dto.AttendanceDTO;

public class AttendanceData {

	public static void main(String[] args) {

		AttendanceDTO attendance = new AttendanceDTO();
		attendance.setSection("X-workz Batch");
		attendance.setBoys(13);
		attendance.setGirls(12);
		attendance.setTotStudents(25);
		attendance.setAllPresent(true);

		System.out.println(attendance);
		System.out.println(attendance.hashCode());

	}

}
