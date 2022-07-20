import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ko.co.greenart.dbutil.DBUtil;

/*
 *  my_db.books
 * 
 */























public class TestConn {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT 1");
			
			if (rs.next()) {
				int result = rs.getInt(1);
				System.out.println("결과확인 : " + result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
}
