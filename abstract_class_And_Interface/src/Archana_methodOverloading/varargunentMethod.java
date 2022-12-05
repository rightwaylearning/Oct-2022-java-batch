package Archana_methodOverloading;

public class varargunentMethod {
	
	void m1(int a) {
		System.out.println("m1(int)");
	}
	
	void m1(int...a) {
		System.out.println("I am var Argument method");
		for(int i = 0;i < a.length; i++) {
			System.out.print(a[i] +" " );
			
		}
		System.out.println("=========================");
	}
	public static void main(String[] args) {
		varargunentMethod v = new varargunentMethod();
		
		v.m1(); //var arg
		v.m1(2); // m1(int)
		v.m1(1,2,3); // var arg
		v.m1(1,2,3,4,5,6,7); //var arg
	}

}
