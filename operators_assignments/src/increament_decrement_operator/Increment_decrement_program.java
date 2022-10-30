package increament_decrement_operator;

public class Increment_decrement_program {

	public static void main(String[] args) {

		byte z = 10;
		z++;
		byte y = z;
		System.out.println(y);

		int s = 50;
		++s;
		int q = s;
		System.out.println(q);

		int a = 10;
		int b = 20;

		int c = a++ + b++;
		int d = a + b;
		System.out.println(c);
		System.out.println(d);

		int l = 50;
		byte m = 100;

		int n = l++ + ++m;
//		l++ 50 and ++m101  

		int o = l + m;
		System.out.println(n);
		System.out.println(o);

		int x = 500;
		int g = 400;
		int r = --x - g++;

		System.out.println(r);

	}

}
