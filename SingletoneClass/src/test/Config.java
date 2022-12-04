package test;

public class Config implements Cloneable{
	
	private static Config con;

	private Config() {}
	
	public synchronized static  Config getObject() {
		if(con == null) {
			con = new Config();
		}
		
		return con;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException  {
		if(con == null) {
			con = new Config();
		}
		
		return con;
	}
}
