public class Sumeg
{
public static int sum(int a, int b)
{
return a + b;
}
    
public static int sum(int n)
{
int sum = 0;
while (n > 0)
{
sum =sum+n%10;
n=n/10;
}
return sum;
    }
    
    public static String sum(String s1, String s2)
	{
        return s1 + s2;
    }
public static void main(String[] args) {
        
        System.out.println(sum(5, 10));          
        System.out.println(sum(123));             
        System.out.println(sum("Hello","World")); 
    }
}
