
package ashwini_pattern_practise;

public class Star_pattern_1_And_2 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>..............>>>>>>>>>>>>>>>>>");
		System.out.println();
		
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
