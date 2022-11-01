package nirnal_contructer_assigment;

public class dcontroller {

	public static void main(String[] args) {

		
//		
//
//	       D d = new D();
//	       d.m1(50, 100);
//	       System.out.println(d.a);
//	       System.out.println(d.b);
		
	       
	       
//	   create d1 object for the call of parameterise contructer    
		D d1 = new D(100,300);
//		d1.m2(500);
//		we can creat m2 method in class D for the update of value 'a'
		System.out.println(d1.a);
		System.out.println(d1.b);
		
	}
}
