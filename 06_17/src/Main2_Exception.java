
public class Main2_Exception {
	public static void main(String[] args) {
		String s = null;
		try {
			int div = 10 / 0;
			s.equals("asdf");
			
			System.out.println("실행되나?");
		} catch(NullPointerException e) {
			//e : 해당 캐치 블럭 안에서만 존재하는 지역변수
			System.out.println("NullPointerException 처리");
		} catch (ArithmeticException e) {
			System.out.println("수 예외 처리");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 예외 처리");
		} catch (Exception e) {	// 상위클래스는 하단에 두어야 에러가 안 남.
			System.out.println("모든 오류 잡아내깅");
		}
			
		
		System.out.println("프로그램 종료");
	}
}
