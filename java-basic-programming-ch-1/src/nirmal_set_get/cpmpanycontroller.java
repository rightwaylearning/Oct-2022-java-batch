package nirmal_set_get;

public class cpmpanycontroller {

	public static void main(String[] args) {
		
		Company c = new Company("infosys","m s sharma",5000);
		 String n = c.getComapnyName();
	     String m =	c.getCompanyCeo();
		 int l = c.getCompanyemployee();
		
		 System.out.println(n);
		 System.out.println(m);
		 System.out.println(l);
		
		

	}

}
