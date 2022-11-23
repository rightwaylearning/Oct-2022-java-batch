package vishwa_12_10_constructor;

public class Student {

	int rollNo;
	String name;
	String collegeName;
	
	Student(){} // zero arg constructor
	
	// param constructor

	public Student(int rollNo, String name, String collegeName) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.collegeName = collegeName;
	}
	
	
	
	
}
