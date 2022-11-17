package test;

public class Controller {

	public static void main(String[] args) throws Exception{
		
		Config c = Config.getObject();
		Config c1 = Config.getObject();
		System.out.println(c ==c1);
		
		Config copy = (Config) c.clone();
		System.out.println(c == copy);
	}
}
