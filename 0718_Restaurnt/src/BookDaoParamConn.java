import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ko.co.greenart.dbutil.DBUtil;

public class BookDaoParamConn {
	public int update(Connection conn, int bookId, String title, int price) throws SQLException {
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement("UPDATE books SET title = ?, price = ? WHERE bookId = ?");
			pstmt.setString(1, title);
			pstmt.setInt(2, price);
			pstmt.setInt(3, bookId);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
		}
	}
	public int insert(Connection conn, String title, int price) throws SQLException {
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement("INSERT INTO books (title, price) VALUES (?, ?)");
			pstmt.setString(1, title);
			pstmt.setInt(2, price);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
		}
	}
	public int delete(Connection conn, int bookId) throws SQLException {
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement("DELETE FROM books WHERE bookId = ?");
			pstmt.setInt(1, bookId);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
		}
	}
}
