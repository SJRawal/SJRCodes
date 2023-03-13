package com.xworkz.application.dto;

import java.io.Serializable;
import java.util.Objects;

public class AttendanceDTO implements Serializable {
	private String section;
	private int totStudents;
	private int boys;
	private int girls;
	private boolean allPresent;

	public AttendanceDTO() {
		System.out.println("Running no-arguments constructor");
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public int getTotStudents() {
		return totStudents;
	}

	public void setTotStudents(int totStudents) {
		this.totStudents = totStudents;
	}

	public int getBoys() {
		return boys;
	}

	public void setBoys(int boys) {
		this.boys = boys;
	}

	public int getGirls() {
		return girls;
	}

	public void setGirls(int girls) {
		this.girls = girls;
	}

	public boolean isAllPresent() {
		return allPresent;
	}

	public void setAllPresent(boolean allPresent) {
		this.allPresent = allPresent;
	}

	@Override
	public String toString() {
		return "AttendanceDTO [Section=" + section + ", Total Students=" + totStudents + ", Boys=" + boys + ", Girls="
				+ girls + ", All Present=" + allPresent + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(allPresent, boys, girls, section, totStudents);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AttendanceDTO other = (AttendanceDTO) obj;
		return allPresent == other.allPresent && boys == other.boys && girls == other.girls
				&& Objects.equals(section, other.section) && totStudents == other.totStudents;
	}

}
