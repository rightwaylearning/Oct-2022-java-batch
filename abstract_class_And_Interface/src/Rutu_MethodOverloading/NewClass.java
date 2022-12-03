package Rutu_MethodOverloading;

public class NewClass {
	 
		void m1(Object o) {
			System.out.println("m1(Object)");
		}
		
		void m1(Number o) {
			System.out.println("m1(Number)");
		}
		
		void m1(Float o) {
			System.out.println("m1(Float)");
		}
		
		void m1(String o) {
			System.out.println("m1(String)");
		}
		
		public static void main(String[] args) {
			
			NewClass n= new NewClass();
			n.m1("");
		
		    n.m1(new String());
		
		    n.m1(new String(""));
		    n.m1(n);
		    n.m1(new Integer(10));
		
			n.m1(new StringBuffer());
			
			
		}
	
}

