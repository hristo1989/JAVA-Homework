import java.util.Scanner;

public class Zadacha_2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter the lenght of the array: ");
		int n = input.nextInt();
		int[] array = new int[n];
		array[0] = 1;
		array[1] = 1;
		for (int i = 2; i < n; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}
		for (int i = 0; i < n; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
		input.close();
	}
}