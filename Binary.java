import java.util.Scanner;
public class Binary
{
	
public static int Bs(int array[],int target)
{
int left=0;
int right=array.length-1;
while(left<=right)
{
int middle=(left+right)/2;
if(target<array[middle])
{
	right=middle-1;
}
else if(target>array[middle])
{
	left=middle+1;
}
else
{
	return middle;
}
}

return -1;
}


public static void main(String[] args) {

    
    Binary obj = new Binary();

    
    int[] array = { 3, 4, 5, 6, 7, 8, 9 };
    int n = array.length;

   
    Scanner input = new Scanner(System.in);

    System.out.println("Enter element to be searched:");

    int element = input.nextInt();
    input.close();

    int result = obj.Bs(array,element);
    if (result == -1)
      System.out.println("Not found");
    else
      System.out.println("Element found at index " + result);
  }
}