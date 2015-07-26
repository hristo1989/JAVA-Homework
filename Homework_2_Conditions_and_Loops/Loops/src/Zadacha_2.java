import java.util.Scanner;

public class Zadacha_2 {

	public static void main(String[] arg) {

		Scanner test = new Scanner(System.in, "UTF-8");

		System.out.println("Enter a number.");
		int num = test.nextInt();

		for (int x = 1; x < num + 1; x++) {
			if (x % (3 * 7) == 1){
			// if (x % 3 == 1 && x % 7 == 1) { I dvata nachina mi davat rezultat 1 i 22 i ne moga da si hwana gre[kata.
					System.out.println(x);
				}
		}
		test.close();
	}
}