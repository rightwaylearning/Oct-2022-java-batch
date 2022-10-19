package Rutuja_Kauthale;

class DefaultValueOfArray{
	
	int arr_int[];
	String arr_str[];
	double arr_double[];
	static char arr_char[];
	
	void M1()
	{
		long arr_long[]=new long[10];
		System.out.println("Default value of long array = "+arr_long);
	}
	
	
}

class Controller{
	
	public static void main(String[] args) {
		DefaultValueOfArray defaultValueOfArray =new DefaultValueOfArray();
		defaultValueOfArray.arr_int=new int[10];
		
		for(int i=0;i< defaultValueOfArray.arr_int.length;i++)
		{
			System.out.println("Default value of interger array of position = "+i+" is "+defaultValueOfArray.arr_int[i]);
		}
		
		
		defaultValueOfArray.arr_str=new String[5];
		for(int i=0;i< defaultValueOfArray.arr_str.length;i++)
		{
			System.out.println("Default value of String array of position = "+i+" is "+defaultValueOfArray.arr_str[i]);
		}
		
		defaultValueOfArray.arr_double= new double[10];
		for(int i=0;i< defaultValueOfArray.arr_double.length;i++)
		{
			System.out.println("Default value of double array of position = "+i+" is "+defaultValueOfArray.arr_double[i]);
		}
		
		DefaultValueOfArray.arr_char=new char[10];
		
		for(int i=0;i< DefaultValueOfArray.arr_char.length;i++)
		{
			System.out.println("Default value of char array of position = "+i+" is "+DefaultValueOfArray.arr_char[i]);
		}
		
		
		defaultValueOfArray.M1();
	}
	
}