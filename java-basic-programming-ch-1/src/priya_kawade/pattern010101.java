package priya_kawade;

public class pattern010101 {
	public static void main(String[] args) {
		int n=10;
		
		for(int i=1;i<=n;i++) {
			      // 6<=5
			for(int j=1;j<=i;j++) {
				       //1<=5                           //*--------*
				System.out.print("* ");                 //**------**
			}                                           //***----***
			for(int s=1;s<=(n*2-i*2);s++) {	            //****--****
				        //1<=0                         // **********
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
		
		
		System.out.println();
		
		
		
		if( i == n-1) {		        //n=5-1=4
		
		break;
		}
		}
		
	

		//======2nd program=======
for(int i=n;i>=1;i--) {
	for(int j=1;j<=i;j++) {
		System.out.print("* ");
	}
	for(int s=1;s<=(n*2-i*2);s++) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print("* ");
	}


System.out.println();
}

}

}

	


