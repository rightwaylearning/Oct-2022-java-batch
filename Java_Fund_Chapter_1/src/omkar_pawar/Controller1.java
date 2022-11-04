package omkar_pawar;

public class Controller1 {
  public static void main(String[] args) {
	  
	 
	  Student1 s = new Student1();
	  s.rollNumber = 23;
	  s.name ="ajay";
	  //s.schoolname = "MK"; // Thestatic field Student1.schoolname 
	  Student1.schoolname ="MK";
	  
	  
	  Student1 s1 = new Student1();
	  s1.rollNumber = 24;
	  s1.name = "karthik";
	  
	  // System.out.pritln(s1.schoolname);
	  System.out.println(Student1.schoolname);
	  System.out.println("JK");
	  
	  
	// System.out.pritln(s.schoolname); //
	// System.out.pritln(s1.schoolname); //
	 System.out.println(Student1.schoolname);
	  
  }
}
