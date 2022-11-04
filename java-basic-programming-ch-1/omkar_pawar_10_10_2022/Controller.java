package omkar_pawar_10_10_2022;

public class Controller {
  public static void main(String[] args) {
	  
	  Student s = new Student();
	  s.rollNumber = 23;
	  s.name = "A";
	  Student.schoolName = "SKDV";
	  
	  
	  Student s2 = new Student();
	  s2.rollNumber = 24;
	  s2.name = "B";
	  System.out.println(Student.schoolName);// SKDV
	  System.out.println(s2.rollNumber);
  }
}
