
public class Exception5 {
	public static int div(int l, int r) throws MyZeroDivideException {
		if (r==0) {
			throw new MyZeroDivideException("나눌 수 없음");
		} else
		return l/r;
	}
	
	public int myFunction() {
		// 미완성 메소드
		throw new UnsupportedOperationException("내일 만들게 ..");
	}

	
	public static void main(String[] args) {
		
		try {
			int result = div(100, 50);// throws를 가지고 있으면 무조건 ... try 블록 안에 넣기
		} catch (MyZeroDivideException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
