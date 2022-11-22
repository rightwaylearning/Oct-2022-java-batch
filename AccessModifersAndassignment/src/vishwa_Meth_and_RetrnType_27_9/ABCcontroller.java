package vishwa_Meth_and_RetrnType_27_9;



public class ABCcontroller {

	public static void main(String[] args) {
		
		A a = new A();
		
		a.a= 10;
		a.b=20;
		int s = a.sum();
		System.out.println(s);
		
		
		B b = new B();
		A ss = b.getAobj();
		int sss =  ss.sum();
	    System.out.println(sss);
		      
		
	    C c = new C();
	   A rrr = c.getAobj();
	   int vvv = rrr.sum();
	   System.out.println(vvv);
	    
	    
	    
	}
	
}
