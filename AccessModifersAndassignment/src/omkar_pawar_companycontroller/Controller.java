package omkar_pawar_companycontroller;

import omkar_pawar_company.EmployeeInfo;

import omkar_pawar_company.Employee;



public class Controller {
	public static void main(String[] args) {

		
		EmployeeInfo empin = new EmployeeInfo();
		
	Employee[] array= empin.getEmployeeInfo();
		
	for(int i = 0; i<array.length;i++) {
		System.out.println(array[i].getEmpName());
		System.out.println(array[i].getEmpId());
		System.out.println(array[i].getEmpCompany());
		System.out.println("-----------------------------")
		;
	}
		
	}

}

