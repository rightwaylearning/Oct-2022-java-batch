package exceptionhandling;

public class A {

	public void doA() throws Exception {
		System.out.println("I am A class");
		B b= new B();
		b.doB();
	}
}
