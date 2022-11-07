package Rutuja.Nimbhore;

public class Product {
int productId;
String productName;


  Product(){
	System.out.println("hello my name is constructor");
  }
  
  void Product() {
	  System.out.println("hello my name is method");
  }
  public static void main(String[] args) {
	  Product p= new Product();
	p.Product();
}
}
