package archana_14_october;

public class Controller {
	public static void main(String[] args) {
		
		A a = new A(); //class cha object
		a.m1(50, 10);
		System.out.println(a.a); //50
		System.out.println(a.b); // 10
		
	//--------------------------
		
		A a1 = new A(10,20);
		a1.m1(400,1500);
		a1.upDateA(1200);
		
		System.out.println(a1.a); // 400
		System.out.println(a1.b); // 1500
	}

}
