import java.util.*;

public class Ex4_ArrayLIst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>(Arrays.asList("사과", "포도", "오렌지", "배", "수박", "복숭아"));
		int num = 0;

		System.out.println("::과일가게::");

		// 진열대 최대 10개
		while (true) {
			System.out.println("==========================");
			System.out.println("1. 파는 과일 목록 보여주기");
			System.out.println("2. 과일 증정");
			System.out.println("3. 재고 과일 추가");
			System.out.println();
			System.out.println("9. 프로그램 종료");
			System.out.print("입력: ");
			try {
			num = sc.nextInt();
			} catch (Exception e){
				System.out.println("숫자를 입력하세요.");
				sc.nextLine();
			}
			System.out.println("--------------------------");

			if (num == 1) {
				System.out.println("<과일 목록 보여주기>");
				for (String s : list)
					System.out.println(s);
				System.out.printf("[재고 갯수: %d / 10]\n", list.size());
			} else if (num == 2) {
				System.out.println("<과일 증정>");
				System.out.print("사고싶은 과일: ");
				String input = sc.next();
				boolean has = false;
				if (list.contains(input)) {
					list.remove(input);
					System.out.println("맛있게 드세용");
				} else {
					System.out.println("재고가 없습니당");
				}
			} else if (num == 3) {
				System.out.println("<재고 과일 추가>");
				if (list.size()<10) {
				System.out.print("추가할 재고명 입력: ");
				list.add(sc.next());
				} else {
					System.out.println("재고가 많아서 발주신청을 할 수 없어용");
				}
			} else if (num == 9) {
				System.out.println("프로그램 종료");
				break;
			} else if (num==99) {
				
			} else {
				System.out.println("잘못된 입력");
			}

		}
	}
}
