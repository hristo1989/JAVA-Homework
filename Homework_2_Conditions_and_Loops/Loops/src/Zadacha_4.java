import java.util.Scanner;

public class Zadacha_4 {

	public static void main(String[] arg) {

		Scanner test = new Scanner(System.in, "UTF-8");

		System.out.println("Enter two numbers to calculate N!/K! equation (N have tp be larger then K): ");
		int N = test.nextInt();
		int K = test.nextInt();
		long N_fact = 1;
		long K_fact = 1;
		long result;
		while (true) {
			if (N == 1) {
				break;
			}
			N_fact *= N;
			N--;

		}
		while (true) {
			if (K == 1) {
				break;
			}
			K_fact *= K;
			K--;

		}
		result = N_fact / K_fact;
		System.out.println("Result is: " + result);
		test.close();
	}
}
