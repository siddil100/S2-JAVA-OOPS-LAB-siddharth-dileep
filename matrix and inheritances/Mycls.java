public class Mycls
{
	int a=5;
	int b;
	public void mymethod()     
	{
		System.out.println("Method is running");
	}
	
	static void mymethod2()  //static method
	{
		System.out.println("This method is called without obj that is static method declaration");
	}
	
	public Mycls()       //constructor
	{
		b=99;
	}
public static void main(String[] args)
{
	Mycls obj=new Mycls();
	System.out.println(obj.a=100);
	obj.mymethod();
	mymethod2();  //static method
	System.out.println(obj.b); //the value of b was initialized by constructor
}
}