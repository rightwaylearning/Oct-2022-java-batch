package method_overloading_nikita;

   class Z {}
   class M extends Z{}
   class O extends M{}
   class P extends O{}

public class N {
	void m1(M m) {
	System.out.println("m1(M)");	
	}
	void m1(O o) {
		System.out.println("m1(O)");
		
	}
	void m1(P p) {
		System.out.println("m1(P)"); 
	}
	void m1(Object o) {
		System.out.println("m1(object)");
	}
	public static void main(String[] args) {
		N n = new N();
		n.m1(n);
		
	}
}
