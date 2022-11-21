package vaishnavi.shitole;

public class thisDemo {
	//Byte c1=40;
	int a;
	int b;
	int c;
	Integer i = 10;
	String s = "ghgh";
	
	void m1(int a,int b,thisDemo t) {
		
		System.out.println(a);//10
		System.out.println(b);//20
		System.out.println(this.a);//1000
		System.out.println(this.b);//2000
		System.out.println(this.c);//3000
		System.out.println(t.a);//1000
		System.out.println(t.b);//2000
		
		//t.m1(10,20, t);
		
	}

}
// Wrapper Classse--------------------------

// 1) byte b = 10;                   Byte b = new Byte(10); 
// 2) short s = 10;                  Short s = new Short(10);


