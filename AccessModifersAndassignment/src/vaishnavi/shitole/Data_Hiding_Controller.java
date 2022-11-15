package vaishnavi.shitole;

public class Data_Hiding_Controller {

	public static void main(String[] args) {
		
	
	DataHiding_class dh = new DataHiding_class("vaishu",20);
	
	String result = dh.getName();
	Integer re = dh.getRollNo();
	
	System.out.println(result);
	System.out.println(re);
	
	
	}
}
