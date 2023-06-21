public class Avgeg{
    
    
    public static double average(int num1, int num2) {
        return (num1 + num2) / 2;
    }
    

    public static double average(double num1, double num2) {
        return (num1 + num2) / 2.0;
    }
    
 
    public static float average(float num1, float num2, float num3) {
        return (num1 + num2 + num3) / 3.0f;
    }
    
    public static void main(String[] args) {
        int num1 = 10;
		int num2 = 20;
        double num3 = 3.14;
		double num4 = 6.28;
        float num5 = 1.2f;
		float num6 = 2.4f;
		float num7 = 3.6f;
        
        System.out.println("Average of " + num1 + " and " + num2 + " is " + average(num1, num2));
        System.out.println("Average of " + num3 + " and " + num4 + " is " + average(num3, num4));
        System.out.println("Average of " + num5 + ", " + num6 + " and " + num7 + " is " + average(num5, num6, num7));
    }
}
