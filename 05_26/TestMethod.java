public class TestMethod {
	public static void printRepeat() { // 메소드 생성: 이름은 자기가 정하기
		for (int i=0; i<3; i++) {  
			System.out.println("반복중");
		}
	}
	public static void printHello() {
		int number = 10;
		System.out.println("Hello World!");
		System.out.println("초기화한 변수 값: "+number);
		
	}
	public static void main(String[] args) { // 메인 메소드: 흐름을 만들어낼 수 있음
		
		System.out.println("프로그램 시작");
		
		
		printHello();
//		System.out.println("헬로에서 초기화한 변수 값: "+number);
		for (int i=0; i<2; i++) {
		printRepeat(); // 메소드 호출
		System.out.println(i+1+"번 반복");
		}

		System.out.println("프로그램 끝");
	}
}