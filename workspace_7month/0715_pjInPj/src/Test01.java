import java.sql.*;
import ko.co.greenart.dbutil.DBUtil;

public class Test01 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("Select 1");
			
			if (rs.next()) {
				int result = rs.getInt(1);
				System.out.println("»Æ¿Œ" + result);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConn(conn);
		}
	}
}
