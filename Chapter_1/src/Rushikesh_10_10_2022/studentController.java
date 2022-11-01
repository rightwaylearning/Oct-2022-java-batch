package Rushikesh_10_10_2022;

public class studentController {
	
	public static void main(String[] args) {
		
		Student s= new Student();
		s.rollno=55;
		s.name="Rushikesh";
		Student.schoolName="MG Gandhi School";
		System.out.println(s.rollno);
		System.out.println(s.name);
		System.out.println(Student.schoolName);
		
		Student s1= new Student();
		s1.rollno=65;
		s1.name="Prasad";
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(Student.schoolName);
		
		Student s2=new Student();
		s2.rollno=21;
		s2.name="Shashikant";
		System.out.println(s2.rollno);
		System.out.println(s2.name);
		System.out.println(Student.schoolName);
		
	}

}
