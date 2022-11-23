package com.project1;

public class Student {

	private Integer studentID;
	private String studentFullname;
	private String courseName;
	private Integer age;
	private String gender;

	public Student(Integer studentID, String studentFullname, String courseName, Integer age, String gender) {
		super();
		this.studentID = studentID;
		this.studentFullname = studentFullname;
		this.courseName = courseName;
		this.age = age;
		this.gender = gender;
	}

	public void showData() {

		System.out.println("===============================================");
		System.out.println("                Student Details               ");
		System.out.println("===============================================");
		System.out.println("Student ID =  "+studentID);
		System.out.println("===============================================");
		System.out.println("Student Full Name =  "+studentFullname);
		System.out.println("===============================================");
		System.out.println("Course Name =  "+ courseName);
		System.out.println("===============================================");
		System.out.println("Student Age =  "+age);
		System.out.println("===============================================");
		System.out.println("Student Gender =  "+gender);
		System.out.println("===============================================");
		System.out.println("                                            ");
		System.out.println("                                                  ");
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentFullname=" + studentFullname + ", courseName=" + courseName
				+ ", age=" + age + ", gender=" + gender + "]";
	}

}
