package com.akshaytejale;

public class Employee {

	private Integer ID;
	private String name;
	private String designation;
	private Integer age;
	private String gender;

	public Employee(Integer iD, String name, String designation, Integer age, String gender) {
		super();
		ID = iD;
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.gender = gender;
	}

	public void showData() {
		System.out.println("==============================");
		System.out.println("Employee ID =  " + ID);
		System.out.println("==============================");
		System.out.println("Employee Name =  " + name);
		System.out.println("==============================");
		System.out.println("Employee Designation = " + designation);
		System.out.println("==============================");
		System.out.println("Employee age =  " + age);
		System.out.println("==============================");
		System.out.println("Employee Gender =  " + gender);
		System.out.println("==============================");
		System.out.println("");

	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + ", designation=" + designation + ", age=" + age + ", gender="
				+ gender + "]";
	}

}
