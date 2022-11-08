package Rutuja_Kauthale;

public class Employee {

	private int empID;
	private  String name;
	private String companyName;
	
	
	Employee()
	{}
	//constructor
	public Employee(int empID, String name, String companyName) {
		super();
		this.empID = empID;
		this.name = name;
		this.companyName = companyName;
	}
	
	//getter setter method
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public Employee[] getEmployeeInfo(){
		Employee[] employee = new Employee[4];
		employee[0]=new Employee(1,"rutu","Cognizant");
		employee[1]=new Employee(2,"divya","Accenture");
		employee[2]=new Employee(3,"priya","Capgemini");
		employee[3]=new Employee(4,"nikita","TCS");
		return employee;
	}
	
}
