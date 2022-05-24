import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i, coke, soda, money;
		i=4;
		coke=0;
		soda=0;
		money=0;
		System.out.println("**************************");				
		System.out.println("****** 자판기 ver.1 ******");
		System.out.println("**************************");
		while (i!=3) {
			if (i==1) { // 콜라 구매
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
			} else if (i==2) { // 사이다 구매
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
			} else if (i==4) { // 돈 넣기
			    System.out.println("자판기에 돈을 투입하세요");
		        money=money+sc.nextInt();
				System.out.println("투입되었습니다.\n잔액: "+money);
				i=5;
			} else if (i==5) { // 설명
				System.out.println("잔액: "+money+"원");
				System.out.println("1번: 콜라☞1500원\n2번: 사이다☞1300원\n3번: 계산\n4번: 돈 추가 투입\n5번: 다시 설명");
				i=sc.nextInt();
			} else { // 잘못된 입력
				System.out.println("잘못된 입력입니다. \n다시 입력하세요.");
				i=5;
			}
			System.out.println("__________________________");
		}
			System.out.println("********계산합니다********");
			System.out.printf("물품: 콜라 %d개, 사이다 %d개\n거스름돈: %d원\n",coke, soda, money);
	}
}