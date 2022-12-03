package Archana_method_overloading;

public class testNew {
	
	void m1(Object o) {
		System.out.println("m1 Object");
		
	}
	
	void m1(Number o) {
		System.out.println("m1 Number");
	}
	
	void m1(Float o) {
		System.out.println("m1 Float");
	}
	
	void m1(String o) {
		System.out.println("m1 String");
	}
	
	public static void main(String[] args) {
		testNew t= new testNew();
	}
	

}
