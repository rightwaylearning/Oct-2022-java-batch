package rwl_type_of_variable_acc_location;

public class Controller {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.rollNumber = 23;
		s.name = "Ajay";
		//s.schoolname = "MK"; // The static field Student.schoolname should be accessed in a static way
		Student.schoolname = "MK";
		
		Student s1 = new Student();
		s1.rollNumber = 24;
		s1.name = "karthik";
		
		//System.out.println(s1.schoolname);
		 System.out.println(Student.schoolname);
		Student.schoolname = "JK";
		
	//	System.out.println(s.schoolname); //
	//	System.out.println(s1.schoolname); //
		System.out.println(Student.schoolname);
		
	}
}
