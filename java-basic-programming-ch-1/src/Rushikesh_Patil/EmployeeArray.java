package Rushikesh_Patil;

public class EmployeeArray {
	
	public static void main(String[] args) {
		
		Employee[] e=new Employee[5];
		
		
		Employee e1=new Employee();
		e1.name="Patil Rushikesh";
		e1.empId="Pass@123";
		e1.mobileNo=9284557810l;
		                         
	    e[0]=e1;
	    
	    Employee e2=new Employee();
		e2.name="Rohit Patil";
		e2.empId="Pass@1234";
		e2.mobileNo=9284557810l;
		
	    e[1]=e2;
	    
	    Employee e3=new Employee();
		e3.name="Pratap Patil";
		e3.empId="Pass@12345";
		e3.mobileNo=9284557810l;
		
	    e[2]=e3;
	    
	    
	    System.out.println(e[0].name);
	    System.out.println(e[0].empId);
	    System.out.println(e[0].mobileNo);
	    
	    System.out.println("------------------------------------------------");
	    
	    System.out.println(e[1].name);
	    System.out.println(e[1].empId);
	    System.out.println(e[1].mobileNo);
	    
	    System.out.println("------------------------------------------------");
	    
	    System.out.println(e[2].name);
	    System.out.println(e[2].empId);
	    System.out.println(e[2].mobileNo);
	    
	    System.out.println("------------------------------------------------");	                                   
		
	}

}
