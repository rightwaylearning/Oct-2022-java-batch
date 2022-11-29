package sarthak_nalage;

class Overload_wrapper
{
	void m1(Number f) {
		System.out.println("I'm inside Number ");
	}
	
	
	void m1(long b) {
		System.out.println("I'm long byte");
	}
 
		void m1(Object num) {	
			System.out.println("I'm inside Object ");
	}

}

public class Testing_Overloading {
	public static void main(String[] args) {
		Overload_wrapper obj=new Overload_wrapper();
		Integer i= 10;
		obj.m1(i);
	}
}
