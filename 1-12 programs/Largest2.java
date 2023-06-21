import java.util.Scanner;
public class Largest2
{
	
	public void largest(int a,int b)
	{
		int x=a;
		int y=b;
		if(x>y)
		{
			
		System.out.println(x+" is greater of two numbers");
		}
		else
		{
			System.out.println(y+" is greater of two numbers");
		}
	}
	
	public void largest(int a,int b,int c)
	{
		int x=a;
		int y=b;
		int z=c;
		if(x>y && x>z)
		{
			
		System.out.println(x+" is greater of three numbers");
		}
		else if(y>x && y>z)
		{
			System.out.println(y+" is greater of three numbers");
		}
		else
		{
			System.out.println(z+" is greater of three numbers");
		}
	}
	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
			System.out.println("Enter first number");
			int a=cin.nextInt();
			System.out.println("Enter second number");
			int b=cin.nextInt();
			System.out.println("Enter third number");
			int c=cin.nextInt();
		Largest2 l=new Largest2();
		l.largest(a,b);
		l.largest(a,b,c);
	}
	}
		