public class Sumofdigit
{
	public static void main(String[] args)
	{
		int n=123;
		System.out.println("The number is "+n);
		int r=0;
		int sum=0;
		int temp=n;
		while(temp!=0)
		{
			r=temp%10;
			sum=sum+r;
			temp=temp/10;
		}
		System.out.println("sum of digits is "+sum);
	}
}
