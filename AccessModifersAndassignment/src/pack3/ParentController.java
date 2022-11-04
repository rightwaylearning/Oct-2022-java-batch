package pack3;


import pack1.Controller;

public class ParentController {

	public static void main(String[] args) {
		
		Controller c1 = new Controller();
		c1.main();
		
		pack2.Controller c2 =new pack2.Controller();
		c2.main1();
		
		
	}
}
