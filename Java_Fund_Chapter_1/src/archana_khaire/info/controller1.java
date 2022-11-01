package archana_khaire.info;

public class controller1 {
	public static void main(String[] args) {
		
		
		Employee1 e= new Employee1();
		e.rollNo =12;
		e.name = "Ranjeet";
		Employee1.address = "Baramati";
		
		Employee1 e1 =new Employee1();
		e1.rollNo =25;
		e1.name = "Swara";
		
		System.out.println(Employee1.address);
		Employee1.address = "Pune";
		System.out.println(Employee1.address);
	}

}
