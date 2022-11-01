package nirmal_this_demo;

public class Company {
	
	String name;
	String CompanyName;
	int id;
	
	
	
	void m(String name, String CompanyName, int id ) {
		
		System.out.println(name);
		System.out.println(CompanyName);
		System.out.println(id);
		
	    System.out.println(this.name);
		System.out.println(this.CompanyName);
		System.out.println(this.id);
			
	}
	

}
