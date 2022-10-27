package ashwini_pattern_practise;

public class Star_patterns_3 {
	
	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=6;i<=n;i++) {
			for(int s=1;s<i;s++) {
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
