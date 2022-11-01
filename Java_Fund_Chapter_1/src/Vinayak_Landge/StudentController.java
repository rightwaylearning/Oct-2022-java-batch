package Vinayak_Landge;

public class StudentController {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.rollNo = 101;
		s.name = "Abhi";
		Student.schoolName = "Shri Sadguru HighSchool";
		int a = s.m1(12, 10);
		
		Student s1 = new Student();
		s1.rollNo = 102;
		s1.name = "Bharat";
		int b = s1.m1(14, 12);
		
		Student s2 = new Student();
		s2.rollNo = 103;
		s2.name = "Chirag";
		int c = s2.m1(58, 17);
		
		System.out.println(s.rollNo);
		System.out.println(s.name);
		System.out.println(Student.schoolName);
		System.out.println("marks:"+a);
		System.out.println("-------------");
		
		System.out.println(s1.rollNo);
		System.out.println(s1.name);
		System.out.println(Student.schoolName);
		System.out.println("marks:"+b);
		System.out.println("-------------");

		System.out.println(s2.rollNo);
		System.out.println(s2.name);
		System.out.println(Student.schoolName);
		System.out.println("marks:"+c);
		//System.out.println("-------------");
			
	}
}
