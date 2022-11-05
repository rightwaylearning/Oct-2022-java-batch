package Rutuja_Kauthale;

public class EmployeeInfo {
	
	
	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		
		Employee[] emp=new Employee[4];
		emp= emp1.getEmployeeInfo();
		for(int i=0;i<emp.length;i++)
		{
			
	System.out.println(emp[i].getEmpID());
	System.out.println(emp[i].getName());
	System.out.println(	emp[i].getCompanyName());
		}
			
			
		
	}
	
}
