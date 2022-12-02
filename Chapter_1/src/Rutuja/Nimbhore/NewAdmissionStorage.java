package Rutuja.Nimbhore;

public class NewAdmissionStorage {

	public static void main(String[] args) {
		newAdmission a1= new 	newAdmission();
		a1.fullName="Akshay shrama";
		a1.mailId = "rajivbhatiya@gmail.com";
	     a1.cellNumber = 7890567845L;
	     
	     newAdmission a2= new 	newAdmission();
	     a2.fullName = "ajay devgaan";
	     a2.mailId = "ajay@gmail.com";
	     a2.cellNumber = 7334767477L;
	     
	     newAdmission[] ad = {a1,a2};
	     
	     for(int i =0 ; i < ad.length; i++) {
		 		System.out.println(ad[i].fullName); 
			    System.out.println(ad[i].mailId);
			    System.out.println(ad[i].cellNumber);
			    System.out.println("-------------------");
		 	}
		 	
		 	
		 	
				
	
		
	}
		    
	
}
