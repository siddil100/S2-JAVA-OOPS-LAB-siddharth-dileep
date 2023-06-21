//program to demonstrate the creation of queue object using Priority Queue Class
import java.util.*;
import java.util.Scanner;
class priorityqueuedemo
{
public static void main(String args[])
{
	Scanner cin=new Scanner(System.in);
PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
System.out.println("Enter item to insert");
int i1=cin.nextInt();
pq.add(i1);
System.out.println("Enter item to insert");
int i2=cin.nextInt();
pq.add(i2);
System.out.println("Enter item to insert");
int i3=cin.nextInt();
pq.add(i3);
System.out.println(pq.peek()); //print the hisghest prority elements
System.out.println(pq.poll());//print and delete high pririty item
System.out.println("all elements of queue are"+pq);
}
}