import java.util.Scanner;
class stack
{
	int top,val;
	int n=3;
	int arr[]=new int[n];
	Scanner cin=new Scanner(System.in);
	stack()
	{
		top=-1;
	}
	void push()
	{
		if(top==n-1)
		{
			System.out.println("Stack is full that is overflow");
		}
		else
			
			
		System.out.println("enter the value to be pushed");
		val=cin.nextInt();
		top++;
		arr[top]=val;
		System.out.println("value pushed");
	}
	void pop()
	{
		if(top==-1)
			System.out.println("stack is empty");
		else
		{
		top--;
		System.out.println("item popped");
		}
	}
	void display()
	{
		int i;
		System.out.println("Printing values");
		for(i=top;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}
public class stackimp
{
	public static void main(String args[])
	{
		Scanner cin=new Scanner(System.in);
		int choice=0;
		stack s=new stack();
		
		while(choice!=4)
		{
			System.out.println("1.push\n2.pop\n3.display\n4.Exit");
			System.out.println("Enter your choice");
		choice=cin.nextInt();
	    switch(choice)
	     {
			 case 1:
			 {
				 s.push();
				 break;
			 }
			 case 2:
			 {
				 s.pop();
				 break;
			 }
			 case 3:
			 {
				 s.display();
				 break;
			 }
			 case 4:
			 {
				 System.exit(0);
			 }
			 default:
			 {
				 System.out.println("INVALID CHOICE");
			 }
		 }
		}
	}
}
		

