public class StaticVariableAndConst3 {
	public static int number=100; // 전역변수 
	
	public static void test() {
		number++;
		System.out.println("Test Method "+number);
	}
	
	public static void main(String[] args) {
		number++;
		System.out.println("Main Method "+number);
		test();
		System.out.println(Math.PI); // PI값 출력
		
		double a=Math.abs(-372); // 음수를 넣으면 양수로, 양수를 넣으면 양수로 반환
		System.out.println(a);
		
		double r=Math.random(); // 0과 1 사이의 랜덤 실수를 출력 실수형으로 만들기 가장 쉬운 방법은 곱셈 활용
		r=(int)(r*10); // 하지만 랜덤 클래스를 쓰는게 더 나을듯.
		System.out.println(r);
		
	}
}