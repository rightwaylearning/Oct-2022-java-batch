package Rutuja.Nimbhore;



     public class controller3 {
  public static void main(String[] args) {
		
		Student2 s = new Student2();
		s.rollNumber = 23;
		s.name = "Ajay";
		//s.schoolname = "MK"; // The static field Student.schoolname should be accessed in a static way
		Student2.schoolname = "MK";
		
		Student2 s1 = new Student2();
		s1.rollNumber = 24;
		s1.name = "karthik";
		
		//System.out.println(s1.schoolname);
		 System.out.println(Student2.schoolname);
		Student2.schoolname = "JK";
		
	//	System.out.println(s.schoolname); //
	//	System.out.println(s1.schoolname); //
		System.out.println(Student2.schoolname);
		
	}
}
