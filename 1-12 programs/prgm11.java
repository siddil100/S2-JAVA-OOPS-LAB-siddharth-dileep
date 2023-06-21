import java.util.*;

class Employee
{
	int empid;
	String name;
	Employee()
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Emp id :");
		 empid = sc.nextInt(); 
		 
		 System.out.print("Enter Name :");
		 name = sc.next();
		 
	}
}
class Worker extends Employee
{
	int wage;
	Worker()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Daily Wage :");
		wage = sc.nextInt(); 
	}
	void display()
	{
		System.out.println("Emp id :"+empid);
		System.out.println("Emp name :"+name);
		System.out.println("Emp wage :"+wage);
		
	}
}



class prgm11
{
  public static void main(String args[])
	{
		Worker obj = new Worker();
        obj.display();		
	}
}