package rwl_array_programs;

public class NewAdmissionStorage {

	public static void main(String[] args) {
		
				   
		     NewAdmission a1 = new NewAdmission();
		     a1.fullName = "Akshay shrama";
		     a1.mailId = "rajivbhatiya@gmail.com";
		     a1.cellNumber = 7890567845L;
		     
		     NewAdmission a2 = new NewAdmission();
		     a2.fullName = "ajay devgaan";
		     a2.mailId = "ajay@gmail.com";
		     a2.cellNumber = 7334767477L;
		     	     
		              
		 	NewAdmission[] ad = {a1,a2};
		 	
		 	
		 	for(int i =0 ; i < ad.length; i++) {
		 		System.out.println(ad[i].fullName); 
			    System.out.println(ad[i].mailId);
			    System.out.println(ad[i].cellNumber);
			    System.out.println("-------------------");
		 	}
		 	
		 	
		    
	}
}
