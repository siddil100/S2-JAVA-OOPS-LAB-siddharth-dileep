import java.util.Scanner;
public class Adduser
{
public static void main(String[] args)
{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter employee name");
	String name=obj.nextLine();
	System.out.println("Enter phone number");
	Integer mob=obj.nextInt();
	System.out.println("Name is: "+name);
	System.out.println("Mob is: "+mob);
}
}