
public class Main3_Exception {

	public static void main(String[] args) {
		try {
			System.out.println("try 블록 안");
			System.out.println("문장1");
			
			Object o = new Object();	
			String s = (String) o;		// 예외 발생 문장
			
			System.out.println("문장 2");	// 실행 X
			System.out.println("문장 3");
			
		} catch (Exception e) {
			System.out.println("catch 블록 안");
		} finally {
			System.out.println("finally 블록 안");	// 예외가 발생하든지 말든지 무조건 실행됨!
		}
		System.out.println("종료");
	}

}
