public class Paraconst
{
	int x;
	String m;
public Paraconst(int y,String b)
{
	x=y;
	m=b;
	System.out.println("x is"+x+ " "+"m is "+m);         //para constructor
}
public static void main(String[] args)    
{
	Paraconst c1=new Paraconst(100,"sid");
	   
}
}