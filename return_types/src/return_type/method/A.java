package return_type.method;

public class A {

	int a;
	int b;
	
	int sum() {  // This method must return a result of type int
		int s = a + b;
		return s;
	}
}
