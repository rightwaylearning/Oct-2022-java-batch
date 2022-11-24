package method_overloading_nikita;

public class MethodOverloading {
	
      public void m1 (int a,int b) {
	 System.out.println("int,int");
 }
      public void m1 (int a,float f,int i) {
    	  System.out.println("int,float,int");
    	  
      }
      public void m1 (int x,int y,int a) {
    	  System.out.println("int,int,int");
    	  
      }
      public void m1 (float f, int y) {
    	  System.out.println("float,int");
      }
}