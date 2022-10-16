package archana_14_october;

public class A {
	int a;
	int b;
	
	A(){} //default Constructor
	
	A(int x,int y){ //parameter Constructor
		a = x;
		b = y;
	}
	
	void m1(int x, int y) {
		a = x;
		b =y;
	}
	
	void upDateA(int x) {
		a = x;
	}
	
	void upDateB(int y) {
		b = y;
	}

}
