//사용자의 사각형의 밑변과 높이를 정수로 입력
//사각형의 둘레와 넓이를 출력하는 예제 프로그램

import java.util.Scanner;

public class trn01_CalcSquare {
	public static void main(String args[]) {
		//사용자로부터 입력을 받기 위해 Scanner 생성
		
		Scanner sc = new Scanner(System.in);
		
		int b;
		int h;
		int round;
		int area;
		
		System.out.println("****************");
		System.out.println("사각형의 둘레와 넓이 구하는 프로그램");
		System.out.println("****************");
		System.out.println();
		
		System.out.print("사각형의 밑변을 입력: ");
		b = sc.nextInt();
		System.out.print("사각형의 높이를 입력: ");
		h = sc.nextInt();
		
		round=(b+h)*2;
		area=b*h;
		
			System.out.println("*******결과*******");
		System.out.println("사각형의 둘레: "+ round);
		System.out.println("사각형의 넓이: "+ area);
		
	}
}