import java.util.Scanner;
public class Emp
{
	int eno;
	String ename;
	int esalary;
	
	public void get()
	{
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter employee number: ");
		eno=cin.nextInt();
		System.out.println("Enter employee name: ");
		ename=cin.next();
		System.out.println("Enter salary of employee: ");
		esalary=cin.nextInt();
	}
	public void display()
	{
		System.out.println("employee number is "+eno);
		System.out.println("employee name is "+ename);
		System.out.println("Salary is "+esalary);
	}
	public static void main(String[] args)
	{
		int i;
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter the limit of array");
		int n=cin.nextInt();
		Emp e[]=new Emp[n];
		for(i=0;i<n;i++)
		{
			e[i]=new Emp();
			e[i].get();
		}
		for(i=0;i<n;i++)
		{
			
			e[i].display();
		}
		System.out.println("Enter the eno:");
		int val=cin.nextInt();
		int flag=0;
		for(i=0;i<n;i++)
		{
			if(e[i].eno==val)
			{
				e[i].display();
				flag=1;
			}
				
	}
	if(flag==0)
	{
		System.out.println("Not found");
	}
	
}
}
		