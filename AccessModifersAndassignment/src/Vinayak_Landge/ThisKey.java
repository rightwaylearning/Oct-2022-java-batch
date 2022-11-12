package Vinayak_Landge;

public class ThisKey {

	String fName;
	
	String lName;
	
	int rNo;
	
	void m1(String fName,String lName,int rNo) {
		
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(rNo);
		
		System.out.println("-------------");

		System.out.println(this.fName);
		System.out.println(this.lName);
		System.out.println(this.rNo);

		
	}
}
