import java.util.Scanner;

public class Zadacha_7 {
    public static void main(String[] arguments) {
    	
    	Scanner input = new Scanner(System.in,"UTF-8");
    	System.out.println("Enter a number:");
    	
    	int Num = input.nextInt();
    	
    	 boolean A = Num%5 == 0 && Num%7 == 0;
        System.out.print("Checking if the nuber is devided to 5 or 7 without residue: ");
        System.out.println(A);
    	
        input.close();
    	}
    }