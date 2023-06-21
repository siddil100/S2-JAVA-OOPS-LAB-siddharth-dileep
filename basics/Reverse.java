public class Reverse
{
	public static void main(String[] args)
	{
		int n=110;
		int r=0;
		int sum=0;
		int temp=n;
		while(temp!=0)
		{
			r=temp%10;
			sum=sum*10+r;
			temp=temp/10;
		}
		System.out.println("The reverse of number is: "+sum);
	}
}