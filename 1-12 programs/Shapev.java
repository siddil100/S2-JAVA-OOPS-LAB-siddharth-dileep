public class Shapev {
    
   
    public double volume(double length, double width, double height) //cuboid
	{
        return length * width * height;
    }
    
   
    public double volume(double side)  //cube
	{
        return side * side * side;
    }
    
    
    public double volume(double radius, double height) //cylinder
	{
        return 3.14 * radius * radius * height;
    }
    
 
    public float volume(float radius) //sphere
	{
        return (4.0f/3.0f) *3.14f * radius * radius * radius;
    }
    
    public static void main(String[] args) {
        Shapev s = new Shapev();
        System.out.println("Volume of a cuboid with length 2, width 3, and height 4 is: " + s.volume(2, 3, 4));
        System.out.println("Volume of a cube with side 5 is: " + s.volume(5));
        System.out.println("Volume of a cylinder with radius 2 and height 6 is: " + s.volume(2, 6));
        System.out.println("Volume of a sphere with radius 3 is: " + s.volume(3.5f));
    }
}
