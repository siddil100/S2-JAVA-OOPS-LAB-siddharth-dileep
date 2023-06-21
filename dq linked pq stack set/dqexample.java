//program to demonstrate the addition and deletion of elements in deque that is double ended queue del and add from both front and back
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Deque;
public class dqexample
{
public static void main(String args[])
{
	Scanner cin=new Scanner(System.in);
Deque<Integer> dq=new ArrayDeque<>();
System.out.println("Enter item to add through front ");
int i1=cin.nextInt();
dq.addFirst(i1);
System.out.println("Enter item to add through back ");
int i2=cin.nextInt();
dq.addLast(i2);
int first=dq.removeFirst();
int last=dq.removeLast();
System.out.println("first is "+first);
System.out.println("last is "+last);
System.out.println("full list is"+dq);
}
}