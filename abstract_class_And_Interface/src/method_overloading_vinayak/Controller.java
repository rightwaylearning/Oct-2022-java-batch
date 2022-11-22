package method_overloading_vinayak;

public class Controller {

	public static void main(String[] args) {
		
		method_signature ms = new method_signature();
		
		ms.m(12);
		
		ms.m(3,4,8);
		
		ms.m(1.1f,1);
		
		ms.m(8,5.3f);
		
		ms.m(558,458);
		
		ms.m(45.6f,98.12f);
		
		float f=10.3f;
		
		byte s=55;
		
		ms.m(f,s);
		
		//ms.m(456822d);
	}
}
