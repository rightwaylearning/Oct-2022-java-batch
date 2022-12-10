package exceptionhandling;

public class B {
	
	public void doB() throws Exception {
		System.out.println("I am B class");
		C c= new C();
		c.doC();
	}

}
