public class TestMethod2 {
	
	public static int sum() {
		int a=10;
		int b=10;
		int sum=a+b;
		return sum;  // sum()의 값은 sum, 이라는 것이 저장됨.
	}
	
	public static double pi() {
		return Math.PI;
	}
	
	public static void main(String[] args) {
		System.out.println("시작");
		int result=sum(); // result 변수값으로 sum 메소드 호출
		System.out.println(result); // result 출력
		
		System.out.println(sum());
		System.out.println(pi());
		
		System.out.println("끝");
	}
}