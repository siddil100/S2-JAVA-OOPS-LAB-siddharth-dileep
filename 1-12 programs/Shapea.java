public class Shapea {
    
   
    //circle
    public static double area(double radius) {
        return 3.14 * radius * radius;
    }
    
    //triangle
    public static double area(double base, double height) {
        return 0.5 * base * height;
    }
    
    //square
    public static double area(float side) {
        return side * side;
    }
    
    //rectangle
    public static double area(double length, float breadth) {
        return length * breadth;
    }
	 public static void main(String[] args) {
        System.out.println("Area of Circle: " + area(5.5));
        System.out.println("Area of Triangle: " + area(5, 10));
        System.out.println("Area of Square: " + area(5.5));
        System.out.println("Area of Rectangle: " + area(5, 10.5f));
    }
    
}
