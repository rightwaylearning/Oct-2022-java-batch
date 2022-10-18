package vaibhav_patil;

public class pattern1 {
public static void main(String[] args) {
	pattern2(10);
	pattern3(5);
	pattern4(5);
	pattern5(5);
}

static void pattern2(int n)
{
for(int row=1;row<=n;row++) {
		
		for(int col=1;col<=row;col++) {
			
			System.out.print(" * ");
		}
		System.out.println();
	}
}

///////////////////

static void pattern3(int n)
{
for(int row=1;row<=n;row++) {
		
		for(int col=1;col<=n;col++) {
			
			System.out.print(" * ");
		}
		System.out.println();
	}
}

///////////////////////

static void pattern4(int n) {
	for(int row=1;row<=n;row++) {
		for(int col=1;col<=n-row+1;col++) {
			System.out.print(" *");
		}
		
		System.out.println();
	}
}

/////////////////////////

static void pattern5(int n) {
for(int row=1;row<=n;row++) {
		
		for(int col=1;col<=row;col++) {
			
			System.out.print(col+" ");
		}
		System.out.println();
	}
}
	
}









///////////////////////////////////////////////////////

//char ch='A';{
//for(int r=1;r<=20;r++) {
//for (int c=1;c<=r;c++) {
//System.out.print(" "+ ch + "  ");	
//}	
//System.out.println();
//ch++;

	

