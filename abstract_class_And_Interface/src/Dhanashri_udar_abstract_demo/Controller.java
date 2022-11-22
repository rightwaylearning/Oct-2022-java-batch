package Dhanashri_udar_abstract_demo;

public class Controller {
	public static void main(String[] args) {
		//case 1
		//parent p = new parent();
		
		//case 2
		Child c = new Child();
		c.m1();
		c.m2();
		c.m3();
		
		Parent p= new Child();
		p.m1();
		p.m2();
		p.m3();
		
		Caller(p);
	}

	 static void Caller(Parent p) {
		 p.m1();
		 p.m2();
		 p.m3();
		
		
	}

}
