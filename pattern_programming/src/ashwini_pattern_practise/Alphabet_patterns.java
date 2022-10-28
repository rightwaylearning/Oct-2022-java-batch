package ashwini_pattern_practise;

public class Alphabet_patterns {
	public static void main(String[] args) {
		
		int r=5;
		char ch='A';
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch + " ");
				
			}
			System.out.println();
		}
		
		
		System.out.println(">>>>>>>>>...............>>>>>>>>>>>>>>>>>");
		
		
		char ch1=65;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch1 +" ");
				
			}
			System.out.println();
			ch1++;
		}
		
		System.out.println("--------------------->>>>>>>>>>>>>>>>>>>>>.............");
		
		char ch2=65;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch2+" ");
				ch2++;
			}
			System.out.println();
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=1;i<=r;i++) {
			char ch3=65;
			for(int j=1;j<=i;j++) {
				System.out.print(ch3+ " ");
				ch3++;
			}
			System.out.println();
			
		}
		
		
	}

}
