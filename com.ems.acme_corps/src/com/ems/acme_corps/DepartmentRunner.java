package com.ems.acme_corps;

public class DepartmentRunner {

	public DepartmentRunner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Department department = new Department("Accounting", "505");
		
		System.out.println(department.getDepartmentName());

	}

}
