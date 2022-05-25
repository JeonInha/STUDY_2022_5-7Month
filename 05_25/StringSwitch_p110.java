public class StringSwitch_p110 {
	public static void main(String[] args) {
		String month="february";
		
		int monthNumber;
		switch (month) {
			case "january":
				monthNumber=1;
				break;
			case "februry":
				monthNumber=2;
				int b=10; // 스위치문 안에서만 쓰는 지역변수
				break;
			case "march":
				monthNumber=3;
//				System.out.println(b); // 초기화되지 않을 가능성이 있어 컴파일에러를 띄움
				break;
			default:
				monthNumber=0;
				break;
		}
		System.out.prtinln(monthNumber);
	}
}