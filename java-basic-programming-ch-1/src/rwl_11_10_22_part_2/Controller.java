package rwl_11_10_22_part_2;

public class Controller {

	
	public static void main(String[] args) {
		
		//  for static variable & method use class name
		Employee.officeName = "infosys limited";
		Employee.s1();
		Employee.s2();
		
		Employee e = new Employee();
		e.name = "abc";
		e.empId = 23;
		e.cellPhone = 73465827658L;
		e.m1();
		e.m2();
		
	}
}
