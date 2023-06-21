class Parentclass
{
int a;   //single inheritance using parameterized constructor using super.  next question super(x,y)
Parentclass(int x)
{
a=x;
}
}
class Childclass extends Parentclass
{
int b;
Childclass(int x,int y)
{
super(x);
b=y;
}
void show()
{
System.out.println("value of a "+a+ "  "+"value of b"+b);
}
}
class Superdemo
{
public static void main(String[] args)
{
Childclass obj=new Childclass(10,20);
obj.show();
}
}