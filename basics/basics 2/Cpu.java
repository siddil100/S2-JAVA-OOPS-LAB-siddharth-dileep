import java.util.Scanner;             //item 5000
public class Cpu
{
	
	int price;
	public Cpu(int x)
	{
		price=x;
		System.out.println("price of cpu is "+price);
	}
	 public class Processor
	{
		int crno;
		String pmanu;
	}
	public Processor(int x,String y)
	{
		crno=x;
		pmanu=y;
	}
	
	public static void main(String[] args)
	{
		
		Cpu obj1=new Cpu(10);
		Cpu.Processor obj2=obj1.new Processor(8,"intel");
	
}
}
		