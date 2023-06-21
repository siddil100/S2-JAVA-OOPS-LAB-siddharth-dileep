import java.util.Scanner;
public class Arraysearch
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of array");
		Integer n=obj.nextInt();
		int arr[]=new int[n];
		int i,flag=0;
		System.out.println("Enter the elements of array");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=obj.nextInt();
		}
		System.out.println("Enter item to be searched");
		Integer item=obj.nextInt();
		System.out.println("searching");
		for(i=0;i<arr.length;i++)
	    {
		if(item==arr[i])
		 {
			System.out.println("Value found at loc "+i);
			flag=1;
			
		 }
		 
	     }
		 if(flag==0)
		 {
			 System.out.println("item not found");
         }
		 
	}
	
}

		