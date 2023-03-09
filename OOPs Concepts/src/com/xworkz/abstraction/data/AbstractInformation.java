package com.xworkz.abstraction.data;

public abstract class AbstractInformation {

	private String createdBy = "SJR";
	private String updatedBy = "Sumith";

	public AbstractInformation() {

	}

	public AbstractInformation(String createdBy, String updatedBy) {
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		return "AbstractInformation [Created By=" + createdBy + ", Updated By=" + updatedBy + "]";
	}

}
