import java.util.Scanner;
public class Methove
{
	int a,b,c;
	public void add(int a,int b)
	{
		int z=a+b;
		System.out.println("adding 2 is "+z);
	}
	
	public void add(int a,int b,int c)
	{
		int y=a+b+c;
		System.out.println("adding 3 is "+y);
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
		Methove m=new Methove();
		m.add(a,b);
		m.add(a,b,c);
	}
	}
		