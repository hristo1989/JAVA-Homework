import java.util.Scanner;

public class Zadacha_1 {

	public static void main(String[] arg) {

		Scanner test = new Scanner(System.in, "UTF-8");

		System.out.println("Enter a number: ");
		int Number = test.nextInt();

		if (Number > 0 && Number < 6) {
			if (Number % 2 == 0) {
				System.out.println("Your number is " + Number + " and it's even.");

			} else {
				System.out.println("Your number is " + Number + " and it's odd.");
			}

		} else if (Number > 5 && Number < 16) {
			if (Number % 3 == 0) {
				System.out.println("Your number is " + Number + " and it's devided to 3 without reside.");
			} else {
				System.out.println("Your number is " + Number + " and it's devided to 3 with reside. ");
			}
		} else {
			if (Number == 0) {
				System.out.println("Your number is zero!");
			} else if (Number < 0) {
				System.out.println("Your number is negative!");
			} else
				System.out.println("Your number is positive!");
		}
		test.close();
	}

}
