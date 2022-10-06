package vaishnavi_lolage;

public class Controller {
public static void main(String[] args) {
	array_program_bank_details b = new array_program_bank_details();
	        String[] n = new String[3];
	             n[0] = "devyani dhage";
	            n[1] = "nikita tonde";
	            n[2] = "vaishnavi lolage";
	            
	            
	        int[] ac = new int[3];
	             ac[0] = 1234567;
	             ac[1] = 4567890;
	             ac[2] = 6789012;
	             
	             
	        String[] br = new String[3];
	             br[0] = "ahmednagar";
	             br[1] = "nagpur";
	             br[2] = "nashik";
	             
	             
	        Adress[] ad = new Adress[3];
	              Adress a = new Adress();
	                  a.line1 = "abc";
	                  a.line2 = "vcb";
	                  a.pinnumber = 65473;
	                  a.district = "ahmednagar";
	           ad[0]  = a;     
	        Adress a1 = new Adress();
	                  a1.line1 = "def";
	                  a1.line2 = "hfr";
	                  a1.pinnumber = 76548;
	                  a1.district = "nagpur" ; 	
	            ad[1] = a1;      
	                  
	        Adress a2 = new Adress();
	                  a2.line1 = "mnb";
	                  a2.line2 = "hgf";
	                  a2.pinnumber = 87654;
	                  a2.district = "nashik";
	             ad[2] = a2;     
	                  
	                  
	        b.name = n;
	        b.accountNumber = ac;
	        b.branch = br;
	        b.adr = ad;
	        
	for(int i=0;i<b.name.length;i++) {
		System.out.println(b.name[i]);
		System.out.println("----------------");
	}
	for(int i=0;i<b.accountNumber.length;i++) {
		System.out.println(b.accountNumber[i]);
		System.out.println("------------------");
	}
	for(int i=0;i<b.branch.length;i++) {
	System.out.println(b.branch[i]);
	System.out.println("------------------");
	}
	for(int i=0;i<b.adr.length;i++) {
		System.out.println(b.adr[i].line1);
		System.out.println(b.adr[i].line2);
		System.out.println(b.adr[i].pinnumber);
		System.out.println(b.adr[i].district);
		System.out.println("---------------");
		
	}
	   
	    
	        
}
}
