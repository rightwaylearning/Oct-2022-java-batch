package rwl_15_10_22_thisdemo.examples;

public class ThisDemo {

	public static void main(String[] args) {
		
		 A obj1  = new A();
		 obj1.a = 10;
		 obj1.b = 20;
		 obj1.x = 30;
		 
		 obj1.m1(1, 2, obj1);
	
		 System.out.println("--------------");
				
	  	 A obj2 = new A();
		 obj2.a = 100;
		 obj2.b = 200;
		 obj2.x =300;
		 
		 obj2.m1(11, 12, obj2);
		
	}
}
