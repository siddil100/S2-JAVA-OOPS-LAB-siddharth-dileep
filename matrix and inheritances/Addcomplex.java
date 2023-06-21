import java.util.Scanner;
public class Addcomplex
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter real and imaginary part of first");
		Integer fr=obj.nextInt();
		Integer fi=obj.nextInt();
		System.out.println("Enter real and imaginary part of second");
		Integer sr=obj.nextInt();
		Integer si=obj.nextInt();
		Integer resultr=fr+sr;
		Integer resulti=fi+si;
		System.out.println("Sum of complex nos is is "+resultr+ " " +resulti+"i");
	}
}
		
		
		