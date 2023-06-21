
import java.util.*;

class Employee
{
	int empid;
	String name;
	String des;
	Employee()
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Emp id :");
		 empid = sc.nextInt(); 
		 
		 System.out.print("Enter Name :");
		 name = sc.next();
		 System.out.print("Enter designation :");
		 des = sc.next();
		 
	}
}
class Salary extends Employee
{
	double b,hra,da,gross;
	Salary()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Basic :");
		b = sc.nextDouble(); 
		da =b*35/100;
		hra = b*15/100;
		gross = b+da+hra;
	}
	void display()
	{
		System.out.println("Emp id :"+empid);
		System.out.println("Emp name :"+name);
		System.out.println("Emp designation :"+des);
		System.out.println("DA :"+da);
		System.out.println("hra :"+hra);
		System.out.println("Emp gross :"+gross);
		
		
	}
}
class prgm9
{
  public static void main(String args[])
	{
		Salary obj = new Salary();
        obj.display();		
	}
}