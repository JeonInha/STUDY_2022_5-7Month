import java.util.*;
import java.util.Map.Entry;

class Menu {
	private String name;
	private int price;

	public Menu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%s\t\t%d", name, price);
	}
}

class POSmachine {
	Map<String, Menu> menu = new HashMap<String, Menu>();
	List<Menu> orderSheet = new ArrayList<>();
	
	void addMenu(String a, int b) { // 프로그램 안에 내가 임의로 초기값 넣을때 씀,,
		Menu m = new Menu(a, b);
		menu.put(a, m);
	}

	void removeMenu(String inputName) { // 메뉴 빼기
		if (menu.containsKey(inputName)) {
			menu.remove(inputName);
		} else {
			System.out.println("없는 메뉴입니다.");
		}
	}
	
	void printAllMenu() { // 메뉴판 출력
		System.out.println("<메뉴>\t\t<가격>");
		System.out.println("----------------------------------");
		for (Entry<String, Menu> a : menu.entrySet()) {
			System.out.println(a.getValue());
		}
	}

	void inputOrder(String inputName, int inputNum) { // 주문 1번 넣기
		if (menu.containsKey(inputName)) {
			for (int i = 0; i < inputNum; i++) {
				orderSheet.add(menu.get(inputName));
			}
		} else {
			System.out.println("잘못된 입력");
		}
	}

	int calcAllPrice() { // 가격 리턴
		int price = 0;
		for (Menu a : orderSheet) {
			price += a.getPrice();
		}
		return price;
	}

	void printBill() { // 계산서 출력
		Map<Menu, Integer> bill = new HashMap<>();
		
		for (Menu a : orderSheet) {
			Integer freq = bill.get(a);	// key값이 없으면 null을 반환
			bill.put(a, (freq == null) ? 1 : freq + 1);	// 3항 연산자: freq가 null이면 1 넣고 값이 있으면 1 더함
		}
	
		System.out.println("----------------------------------");
		System.out.printf("[총 금액: %d원]\n", calcAllPrice());
		System.out.println("<메뉴>\t\t<가격>\t<수량>");
		System.out.println("----------------------------------");
		for (Map.Entry<Menu, Integer> s : bill.entrySet()) {
			System.out.print(s.getKey());
			System.out.print("\t" + s.getValue());
			System.out.println();
		}
	}
	
	void pay(int inputmoney) { // 계산
		int price = calcAllPrice();
		if (inputmoney >= price) {
			System.out.println("계산 완료. 거스름돈: " + (inputmoney - price));
			orderSheet = new ArrayList<>();
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
}

class ManageSys {
	Scanner sc = new Scanner(System.in);
	POSmachine machine = new POSmachine();

	public ManageSys() { // 실행부
		run();
	}

	private void resetData() {
		machine.addMenu("파스타", 10000);
		machine.addMenu("스테이크", 34000);
		machine.addMenu("치킨샐러드", 10000);
		machine.addMenu("와인에이드", 6000);
		machine.addMenu("피자", 12000);
	}
	
	void inputOrder() { // 주문 넣기 1번
		while (true) {
			System.out.println("메뉴와 수량 입력 (메뉴 수량): ");
			String inputName = sc.next();
			int inputNum = sc.nextInt();
			
			machine.inputOrder(inputName, inputNum);	// 주문 넣기
			
			System.out.println("주문을 마치려면 0, 주문을 계속하려면 아무 키나 입력: ");
			String input = sc.next();
			if (input.equals("0"))
				break;
		}
	}

	private void run() { // 작동부
		resetData();
		int num;
		System.out.println("============포스기 프로그램===========");

		while (true) {
			try {
				System.out.println("==================================");
				System.out.println("1. 메뉴 보기");
				System.out.println("2. 주문 입력");
				System.out.println("3. 계산서 출력");
				System.out.println("4. 계산하기");
				System.out.println();
				System.out.println("9. 메뉴 관리");
				System.out.println("0. 프로그램 종료");
				System.out.println("----------------------------------");
				System.out.print("입력: ");
				num = sc.nextInt();
				System.out.println("==================================");

				if (num == 1) {
					machine.printAllMenu();

				} else if (num == 2) {
					System.out.println("<주문 입력>");
					inputOrder();

				} else if (num == 3) {
					System.out.println("<계산서 출력>");
					machine.printBill();

				} else if (num == 4) {
					System.out.println("<계산하기>");
					System.out.print("건넨 금액: ");
					int inputmoney = sc.nextInt();
					machine.pay(inputmoney);

				} else if (num == 9) {
					System.out.println("<메뉴 관리>");
					machine.printAllMenu();
					System.out.println("\n메뉴 추가&가격변경: 1\n메뉴 삭제: 2");
					System.out.print("입력:  ");
					int selectManage = sc.nextInt();

					if (selectManage == 1) {
						System.out.println("새 메뉴 이름과 가격 입력: ");
						String inputName = sc.next();
						int inputPrice = sc.nextInt();
						machine.addMenu(inputName, inputPrice);

					} else if (selectManage == 2) {
						System.out.println("지울 메뉴 입력: ");
						String inputName = sc.next();
						machine.removeMenu(inputName);
					} else {
						System.out.println("잘못된 입력");
					}

				} else if (num == 0) {
					System.out.println("프로그램을 종료합니다.");
					break;

				} else if (num == 99) {

				} else {
					System.out.println("잘못된 입력");
				}
			} catch (Exception e) {
				System.out.println("잘못된 입력. 처음으로 돌아갑니다.");
				num = 99;
				sc.nextLine();
			}
		}
	}

}

public class Ex2_RestaurantPos {
	public static void main(String[] args) {
		new ManageSys();
	}
}
