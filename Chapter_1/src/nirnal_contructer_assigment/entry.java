package nirnal_contructer_assigment;

public class entry {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.a);
		System.out.println(t.b);
		
		Test t1 = new Test(200,300);
		System.out.println(t1.a);
		System.out.println(t1.b);

	}

}
