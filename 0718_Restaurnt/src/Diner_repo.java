import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import ko.co.greenart.dbutil.DBUtil;

public class Diner_repo {
	
	private Diner resultMapping(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		String tel = rs.getString("tel");
		String adress = rs.getString("adress");

		return new Diner(id, name, tel, adress);
	}
	
	/*
	 * C(상호명, 전화번호, 주소) or C(음식점) : 행 개수 				throws SQLException
	 * R() : List<음식점> 									throws SQLException
	 * R(id) : 음식점											throws SQLException
	 * U(id, 새 상호명, 새 전화번호, 새 주소) or U(음식점) : 행 개수 	throws SQLException
	 * D(id) : 행 개수 										throws SQLException
	 * 
	 */
	
	String insertQuary(Diner d) {
		return String.format("insert into Diner (name, tel, adress) values ('%s', '%s', '%s');", d.getName(), d.getTel(), d.getAdress());
	}
	
	String allPrintQuary() {
		return "select * from Diner;";
	}

	String searchQuary(String input) {
		return "select * from Diner where id = '" + input + "' or name like '%" + input + "%' order by id;";
	}
	
	String updateQuary(int id, Diner d) {
		return String.format("update Diner set name = '%s', tel = '%s', adress = '%s' where id = %d;", d.getName(), d.getTel(), d.getAdress(), id);
	}

	String deleteQuary(int id) {
		return "delete from Diner where id = " + id + ";";
	}
	
	int command(String query) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			// 성공했으면 1, 아니면 0 반환
			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	public List<Diner> list(String query) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Diner> list = new ArrayList<>();
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
}
