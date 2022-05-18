//사용자에게 국어, 영어, 수학 점수를 정수로 입력받아
//총점과 평균점수를 출력하는 프로그램

import java.util.Scanner;

public class trn03_CalcScore {
	public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
	
	int ko, math, eng;
	
	System.out.print("국어 점수를 입력하세요: ");
	ko = sc.nextInt();
	System.out.print("수학 점수를 입력하세요: ");
	math = sc.nextInt();
	System.out.print("영어 점수를 입력하세요: ");
	eng = sc.nextInt();
	
	int sum = ko+math+eng;
	
	
    System.out.println("총점: "+sum);
	System.out.println("평균: "+sum/3);


	}
	
}
		
		