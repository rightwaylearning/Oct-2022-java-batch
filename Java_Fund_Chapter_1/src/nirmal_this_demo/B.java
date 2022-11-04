package nirmal_this_demo;

public class B {
	
	int x;
	int y;
	int z;
	
	
	void m(int m, int n ) {
		
		System.out.println(m);
		System.out.println(n);
		
//		we can call class B variable with the help of this key
		
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println(this.z);
		
	}
	

}
