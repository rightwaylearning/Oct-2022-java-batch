package nirmal_set_get;

public class econtroller {

	public static void main(String[] args) {
		
		
		Employee e = new Employee();
		e.setFirstname("Nirmal");
		e.setLastname("Rajput");
		e.setId(45);
		
		 String s = e.getFirstname();
		 String f = e.getLastname();
		 int c = e.getId();
		
		 System.out.println(s);
		 System.out.println(f);
		 System.out.println(c);
         
	}

}
