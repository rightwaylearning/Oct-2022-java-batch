package Dhanu_method_overriding;

import method1.overriding.pack.Parent;

public class parent {
	
	public Number m1(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum = sum + a;
		}
		System.out.println(sum);
		return 0;
	}
}

class Child extends Parent {

	@Override
	public Integer m1(int a) {
		System.out.println(">>" + a * a);
		return 0;
	}

}

