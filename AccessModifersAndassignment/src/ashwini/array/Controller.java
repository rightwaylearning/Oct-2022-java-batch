package ashwini.array;

public class Controller {
	
	public static void main(String[] args) {
		
		Student s= new Student();
			s.name = "Revthi";
			s.rollNumber=11;
		
						Marks[] sub = new Marks[3];
							Marks m1= new Marks();
							m1.subject="History";
							m1.score=89;
							sub[0]=m1;
						
							Marks m2= new Marks();
							m2.subject="Science";
							m2.score=93;
							sub[1]=m2;
						
							Marks m3 = new Marks();
							m3.subject="English";
							m3.score=77;
							sub[2]=m3;
						
							
				s.mks=sub;
				Show sh =new Show();
				sh.printData(s);
						
	}

}
