package Archana_parent_child;

public class Flower {
	void m1() {
		System.out.println("I am m1 method of Flower class");
	}

	void m2() {
		System.out.println("I am m2 method of Flower class");
	}

	public boolean equals(Object obj) {
		System.out.println("I am equals method of Flower class");

		return super.equals(obj);
	}

}

class Rose extends Flower {
	void m3() {
		System.out.println("I am m3 method of Rose class");
	}

	void m1() {
		System.out.println("I am m1 method of Rose class");
	}
}

class Lily extends Rose {
	void m4() {
		System.out.println("I am m4 method of Lily class");

	}

	void m3() {
		System.out.println("I am m3 method of Lily class");
	}
}
