package vaishnavi.shitole;

public class Controller {
	
	public static void main(String[] args) {
		B obj1 = new B();
		obj1.a=1000;
		obj1.b=2000;
		obj1.c=3000;
		
		obj1.m1(1, 2, obj1);
		
		System.out.println("-------------------------------");
		
		B obj2 = new B();
		obj2.a=100;
		obj2.b=200;
		obj2.c=300;
		
		obj2.m1(10, 20, obj2);
		
	}

}
