package Rutuja.Nimbhore;

public class Controller {
 public static void main(String[] args) {
	  Student1 s= new Student1();
	  s.name="sky";
	  s.rollNumber=3;
	  
	   Marks[] sub= new Marks[3];
				  Marks m1=new Marks();
				  m1.subject="math";
				  m1.score=89;
		  
         sub[0]=m1;
    
	  
	  
				    Marks m2=new Marks();
					  m2.subject="phy";
					  m2.score=69;
	  
	    sub[1]=m2;
	  
	  
		  
					  Marks m3=new Marks();
					  m3.subject="chem";
					  m3.score=67;
	     sub[2]=m3;
	     
	 s.mks=sub;
	 
	 ShowUp show = new ShowUp();
	 show.printData(s);
	  
	 
}
}
