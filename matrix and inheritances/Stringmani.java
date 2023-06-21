import java.util.Scanner;
public class Stringmani
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter two strings");
		String str1=obj.nextLine();
		String str2=obj.nextLine();
		System.out.println("string concat is "+str1.concat(str2));          //concat
		if(str1.equals(str2))                                              //string compare
		{
			System.out.println("Both string are same");
		}
		else
		{
			System.out.println("Both string are not same");
		}
		System.out.println("string to upper caseis "+str1.toUpperCase());        //uppercase
		System.out.println("string to lower caseis "+str2.toLowerCase());        //lowercase
		System.out.println("substring  is "+str1.substring(1,3));
        System.out.println("Trim function is "+str1.trim());                     //front space removal eg "    hai" 
        System.out.println("Length of first string is "+str1.length());   		//string length
	}
	
}

		
		