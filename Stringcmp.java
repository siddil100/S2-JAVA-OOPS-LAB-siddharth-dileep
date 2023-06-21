import java.util.Scanner;
public class Stringcmp
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter string array size");
		Integer n=obj.nextInt();
		String arr[]=new String[n];
		System.out.println("Enter elements");
		int i=0,j;
		for(i=0;i<n;i++)
		{
		arr[i]=obj.next();           //because in string array 
		}
		System.out.println("Printing original");
		for(i=0;i<n;i++)
		{
		System.out.println(arr[i]);
		}
		
		String temp;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Printing sorted array");
		for(i=0;i<n;i++)
		{
		System.out.println(arr[i]);
		}
				
					
		
	}
}