package vaishnavi.shitole;

public class DataHiding_class {
	
	private String name;
	private Integer rollNo;
	

    public DataHiding_class(String name, Integer rollNo) {
		
		this.name = name;
		this.rollNo = rollNo;
	}
	public void setName(String name) {
    	
    	this.name=name;
    }
    public String getName() {

    	return name;
    }
    
	public Integer getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(Integer rollNo) {
		
		this.rollNo = rollNo;
	}
     
}
