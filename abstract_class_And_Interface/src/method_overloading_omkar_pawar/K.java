package method_overloading_omkar_pawar;

class M{}
class N extends M{}
class Z extends N{}
class L extends Z{}


public class K {

	void m1(N n) { // m1(N)
System.out.println("m1(M)");
	}
	
	void m1(M m) {
		System.out.println("M(M)");
	}
	
	void m1(Z z) {
		System.out.println("m1(Z)");
	}
	
	void m1(Object o) {
		System.out.println("m1(object)");
	}
	
	public static void main(String[] args) {
		K k =new K();
//  L l = new L();
//  k.m1(1); //
		
		N n = new Z();
		k.m1(n); //m1(N)
	}
}
