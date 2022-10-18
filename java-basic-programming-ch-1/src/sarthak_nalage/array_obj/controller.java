package sarthak_nalage.array_obj;
import java.util.*;

public class controller {
	public static void main(String[] args) {
		System.out.println("Enter the Number of Student you want to store");
		Scanner sc=new Scanner(System.in);
		short size=sc.nextShort();
		StudentInfo[]s=new StudentInfo[size];
	//	StudentInfo s1=new StudentInfo();
		Address []ad=new Address[size];
		for(byte i=0;i<size;i++) {
			ad[i]=new Address();
			System.out.println(" Enter the details of landmark and pin of Student "+(i+1));
			ad[i].landmark=sc.next();
			ad[i].pin=sc.nextInt();
			s[i]=new StudentInfo();
			System.out.println("Enter the details of student Name and its roll_number "+(i+1));
			s[i].name=sc.next();s[i].r_n=sc.nextShort();
		}
//		for(byte i=0;i<size;i++) {
//			s[i]=new StudentInfo();
//			System.out.println("Enter the details of student Name and its roll_number");
//			s[i].name=sc.next();s[i].r_n=sc.nextShort();
//		}
	//	s1.adr=ad;
		for(byte i=0;i<size;i++) {
			s[i].adr=ad[i];
		}
		for(byte i=0;i<size;i++) {
			System.out.println("Printing Stduent "+(i+1)+" details");
			System.out.println(s[i].name+" "+s[i].r_n+" "+s[i].adr.landmark+" "+s[i].adr.pin);
		}
		
		
	}
}
