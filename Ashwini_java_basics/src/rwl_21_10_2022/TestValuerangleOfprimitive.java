package rwl_21_10_2022;

import rwl_18_10_2022.main;

public class TestValuerangleOfprimitive {

	public static void main(String[] args) {
		
		byte b = 127;
		//byte b1 = 128;
		
		byte b2 = -128;
		//byte b3 = -129;
		//--------------------
		
		short s = 32767;
		short s1 = -32768;
		
	//	short s2 = 32768;
		
		//--------------------------
		int i = -2147483648;
		int i1 = 2147483647;
		
		//int i2 = 2147483648;
		
		//---------------------------
		long l = -9223372036854775808L;
		long l11 = 92233720368547L;
		long l1 = 2147483648L;
		long l2 = 1L;
		
		//----------------------------------
		// not applicable  
		boolean t = true;
		boolean t1 = false;
		
		//----------------------------------------
		// a-z, = 26, A-Z = 26 , 0-9 = 10, 30
		
		char ch = 'A';
		char ch1 = '1';
		char ch2 = '*';
		
		char ch5 = 65535;
		//--------------------------------------------------
		
		// float 4 byte
		// double 8 byte  // 64 bit -1 = 63  >> 52 bit, 11 bit
		
		double d = 10.89;
		
		float f = 89.00F; // 4 byte 32 bit -1  = 31 >> 23 bit, 8 bit
		
		//-------------------------------------------------------
		
	    float f11 = 7890.34967938736875326873437F;
	    double dd11 = 7890.34967938736875326873437;
		System.out.println(f11);
		System.out.println(dd11);
		
		float t12 = 263543257635734753475.34F;
		System.out.println(t12);
		
		
	}
	
	
}
