package varsha_tavhare;

public class controller {
	public static void main(String[] args) {
		student s = new student ();
		
		s.name = "sky";
		s.rollno = 21;
		 
		marks[] sub = new marks[3];
		marks m1 = new marks();
		m1.subject = "Maths";
		m1.score = 92;
		sub[0] = m1;
		marks m2 = new marks();
		m2.subject = "Physics";
		m2.score = 75;
		sub[1] = m2;
		marks m3 = new marks();
		m3.subject = "Chemistry";
		m3.score = 62;
		sub[2] = m3;
		
	s.mks = sub;
	//print data;
	System.out.println(s.name);
	System.out.println(s.rollno);
	for(int i = 0; i < s.mks.length ; i++)
	{
		System.out.println(s.mks[i].subject);
		System.out.println(s.mks[i].score);
		System.out.println("------------------");
	}

	}
	}
	
