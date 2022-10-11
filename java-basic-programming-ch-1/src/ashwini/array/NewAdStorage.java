package ashwini.array;

public class NewAdStorage {
	
	public static void main(String[] args) {
		
		NewAdmission n1 =new NewAdmission();
			n1.fullName="Ashwini";
			n1.Phone=7039748558L;
			n1.Email="ashwinidewade@hotmail.com";
		
		NewAdmission n2 =new NewAdmission();
			n2.fullName="Raashi";
			n2.Phone=8997665378L;
			n2.Email="Raashi@gmail.com";
			
			NewAdmission [] ad= {n1,n2};
			
				for(int i=0; i<ad.length; i++)
				{
					System.out.println(ad[i].fullName);
					System.out.println(ad[i].Phone);
					System.out.println(ad[i].Email);
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
					
				}
	}

}
