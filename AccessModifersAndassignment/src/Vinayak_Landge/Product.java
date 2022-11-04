package Vinayak_Landge;

public class Product {

	Product(){
		
		System.out.println("hi i am constructor");
	}
	
	void Product() {
		
		System.out.println("hi i am method");

	}
	
	public static void main(String[] args) {
		
		Product p = new Product();
		
		p.Product();
	}
}
