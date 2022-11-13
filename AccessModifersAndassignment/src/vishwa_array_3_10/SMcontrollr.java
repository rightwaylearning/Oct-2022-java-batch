package vishwa_array_3_10;

public class SMcontrollr {

	
	public static void main(String[] args) {
		Student[] Sarray = new Student[3];
		
		Student x = new Student();
		x.name="vishwa";
		x.rollNumber=1;
		
		
	Sarray[0]=x;
		
		Student y = new Student();
		y.name="nirmal";
		y.rollNumber=2;
	Sarray[1]=y;
		
		Student z = new Student();
		z.name="kuldip";
		z.rollNumber=3;
	Sarray[2]=z;	
		
		
		Marks[] Marray = new Marks[2];
		
		Marks m1 = new Marks();
		m1.subName="english";
		m1.score=95;
	Marray[0]=m1;
		
		Marks m2 = new Marks();
		m2.subName="history";
		m2.score=95;
	Marray[1]=m2;
	
	x.mks=Marray;
	
		System.out.println(x.name);
		System.out.println(x.rollNumber);
		System.out.println(y.name);
		System.out.println(y.rollNumber);
		System.out.println(z.name);
		System.out.println(z.rollNumber);
		//System.out.println()
		System.out.println("_____________");
		for(int i=0;i<x.mks.length;i++) {
			System.out.println(x.mks[i].subName);
			System.out.println(x.mks[i].score);
			System.out.println("_________");
			
			
			
			}
		}
		
		
	}
	
	
	
	
	

