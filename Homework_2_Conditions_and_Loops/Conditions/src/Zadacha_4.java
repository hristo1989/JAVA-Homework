import java.util.Scanner;

public class Zadacha_4 {

	public static void main(String[] arg) {

		Scanner test = new Scanner(System.in, "UTF-8");

		System.out.println("Enter number from 0-9: ");
		int number = test.nextInt();

		switch (number) {
		case 0:
			System.out.println("Null");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		default:
			System.out.println("Invalid number!");
			break;
		}
		test.close();
	}
}
