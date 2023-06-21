//program to remove an object from the stack when the position is passed as a parameter
import java.util.*;
import java.util.Scanner;
public class Stackdemo
{
	public static void main(String args[])
	{
		
	Scanner cin=new Scanner(System.in);
		Stack<String> mystack=new Stack<String>();
	System.out.println("Enter item to insert");
    String i1=cin.next();
		mystack.add(i1);
		System.out.println("Enter item to insert");
      String i2=cin.next();
		mystack.add(i2);
		System.out.println("Enter item to insert");
     String i3=cin.next();
		mystack.add(i3);
		System.out.println("Enter item to insert");
      String i4=cin.next();
		mystack.add(i4);
		System.out.println("Enter item to insert");
      String i5=cin.next();
		mystack.add(i5);
		System.out.println("Enter item to insert");
      String i6=cin.next();
		mystack.add(i6);
		System.out.println("stack is "+mystack);
		String deleted=mystack.remove(2);
		System.out.println("deleted element is "+deleted);
		System.out.println("Final stack is "+mystack);
	}
}
		