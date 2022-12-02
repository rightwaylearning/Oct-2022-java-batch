package Rutupack1_13_11_22;

public class Parent {
       void m1() {
    	   System.out.println("m1 method Parent");
       }
       
  		void m2() {
    	 	   System.out.println("m2 method Parent");
    	    }
    	
       
}
class Parent1 extends Parent{
	void m2() {
 	   System.out.println("m2 method Parent1");
    }
	void m3() {
		System.out.println("m3 method Parent1");
	}
}
class Parent2 extends Parent1{
	void m3() {
 	   System.out.println("m3 method Parent2");
    }
	void m4() {
		System.out.println("m4 method Parent2");
	}
}
