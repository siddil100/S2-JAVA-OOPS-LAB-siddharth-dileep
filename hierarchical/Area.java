import java.util.Scanner;
class shape
{
	
	
	shape()
	{
		System.out.println("PRINT AREA OF TRIANGLE AND RECTANGLE");
		
		
	}
}
class rectangle extends shape
{
	int length,breadth;
	void display()
	{
		System.out.println("Area of rectangle is "+(length*breadth));
	}
	rectangle()
	{
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter length and breadth of rectangle");
		length=cin.nextInt();
		breadth=cin.nextInt();
	}
}
class triangle extends shape
{
	int base;
	int height;
	
	void display1()
	{
		System.out.println("Area of triangle is "+(0.5*base*height));
	}
	triangle()
	{
		System.out.println("Enter base and height of triangle");
		Scanner cin=new Scanner(System.in);
		base=cin.nextInt();
		height=cin.nextInt();
	}
	
}
public class Area
{
	public static void main(String args[])
	{
		triangle t1=new triangle();
		t1.display1();
		rectangle r1=new rectangle();
		r1.display();
		
	}
}