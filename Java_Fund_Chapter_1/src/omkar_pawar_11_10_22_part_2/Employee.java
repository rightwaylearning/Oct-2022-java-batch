package omkar_pawar_11_10_22_part_2;

public class Employee {
 int empId;
 String name;
 long cellPhone;
 static String officeName;
 
 void m1() {
	 System.out.println("I am m1 method");
 }
 
static void s1() {
	 System.out.println("I am static method");
 }
 
 void m2() {
	 System.out.println(empId);
	 System.out.println(name);
	 System.out.println(cellPhone);
	 m1();
	 
	 System.out.println(officeName); //Employee.officeName
	 s1();                             //Employee.s1();
 }
 
     static void s2() {
    	 System.out.println(officeName); //Employee.officeName
    	 s1();                           //Employee.s1();
    	 
    	 //we can't access instance variable &
    	 //method directly inside static method
    //   System.out.println(empId);
    //   	 System.out.println(name);
    	 //  System.out.println(cellPhone);
    	 // m1();
    	 //solution
    	 
    Employee e = new Employee();
    System.out.println(e.empId);
    System.out.println(e.name);
    System.out.println(e.cellPhone);
    e.m1();
    
     }
 
}
