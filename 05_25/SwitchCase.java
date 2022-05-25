public class SwitchCase {
	public static void main(String[] args) {
		int i=3;
		
		switch (i) {
			case 1: 
			System.out.println("일");
			break;
			case 2: 
			System.out.println("이");
			break;
			case 3: 
			System.out.println("삼");
			break;
			default:  // 정수값을 찾을 수 없을 때 디폴트 수행. 있어도 되고 없어도 됨. case에 해당하는 값을 입력하지 않았는데 디폴트가 없으면 아무것도 실행이 안됨.
			System.out.println("일이삼 아님");
		}
		System.out.println("프로그램 종료");
		
	}
}
		

/*		if (i==1) {
			
		} else if (i==2) {
			
		} else if (i==2) {
			
		} else {
		얘랑 비슷함      */