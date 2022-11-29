package archana_abstrac_demo;



public class controller {
	
	public static void main(String[] args) {
		// case 1
		//parent p = new parent();
		
		//case 2
		child c = new child();
		c.a1();
		c.a2();
		c.a3();
		
		parent p1 = new child();
		p1.a1();
		p1.a3();
		
		caller(p1);
		
	}

	
	static void caller(parent p1) {
		p1.a1(); 
		p1.a2();
		p1.a3();
	}

}
