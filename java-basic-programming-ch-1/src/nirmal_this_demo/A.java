package nirmal_this_demo;

public class A {
	
	int a; 
	int b;
	int z;
	
	
	void m1(int a , int b , A obj ) {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(z);
//		we can call class A variable by obj.a, obj.2
		
		
//		OR or better we use this key word to class A variable.
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.z);
		
	}

}
