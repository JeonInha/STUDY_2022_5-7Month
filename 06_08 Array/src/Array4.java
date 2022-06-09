public class Array4 {
	public static void someMethod(int[] arr) {
		
		for (int number: arr) {
			System.out.println(number);
		}
	}
	
	public static void someMet2(int ... arr) {	//가변길이 파라미터. (가변길이 파라미터로도 배열 전달받을수있음)
		for (int number: arr) {		//가변길이 파라미터로 받은 값들은 배열처럼 쓰면 됨.
			System.out.println(number);		//가변길이 파라미터는 파라미터가 여러개 있을 시 파라미터 중 마지막에 위치해야 함.
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {10, 20, 30, 40, 50};
		
		someMethod(arr);	//배열을 통해 파라미터 전달: 유동적인 갯수의 매개변수를 전달하고 호출할 수 있음.
		someMethod(new int[] {4, 5, 6, 7});
		someMet2(arr);
		someMet2(new int[] {4, 5, 6, 7});
		someMet2(1, 2, 3, 4, 5);
	}
}
