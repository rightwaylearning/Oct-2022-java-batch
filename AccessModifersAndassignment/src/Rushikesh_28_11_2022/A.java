package Rushikesh_28_11_2022;

public class A {
	
	void m1(Object o) {
		
		System.out.println("Object o");
		
	}
	
    void m1(String s) {
		
		System.out.println("String s");
		
	}
	
	void m1(byte b) {
		
		System.out.println("byte b");
		
	}
	
    void m1(long b) {
		
		System.out.println("long b");
		
	}
    
    void m1(boolean b1) {
    	
    	System.out.println("Boolean b1");
    	
    }
	
	public static void main(String[] args) {
		
		A a = new A();  
		a.m1("");                // String s
		a.m1("Rushikesh");       // String s
		a.m1(10.44);             // object o
		a.m1(null);              // String s
	    a.m1(20);                // long b
		a.m1(true);              // Boolean b
		a.m1('a');               // long b
	}

}
