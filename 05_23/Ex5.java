import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
       // 2의 제곱 수 32개 나열하고 결과값 확인하기
		System.out.println("***2의 제곱수 32개 나열***");

		for (int i=1; i<=32; i++) {
					long sq=1L;
			for (int j=1; j<=i; j++) {
				sq=sq*2;
			}
			System.out.println(i+"="+sq);
		}
		System.out.println("\n\n\n");
		
		
		//사용자 입력 n, m에 대해 n^m 출력하기
		System.out.println("***입력받아 n^m 출력***");
		System.out.print("밑 입력: ");
		int n=sc.nextInt();
		System.out.print("지수 입력: ");
		int m=sc.nextInt();
		Long sum=(long)n;
		for(int i=1; i<m; i++) {
			sum=sum*n;
		}
        System.out.println("값: "+sum);
						
		System.out.println("\n\n\n");
		
		
		//자판기 프로그램
		//돈 입력
		//반복하여 입력을 받아
		//1번 콜라: 1500
		//2번 사이다: 1300
		//3번 계산
		//총 몇개의 캔을 구입하고, 거스름돈은 얼마인지 출력
		
		System.out.println("***자판기 ver.1***");
		
		int i=4;
		int coke=0;
		int soda=0;
		System.out.println("자판기에 돈을 투입하세요")
		int money=sc.nextInt();
		for (i!=3) {
			if (i=1) {
			++coke;
			money=money-1500;
			System.out.printf("물품: 콜라 %d개, 사이다 %d개",coke, soda);
			} else if (i=2) {
			++soda;
			money=money-1300;
			System.out.printf("물품: 콜라 %d개, 사이다 %d개",coke, soda);
			} else if (i=3) {
			System.out.printf("계산합니다.");
				return;
			} else if (i=4) {
				System.out.println("정수만 입력하세요");
				System.out.println("1번: 콜라(1500원)\n2번: 사이다(1300원)\n3번: 계산\n4번: 다시 설명");
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		System.out.println("")
			
		
		
		
	}
}
		
		//사용자가 입력한 정수의 약수 나열하고 총 갯수 출력하기
		
		// 사용자가 입력한 5개의 정수 중 가장 큰 수 출력하기
				
		// 사용자가 입력한 영단어(latin 문자열)에서 모음이 몇개인지 출력
		