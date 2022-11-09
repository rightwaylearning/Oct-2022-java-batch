package Rushikesh_17_10_2022;

public class Student {
	
	private String name;
	private int rollNo;
	private String branch;
	

	Student(String name,int rollNo,String branch){
		
		this.name=name;
		this.rollNo=rollNo;
		this.branch=branch;
		
	}
	
	Student(){}
	
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name= name;
	}
	
	int getRollNo() {
		return rollNo;
	}
	
	void setRollNo(int rollNo) {
		this.rollNo=rollNo;
	}
	
	String getBranch() {
		return branch;
	}
	
	void setbranch(String branch) {
		this.branch=branch;
	}
	
}
