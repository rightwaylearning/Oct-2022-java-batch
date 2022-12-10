package Rushikesh_13_11_2022;

public class Controller {
	
	public static void main(String[] args) {
		
		menuCard m=new menuCardImpl();
		
		Customer c=new Customer();
		c.order(m);
		
	}

}
