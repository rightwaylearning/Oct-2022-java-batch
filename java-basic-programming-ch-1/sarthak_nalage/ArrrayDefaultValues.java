package sarthak_nalage;

class DefaultValue {
	int[] ar;
	String[] ar1;
	static boolean ar2[];

	DefaultValue() {
		System.out.println(ar); // null
		System.out.println(ar1);// null
		System.out.println(ar2);// null
	}

	DefaultValue(int prank) {
		ar = new int[3];
		ar1 = new String[3];
		ar2 = new boolean[3];

	}

	void operation() {
//		System.out.println(ar);  
//		System.out.println(ar1); 
//		System.out.println(ar2); 
		System.out.println(ar[1]);//0 
		System.out.println(ar1[1]);// null
		System.out.println(ar2[2]);// false

	}
}

public class ArrrayDefaultValues {
	public static void main(String[] args) {
		DefaultValue df = new DefaultValue();
		System.out.println(df);
		DefaultValue df1 = new DefaultValue(0);
		df1.operation();
	}

}
