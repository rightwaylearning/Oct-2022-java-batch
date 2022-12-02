package sarthak_nalage;

public class SettersAndGetters {
public static void main(String[] args) {
	SetGet sg=new SetGet(1,2);
	System.out.println(sg.Get_a()+" "+sg.Get_b());
	SetGet sg1=new SetGet(1,2);
	sg1.Set_a_b(45,46);
	System.out.println(sg1.Get_a()+" "+sg1.Get_b());
	
	
}
}
