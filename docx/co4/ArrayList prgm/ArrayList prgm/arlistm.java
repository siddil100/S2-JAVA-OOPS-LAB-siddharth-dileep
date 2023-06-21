import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
class listimp
{
Scanner cin=new Scanner(System.in);
ArrayList<String> cars=new ArrayList<>();
String item;
int pop;
void add()
{

System.out.println("Enter item to be inserted");
item=cin.next();
cars.add(item);	
}
void display()
{
System.out.println("printing "+cars);
}
void remove()
{
	System.out.println("Enter the element number to be removed");
	pop=cin.nextInt();
	cars.remove(pop);
}
void size()
{
	int size=cars.size(); 
		System.out.println("Size of array list is "+size);
}
void sorta()
{
	cars.sort(Comparator.naturalOrder()); 
	System.out.println("Printing array list after sorting in ascending order "+cars);
}
void sortd()
{
	cars.sort(Comparator.reverseOrder()); 
	System.out.println("Printing array list after sorting in descending order "+cars);
}
}
public class arlistm
{
public static void main(String args[])
{
Scanner cin=new Scanner(System.in);
int choice=0;
listimp obj=new listimp();
while(choice!=3)
{
System.out.println("1.add element\n2.display\n3.Exit\n4.remove\n5.find size\n6.sort asc\n7.sort desc");
System.out.println("Enter your choice");
		choice=cin.nextInt();
		switch(choice)
		{
		case 1:
		{
		obj.add();
		break;
		}
		case 2:
		{
		obj.display();
		break;
		}
		case 3:
		{
		System.exit(0);
		}
		case 4:
		{
			obj.remove();
			break;
		}
		case 5:
		{
			obj.size();
			break;
		}
		case 6:
		{
			obj.sorta();
			break;
		}
		case 7:
		{
			obj.sortd();
			break;
		}
		default:
		{
		System.out.println("invalid choice");
		}
		}
		}
		}
		}


