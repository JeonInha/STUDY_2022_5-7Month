import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import kr.co.green.BusanUtil;

public class SkillImpl {
	
	private Skill resultMapping(ResultSet rs) throws SQLException {
		int id = rs.getInt("Skill_id");
		int type = rs.getInt("Skill_type");
		String name = rs.getString("Skill_name");
		int aim = rs.getInt("Skill_aim");
		String needItem = rs.getString("Skill_needItem");
		
		String criticalScript = rs.getString("Skill_criticalScript");
		String sucessScript= rs.getString("Skill_sucessScript");
		String failScript= rs.getString("Skill_failScript");
		String fumbleScript= rs.getString("Skill_fumbleScript");
		
		return new Skill(id, type, name, aim, needItem, criticalScript, sucessScript, failScript, fumbleScript);
	}
	
	
	
	// TODO skill - enemy 연동;;

	List<Skill> readSkill() {
		String query = "SELECT * FROM skill";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Skill> skill = new ArrayList<>();
		
		try {
			conn = BusanUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				skill.add(resultMapping(rs));
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BusanUtil.closeRS(rs);
			BusanUtil.closeStmt(pstmt);
			BusanUtil.closeConn(conn);
		}
		return skill;
	}
	

}
