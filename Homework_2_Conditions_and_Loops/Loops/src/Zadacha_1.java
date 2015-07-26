import java.util.Scanner;

public class Zadacha_1 {

	public static void main(String[] arg) {

		Scanner test = new Scanner(System.in, "UTF-8");

		System.out.println("Enter a number.");
		int num = test.nextInt();

		for (int x = 1; x < num+1; x++) {
			System.out.println("value of x : " + x);
			
		}
		test.close();
	}
}