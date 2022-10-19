package omkar_pawar_17_10_2022;

public class A {
  private int x;
  private int y;
  
  A(){}
  
  A(int x,int y) {
	this.x = x ; 
	this.y = y ;
	
  }
  
  int getX() {
	  return x;
  }
  
  void setX(int x) {
	  this.x = x;
  }
  
  int getY() {
	  return y;
  }	
  
  void setY(int y) {
	  this.y = y;
  }
	
}
// 1] first that variable search inside blpck if not
// 2] who is calling me,check that object memory if not
// 3] then compiler will show error