package nikita_tonde;

public class Employee {
	public static void main (String []args) {
		
		emp [] e = new emp [3];
		
		emp obj = new emp();
		
		obj.name = "sayli";
		obj.CellPhone = 9370666420L;
		obj.empId = 1234;
		
		e[0] = obj;
		
		emp obj1 = new emp ();
		
		obj1.name = "sahil";
		obj1.CellPhone = 9921196068L;
		obj1.empId = 7894;
		
		e[1] = obj1;
		
		System.out.println(obj.name);
		System.out.println(obj.CellPhone);
		System.out.println(obj.empId);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>..");
		
		System.out.println(obj1.name);
		System.out.println(obj1.CellPhone);
		System.out.println(obj1.empId);
		
		
		
		
		
		
		
		
	}

}
