package Archana_11_10_2022;

public class Controller_ins {
	public static void main(String[] args) {
		student_instance s =new student_instance();
		s.rollNumber = 45;
		s.name = "Saee Kalkhaire";
		student_instance.schoolName = "MJS";
		
		student_instance s1 =new student_instance();
		s1.rollNumber = 55;
		s1.name = "Sharayu Kalkhaire";
		System.out.println(student_instance.schoolName); //MJS
		
		
	}

}
