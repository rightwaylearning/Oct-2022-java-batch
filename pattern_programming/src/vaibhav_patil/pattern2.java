package vaibhav_patil;

public class pattern2 {
public static void main(String[] args) {
	for(int r=10;r>=1;r--)
	{
		for(int c=1;c<=r;c++) {
			System.out.print(" * ");
		}
		
		System.out.println();
	}
	
	////////////////////////////////////////////////////////
	
	char ch='c';
	for(int s=10;s>=1;s--) {
		
		for(int p=1;p<=s;p++) {
			System.out.print(ch+"  ");
		}
		
		System.out.println();
		ch++;
	}
}
}
