package vaishnavi.shitole;

public class C {
	
	int a;
	int b;
	
	void m1(int a, int b,C obj) {
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("vaiable initialize using object");
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		System.out.println("vaiable initialize using this variable");

		System.out.println(this.a);
		System.out.println(this.b);
		
		
		
	}

}
