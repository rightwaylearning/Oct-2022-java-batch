package Rutuja.Nimbhore;

public class Controller12 {
	public static void main(String[] args) {
		 
		Employee3 e=new Employee3(10,"Karishma","Gavali","Finance");
		System.out.println(e.getEmpNumber());
		System.out.println(e.getEmpFirstName());
		System.out.println(e.getEmpLastName());
		System.out.println(e.getEmpDepartment());
		
		//=====================================
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.");
		
		Employee3 e1=new Employee3();
		e1.setEmpNumber(20);
		e1.setEmpFirstName("Teju");
		e1.setEmpLastName("Jaktap");
		e1.setEmpDepartment("Marketing");
		
		
		int data1=e1.getEmpNumber();
		String data2=e1.getEmpFirstName();
		String data3=e1.getEmpLastName();
		String data4=e1.getEmpDepartment();
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
	}

}

