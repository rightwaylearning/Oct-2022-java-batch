package nirmal_static_method;

public class controller {

	public static void main(String[] args) {
		
	
		Student s = new Student();
		s.fname = "nirmal";
		s.lname = "rajput";
		s.RollNum = 54;
		
		System.out.println(s.fname);
		System.out.println(s.lname);
		System.out.println(s.RollNum);
		
		s.m1();
		
		Student.m2();
	
	}
}
