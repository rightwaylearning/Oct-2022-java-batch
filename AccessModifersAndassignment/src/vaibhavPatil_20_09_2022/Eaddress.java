package vaibhavPatil_20_09_2022;

public class Eaddress {
	String city;
	int pincode;
	
	public static void main(String[] args) {
		
		Eaddress ea=new Eaddress();
		ea.city="Gajaragaon";
		ea.pincode=2432533;
		//e.adr=ea;
		
		Employee e=new Employee();
		e.name="vaibhav";
		e.empId=234543;
		e.adr=ea;
		
		
		
		System.out.println(e.name);
		System.out.println(e.empId);
		System.out.println(ea.city);
		System.out.println(ea.pincode);

		
		
		
		
		
	}

}
