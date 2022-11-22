package com.fc.college;

public class Student {

	private String name;
	private Integer rollNumber;
	private String collegeName;
	
	public Student(String name, Integer rollNumber, String collegeName) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.collegeName = collegeName;
	}
	
	public void showData() {
		System.out.println(this.name);
		System.out.println(this.rollNumber);
		System.out.println(this.collegeName);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", collegeName=" + collegeName + "]";
	}
		
}
