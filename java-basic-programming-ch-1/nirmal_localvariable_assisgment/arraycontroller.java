package nirmal_localvariable_assisgment;

public class arraycontroller {

	public static void main(String[] args) {

		array_default_value arr = new array_default_value();

		arr.arr = new int[5];
		System.out.println(arr.arr[0]);

		arr.arr1 = new String[10];
		System.out.println(arr.arr1[0]);

		arr.arr2 = new double[4];
		System.out.println(0);

		array_default_value.arr3 = new char[8];
	
		
		
		System.out.println(array_default_value.arr3[0]);
	

		arr.m1();

	}

}
