import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ko.co.greenart.dbutil.DBUtil;

public class Main {

	public static void main(String[] args) {
//		Connection conn = null;
//		try {
//			conn=DBUtil.getConnection();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			if (conn != null)
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//		}

		// 이런 복잡한 try catch로 열고닫는거 안하기위해 ....
		try (Connection conn=DBUtil.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement("");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream("")) {
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
