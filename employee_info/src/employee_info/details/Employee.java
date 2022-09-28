package employee_info.details;

public class Employee {

	int empId;
	String name;
	long cellPhone;
	Compnay comp;
	Address adr;
	
	void showData() {
		System.out.println("------- Employee Information-----------");
		System.out.println(name);
		System.out.println(empId);
		System.out.println(cellPhone);
		System.out.println(adr.line1);
		System.out.println(adr.line2);
		System.out.println(adr.landmark);
		System.out.println(adr.pin);
		
		
		System.out.println("------- Company Information-----------");
		System.out.println(comp.name);
		System.out.println(comp.registerNumber);
		System.out.println(comp.adr.line1);
		System.out.println(comp.adr.line2);
		System.out.println(comp.adr.landmark);
		System.out.println(comp.adr.pin);
	}
}
 