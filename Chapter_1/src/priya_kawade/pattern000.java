package priya_kawade;

public class pattern000 {
public static void main(String[] args) {
	int n=5;
	
	for(int i=1;i<=n;i++) {
		      // 6<=5
		for(int j=1;j<=i;j++) {
			       //1<=5                           //*--------*
			System.out.print("*");                 //**------**
		}                                           //***----***
		for(int s=1;s<=(n*2-i*2);s++) {	            //****--****
			        //1<=0                         // **********
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
	
	
	System.out.println();
	}
	
}
	
	//n*2-i*2
//5*2-1*2=10-2=8
//5*2-2*2=10-4=6
//5*2-3*2=10-6=4
//5*2-4*2=10-8=2
//5*2-5*2=10-10=0

}
//*________*
//**______**
//***----***
//****--****
//**********