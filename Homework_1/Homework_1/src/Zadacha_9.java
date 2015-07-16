import java.util.Scanner;

public class Zadacha_9 {
    public static void main(String[] arguments) {
    	
    	Scanner input = new Scanner(System.in,"UTF-8");
    	System.out.println("Enter a two numbers (The first number has to be larger then the second):");
    	
    	int Num1 = input.nextInt();
    	int Num2 = input.nextInt();
    	int Res = Num1%Num2;
    	
        System.out.print("The result of dividing is:");
        System.out.println(Res);
    	
        input.close();
    	}
    }