import java.util.*;

class Box
{
	int length,width,height;
	Box()
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter   length:");
		 length = sc.nextInt(); 
		 
		  System.out.print("Enter width:");
		 width = sc.nextInt(); 
		 
		  System.out.print("Enter height:");
		 height = sc.nextInt(); 
		 
		 
	}
}


class Cupboard extends Box
{
	int shelves;
	Cupboard()
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter no of shelves:");
		 shelves = sc.nextInt();   	 
	}
	void display()
	{
		System.out.println("length :"+length);
		System.out.println("width :"+width);
		System.out.println("height :"+height);
		System.out.println("no of shelves:"+shelves);
	}
}

class prgm10
{
  public static void main(String args[])
	{
		Cupboard obj = new Cupboard();
        obj.display();		
	}
}