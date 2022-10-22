package cal1;

public class compiler {
	public static void main(String[] args) {
		Cal1 c = new Cal1( );
		c.a = 100;
		c.b = 200;
		int s = c.sum();
		System.out.println(s);
				
		Cal2 c3 = new Cal2( );
        Cal1 obj1 = c3.s( );
        int m = obj1.sum();
        System.out.println(m);
			 
	}

}
