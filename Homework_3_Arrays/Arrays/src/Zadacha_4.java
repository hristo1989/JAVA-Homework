public class Zadacha_4 {

	public static void main(String[] args) {
		int[][] matrix = { { 30, 29, 28, 27, 26 }, { 25, 24, 23, 22, 21 }, { 20, 19, 18, 17, 16 },
				{ 15, 14, 13, 12, 11 }, { 10, 9, 8, 7, 6 }, { 5, 4, 3, 2, 1 }, };

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.printf("%d ", matrix[row][col]);
			}
			System.out.println();
		}
	}
}