package vaibhavpatil_14_10_2022;

public class Controller {

	public static void main(String[] args) {
		A a=new A(100,200);
		
		System.out.println(a.a);
		System.out.println(a.b);
		
		//------------------------------------------
		
		A a1=new A(10,20);
		a1.m1(1000, 2000);
		
		a1.updateA(56);
		
		//System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.a);

	}
}
