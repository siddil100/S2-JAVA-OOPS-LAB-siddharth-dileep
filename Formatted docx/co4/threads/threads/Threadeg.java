import java.util.Scanner;
class Fibanacci implements Runnable
{
	public void run()
	{
		int first=0,second=1,next;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms of fibonacci series");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(first + " ");
			next=first+second;
			first=second;
			second=next;
		}
	}
}
class Even implements Runnable
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		int lower,upper;
		System.out.println("Enter lower limit to print even");
		lower=sc.nextInt();
		System.out.println("Enter upper limit to print even");
		upper=sc.nextInt();
		int i;
		for(i=lower;i<upper;i++)
		{
			if(i%2!=0)
			{
				continue;
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}
		public class Threadeg
		{
			public static void main(String args[])throws InterruptedException
			{
				Fibanacci obj1=new Fibanacci();
				Thread a=new Thread(obj1);
				a.start();
				a.sleep(4000);
				Even obj2=new Even();
				Thread b=new Thread(obj2);
				b.start();
				b.sleep(2000);
			}
		}
