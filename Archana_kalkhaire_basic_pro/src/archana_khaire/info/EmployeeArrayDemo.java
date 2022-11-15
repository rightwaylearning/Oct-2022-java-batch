package archana_khaire.info;

public class EmployeeArrayDemo {
	public static void main(String[] args) {
		Employee [] e = new Employee[3]; 
		       Employee obj =new Employee();
		       obj.rollNumber = 15;
		       obj.name = "Sharayu";
		       obj.id =2121;
		   e[0] = obj;
		   
		       Employee obj1 =new Employee();
		         obj1.rollNumber =20;
		         obj1.name = "Swara";
		         obj1.id =2325;
		   e[1] =obj1;
		   
		         Employee obj2 = new Employee();
		         obj2.rollNumber = 30;
		         obj2.name = "Aryan";
		         obj2.id = 2421;
		   System.out.println("Enter Employee Details......");      
		   System.out.println(e[0].rollNumber);
		   System.out.println(e[0].name);
		   System.out.println(e[0].id);
		   
		   
		   int[] x =new int[5];
		   x[0] = 10;
	}

}
