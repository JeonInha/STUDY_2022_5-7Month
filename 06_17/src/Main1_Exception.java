import java.util.*;

// 정수 2개 입력받아서 나누기한 몫을 출력하는 프로그램
public class Main1_Exception {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner scan = new Scanner(System.in);
		
		try {
			
			System.out.println("분자 입력");
			int left = scan.nextInt();
			System.out.println("분모 입력");
			int right = scan.nextInt();
			
			if (right != 0) {
				System.out.println("나눈 몫: " + (left / right));
			} else
				System.out.println("분모에 0 입력할 수 없음");
			
		} catch (InputMismatchException ex) {
			System.out.println("숫자를 입력해야 합니다.");
//			System.out.println(ex.getMessage());
			ex.printStackTrace();	// 정상종료를 하고 난 다음에 예외가 발생했던 경로를 콘솔창에 출력
			
		}
		
		System.out.println("프로그램 정상 종료");
	}
		
}
