package method_overloading_vinayak;

public class Test {
	
	 void m1(Object o){
		
		System.out.println("This is m1(object)");
		
	}
	 
	 void m1(Number n) {
		 
			System.out.println("This is m1(number)");
		 
	 }
	 
	 void m1(int i) {
		 
			System.out.println("This is m1(int)");

	 }
	 
	 void m1(float f) {
		 
			System.out.println("This is m1(float)");

	 }
	 
	 void m1(String s) {
		 
			System.out.println("This is m1(String)");

	 }
	public static void main(String[] args) {
		
		Test t = new Test();
		
		t.m1("");
		
		t.m1(t);
		
		t.m1(new String(""));
		
		byte b=10;
		
		t.m1(b);
		
		t.m1(new Integer(10));
		
		Boolean b1=false;
		
		t.m1(b1);
		
		t.m1(new Float(10.0f));
		
		short s=45;
		
		t.m1(s);
	}
}


