package nikita_tonde;

public class ArrayAdmissionStorage {
	public static void main (String []args) {
		
		NewAdmission a1 = new NewAdmission();
		a1.FullName = "Akshay Sharma";
		a1.mailId = "akshays@gmail.com";
		a1.CellNumber = 9928756134L;
		
		NewAdmission a2 = new NewAdmission();
		a2.FullName = "Shital Rane";
		a2.mailId = "shitalrane@gmail.com";
		a2.CellNumber = 9370686420L;
		
		NewAdmission a3 = new NewAdmission();
		a3.FullName = "Priya Kumar";
		a3.mailId = "priyak@gmail.com";
		a3.CellNumber = 9927603514L;
		
		NewAdmission[] ad = {a1,a2,a3};
		for (int i=0; i<ad.length;i++) {
			System.out.println(ad[i].FullName);
			System.out.println(ad[i].mailId);
			System.out.println(ad[i].CellNumber);
			System.out.println("................................");
			
			
			
			
		}
		
		
	}

}
