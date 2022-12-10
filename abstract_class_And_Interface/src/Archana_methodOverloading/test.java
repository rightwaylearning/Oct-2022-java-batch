package Archana_methodOverloading;

public class test {
	void m1(Object o) {
		System.out.println("object o");
	}
	
	void m1(byte b) {
		System.out.println("byte b");
	}
	
	void m1(StringBuffer sb) {
		System.out.println("StringBuffer sb");
	}
	
	public static void main(String[] args) {
		
		test t = new test();
		t.m1(" ");
		t.m1(369);
		t.m1(null);
	}

}
