package right.way.learning;

public class StudentArrayDemo {
	
	public static void main(String[] args) {
		
		Student[] s = new Student[3];
		// s is reference type variable
		// which reference type ? Student[]
		// inside  Student[] which type data we are going to store Student type
		
		             Student obj = new Student();
			             obj.rollNumber = 12;
			             obj.name = "Madhura";
		             
		s[0] = obj;
		            
		               Student obj1 = new Student();
		                   obj1.rollNumber = 34;
		                   obj1.name = "Monali";
		
		s[1] = obj1;
		
		System.out.println(s[0].rollNumber);
		System.out.println(s[0].name);
		
		
		
		
		
		
		int[] x = new int[5];
		// x is reference type variable
		// which reference type ?? int[]
		//  inside int[] which type data we are going to store  >> int
		
		x[0] = 10;
		
		// OR
		
		int a = 100;
		x[1] = a;
		
	//	System.out.println(x[1]);  // 100
		
	}

}
