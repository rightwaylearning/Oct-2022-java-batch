package vishwa_static_11_10;



public class Controller {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.name = "abc";
		s.rollNo = 23;
		s.cellPhone =4545612121L;
		s.m1();
		s.m2();
		
	//  access static variable & method using class name
			Student.schoolName = "infosys limited";
			Student.s1();
			Student.s2();
		
		
}
}