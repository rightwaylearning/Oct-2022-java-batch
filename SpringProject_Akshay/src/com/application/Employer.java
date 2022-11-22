package com.application;

public class Employer {

	private String name;
	private String designation;
	private int age;
	private String Address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
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
