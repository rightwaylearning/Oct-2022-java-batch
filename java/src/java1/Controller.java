package java1;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition a1=new Addition ();
		a1.a=300;
		a1.b=200;
		
		a1.add();
		int add=a1.add();
		System.out.println(a1.add);

		subtraction s1=new subtraction();
		Addition a2=s1.getObject();
		int r=a2.add();
		System.out.println(r);
		
		System.out.println(a1.a+a1.b);
	}

}
