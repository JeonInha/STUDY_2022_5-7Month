import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import ko.co.greenart.dbutil.DBUtil;

class Books {
	String allPrintQuary() {
		return "select * from books;";
	}
	
	String searchQuary(String input) {
		return "select * from books where bookid = '"+input+"' or title like '%"+input+"%' order by bookid;";
	}
	
	String deleteQuary(int id) {
		return "delete from books where bookid = "+id+";";
	}
	
	String insertQuary(String title, int price) {
		return String.format("insert into books (title, price) values ('%s', %d);", title, price);
	}
	
	String updateQuary(String title, int price, int id) {
		return String.format("update books set title = '%s', price = %d where bookid = %d;", title, price, id);
	}
	
	void readBookDB(String quary) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(quary);
			
			while (rs.next()) {
				int id = rs.getInt("bookid");
				String title = rs.getString("title");
				int price = rs.getInt("price");
				System.out.printf("[id: %d | %s, %d원]\n", id, title, price);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	// 개발자 입장에서 동작을 한 결과를 출력하면 좋을 것 같음. int나 불연 값으로.
	void commandBookDB(String query) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
}

class ManageSys {
	Books books = new Books();
	
	ManageSys() {
		run();
	}
	
	private String scanString() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
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
				System.out.println("숫자를 입력하세요.");
			}
		} while (a);
		return num;
	}

	private void run() {

		System.out.println("====================");
		System.out.println("====도서관리시스템");
		System.out.println("====================");

		int num = 0;
		while (true) {
			System.out.println("====================");
			System.out.println("1. 전체 목록 출력");
			System.out.println("2. 도서 검색");
			System.out.println("3. 도서 추가");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 수정");
			System.out.println();
			System.out.println("9. 프로그램 종료");
			System.out.println("--------------------");
			System.out.print("입력: ");
			num = scanInt();
			System.out.println("====================");
			
			if (num == 1) {
				System.out.println("1. 전체 목록 출력");
				// 깔끔하게 하고 싶으면 이걸 랩핑하는 메소드를 만들어서 깔끔하게 해보장.
				books.readBookDB(books.allPrintQuary());
				
			} else if (num == 2) {
				System.out.println("2. 도서 검색");
				System.out.print("id 또는 책 제목 검색: ");
				String input = scanString();
				books.readBookDB(books.searchQuary(input));
				
			} else if (num == 3) {
				System.out.println("3. 도서 추가");
				System.out.print("책 제목 입력: ");
				String title = scanString();
				System.out.print("책 가격 입력: ");
				int price = scanInt();
				books.commandBookDB(books.insertQuary(title, price));
				System.out.println("입력 완료되었습니다. id: ");

			} else if (num == 4) {
				System.out.println("4. 도서 삭제");
				System.out.print("변경할 도서의 id 입력: ");
				int id = scanInt();
				books.commandBookDB(books.deleteQuary(id));
				
			} else if (num == 5) {
				System.out.println("5. 도서 수정");
				System.out.print("변경할 도서의 id 입력: ");
				int id = scanInt();
				System.out.print("변경할 도서의 제목 입력: ");
				String title = scanString();
				System.out.print("변경할 도서의 가격 입력: ");
				int price = scanInt();
				books.commandBookDB(books.updateQuary(title, price, id));

			} else if (num == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
			} else {
				System.out.println("잘못된 입력");
			}
		}

	}
}

public class Ex1_MyDB_books {
	public static void main(String[] args) {
		new ManageSys();
	}
}
