import java.util.Scanner;             //item 5000
public class Item2
{
	int itemno;
	String iname;
	int cost;
	
	public void get()
	{
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter itemno: ");
		itemno=cin.nextInt();
		System.out.println("Enter item name: ");
		iname=cin.next();
		System.out.println("Enter cost: ");
		cost=cin.nextInt();
	}
	public void display()
	{
		System.out.println("item number is "+itemno);
		System.out.println("item name is "+iname);
		System.out.println("Cost is "+cost);
	}
	public static void main(String[] args)
	{
		int i;
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter the limit of array");
		int n=cin.nextInt();
		Item2 e[]=new Item2[n];
		for(i=0;i<n;i++)
		{
			e[i]=new Item2();
			e[i].get();
		}
		
		
		int flag=0;
		for(i=0;i<n;i++)
		{
			if(e[i].cost>5000)
			{
				System.out.println("Printing items greater than 5000");
				e[i].display();
				flag=1;
			}
				
	}
	if(flag==0)
	{
		System.out.println("No item have price greater than 5000");
	}
	
}
}
		