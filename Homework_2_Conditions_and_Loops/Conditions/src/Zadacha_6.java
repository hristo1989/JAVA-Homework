import java.util.Scanner;

public class Zadacha_6 {

	public static void main(String[] arg) {

		Scanner test = new Scanner(System.in, "UTF-8");

		System.out.println("Enter your number of points (1-9): ");
		int a = test.nextInt();
		int b;
		if (0 < a && a < 4) {
			b = a * 5;
			System.out.println("Your score is " + b + " points.");
		} else if (3 < a && a < 7) {
			b = a * 10;
			System.out.println("Your score is " + b + " points.");
		} else if (6 < a && a < 10) {
			b = a * 50;
			System.out.println("Your score is " + b + " points.");
		} else
			System.out.println("Invalid number of points!");
		test.close();
	}
}