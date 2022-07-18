import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Diner_ConsoleApp {

	private Diner_repo repo;

	public Diner_ConsoleApp(Diner_repo repo) {
		this.repo = repo;
	}

	private String scanString() {
		Scanner scString = new Scanner(System.in);
		return scString.nextLine();
	}

	private int scanInt() {
		int num = 0;
		boolean a = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				num = sc.nextInt();
				a = false;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("숫자를 입력하세요.");
			}
		} while (a);
		return num;
	}

	private void list() {
		String quary = repo.allPrintQuary();
		try {
			List<Diner> list = repo.list(quary);

			if (list.size() > 0) {
				System.out.println("::id::\t::name::\t::tel::\t::adress::");
				for (Diner d : list) {
					System.out.println(d);
				}
			} else {
				System.out.println("목록이 존재하지 않습니다.");
			}
		} catch (SQLException e) {
			System.out.println("데이터 읽어오기 실패. 다시 시도하세요.");
		}
	}

	private void search() {
		System.out.println("검색할 책 제목 혹은 id 입력");
		String a = scanString();
		String quary = repo.searchQuary(a);

		try {
			List<Diner> list = repo.list(quary);

			if (list.size() > 0) {
				System.out.println("::id::\t::name::\t::tel::\t::adress::");
				for (Diner d : list) {
					System.out.println(d);
				}
			} else {
				System.out.println("목록이 존재하지 않습니다.");
			}
		} catch (SQLException e) {
			System.out.println("데이터 읽어오기 실패. 다시 시도하세요.");
		}
	}
	
	private void add() {
		System.out.println("상호명, 전화번호, 주소를 입력하세요.");
		String title = scanString();
		if (title.length() > 40) {
			System.out.println("글자수 제한");
			return;
		}
		String tel = scanString();
		if (tel.length() > 13) {
			System.out.println("글자수 제한");
			return;
		}
		String adress = scanString();
		if (adress.length() > 100) {
			System.out.println("글자수 제한");
			return;
		}
		int result;
		String quary = repo.insertQuary(new Diner(title, tel, adress));
		
		try {
			result = repo.command(quary);
			System.out.println(result+" 개의 가게가 추가되었습니다.");
		} catch (SQLException e) {
			int code = e.getErrorCode();
			if (code == 1062)
				System.out.println("중복된 제목");
			
			System.out.println("데이터 추가 실패");
		}
	}
	
	private void update() {
		list();
		System.out.println("수정할 가게의 id, 새 상호명, 새 전화번호, 새 주소 입력");
		int id = scanInt();
		String title = scanString();
		if (title.length() > 40) {
			System.out.println("글자수 제한");
			return;
		}
		String tel = scanString();
		if (tel.length() > 13) {
			System.out.println("글자수 제한");
			return;
		}
		String adress = scanString();
		if (adress.length() > 100) {
			System.out.println("글자수 제한");
			return;
		}
		int result;
		String quary = repo.updateQuary(id, new Diner(title, tel, adress));
		try {
			result = repo.command(quary);
			System.out.println(result+"가게 수정 완료.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	private void delete() {
		list();
		System.out.println("삭제할 가게의 id?");
		int id = scanInt();
		String quary = repo.deleteQuary(id);

		try {
			int result = repo.command(quary);
			if (result > 0)
				System.out.println("책이 삭제되었습니다.");
			else 
				System.out.println("없는 번호");
		} catch (SQLException e) {
			System.out.println("삭제 실패, 다시 시도 요망");
		}
	}

	private void menu() {
		while (true) {
			System.out.println("1. 조회, 2. 검색, 3. 추가, 4. 수정, 5. 삭제 / 9.프로그램 종료");
			int num = scanInt();
			switch (num) {
			case 1:
				list();
				continue;
			case 2:
				search();
				continue;
			case 3:
				add();
				continue;
			case 4:
				update();
				continue;
			case 5:
				delete();
				continue;
			case 9:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 입력");
				continue;
			}
		}
	}

	public static void main(String[] args) {
		Diner_ConsoleApp ap = new Diner_ConsoleApp(new Diner_repo());
		ap.menu();
	}
}
