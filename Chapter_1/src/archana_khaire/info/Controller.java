package archana_khaire.info;

public class Controller {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.name = "Swara";
		s.rollNumber = 25;
		                 Marks1[] sub = new Marks1[3];
		                  Marks1 m1 = new Marks1();
		                  m1.subject = "che";
		                  m1.score = 89;
		               sub[0]=m1;
		                 Marks1 m2 =new Marks1();
		                 m2.subject = "math";
		                 m2.score = 97;
		               sub[1]=m2;
		                 Marks1 m3 = new Marks1();
		                 m3.subject = "bio";
		                 m3.score = 95;
		               sub[2]=m3;   
		                 
		 s.mks=sub;
		 ShowUp show = new ShowUp();
		 show.PrintData(s);
		                 
		                 
		
	}

}
