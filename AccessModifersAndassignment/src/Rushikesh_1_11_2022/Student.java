package Rushikesh_1_11_2022;

public class Student {
	
	private String name;
	private int rollNo;
	private String branch;
	
	Student(){}
	
	public Student(String name,int rollNo,String branch){
		
		this.name=name;
		this.rollNo=rollNo;
		this.branch=branch;
		
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getrollNo() {
		return rollNo;
	}
	
	public void setrollNo(int rollNo) {
		this.rollNo=rollNo;
	}
	
	public String getbranch() {
		return branch;
	}
	
	public void setbranch(String branch) {
		this.branch=branch;
	}

}
