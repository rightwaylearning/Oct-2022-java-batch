package student.info;

public class Controller {

   
	public static void main(String[] arr) {
		
		Student s = new Student();
		s.name = "Kiran";
		s.rollNumber = 23;
		s.division = 'A';
		s.std ="10th";
		
               School sc = new School();
               sc.schoolName = "mgs";
               sc.headMaster = "Kulkarni";
		              
                     Address d = new Address();
                     d.line1 = "C 505, B A vermont";
                     d.line2 = "wagholi, Tal - haveli, Pune";
                     d.landMark = "baif road, next to Martin";
                     d.pin = 412277;
	                   
	           sc.adr = d;
	                   
	   s.s = sc;
	   s.printStudentData();
		
	}
	
}
