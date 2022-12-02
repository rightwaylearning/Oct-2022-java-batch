package rwl_array_programs;

public class IntarrayDemoExample {

	public static void main(String[] args) {
		
		 int[] a = new int[5]; // size = 5 (length) (0-4)
		 System.out.println(a.length); //5
		 a[0] = 10;
		 a[1] = 100;
		 a[2] = 200;
		 a[3] = 40;
		 a[4] = 50;
		 
		for(int i =0; i< a.length ;i++) {
			System.out.println(a[i]);
		} 
		 
		 
	}
}
