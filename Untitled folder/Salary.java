import java.util.Scanner;             //salary
public class Salary
{
	int empno;
	String ename;
	int salary;
	
	public void get()
	{
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter empno of employee: ");
		rollno=cin.nextInt();
		System.out.println("Enter name of employee: ");
		ename=cin.next();
		System.out.println("Enter salary of employee: ");
		salary=cin.nextInt();
	}
	public void display()
	{
		System.out.println("roll number is "+empno);
		System.out.println("student name is "+ename);
		System.out.println("balance fee is "+salary);
	}
	public static void main(String[] args)
	{
		int i;
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter the limit of array");
		int n=cin.nextInt();
		Salary e[]=new Salary[n];
		for(i=0;i<n;i++)
		{
			e[i]=new Salary();
			e[i].get();
		}
		
		
		for(i=0;i<n;i++)
		{
			
				System.out.println("Printing details of employees");
				if(e[i].salary>=10000 && e[i].salary<=15000)
				{
				e[i].display();
				}
				
		}
	
	
}
}
		