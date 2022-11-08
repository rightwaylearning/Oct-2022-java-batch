package rwl_type_casting;

public class Test {

	public static void main(String[] args) {
		// up casting
		byte b = 10;
		int i = b;
		System.out.println(i);
		
		char ch = 'A';
		int aa = ch;
		System.out.println(aa);
		
		byte bb = 1;
		float f = bb;
		System.out.println(f);
		
		float ff = 10F;  // 10.0
		double dd = 10;  // 10.0
		
		float f1 = 89.90F;
		double d1 = f1; // 89.90;
		
        long l2 = 47537349384573845L;
        float f2 = l2;
        System.out.println(f2);
        
        // down casting
        
        int i1 = 1;
        byte b1 =(byte)i1;
        System.out.println(b1);
        
        // unpredictable 
        int i2 = 4564754;
        byte b2 = (byte)i2;
        System.out.println(b2);
        
        // data loss
        double d2 = 123.678;
        int i3 = (int)d2;
        System.out.println(i3);
        
        float f4 = 45.89F;
        long l3 = (long)f4;
        System.out.println(l3);
        
        
	}
}


