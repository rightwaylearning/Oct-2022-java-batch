package vishwa_array_3_10;

public class EmployeeArray {

	
	public static void main(String[] args) {
		
	Employee[] e = new Employee[3];
	
	     Employee x = new Employee();
	     x.name="vishwa";
	     x.impid=20001;
	     // here we declared the valve like 001,002
	     // then it will print only last num like 1,2
	 e[0]=x;
	 
	     Employee y= new Employee();
	     y.name="nirmal";
	     y.impid=20002;
	e[1]=y;
	
	     Employee z = new Employee();
	     z.name="kuldip";
	     z.impid=20003;
	e[2]=z;
	
	
	
	System.out.println(e[0].name);
	System.out.println(e[0].impid);
	System.out.println(e[1].name);
	System.out.println(e[1].impid);
	System.out.println(e[2].name);
	System.out.println(e[2].impid);
	
	
	
	}   	
}
