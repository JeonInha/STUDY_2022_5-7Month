import java.time.LocalTime;
import java.util.Scanner;

class LackMoneyException extends Exception {
	public LackMoneyException(String message) {
		super(message + ", " + LocalTime.now() + "에 발생하였음");
	}
}

class Account {
	private int money;

	@Override
	public String toString() {
		return String.format("잔액: %d원", money);
	}

	public Account(int bal) {
		this.money = bal;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int bal) {
		this.money = bal;
	}

	public void withdrawMoney(int a) throws LackMoneyException {
		if (a > money)
			throw new LackMoneyException(String.format("[잔고 부족. 부족 금액: %d]", a - money));
		money -= a;
	}

	public void inputMoney(int a) {
		money += a;
	}
}

public class Main6_Exception_Bank {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Account account = new Account(1800);
		int num;
			System.out.println("ATM");
		while (true) {
			
			System.out.println("========================");
			System.out.println("1. 잔고 확인");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("0. 프로그램 종료");
			System.out.print("입력: ");
			num=sc.nextInt();
			System.out.println("========================");
			if (num==1) {
				System.out.println("<잔고 확인>");
				System.out.println(account);
			} else if (num==2) {
				System.out.println("<입금>");
				System.out.print("입금액 입력: ");
				int in = sc.nextInt();
				account.inputMoney(in);
				
				
			} else if (num==3) {
				System.out.println("<출금>");
				System.out.print("출금액 입력: ");
				int in = sc.nextInt();
				
				try {
					account.withdrawMoney(in);
				} catch (LackMoneyException e) {
					System.out.println(e.getMessage());
				}
				
				
				
			} else if (num==0) {
				System.out.println("프로그램을 종료");
				break;
			} else {
				System.out.println("잘못된 입력");
			}
		}
	}
}
