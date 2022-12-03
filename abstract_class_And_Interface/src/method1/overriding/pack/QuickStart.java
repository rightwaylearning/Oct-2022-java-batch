package method1.overriding.pack;

class AAA{
	
	void m1()  {
		
	}
}

class BBB extends AAA{
	
	@Override
	void m1() throws ArrayIndexOutOfBoundsException{
	  int[] arr = new int[5];
	  System.out.println(arr[10]);
	}
}



public class QuickStart {

	public static void main(String[] args) throws Exception {
	
	}
}
