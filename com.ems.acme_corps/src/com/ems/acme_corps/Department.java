package com.ems.acme_corps;

public class Department {
	
	//Attributes
	private String buildingName;
	private String buildingNumber;
	
	Department(String buildingName, String building_number) {
		this.buildingName = buildingName;
		this.buildingNumber = building_number;		
	}
	
	// Getters
	public String getDepartmentName() {
		return buildingName;
	}		
	public String getBuildingNumber() {
		return buildingNumber;
	}
	
	// Setters	
	public void setDepartmentName(String buildingName) {
		this.buildingName = buildingName;
	}
	public void setBuildingNumber(String building_number) {
		this.buildingNumber = building_number;
	}
	
	
}
