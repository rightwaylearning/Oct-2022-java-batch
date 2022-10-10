package employee_info.details;

public class Controller {

	public static void main(String[] args) {
		
		Address x = new Address();
		x.line1 = "TCS , hinjewadi, phase - 3";
		x.line2 = "tal-mulshi";
		x.landmark = "Mumbai-pune road";
		x.pin = 234567;
		
		Compnay c = new Compnay();
		c.name ="TCS";
		c.registerNumber = "IN-5465/63546/2001";
		c.adr = x;
		
		
		Address empAddress = new Address();
		empAddress.line1 = "D-789, Wing H";
		empAddress.line2 = "tal haveli pune";
		empAddress.landmark = "next to nagar road";
		empAddress.pin = 456789;
		
				
       Employee emp = new Employee();
       emp.empId = 123;
       emp.name = "Rohan";
       emp.cellPhone = 9422947835L;
       emp.comp = c;
       emp.adr = empAddress;
       
		
       emp.showData();
		
	}
	
}
