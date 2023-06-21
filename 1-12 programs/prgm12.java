import java.util.*;

class Student
{
	int rollno;
	String name;
	
	Student()
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Emp id :");
		 rollno = sc.nextInt();
		 
		 System.out.print("Enter Name :");
		 name = sc.next();
		 
	}
	
}
class Test extends Student
{
	int mark1;
    int mark2;
	
	Test()
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter mark1 :");
		 mark1 = sc.nextInt();
		 
		 System.out.print("Enter mark2 :");
		 mark2 = sc.nextInt();
		 
	}
	
}
class Result extends Test
{
	int total;
	void total()
	{
		total = mark1+mark2;
		System.out.println("Rollno :"+rollno);
		System.out.println("Name :"+name);
		System.out.println("Total mark obtained :"+total);
	}
	
	
}
class prgm12
{
  public static void main(String args[])
	{
		Result obj = new Result();
        obj.total();		
	}
}