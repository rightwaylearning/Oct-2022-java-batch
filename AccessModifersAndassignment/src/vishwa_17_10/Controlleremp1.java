package vishwa_17_10;

public class Controlleremp1 {
	
	public static void main(String[] args) {
		
// if i want to call instance method then i will have to create an object
	   Employee1 e = new Employee1();
	   e.name="vishwa";
	   e.empid=1234;
	   e.m1();
	   System.out.println("___________________________________________");
// if i want to call  static method then no need to create an object
	   Employee1.m2();
	   System.out.println();
	
	System.out.println("_______________________________________________");
	System.out.println(e.name);
	System.out.println(e.empid);
	Employee1.companyName="RIGHT_WAY_LEARNING";
	System.out.println(Employee1.companyName);
	System.out.println("_______________________________________________");
		
		
		
		
		
		
		
		



	}

		
	
	
}
