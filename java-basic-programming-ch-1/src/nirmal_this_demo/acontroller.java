package nirmal_this_demo;

public class acontroller {

	public static void main(String[] args) {
		
		A a = new A();
		a.a = 23;
		a.b = 43;
		a.z = 50;
		a.m1(500, 1000, a);

		System.out.println("---------------------------------------");
		
		A a2 = new A();
		a2.a = 100;
		a2.b = 200;
		a2.z = 300;
		
		a2.m1(700, 800, a2);
	
		
		
		
	}

}
