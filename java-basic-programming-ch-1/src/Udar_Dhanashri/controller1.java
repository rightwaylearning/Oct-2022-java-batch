package Udar_Dhanashri;

public class controller1 {
public static void main(String[] args) {
		
		Student1 s = new Student1();
		s.rollNumber = 23;
		s.name = "Ajay";
		//s.schoolname = "MK"; // The static field Student.schoolname should be accessed in a static way
		Student1.schoolname = "MK";
		
		Student1 s1 = new Student1();
		s1.rollNumber = 24;
		s1.name = "karthik";
		
		//System.out.println(s1.schoolname);
		 System.out.println(Student1.schoolname);
		Student1.schoolname = "JK";
		
	//	System.out.println(s.schoolname); //
	//	System.out.println(s1.schoolname); //
		System.out.println(Student1.schoolname);
		
	}
}

