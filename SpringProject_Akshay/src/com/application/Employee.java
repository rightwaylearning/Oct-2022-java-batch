package com.application;

public class Employee {

	private String name;
	private String designation;
	private int age;
	private String Address;

	public Employee(String name, String designation, int age, String Address) {
		super();
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.Address = Address;
	}

	public void showData() {
		System.out.println(this.name);
		System.out.println(this.designation);
		System.out.println(this.age);
		System.out.println(this.Address);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", age=" + age + ", Address=" + Address
				+ "]";
	}

}
