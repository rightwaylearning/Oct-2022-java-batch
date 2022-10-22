package nirmal_set_get;

public class controller {

	public static void main(String[] args) {

		D d = new D(100, 200);
		int obj1 = d.geta();
		System.out.println(obj1);

		int obj2 = d.getb();
		System.out.println(obj2);

		D d2 = new D(500, 700);
		int y = d2.geta();
		int z = d2.getb();

		System.out.println(y);
		System.out.println(z);

		D d1 = new D();
		d1.seta(500);
		d1.setb(600);

		int a = d1.geta();
		System.out.println(a);
		int b = d1.getb();
		System.out.println(b);

	}

}
