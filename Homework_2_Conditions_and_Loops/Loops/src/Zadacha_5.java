import java.util.Scanner;

public class Zadacha_5 {

	public static void main(String[] arg) {

		Scanner test = new Scanner(System.in, "UTF-8");

		System.out.println("Enter two numbers to calculate (N!*K!)/(N-K) equation (N have tp be larger then K): ");
		int N = test.nextInt();
		int n = N;
		int K = test.nextInt();
		int k = K;
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
		result = (N_fact * K_fact) / (n - k);
		System.out.println("Result is: " + result);
		test.close();
	}
}
