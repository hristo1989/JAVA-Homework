import java.util.Scanner;

public class Zadacha_8 {

	public static void main(String[] arg) {

		Scanner test = new Scanner(System.in, "UTF-8");

		System.out.println("Enter three numbers to solve quadratic equation: ax2 + bx + c = 0");
		double a = test.nextInt();
		double b = test.nextInt();
		double c = test.nextInt();
		if ((b * b - 4 * a * c) > 0) {
			double x1 = (-b + (Math.sqrt(b * b - 4 * a * c))) / (2 * c);
			double x2 = (-b - (Math.sqrt(b * b - 4 * a * c))) / (2 * c);
			System.out.println("The roots of the equation are: x1= " + x1 + " and x2= " + x2 + "");
		} else
			System.out.println("The equation can not exist with such roots.");
		test.close();

	}

}
