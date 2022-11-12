package Vinayak_Landge;

public class Employee_Controller {

	public static void main(String[] args) {
		
		Employee_static es = new Employee_static();
		
		es.empId= 12;
		es.empName= "Arvind";
		Employee_static.empComp = "Tech Mahindra";
		
		
		System.out.println(es.empId);
		System.out.println(es.empName);
		System.out.println(Employee_static.empComp);
		
		System.out.println("-----------------------");
		
		Employee_static es1 = new Employee_static();
		
		es1.empId= 13;
		es1.empName= "Sumeet";
		//Employee_static.empComp = "Tech Mahindra";
		
		
		System.out.println(es1.empId);
		System.out.println(es1.empName);
		System.out.println(Employee_static.empComp);
		
		System.out.println("-----------------------");
		
		es.m1();
		Employee_static.m2();
		
	}
}
