import java.util.*;

class Student
{
	int rollno;
	String name;
	
	Student()
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter rollno:");
		 rollno = sc.nextInt();
		 
		 System.out.print("Enter Name :");
		 name = sc.next();
		 
	}
	
}
class Marks extends Student
{
	int m1,m2,m3,t;
	int p;
	Marks()
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Mark1 :");
		 m1 = sc.nextInt();
		  System.out.print("Enter Mark2 :");
		 m2 = sc.nextInt();
		  System.out.print("Enter Mark3 :");
		 m3 = sc.nextInt();
		 
		 
		 
	}
	void total()
	{
		t = m1+m2+m3;
		p = (t/100)*100;
		System.out.println("Rollno :"+rollno);
		System.out.println("Name :"+name);
		System.out.println("Total mark obtained :"+t);
		System.out.println("Total persentage obtained :"+p);
	}
	
	
}
class prgm8
{
  public static void main(String args[])
	{
		Marks obj = new Marks();
        obj.total();		
	}
}