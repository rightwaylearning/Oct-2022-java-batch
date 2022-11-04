package sarthak_nalage;
class A{
	int a; int b;
	static int x;
	void m1(int a, int b) {
		this.a=a;this.b=b;
		System.out.println(A.x);
		System.out.println(this.a);System.out.println(this.b);
	}
	static void m2() {
		System.out.println(x);
		
		
	}
}
public class Static_local_instance {
	static int a;
	public static void main(String[] args) {
		System.out.println(A.x);
		A a=new A();
		Static_local_instance.a=90;
		a.m1(12,47); A.m2();
		System.out.println(Static_local_instance.a);
	}

}
