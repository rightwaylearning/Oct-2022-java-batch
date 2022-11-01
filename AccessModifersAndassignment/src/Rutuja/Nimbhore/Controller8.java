package Rutuja.Nimbhore;

public class Controller8 {
	public static void main(String[] args) {
		A a=new A();
		a.m1(10,20);
		
		System.out.println(a.a);
		System.out.println(a.b);
		
		A a1 = new A(100,200);
		a1.m1(50, 40);
		
		System.out.println(a1.a);
		System.out.println(a1.b);
	}

}
