package Udar_Dhanashri;

public class NewAddmissionStorage {
	public static void main(String[] args) {
		
		NewAddmission a1 = new NewAddmission();
		a1.fullName = "Nakul Sharma";
		a1.cellNumber = 45362736486L;
		a1.mailId = "nakul@gmail.com";
		
		NewAddmission a2 = new NewAddmission();
		a2.fullName = "Kunal Sharma";
		a2.cellNumber = 35462736486L;
		a2.mailId = "kunal@gmail.com";
		
		NewAddmission[] ad = {a1,a2};
		for(int i =0 ; i < ad.length; i++) {
	 		System.out.println(ad[i].fullName); 
		    System.out.println(ad[i].mailId);
		    System.out.println(ad[i].cellNumber);
		    System.out.println("-------------------");
	 	}
	 	
	 	
	    
}
}

