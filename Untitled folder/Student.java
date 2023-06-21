import java.util.Scanner;             //feepaid
public class Student
{
	int rollno;
	String sname;
	int feepaid;
	
	public void get()
	{
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter rollno of student: ");
		rollno=cin.nextInt();
		System.out.println("Enter name of student: ");
		sname=cin.next();
		System.out.println("Enter fee paid?: ");
		feepaid=cin.nextInt();
	}
	public void display()
	{
		System.out.println("roll number is "+rollno);
		System.out.println("student name is "+sname);
		System.out.println("balance fee is "+(74000-feepaid));
	}
	public static void main(String[] args)
	{
		int i;
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter the limit of array");
		int n=cin.nextInt();
		Student e[]=new Student[n];
		for(i=0;i<n;i++)
		{
			e[i]=new Student();
			e[i].get();
		}
		
		
		for(i=0;i<n;i++)
		{
			
				System.out.println("Printing details with balance fee to be paid");
				e[i].display();
				
		}
	
	
}
}
		