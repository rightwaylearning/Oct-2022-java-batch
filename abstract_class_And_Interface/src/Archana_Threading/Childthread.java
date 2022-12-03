package Archana_Threading;

public class Childthread extends Thread {
	
	public void run() {
		Childthread c = new Childthread();
		  c.start();
		  
		  int i = 100;
		  while(i > 0) {
			  System.out.println("Child >> " +i);
			  i--;
		  }
	
	  
      }

}
