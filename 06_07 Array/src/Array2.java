// 길이가 5인 정수형 배열을 선언초기화하고 모든 원소의 값을 100으로 설정하기
public class Array2 {
	public static void main(String[] args) {
		int[] aBox = new int[5];
		
		for (int i=0; i<aBox.length; i++) {
			aBox[i]=100;
			System.out.printf("A박스배열의 %d번째 원소값: %d\n", i, aBox[i]);
		}
		
		
		System.out.println("정상 종료");
	}
}
