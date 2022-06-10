public class someMethod {
	
	public static void someMethod(int param) {
		
	}
	
 	// 다양한 타입에 대응하는 메소드 만들기.
	// Method Overloading이라고 함.
	// param의 갯수, 타입, 순서
	
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void sum(double a, double b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		someMethod(2878);
		

	}

}
