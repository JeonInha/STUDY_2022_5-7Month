import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ko.co.greenart.dbutil.DBUtil;

public class BooksRepository {
	private Book resultMapping(ResultSet rs) throws SQLException {
		int bookId = rs.getInt("bookId");
		String title = rs.getString("title");
		int price = rs.getInt("price");

		return new Book(bookId, title, price);
	}

	// 異붽�
	public int add(Book book) throws SQLException {
		String query = "INSERT INTO books (title, price) VALUES ('" + book.getTitle() + "', " + book.getPrice() + ")";
		System.out.println("?? 이게모냐: " + query);

		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();

			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}

	// 紐⑸줉 �쟾泥�
	public List<Book> list() throws SQLException {
		String query = "SELECT * FROM books";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Book> list = new ArrayList<>();
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				list.add(resultMapping(rs));
			}
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
		return list;
	}

	// 寃��깋 (�젣紐�) or 寃��깋 (媛�寃�)
	public Book selectByTitle(String title) throws SQLException {
		String query = "SELECT * FROM books WHERE title = '" + title + "'";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			if (rs.next()) {
				return resultMapping(rs);
			} else {
				return null;
			}
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}

//	public List<Book> selectByPrice(int price) {}
	// �궘�젣
	public int delete(int bookId) throws SQLException {
		String query = "DELETE FROM books WHERE bookId = " + bookId;

		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();

			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}

	// �닔�젙
	public int update(Book book) throws SQLException {
		String query = "UPDATE books SET title = '" + book.getTitle()
				+ "', price = " + book.getPrice()
				+ " WHERE bookId = " + book.getBookId();
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
}


















