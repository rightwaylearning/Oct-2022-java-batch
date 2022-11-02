package vishwa_17_10;



public class Employee {

	int empId;
	String name;
	long cellPhone;
    static String officeName;
    
    void m1() {
    	System.out.println("I am m1 method");
    }
    
    static void s1() {
    	System.out.println("I am static methdo");
    }
	
    
    void m2() {
    	System.out.println(empId);
    	System.out.println(name);
    	System.out.println(cellPhone);
    	m1();
    	
    	System.out.println(Employee.officeName); 
    	Employee.s1();                           
    }
    
    static void s2() {
    	System.out.println(officeName); 
    	Employee.s1();                           
 
    
    	//Employee e= new Employee();
    	System.out.println(empId);
    	System.out.println(name);
    	System.out.println(cellPhone);
    	m1();
    }
}

