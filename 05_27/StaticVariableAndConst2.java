public class StaticVariableAndConst2 {
	
	public static void printTest(int param) {
		param++;
		System.out.println("메소드에서 플러스: "+param);
		System.out.println("메소드에서 전달받을 때 상수가 아닌 변수로 전달받아서.";
	}
	
	public static void ptFinal(final int prarm) {
		System.out.println(param);
	}
	
	public static void main(String[] args) {
		int inner = 10;
		final int TEST_SCOPE=20;
		
		{
			System.out.println(inner);
			System.out.println(TEST_SCOPE);
		}
		printTest(TEST_SCOPE);
		System.out.println("메인에서의 상수값: "+TEST_SCOPE);
		
	}
}