package Archana_Overriding_method;

public class Controller {
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.m1(100);
		p.m1(10);
		
		Child c = new Child();
		c.m1(100);
		
		Parent p1 = new Child();
		p1.m1(100);
	}

}
