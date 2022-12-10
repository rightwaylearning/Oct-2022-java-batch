package Rushikesh_Practice;


public class A {
	
	int s;
	int p;
	
	void m1(int s,int p) {
	int calculate;
	if(p==0) {
        calculate=(s-2)*(s-2)*(s-2);
		System.out.println(calculate);
	}else if(p==1){
	    calculate=6*(s-2)*(s-2);
		System.out.println(calculate);	
	}else if(p==2){
		calculate=12*(s-2);
		System.out.println(calculate);
	}else if(p==3){
		System.out.println("8");
	}
	}
	
	
	public static void main(String[] args) {
		
		A a=new A();
		a.m1(10, 3);
			
	}
	
}

