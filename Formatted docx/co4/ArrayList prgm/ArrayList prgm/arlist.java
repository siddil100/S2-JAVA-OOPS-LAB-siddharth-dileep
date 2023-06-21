import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
class arlist
{
	public static void main(String args [])
	{
		ArrayList<String> cars=new ArrayList<>();
		Scanner cin=new Scanner(System.in);
		String item;
		int n,i;
		System.out.println("how many items to insert into arralist");
		n=cin.nextInt();
		for(i=0;i<n;i++)       //adding items to arraylist
		{
			System.out.println("Enter car name to add to arraylist");
		item=cin.next();
		cars.add(item);
		}
		
		System.out.println("Printing array list is "+cars);
		
		String gotitem=cars.get(1);      //accessing arraylist
		System.out.println("the element got from using get(1) is "+gotitem);
		
		cars.set(0,"Enzo");   //changing items
		System.out.println("Printing array list after setting values using set(0) "+cars);
		
		cars.remove(1);  //removing items
		System.out.println("Printing array list after removing first item using remove(1) "+cars);
		
		cars.sort(Comparator.naturalOrder()); //sorting in asc order
		System.out.println("Printing array list after sorting in ascending order "+cars);
		
		cars.sort(Comparator.reverseOrder()); //sorting in desc order
		System.out.println("Printing array list after sorting in descending order "+cars);
		
		int size=cars.size(); //size of arraylist
		System.out.println("Size of array list is "+size);
		
	}
}