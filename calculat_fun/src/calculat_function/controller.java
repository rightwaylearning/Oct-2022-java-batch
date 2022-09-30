package calculat_function;

public class controller {
	public static void main(String[] args) {
		sum obj =new sum();
		obj a=100;
		obj b=200;
		 int add = obj.add();
		System.out.println(add);
		
		result r=new result();
		sum obj1=r.getsumobject();
		int f= obj1.add();
		System.out.println(f);
	}

}
