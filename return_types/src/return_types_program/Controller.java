package return_types_program;

public class Controller {
	
	
	public static void main(String[] args) {
		
		B sch = new B();
		A result = sch.getAObject();
		 int r = result.sum();
		System.out.println(r);
		
		
	}

}
