package Rutuja_Kauthale;

public class DefaultValueProgram {
	byte b;
	static byte b1;
	short s;
	static short s1;
	int i;
	static int i1;
	long l;
	static long l1;
	float f;
	static float f1;
	double d;
	static double d1;
	char c;
	static char c1;
	boolean bo;
	static boolean bo1;
	String st;
	static String st1;
	ControllerOfDefaultValueProgram a;
	 static ControllerOfDefaultValueProgram a1;
	int[] arr;
	static int[] arr1;
	String[] str;
	static String[] str1;
	
}
class ControllerOfDefaultValueProgram{
public static void main(String[] args) {
	DefaultValueProgram defaultValueProgram =new DefaultValueProgram();
	System.out.println("Defalut value of byte = "+defaultValueProgram.b);
	System.out.println("Defalut value of short = "+defaultValueProgram.s);
	System.out.println("Defalut value of int = "+defaultValueProgram.i);
	System.out.println("Defalut value of long = "+defaultValueProgram.l);
	System.out.println("***************************************************************");
	System.out.println("Defalut value of float = "+defaultValueProgram.f);
	System.out.println("Defalut value of double = "+defaultValueProgram.d);
	
	System.out.println("***************************************************************");
	System.out.println("Defalut value of char = "+defaultValueProgram.c);
	System.out.println("Defalut value of boolean = "+defaultValueProgram.bo);
	System.out.println("***************************************************************");
	System.out.println("Defalut value of string = "+defaultValueProgram.st);
	System.out.println("Defalut value of object = "+defaultValueProgram.a);
	System.out.println("Defalut value of array = "+defaultValueProgram.arr);
	System.out.println("Defalut value of string array = "+defaultValueProgram.str);
	
	System.out.println("***************************************************************");
	System.out.println("Defalut value of  Static byte = "+DefaultValueProgram.b1);
	System.out.println("Defalut value of  static short = "+DefaultValueProgram.s1);
	System.out.println("Defalut value of static int = "+DefaultValueProgram.i1);
	System.out.println("Defalut value of static long  = "+DefaultValueProgram.l1);
	
	System.out.println("***************************************************************");
	System.out.println("Defalut value of static float = "+DefaultValueProgram.f1);
	System.out.println("Defalut value of static double = "+DefaultValueProgram.d1);
	System.out.println("***************************************************************");
	System.out.println("Defalut value of static char = "+DefaultValueProgram.c1);
	System.out.println("Defalut value of static boolean = "+DefaultValueProgram.bo1);
	System.out.println("***************************************************************");
	System.out.println("Defalut value of static string = "+DefaultValueProgram.st1);
	System.out.println("Defalut value of object = "+DefaultValueProgram.a1);
	System.out.println("Defalut value of static array = "+DefaultValueProgram.arr1);
	System.out.println("Defalut value of static string = "+DefaultValueProgram.str1);
	
	}
}
