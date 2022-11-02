package nirnal_contructer_assigment;

public class eclasscontroller {

	public static void main(String[] args) {
		
		
		
		E e = new E();
		e.m3(1000, 5000);
		System.out.println(e.a);
		System.out.println(e.b);
//		print the method value of a and b

		
		E e2 = new E(150,400);
		e2.m4(800);
		System.out.println(e2.a);
		System.out.println(e2.b);
		
		
	}

}
