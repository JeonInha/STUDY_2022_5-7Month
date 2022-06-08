public class Array5 {
	// 정수 2개를 전달받아 합을 구해서 반환하는 메소드
	public static int sum(int... numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int result = sum(10, 20, 30, 40, 50, 60, 70, 80);
		System.out.println(result);
	}

//	public static void someMethod(double d, int... arr) {
//		for (int number : arr) {
//			System.out.println(number);
//		}
//	}

//	public static void main(String[] args) {
//		int[] arr = { 10, 20, 30, 40, 50 };
//
//		someMethod(40, 50, 60, 70, 80);

//		someMethod(arr);
//		someMethod(new int[] { 20, 30, 40, 50, 60 });
//		System.out.println("---");
//		someMethod(new int[] { 4, 5, 6 });
//		System.out.println("종료");
//	}
}