package Archana_methodOverloading;

public class testNew {
	
	void m1(Object o) {
		System.out.println("m1 (Object)");
	}
	
	void m1(Number o) {
		System.out.println("m1 (Number)");
	}
	
	void m1(String o) {
		System.out.println("m1 (String)");
	}
	
	void m1(Float o) {
		System.out.println("m1 (Float)");
	}
	public static void main(String[] args) {
		testNew t = new testNew();
		
		//t.m1(201.55);
		t.m1("Archana");
		t.m1(25);
		
		System.out.println("--------------------------");
		t.m1(new StringBuffer());
		t.m1(new Integer(26));
	}

}
