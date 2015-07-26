import java.util.Scanner;

public class Zadacha_2 {

	public static void main(String[] arg) {

		Scanner test = new Scanner(System.in, "UTF-8");

		System.out.println("Enter two numbers, the first will be devidet to the second: ");
		int one = test.nextInt();
		int two = test.nextInt();
		if (one > 0 && two > 0 || one < 0 && two < 0) {
			System.out.println("The quetient is positive: +");
		} else if (one < 0 && two > 0 || one > 0 && two < 0) {
			System.out.println("The quetient is negative: -");
		} else {
			System.out.println("The quetient is 0");
		}
		test.close();
	}
}
