package abhishek_wagh.array.Programs;

public class Emp {

	String name , contactNo ;
	int no;




	


		public static void main(String[] agrs) {
		
		Emp[] e = new Emp[5];
		
		Emp obj = new Emp();
		
			obj.name="ShriPrasad";
			obj.contactNo="8923767367";
			
		e[0]= obj;
		
		Emp obj1 = new Emp();
			
			obj1.name="Shrutika";
			obj1.contactNo="5846622458";
			
			e[1] = obj1;
			
			System.out.println(obj.name);
			System.out.println(obj.contactNo);
			
			System.out.println("----------------------------------------------------------");
			
			System.out.println(obj1.name);
			System.out.println(obj1.contactNo);
		
	
	}
	



}

	




