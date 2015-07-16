import java.util.Scanner;

public class Zadacha_5 {
    public static void main(String[] arguments) {
    	
    	Scanner input = new Scanner(System.in,"UTF-8");
    	System.out.println("Enter 4 numbers that will be sumend");
    	
    	int One = input.nextInt();
    	int Two = input.nextInt();
    	int Three = input.nextInt();
    	int Four = input.nextInt();
    	int SUM = One+Two+Three+Four;
    	
    	System.out.print("Result is: ");
    	System.out.print(SUM);
    	
    	input.close();
    }
}