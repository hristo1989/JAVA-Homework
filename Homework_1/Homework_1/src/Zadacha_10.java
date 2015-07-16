import java.util.Scanner;

public class Zadacha_10 {
    public static void main(String[] arguments) {
    	
    	Scanner input = new Scanner(System.in,"UTF-8");
    	System.out.println("Еnter side and her height:");
    	
    	double A = input.nextDouble();
    	double ha = input.nextDouble();
    	double S = (A*ha)/2;
    	
    	System.out.print("Area of the triangle is: ");
    	System.out.println(S);
    	
    	input.close();
    	}
    }