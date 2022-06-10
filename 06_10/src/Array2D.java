import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 6, 8, 10 };
		int[] arr2 = { 3, 6, 9, 12, 15 };
		int[] arr3 = { 4, 8, 12, 16, 20 };

		int[][] arr2d = new int[3]/* 배열의 길이: 줄 갯수 */[5]/* 원소 배열이 가지는 길이: 칸 갯수 */;
		arr2d[0] = arr1;
		arr2d[1] = arr2;
		arr2d[2] = arr3;
		// 표처럼 생긴 2차원 배열 생성!//

		System.out.println(Arrays.toString(arr2d[2]));
		System.out.println(arr2d[0][0]);
		System.out.println(arr2d.length); // 줄 갯수
		System.out.println(arr2d[0].length); // 칸 갯수

		for (int i = 0; i < arr2d.length; i++) {
			System.out.println(arr2d[0][i]);
		}

		int[][] arrAnother = { { 2, 4, 6 }, { 3, 6, 9 }, { 4, 8, 12 } }; // 이렇게도 초기화가능

		for (int j = 0; j < arrAnother.length; j++) {
			for (int i = 0; i < arrAnother[j].length; i++) {
				System.out.print(arrAnother[j][i]);
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(arr2d)); // 2d배열에서 쓰는 toString
		// 2d배열에서 쓰는 Array.equals(a, b) => Array. deepEquals(a, b);
		
	}

}
