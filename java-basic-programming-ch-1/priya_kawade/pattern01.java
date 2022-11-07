package priya_kawade;

public class pattern01 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1 ; i<=n ; i++) {
			        //6<=5
			for(int j=1 ;j<=i ;j++) {
				        //1<=5                     //*--------*
				System.out.print("* ");             //**------**
				                                   //***----***
			}                                      //****--****
			for(int s=1 ;s<=(n*2-i*2);s++) {       //**********
				         //1<=0
				System.out.print(" ");
			}
			
				for(int j=1;j<=i; j++) {
					      //1<=5
					System.out.print("* ");
				
				
			}
			System.out.println();
			if(i==n-1) {     // 4==5-1=4
				break;//5-1=4
			}
		}
	//	===========2nd program=========
			for(int i=n ; i>=1 ; i--) {
		        //6<=5
		for(int j=1 ;j<=i ;j++) {
			        //1<=5                     
			System.out.print("* ");             
			                                   
		}                                      
		for(int s=1 ;s<=(n*2-i*2);s++) {       //**********
			         //1<=0                    //****--****
			System.out.print(" ");             //***----***
		}                                      //**------**
		                                       //*--------*
			for(int j=1;j<=i; j++) {
				      //1<=5
				System.out.print("* ");
			
			
		}
		System.out.println();
	}
	
}


	
}


	


	


