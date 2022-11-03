package Rushikesh_arayProgram_4_10;

public class Controller {
	
	public static void main(String[] args) {
		
		Student s=new Student();
		s.name="Rushikesh";
		s.rollNo=55;
		                                       Marks[] sub=new Marks[10];
		                                            
		                                             Marks m1=new Marks();
		                                             m1.Subject="Mathematics";
		                                             m1.Score=56;
		                                             
		                                           sub[0]=m1;
		                                           
		                                             Marks m2=new Marks();
		                                             m2.Subject="English";
		                                             m2.Score=89;
		                                             
		                                           sub[1]=m2;
		                                           
		                                             Marks m3=new Marks();
		                                             m3.Subject="Geogrophy";
		                                             m3.Score=78;
		                                             
		                                           sub[2]=m3;
		                                           
		 s.mks=sub;
		 
		 System.out.println(s.name);
		 System.out.println(s.rollNo);
		 System.out.println("------------------------------");
		 for(int i=0;i<s.mks.length;i++) {
			 
			 System.out.println(s.mks[i].Subject);
			 System.out.println(s.mks[i].Score);
			 
			 System.out.println("------------------------------");
			 
			 
		 }
		                                       
		
		
	}

}
