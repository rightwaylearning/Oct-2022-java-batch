package sarthak_nalage;

class Test1{
	void m1()
	{
		System.out.println("hello world");
	}	
}

class Test2 extends Test1

{		public Test2(){
	System.out.println("Hello Mysterio");
}
	 void m2() {
		System.out.println("Hello Sarthak");
	}
}

public class obj_parent_child {
	public static void main(String[] args) {
		Test2 t=new Test2();
		t.m2();
	}

}
