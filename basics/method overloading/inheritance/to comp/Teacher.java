import java.util.Scanner;
class Employee
{            //single inheritance
	int empid;
	String name;
	int salary;
	String address;
	Employee (int a,String b,int c,String d)
	{
	empid=a;
	name=b;
	salary=c;
	address=d;
	}
class Teacher extends Employee
{
	int i;
	String department;
	String subject;
	Teacher(int l,String m,int n,String o,String p,String q)	
	{
		super(l,m,n,o);
		department=p;
		subject=q;
	public static void main(String[] args)
	{
	Scanner cin=new Scanner(System.in);
System.out.println("Enter the limit of array");
int n=cin.nextLine();
Teacher e[]=new Teacher[n];
for(i=0;i<n;i++)
{
	System.our.println("Enter the eid of"+(i+1)+"Employee");
	int a=cin.nextInt();
	System.our.println("Enter the name of"+(i+1)+"Employee");
	String b=cin.next();
	System.our.println("Enter the salary of"+(i+1)+"Employee");
	int c=cin.nextInt();
	System.our.println("Enter the address of"+(i+1)+"Employee");
	String d=cin.next();
	System.our.println("Enter the departmentof teachers");
	String e=cin.next();
	System.our.println("Enter the subject of teachers");
	String f=cin.next();
	e[i]=new Teacher(a,b,c,d,e,f);
}
	

}
}
}


