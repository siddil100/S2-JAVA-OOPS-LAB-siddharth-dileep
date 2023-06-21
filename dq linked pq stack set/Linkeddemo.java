//program to remove all elements from a linkedlist
import java.util.LinkedList;
import java.util.Scanner;
public class Linkeddemo
{
public static void main(String args[])
{
	Scanner cin=new Scanner(System.in);
LinkedList<String> mylist=new LinkedList<String>();
System.out.println("Enter item 1 to be added to linked list ");
String i1=cin.next();
mylist.add(i1);
System.out.println("Enter item 2 to be added to linked list ");
String i2=cin.next();
mylist.add(i2);
System.out.println("Enter item 3 to be added to linked list ");
String i3=cin.next();
mylist.add(i3);
System.out.println("Enter item 4 to be added to linked list ");
String i4=cin.next();
mylist.add(i4);
System.out.println("Original LinkedList is " +mylist);
mylist.clear();
System.out.println("Linked List after removal is " +mylist);
}
}
