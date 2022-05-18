/*사용자가 입력한 두 숫자를 더해서 출력하는 프로그램*/

import java.util.Scanner;
//스캐너를 사용하기 위해 "스캐너" 클래스 호출

public class Add2_p65 {
	//메인 메소드로부터 실행
	public static void main(String args[]) {
		//사용자로부터 입력을 받기 위해 Scanner 생성
		
		Scanner sc = new Scanner(System.in);
		// Scanner: 사용자의 입력을 받을 수 있게 하는 도구들이 저장된 Class.
		// 입력을 받기 위해 Scanner의 Instance를 생성.
		// 변수 선언, 초기화 작업 한줄에 가능.

		int x; //숫자1
		int y; //숫자2
		int sum; //저장값
		
		System.out.print("첫번째 숫자를 입력하시오: "); //입력안내출력
		x = sc.nextInt(); //사용자로부터 숫자 읽기
		
		System.out.print("두번째 숫자를 입력하시오: ");
		y = sc.nextInt();
		
		sum = x + y; //더하기
		
		System.out.println("결과: "+sum); //합 출력
	}
}

