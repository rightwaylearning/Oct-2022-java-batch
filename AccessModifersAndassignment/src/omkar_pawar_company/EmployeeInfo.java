package omkar_pawar_company;

public class EmployeeInfo {

	public Employee[] getEmployeeInfo() {
		
		Employee[] emp = new Employee[5];
		
		emp[0] = new Employee("omkar",22,"Infosys");
		emp[1] = new Employee("rushi",23,"Congnizant");
		emp[2] = new Employee("nirmal",45,"Wipro");
		emp[3] = new Employee("vaibhav",55,"Tcs");
		emp[4] = new Employee("ajinkya",76,"Capgemini");
		
		return emp;
	}
}
