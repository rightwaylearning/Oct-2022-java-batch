package method_overloading_vinayak;

public class method_signature {

	void m(int a) {
		
		System.out.println("int");
	}
	
	void m(int a,int b) {
		
		System.out.println("int int");
		
	}
	
	void m(int a,int b,int c) {
		
		System.out.println("int int int");

	}
	
	void m(float a,float b) {
		
		System.out.println("float float");

	}
	
	void m(float a,int b) {
		
		System.out.println("float int");

	}
	
	void m(int b,float a) {
		
		System.out.println("int float");

	}
	
	void m(float f, short s){
	System.out.println("float short");

	}
}
