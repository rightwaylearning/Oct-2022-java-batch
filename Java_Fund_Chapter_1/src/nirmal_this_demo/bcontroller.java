package nirmal_this_demo;

public class bcontroller {

	public static void main(String[] args) {

		B b = new B();
		b.x = 100;
		b.y = 200;
		b.z = 300;

		b.m(5000, 6000);

		System.out.println("------------------------------");

		B b2 = new B();
		b2.x = 400;
		b2.y = 500;
		b2.z = 600;

		b2.m(8000, 9000);

		System.out.println("------------------------------");

		B b3 = new B();
		b3.x = 700;
		b3.y = 800;
		b3.z = 900;

		b3.m(7000, 8000);

	}

}
