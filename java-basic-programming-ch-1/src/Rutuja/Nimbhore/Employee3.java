package Rutuja.Nimbhore;

public class Employee3 {

	private int  empNumber;
	private String empFirstName;
	private String emplastName;
	private String empDepartment;
	
	Employee3(){
		
	}
	
	Employee3(int empNumber, String empFirstName, String emplastName, String empDepartment) {
		
		this.empNumber = empNumber;
		this.empFirstName = empFirstName;
		this.emplastName = emplastName;
		this.empDepartment = empDepartment;
	}
	      
    int getEmpNumber() {
    	return empNumber;
    }
    
    void setEmpNumber(int empNumber ) {
    	this.empNumber=empNumber;
    	
    }
    
    String getEmpFirstName() {
    	return empFirstName;
    }
    void setEmpFirstName(String empFirstName) {
    	this.empFirstName=empFirstName;
    	
    }
    
    String getEmpLastName() {
    	return emplastName;
    }
    void setEmpLastName(String  emplastName) {
    	this. emplastName= emplastName;
    	
    }
    
    String getEmpDepartment() {
    	return empDepartment;
    }	 
    void setEmpDepartment(String  empDepartment) {
    	this. empDepartment= empDepartment;
    	
    }
}
