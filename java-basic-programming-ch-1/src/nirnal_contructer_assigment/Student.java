package nirnal_contructer_assigment;

public class Student {
	String fname;
	String lname;
	int RollName;
	
	
	
	Student(){
	System.out.println("i am a contructer");

	}
	
	Student(String f , String l , int r ){
		this.fname = f;
		this.lname = l;
		this.RollName = r;
	 
	}
	
}
