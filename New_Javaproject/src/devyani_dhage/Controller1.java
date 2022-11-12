package devyani_dhage;

public class Controller1 {

	
	public static void main(String[] args) {
		
	A a=new A();
	a.m1(100,200);		
	
	
	System.out.println(a.a);//100
	System.out.println(a.b);//200
	
	A a1=new A(100,200);
	a1.m1(1000,2000);
	
	a1.updateA(10000);
	
	System.out.println(a1.a);//10000
	System.out.println(a1.b);//2000
		
	}
}
