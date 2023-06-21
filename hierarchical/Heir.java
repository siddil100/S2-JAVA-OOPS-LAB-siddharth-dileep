import java.util.Scanner;      //hierarchical inheritance,class book is heirarchically inherited to literature and fiction
class publisher
{
	String pname;
	publisher()
	{
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter the publisher name");
		pname=cin.next();
	}
}
class book extends publisher
{
	String btitle;
	String author;
	int price;
	book()
	{
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter the title of book");
		btitle=cin.next();
		System.out.println("Enter the author of book");
		author=cin.next();
		System.out.println("Enter the price of book");
		price=cin.nextInt();
	}
}
class literature extends book
{
	void display()
	{
		System.out.println("Literature book publisher is "+pname);
		System.out.println("Literature book title is "+btitle);
		System.out.println("Literature book price is "+price);
	}
}
class fiction extends book
{
	void display1()
	{
		System.out.println("fiction book publisher is "+pname);
		System.out.println("fiction book title is "+btitle);
		System.out.println("fiction book price is "+price);
	}
}
public class Heir
{
	public static void main(String args[])
	{
		int i;
		Scanner cin=new Scanner(System.in);
		System.out.println("how many literature books");
		int nl=cin.nextInt();
		literature arr[]=new literature[nl];
		for(i=0;i<nl;i++)
		{
			System.out.println("Enter details of Literature book "+(i+1));
			arr[i]=new literature();
		}
		
		System.out.println("how many Fiction books");
		int nf=cin.nextInt();
		fiction arr1[]=new fiction[nf];
		for(i=0;i<nf;i++)
		{
			System.out.println("Enter details of Fictional book "+(i+1));
			arr1[i]=new fiction();
		}
		System.out.println("PRINTING LITERATURE BOOK DETAILS\n");
		for(i=0;i<nl;i++)
		{
			System.out.println("details of literature book "+(i+1)+"\n");
			arr[i].display();
		}
		
		System.out.println("PRINTING FICTIONAL BOOK DETAILS\n");
		for(i=0;i<nf;i++)
		{
			System.out.println("details of fictional book "+(i+1)+"\n");
			arr1[i].display1();
		}
		
	}
}
		
		
		
