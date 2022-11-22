package archana_khaire.info;

public class NewAdmissionStorage {
	
	public static void main(String[] args) {
		
		NewAdimission1 a =new NewAdimission1();
		a.fullName = "Archana Khaire";
		a.mailId = "archanakhaire1986@gmail.com";
		a.cellphone = 9975032670L;
		
		NewAdimission1 a1 = new NewAdimission1();
		a1.fullName = "Anita Pachpute";
		a1.mailId = "anita123@gmail.com";
		a1.cellphone =8669200195L;
		
		NewAdimission1[] as = {a,a1};
		for(int i=0; i<as.length; i++) {
			System.out.println(as[i].fullName);
			System.out.println(as[i].mailId);
			System.out.println(as[i].cellphone);
			System.out.println("........");
		}
				
				
	}

}
