package Vinayak_Landge;

public class Entrypoint {
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		System.out.println(t.a);
		System.out.println(t.b);
		
		Test t1 = new Test (1000,2000);
		
		System.out.println(t1.a);
		System.out.println(t1.b);
	}

}
