import java.util.Scanner;
class Multable extends Thread
{
public void run()
{
int num=5;
System.out.println("MUL table of 5\n");
for(int i=1;i<=10;i++)
{
	System.out.println(num+"*"+i+num*i);
}
}
}
class primeno extends Thread
{
	public void run()
	{
		int i,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of prime no to be generated");
		int N=sc.nextInt();
		System.out.println("prime nos between 1 and"+N+ "are");
		int j;
		for(i=1;i<=N;i++)
		{
			if(i==1 || i==0)
			{
				continue;
			}
				flag=1;
			}
		for(j=2;j<i/2;i++)
		{
			if(i%j==0)
			{
				flag=0;
				break;
		}
		}
		if(flag==1)
		{
			System.out.println(i+ " ");
		}
		}
	}

	public class Threadclass
	{
		public static void main(String args[])throws InterruptedException
		{
			Multable m=new Multable();
			m.start();
			m.sleep(400);
			primeno p=new primeno();
			p.start();
			p.sleep(400);
		}
	}

		
			
			
		