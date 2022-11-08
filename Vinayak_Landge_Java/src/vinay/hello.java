package vinay;

import vin.hi;

public class hello {
	
	public void m1() {
		
		System.out.println("This is m1() of class hello");
	}

	public static void main(String[] args) {
		//System.out.println("hello world.....");
		
		
		hello he = new hello();
		he.m1();
		
		hi h = new hi();
		h.m2();
	}
}
