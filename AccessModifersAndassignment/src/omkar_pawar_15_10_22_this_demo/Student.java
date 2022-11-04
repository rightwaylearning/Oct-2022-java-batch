package omkar_pawar_15_10_22_this_demo;

public class Student {
  int id;
  String name;
  
  void m1(int id,String name) {
	  System.out.println(id);
	  System.out.println(name);
	  System.out.println(this.id);
	  System.out.println(this.name);
  }
}
