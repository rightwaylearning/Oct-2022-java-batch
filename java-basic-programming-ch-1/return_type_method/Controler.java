package return_type_method;

public class Controler {

	public static void main(String[] args) {
		
	   	A a = new A();
		  a.a = 23;
		  a.b = 64;
		 int sum = a.sum();
		 int minus =a.minus();
		 int multi= a.multi();
		 
		 System.out.println(sum);	
		 System.out.println(minus);	
	    System.out.println(multi);	
	    
	
	           B b = new B();
			   A  obj1 = b.getAobject(); 
			   
			   
	}
}
	