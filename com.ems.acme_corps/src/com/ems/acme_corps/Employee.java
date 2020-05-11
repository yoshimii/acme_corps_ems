package com.ems.acme_corps;

public class Employee {
	
	public String employeeName;
	public String employeeDepartment;

	public Employee(String employeeName, String employeeDepartment) {
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
	}
	
	// Getters
	public String getEmployeeName() {
		return employeeName;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	
	// Setters
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

}
