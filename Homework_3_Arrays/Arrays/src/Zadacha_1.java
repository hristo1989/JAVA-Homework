import java.util.Scanner;

public class Zadacha_1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter the lenght of the array: ");
		int n = input.nextInt();
		int[] numbers = new int[n];
		int sbor = 0;
		System.out.println("Enter numbers from that array: ");
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextInt();
			if (numbers[i] % 2 == 0) {
				sbor += numbers[i];
			}
		}
		System.out.println("The sum of even numbers is: " + sbor);
		input.close();
	}
}