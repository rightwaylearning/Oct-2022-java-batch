package Vinayak_Landge;

public class Student_A {

	private String name;
	private int rollNumber;
	private String std;
	
	Student_A (){}
	
	public Student_A(String name, int rollNumber, String std) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.std = std;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}
	
	
}
