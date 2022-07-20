import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import ko.co.greenart.dbutil.DBUtil;

public class Main {

	private Event resultMappingNE(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String opstory = rs.getString("opStory");
		String select1 = rs.getString("select1");
		String select2 = rs.getString("select2");
		String edStroy1 = rs.getString("edStory1");
		String edStory2 = rs.getString("edStory2");
		String select1_result = rs.getString("select1_result");
		String select2_result = rs.getString("select2_result");
		String needitem = rs.getString("needitem");
		Double random = rs.getDouble("random");
		return new Event(opstory, select1, select2, edStroy1, edStory2, select1_result, select2_result, id, needitem,
				random);
	}

	public Event madeEL(Map<Integer, Event> eventList) {
		String query = "SELECT * FROM test_textgame where id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			for (int i = 1; i < 6; i++) {
				pstmt.setInt(1, i);
				rs = pstmt.executeQuery();

				if (rs.next()) {
					Event e = resultMappingNE(rs);
					eventList.put(i, e);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		return null;
	}

	public static void main(String[] args) {
		Map<Integer, Event> eventList = new HashMap<>();
		Main main = new Main();
		main.madeEL(eventList);
		
		for (int i=1; i<6; i++) {
			Event e = eventList.get(i);
			System.out.println(e.opstory);
			System.out.println("1. "+e.select1);
			System.out.println("2. "+e.select2);
			System.out.print("입력: ");
			int num = new Scanner(System.in).nextInt();
				
			if (num==1)
				System.out.println(e.edStroy1);
			if (num==2)
				System.out.println(e.edStory2);
			eventList.remove(i);
			System.out.println("======================");
		}
	}
}
