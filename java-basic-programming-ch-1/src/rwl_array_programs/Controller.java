package rwl_array_programs;

public class Controller {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.name = "sky";
		s.rollNumber = 21;
		                      Marks[] sub = new Marks[3];
		                                Marks m1 = new Marks();
		                                m1.subject = "Maths";
		                                m1.score = 89;
		                      sub[0] = m1;
		                                Marks m2 = new Marks();
		                                m2.subject = "phy";
		                                m2.score = 35;
		                      sub[1] = m2;
		                                Marks m3 = new Marks();
		                                m3.subject = "chem";
		                                m3.score = 45;
		                      sub[2] = m3;
		
        s.mks = sub;	
        // print data work 
        ShowUp show = new ShowUp();
        show.printData(s);
        
        
        
	}
}
