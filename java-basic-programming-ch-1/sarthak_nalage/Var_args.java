package sarthak_nalage;

public class Var_args {
	void  m2(int ...a) {
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
	}


public static void  main(String... args) {
	for(int i=0;i<args.length;i++) {
		System.out.println(args[i]);
	}
	int n1[]= {1,2,3,4,5,6};
	Var_args vr=new Var_args();
	vr.m2(n1);
	
	
}
}
