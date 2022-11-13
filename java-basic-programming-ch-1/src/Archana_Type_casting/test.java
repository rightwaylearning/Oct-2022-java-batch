package Archana_Type_casting;

public class test {
	public static void main(String[] args) {
		//up casting
		byte b = 10;
		int i = b;
		System.out.println(i); //10
		
		
		char a = 'A';
		int a1 = a;
		System.out.println(a1);//65
		
		byte b1 = 12;
		float f = b1;
		System.out.println(f);//12
		
		float f2 = 25.36F;
		double d = f2;
		System.out.println(d);//25.36000
		
		long l = 4785421361L;
		float f3 = l;
		System.out.println(f3);// 4.78542136
		
		//down casting
		
		int i1 = 1;
		byte b2 =(byte)i1;
		System.out.println(b2);//1
		
		//unpredictable
		
		int i2 = 456721;
		byte b3 =(byte)i2;
		System.out.println(b3);
		
		//data loss
		
		double d2 = 125.251;
		int i4 = (int)d2;
		System.out.println(i4);
		
		float f4 = 45.457F;
		long l2 = (long)f4;
		System.out.println(l2);//45
		
	}


}
