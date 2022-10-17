class Student
{

int rollnumber;
String name;
String collegeName;

Student()
{}
 Student(int r, String n, String c)
	{	rollnumber=r;
		name=n;
		collegeName=c;
	
	}
}

class DemoConstructor{
public static void main(String args[])
{
Student obj=new Student(1,"Rutuja","VDS");
Student obj1=new Student();
System.out.println(obj.rollnumber);
System.out.println(obj.name);
System.out.println(obj.collegeName);

}
}

