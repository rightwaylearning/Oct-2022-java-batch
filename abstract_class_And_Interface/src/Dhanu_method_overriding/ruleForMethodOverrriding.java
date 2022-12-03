package Dhanu_method_overriding;


class P {

	private void m1() {
      System.out.println("I am P class m1 method");
	}
	
	static void m2() {
		P p = new C();
		p.m1();
	}
}

class C extends P {

	
	private void m1() {
		 System.out.println("I am C class m1 method");
	 }
}

public class ruleForMethodOverrriding {

	public static void main(String[] args) {
       P.m2();
	}

}


