import java.util.Scanner;

public class Zadacha_5 {

	public static void main(String[] arg) {

		Scanner test = new Scanner(System.in, "UTF-8");

		System.out.println("Enter the length of the three sides (a, b, c) to verify whether they can build a triangle: ");
		int a = test.nextInt();
		int b = test.nextInt();
		int c = test.nextInt();

		if (a < b + c && b < a + c && c < a + b) {
			System.out.println("You can build a triangle with this three sides: a = " + a + ", b = " + b + " and c = " + c + "");
		} else if (a >= b + c) {
			System.out.println("Sorry, said a = "+a+" and it's too large.");
		} else if (b >= a + c) {
			System.out.println("Sorry, said b = "+b+" and it's too large.");
		} else
			System.out.println("Sorry, said c = "+c+" and it's too large.");
		test.close();
	}
}
