public class Palin
{
	public static void main(String[] args)
	{
		
		int n=120;
		System.out.println("Checking number is: "+n);
		int r=0;
		int sum=0;
		int temp=n;
		while(temp!=0)
		{
			  r=temp%10;
			  sum=sum*10+r;
			  temp=temp/10;
		}
		if(sum==n)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not palindrome");
		}
	}
}
		
		