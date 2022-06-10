import java.util.Arrays;
import java.util.Random;

public class Ex2Array2D {

	public static int[][] randomArray() {
		Random random = new Random();
		int[][] array = new int[7][9];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(10);
			}
		}

		return array;
	}

	public static void deepToString(int[][] randomArray) {
		for (int i = 0; i < randomArray.length; i++) {
			for (int j = 0; j < randomArray[i].length; j++) {
				System.out.printf("%d  ", randomArray[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] randomArray = randomArray();
		deepToString(randomArray);

		int[] rowSum = new int[randomArray[0].length]; // a b c d e;
		int[] columnSum = new int[randomArray.length]; // 1 2 3 4 5;
		int sevenCount = 0;

		for (int i = 0; i < randomArray.length; i++) {
			for (int j = 0; j < randomArray[i].length; j++) {
				columnSum[i] += randomArray[i][j];
				rowSum[j] += randomArray[i][j];
				if (randomArray[i][j] == 7)
					sevenCount++;
			}
		}
		System.out.println("-----------------------");

		for (int i = 0; i < rowSum.length; i++) {
			if (i<columnSum.length)System.out.printf("%d열의 합: %d  |  ", i + 1, columnSum[i]);
			System.out.printf("%d행의 합: %d\n", i + 1, rowSum[i]);
		}
		System.out.println("-----------------------");
		System.out.printf("7 갯수: %d\n", sevenCount);

	}
}
