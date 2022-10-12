package nirmal_static_method;

public class Controler {
	public static void main(String[] args) {
		
		Employee.companyname = "tcs limited";
		
		Employee.n();
		Employee.m1();
		
		Employee e = new Employee();
		e.firstname = "nirmal";
		e.lastname = "rajut";
		e.id = 65;
		e.m2();
		e.m();
		
		
		
		
	}

}
