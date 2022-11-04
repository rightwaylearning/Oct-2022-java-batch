package Rushikesh_arayProgram_4_10;

public class Employeeinfo_Controller {
	
	public static void main(String[] args) {
		
	    
		
		EmployeeInfo e1=new EmployeeInfo();
		e1.employeName="Rushikesh";
		e1.emailId="Rushikesh193@gmail.com";
		e1.mobileNumber=9284557810l;
		
		
		EmployeeInfo e2=new EmployeeInfo();
		e2.employeName="Rohit";
		e2.emailId="Rohit23@gmail.com";
		e2.mobileNumber=9263809623l;
		
		
		
		EmployeeInfo e3=new EmployeeInfo();
		e3.employeName="Ronit";
		e3.emailId="Ronit2453@gmail.com";
		e3.mobileNumber=7590168623l;
		
		
		EmployeeInfo[] e= {e1,e2,e3};
		
		
		for(int i=0;i<e.length;i++) {
			System.out.println(e[i].employeName);
			System.out.println(e[i].emailId);
			System.out.println(e[i].mobileNumber);
			
			System.out.println("---------------------------------------------------");
			
			
		}
		
	}
	     

}
