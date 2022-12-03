package method_overloading_nikita;

import method_overloading.AutomaticPramotion;

public class Controller {
	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		m.m1(10,58);
		
		AutomaticPramotion a = new AutomaticPramotion();
		short b = 10;
		a.m1(10,25.23f);
		
//		a.m1(b);
		
//		a.m1(10, 10);
		
		
		short s = 69;
		a.m1(b, s);
		
		
		Object o = new AutomaticPramotion();
		
	}

}
