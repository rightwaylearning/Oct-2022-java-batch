package Rushikesh_7_10_2022;

public class AdharcardController {
	
	public static void main(String[] args) {
		
		AdharCustomer a=new AdharCustomer();
		
		a.Name="Rushikesh";
		a.age=20;
		AdharCustomer.Authorized="Government Of India";
		
		
		System.out.println("Name :-" + " "+ a.Name);
		System.out.println("Age of Customer :-"+ " "+ a.age);
		System.out.println("Authorized by :-" + " "+ AdharCustomer.Authorized);
		
		
		
		System.out.println("-------------------------------------------------------------------------");
		
		
		
		AdharCustomer a1=new AdharCustomer();
		
		a1.Name="Ramesh";
		a1.age=22;
		AdharCustomer.Authorized="Government Of India";
		
		System.out.println(a1.Name);
		System.out.println(a1.age);
		System.out.println(AdharCustomer.Authorized);
		
		
	}

}
