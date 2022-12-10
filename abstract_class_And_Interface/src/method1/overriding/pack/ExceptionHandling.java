package method1.overriding.pack;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("strat");
		
        int a[] = {10,20,30,40};  // 0-3  // a[4]
        for(int i =0 ;i <= a.length ;i++) {
        	
        	try {
        	   System.out.println(a[i]);
        	}catch(Exception e){
        		System.out.println("sorry , I will take care...");
        	}
        }
		
		
		System.out.println("normal end");
	}
}
