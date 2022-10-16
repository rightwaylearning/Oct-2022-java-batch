package yogesh.kawade;

import java.security.PKCS12Attribute;

public class Controller {
 
	  public static void main (String []args) {
		  
		  StudentDetails s = new StudentDetails();
		  s.rollno = 161;
		  s.name = "yogesh";
		  s.Div = 22;
		  

		  StudentDetails s1 = new StudentDetails();
          s1.Div = 22;
          s1.name ="vaibhav";
          s1.rollno = 11;
          
          s1.printdata();
		  s.printdata();
	  }
	
}
