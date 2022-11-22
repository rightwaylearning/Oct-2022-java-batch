package Archana_array_program;

public class NewAdmissionStorage {
	
	public static void main(String[] args) {
		
	
	NewAdimission a1 = new NewAdimission();
	a1.fullName = "Akash joshi";
    a1.mailId = "sadeta@gmail.com";
    a1.cellNumber = 7890567845L;
    
    NewAdimission a2 = new NewAdimission();
    a2.fullName = "aryan Khaire";
    a2.mailId = "aryan@gmail.com";
    a2.cellNumber = 7334767477L;
    	     
             
	NewAdimission[] ad = {a1,a2};
	
	
	for(int i =0 ; i < ad.length; i++) {
		System.out.println(ad[i].fullName); 
	    System.out.println(ad[i].mailId);
	    System.out.println(ad[i].cellNumber);
	    System.out.println("-------------------");
	}
	
	}
	
	

}
