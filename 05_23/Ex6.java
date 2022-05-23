import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//자판기 프로그램
		//돈 입력
		//반복하여 입력을 받아
		//1번 콜라: 1500
		//2번 사이다: 1300
		//3번 계산
		//총 몇개의 캔을 구입하고, 거스름돈은 얼마인지 출력
		
		System.out.println("***자판기 ver.1***");
		
		int i=5;
		int coke=0;
		int soda=0;
		System.out.println("자판기에 돈을 투입하세요");
		int money=sc.nextInt();
		while (i!=3) {
			if (i==1) {
				    if (money<1500) {
				    System.out.println("잔액이 부족합니다.\n");
				    i=5;
				    } else {
			        ++coke;
			        money=money-1500;
			        System.out.printf("물품: 콜라 %d개, 사이다 %d개\n",coke, soda);
				    System.out.println("잔액: "+money+"원");
				    i=sc.nextInt();
					}
			} else if (i==2) {
				    if (money<1300) {
				    System.out.println("잔액이 부족합니다.\n");
				    i=5;
				    } else {
			        ++soda;
			        money=money-1300;
			        System.out.printf("물품: 콜라 %d개, 사이다 %d개\n",coke, soda);
				    System.out.println("잔액: "+money+"원");
				    i=sc.nextInt();
					}
			} else if (i==3) {
				return;
			} else if (i==4) {
			    System.out.println("자판기에 돈을 투입하세요");
		        money=money+sc.nextInt();
				System.out.println("투입되었습니다.\n잔액: "+money);
				i=sc.nextInt();
			} else if (i==5) {
				System.out.println("잔액: "+money+"원");
				System.out.println("1번: 콜라(1500원)\n2번: 사이다(1300원)\n3번: 계산\n4번: 돈 추가 투입\n5번: 다시 설명");
				i=sc.nextInt();
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				i=5;
			}
		}
			 System.out.println("******계산합니다***********");
			System.out.printf("물품: 콜라 %d개, 사이다 %d개\n",coke, soda);
			System.out.printf("거스름돈: %d\n",money);

			
		
		
		
	}
}