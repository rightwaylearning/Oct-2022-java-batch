package Archana_Threading;

public class Controller {
	public static void main(String[] args) {
		
		//System.out.println("I am main thread");
	
		
		
		// public void run() {
		
		Childthread c = new Childthread();
		c.start();
	    
		int i = 100;
		while(i > 0) {
			System.out.println("Parent >> " +i);
			i--;
		}
	} 

}
	

	
	


