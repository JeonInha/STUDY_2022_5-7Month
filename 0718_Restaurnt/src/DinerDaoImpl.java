import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ko.co.greenart.dbutil.DBUtil;

public class DinerDaoImpl implements DinerDao {
	
	
	private Diner resultMapping(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		String tel = rs.getString("tel");
		String adress = rs.getString("adress");
		
		return new Diner(id, name, tel, adress);
	}
	
	public int[] create(List<Diner> list) throws SQLException {
		String query = "Insert into diner (name, tel, adress) values (? ? ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			
			for (Diner r : list) {
			pstmt.setString(1, r.getName());
			pstmt.setString(2, r.getTel());
			pstmt.setString(3, r.getAdress());
			pstmt.addBatch();
		
			}
			
			return pstmt.executeBatch();

		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}
	//배치작업은, 데이터를 실시간으로 처리하는게 아니라, 일괄적으로 모아서 처리하는 작업을 의미한다.
	//가령, 하루동안 쌓인 데이터를 배치작업을 통해 
	// 특정 시간에 한꺼번에 처리하는 경우가 이에 해당한다. 
	// 은행의 정산작업과 같은 업무에서 이런 일괄처리를 수행하게 되며 
	// 사용자에게 빠른 응답이 필요하지 않은 서비스에 적용할 수 있다.
	// 특정 시간이후에는 자원을 거의 소비하지 않는 것이 특징이다.
	
	@Override
	public int create(String name, String tel, String adress) throws SQLException {
		String query = "INSERT INTO Diner (name, tel, adress) VALUES (?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, tel);
			pstmt.setString(3, adress);

			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

	// Statement처럼 명령주는 것은 동일, but 미리 준비하고 그 후에 실행
	// 준비 : ?를 포함하는 sql문이 있다면, 파라미터로 값을 받아와서 안에 값을 넣어주는 역할
	// 값을 다 넣고 나면 실행
	// - 보안상에서 기능이 더 뛰어남 -> sql indextion(sql 명령어를 집어넣어서 악의적인 흐름을 만들어내 공격)
	// Statement는 파라미터로 받은 문자열에 공격적인 문법이 들어가있는지 논리적인 분석이 필요,
	// Prepared Statement는 문자열을 넣어야 하면 문자열 처리를 하는 등 실행될 수 없는 상태로 만들어버리므로 보안성에서 뛰어남
	// - Statement를 상속받음

	@Override
	public List<Diner> read() throws SQLException {
		String query = "SELECT * FROM Diner";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Diner> list = new ArrayList<>();

		try {

			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				resultMapping(rs);
			}
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		return list;
	}

	@Override
	public Diner read(int id) throws SQLException {
		
		String query = "SELECT * FROM Diner where id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				return resultMapping(rs);
			}
			
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		return null;
	}

	@Override
	public int update(int id, String name, String tel, String adress) throws SQLException {
		String query = "UPDATE Diner set name = ?, tel = ?, adress = ? where id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, tel);
			pstmt.setString(3, adress);
			pstmt.setInt(4, id);
			
			return pstmt.executeUpdate();
			
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

	@Override
	public int delete(int id) throws SQLException {
		
		String query = "delete from Diner where id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			
			return pstmt.executeUpdate();
			
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

}
