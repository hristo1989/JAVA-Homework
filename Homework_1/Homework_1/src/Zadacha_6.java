import java.util.Scanner;

public class Zadacha_6 {
    public static void main(String[] arguments) {
    	
    	Scanner input = new Scanner(System.in,"UTF-8");
    	System.out.println("Enter radius of a circle:");
    	
    	double r = input.nextDouble();
    	double n = 3.14159265359;
    	double S = n*r*r;
    	double p = 2*n*r;
    	
    	System.out.print("Area of the circle is: ");
    	System.out.println(S);
    	System.out.print("Perimeter of the circle is:");
    	System.out.println(p);
    	
    	input.close();
    	}
    }