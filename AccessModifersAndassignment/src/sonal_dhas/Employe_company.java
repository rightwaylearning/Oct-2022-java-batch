package sonal_dhas;

public class Employe_company {   
	
	
  String fname;
  String lname;
  int age;
  long contact;
  
  public static void main(String[] args) {
	
	  
	    Employe_company[] e = new Employe_company[3];
	     
	    Employe_company  c = new Employe_company();
	    
	     c.fname = "Sonal";
	     c.lname = "Dhas";
	     c.age = 42;
	     c.contact = 8473632685L;
	     
	     e[0] = c;
	      
	     Employe_company d = new Employe_company();
	       d.fname = "Vishwa";
	       d.lname = " Rajput";
	       d.age  = 68;
	       d.contact = 6368654574L;
	       
	       
	      e[1] = d;
	      
	      Employe_company h = new Employe_company();
	       h.fname = "Arti";
	       h.lname = " Dhas";
	       h.age  = 23;
	       h.contact = 63686545741323L;
	       
	       e[2] = h;
	       
	       
	       
	       System.out.println(e[0].fname);
	       System.out.println(e[0].lname);
	       System.out.println(e[0].age);
	       System.out.println(e[0].contact);
	       
	       
	       System.out.println(e[1].fname);
	       System.out.println(e[1].lname);
	       System.out.println(e[1].age);
	       System.out.println(e[1].contact);
	       
	           
	       System.out.println(e[2].fname);
	       System.out.println(e[2].lname);
	       System.out.println(e[2].age);
	       System.out.println(e[2].contact);
	       
	           
	    
	    
	    
}
 
  
}
