public class Exception4 {
	public static void main(String[] args) {
		try {
			int left = 10;
			int right = 0;
			
			if (right == 0) {
				// 0으로 나누려고 할 때
				// 보고서를 잡아서 던지기로 함
				throw new MyZeroDivideException("0으로 나누는 예외적인 상황이 발생함");	 // 예외 객체
				// 예외 던지기 .
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
