package busan2044_MethodTest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import kr.co.green.BusanUtil;
import loginUser.BusanUser;

public class TestTest {
	
	private boolean isUserHasSave(BusanUser loguser) {
		boolean isUserHasSave = false;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select userId from busan.savehere where userId = ?";
		
		try {
			conn = BusanUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, loguser.getId());
			rs = pstmt.executeQuery();
			////////// userId가 있는지 없는지 확인하는 로직
			isUserHasSave = rs.next();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BusanUtil.closeRS(rs);
			BusanUtil.closeStmt(pstmt);
			BusanUtil.closeConn(conn);
		}
		return isUserHasSave;
	}
	///////////////////////////////////////////////
	
	// 선택지 기록
	private void insertPath(BusanUser loguser, String path) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String qInsert = "INSERT INTO busan.savehere(storyPath1, userId) VALUES (?, ?)";
		String qUpdate = "update busan.savehere set storyPath1 = ? where userId=?";

		try {
			conn = BusanUtil.getConnection();
			boolean a = isUserHasSave(loguser);

			if (a) {
				// 유저아이디가 없을때
				pstmt = conn.prepareStatement(qUpdate);
				pstmt.setString(1, path);
				pstmt.setString(2, loguser.getId());
			} else {
				// 유저아이디가 있을때
				pstmt = conn.prepareStatement(qInsert);
				pstmt.setString(1, path);
				pstmt.setString(2, loguser.getId());
			}
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BusanUtil.closeStmt(pstmt);
			BusanUtil.closeConn(conn);
		}
	}

	public static void main(String[] args) {
		TestTest test = new TestTest();
		BusanUser loguser = new BusanUser("rewrwqrewqrwqrq", "1234");
		test.insertPath(loguser, "[1, 3, 2, 3, 4, 5]");
	}
}
