import java.util.Scanner;
public class Array
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of array");
		Integer n=obj.nextInt();
		int arr[]=new int[n];
		int i;
		System.out.println("Enter the elements of array");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=obj.nextInt();
		}
		System.out.println("printing array");
		for(i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
	}
}
		