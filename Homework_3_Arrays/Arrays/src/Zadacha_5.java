import java.util.Scanner;

public class Zadacha_5 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter lenght of the array: ");
		int n = input.nextInt();
		int[] array = new int[n];
		int[] array2 = new int[n];
		System.out.println("Enter numbers from the array");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		for (int i = 0; i < array.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < array.length; j++)
				if (array[j] < array[index])
					index = j;

			int smallerNmb = array[index];
			array[index] = array[i];
			array[i] = smallerNmb;

		}

		for (int i = 0; i < array2.length; i++) {
			array2[i] = array[i];

		}
		System.out.println("Enter number to check its position: ");

		int position;
		int number = input.nextInt();
		position = (array2[0] + array2[n - 1]) / 2;

		while ((array2[position] != number) && (array2[0] <= array2[n - 1]))

		{
			if (array2[position] > number) {
				array2[n - 1] = position - 1;
			} else {
				array2[0] = position + 1;
			}
			position = (array2[0] + array2[n - 1]) / 2;
		}
		if (array2[0] <= array2[n - 1])

		{
			System.out.println("The number is on position: " + position);
		} else
			System.out.println("Sorry, the number is not in this array.");
		input.close();
	}
}
