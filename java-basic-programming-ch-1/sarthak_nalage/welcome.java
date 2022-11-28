package sarthak_nalage;

public class Test{
	void m1() {
		System.out.println("Hello india");
	}
}
class Test1 extends Test{
	void m2() {
		System.out.println("Hello World");
	}
}
public class welcome {
public static void main(String[] args) {
	System.out.println(" welcome sarthak ");
	 Test t=new Test1();
	 t.m2();
	
}
}
