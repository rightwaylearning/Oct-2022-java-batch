package Rutuja.Nimbhore;

public class Q {
	int a;
	int b;
	int x;
	
	void m1(int a,int b,Q q)
	{
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(q.a);
		System.out.println(q.b);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(x);
		System.out.println(q.x);
		System.out.println(this.x);
	}

}
