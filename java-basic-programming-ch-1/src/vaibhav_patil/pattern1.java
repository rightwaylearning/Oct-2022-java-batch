package vaibhav_patil;

public class pattern1 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		
		for(int j=1;j<=i;j++) {
			
			System.out.print(" * ");
		}
		System.out.println();
	}



///////////////////////////////////////////////////////

char ch='A';
for(int r=1;r<=20;r++) {
for (int c=1;c<=r;c++) {
System.out.print(" "+ ch + "  ");	
}	
System.out.println();
ch++;
}
	
}
}