package nirmal_set_get;

public class controller {

	public static void main(String[] args) {

		D d = new D(100,200);
		int c = d.getA();
		int x = d.getB();
		d.setA(10);
		int bb = d.getA();
		System.out.println(c);
		System.out.println(x);
		System.out.println(bb);
		
		D d1 = new D(500, 700);
		int y = d1.getA();
		int z = d1.getB();

		System.out.println(y);
		System.out.println(z);

		D d2 = new D();
		d2.setA(500);
		d2.setB(600);

		int a = d2.getA();
		System.out.println(a);
		int b = d2.getB();
		System.out.println(b);

	}

}
