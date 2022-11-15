package vaishu.shitole;

public class parent_child_controller {
	
	public static void main(String[] args) {
		 
		
		// case 1
		A a = new A();
		a.m1();
		a.equals(a);
		
		System.out.println("-----------------------------");
		
		// case 2
		
		B b = new B();
		b.m1();
		System.out.println("-----------------------------");

		// case 3
		
		A a1 = new B();
		a1.m1();
		// a1.m2();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	}

}
