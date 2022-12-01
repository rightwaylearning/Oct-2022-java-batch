package Rutu_MethodOverloading;

public class Test {
	public void m1(int a) {
		System.out.println("m1(int)");
	}
	
	public void m1(Number n) {
		System.out.println("m1(number)");
	}
	
	 public void m1(Object o) {
		 System.out.println("m1(Object)");
	 }
	
	 
	
	public static void main(String[] args) {
		Test t= new Test();
		Byte b = 10;
	    t.m1(b);
		
		float f = 23.90f;
		t.m1(f);
		
		byte b1 = 10;
    	t.m1(b1);
		
		boolean b2 = true;
		t.m1(b2);
		
	     Boolean b3 = false;
	     t.m1(b3);
			
	}
}
