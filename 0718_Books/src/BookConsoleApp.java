import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
// DB작업은 시간이 걸리기땜에 ... 시간 줄이기에 유의

public class BookConsoleApp {

	private BooksRepository repo;

	public BookConsoleApp(BooksRepository repo) {
		this.repo = repo;
	}

	public void menu() {
		System.out.println("1. 조회, 2. 검색, 3. 추가, 4. 수정, 5. 삭제");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		
		switch (num) {
		case 1:
			list();
			break;
		case 2:
			search();
			break;
		case 3:
			add();
			break;
		case 4:
			update();
			break;
		case 5:
			delete();
			break;
		default:
			break;
		}
	}
	
	private void search() {
		System.out.println("검색할 책 제목 입력");
		Scanner scan = new Scanner(System.in);
		String title = scan.nextLine();
		Book book;
		
		try {
			book = repo.selectByTitle(title);
			System.out.println(book);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void update() {
		list();
		System.out.println("수정할 번호, 새 제목, 새 가격 순 입력");
		Scanner scan = new Scanner(System.in);
		
		int bookid = scan.nextInt();
		String title = scan.next();
		int price = scan.nextInt();
		try {
			int result = repo.update(new Book(bookid, title, price));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void delete() {
		list();
		System.out.println("삭제할 번호?");
		Scanner scan = new Scanner(System.in);
		int bookid = scan.nextInt();

		try {
			int result = repo.delete(bookid);
			if (result > 0)
				System.out.println("책이 삭제되었습니다.");
			else 
				System.out.println("없는 번호");
		} catch (SQLException e) {
			System.out.println("삭제 실패, 다시 시도 요망");
		}
	}

	private void list() {
		try {
			List<Book> list = repo.list();

			if (list.size() > 0) {
				for (Book b : list) {
					System.out.println(b);
				}
			} else {
				System.out.println("목록이 존재 X");
			}
		} catch (SQLException e) {
			System.out.println("데이터 읽어오기 실패. 다시 시도하세요.");
		}

	}
	
	private void add() {
		System.out.println("제목, 가격을 입력하세요");
		Scanner scan = new Scanner(System.in);
		String title = scan.nextLine();
		if (title.length() > 40) {
			System.out.println("40자를 넘었습니다.");
			return;
		}
		int price = scan.nextInt();
		int result;
		try {
			result = repo.add(new Book(title, price));
			System.out.println(result+"개의 책이 추가되었습니다.");
		} catch (SQLException e) {
			int code = e.getErrorCode();
			if (code == 1062)
				System.out.println("중복된 제목");
			System.out.println("데이터 추가 실패");
		}
		
	}

	public static void main(String[] args) {
		BookConsoleApp app = new BookConsoleApp(new BooksRepository());
		app.menu();
	}

}
