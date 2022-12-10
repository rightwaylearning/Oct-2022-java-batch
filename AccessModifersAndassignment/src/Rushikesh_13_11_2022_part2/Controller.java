package Rushikesh_13_11_2022_part2;

public class Controller {
	
	public static void main(String[] args) {
		
		menuCard m=new menuCardimpl();
		
		Customer c=new Customer();
		c.order(m);
		
		
	}

}

