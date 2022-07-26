import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import kr.co.green.BusanUtil;

public class SkillImpl {
	
	private Skill resultMapping(ResultSet rs) throws SQLException {
		int id = rs.getInt("Skill_id");
		int type = rs.getInt("Skill_type");
		String name = rs.getString("Skill_name");
		int power = rs.getInt("Skill_power");
		int aim = rs.getInt("Skill_aim");
		String needItem = rs.getString("Skill_needItem");
		
		String criticalScript = rs.getString("Skill_criticalScript");
		String sucessScript= rs.getString("Skill_sucessScript");
		String failScript= rs.getString("Skill_failScript");
		String fumbleScript= rs.getString("Skill_fumbleScript");
		
		return new Skill(id, type, name, aim, power, needItem, criticalScript, sucessScript, failScript, fumbleScript);
	}
	
// skill - enemy 연동
// 1. 몬스터 타입 맞는 액션스킬 중에 필요아이템이 null이거나 아이템이 인벤토리에 있는 것.
// 2. 나머지 스킬 중에 필요아이템이 null이거나 아이템이 인벤토리에 있는 것.
	
//	SELECT * FROM busan.skill where floor(skill_id%1000/100) = 2 
//		and (skill_needItem is null or skill_needItem in (1, 2, 3))
//			union
//			select * from busan.skill where floor(skill_id/1000) > 1
//			and (skill_needItem is null or skill_needItem in (1, 2, 3));
	
	List<Skill> readSkillset(Enemy enemy, SaveInfo user) {
		int enemyId = enemy.getId()/10;
		
		List<Item> inventory = user.getInventory();
		List<Integer> itemList = new ArrayList<>();
		
		for (Item item : inventory) {
			int a = item.getItem_id();
			itemList.add(a);
		}
		
		String itemInt = "";
		for (int i=0; i<itemList.size(); i++) {
			if (i==0) {
				itemInt = itemInt.concat(String.valueOf(itemList.get(i)));
			} else {
				itemInt = itemInt.concat(", ");
				itemInt = itemInt.concat(String.valueOf(itemList.get(i)));
			}
		}
		
		String query = "SELECT * FROM busan.skill where floor(skill_id%1000/100) = ? "
		+" and (skill_needItem is null or skill_needItem in (?) )"
				+" union"
				+" select * from busan.skill where floor(skill_id/1000) > 1"
				+" and (skill_needItem is null or skill_needItem in (?) );";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Skill> skill = new ArrayList<>();
		
		try {
			conn = BusanUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, String.valueOf(enemyId));
			pstmt.setString(2, itemInt);
			pstmt.setString(3, itemInt);
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

	// 전체 스킬 읽어오기
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
	
	public static void main(String[] args) {
		Battle_Algo a = new Battle_Algo();
		SaveInfo user = new SaveInfo();
		Enemy_Dao ed = new Enemy_Dao();
		HashMap<Integer, Enemy> EnemyMap = ed.getEnemys();
		SkillImpl a123 = new SkillImpl();
		
		Enemy enemy = EnemyMap.get(10);
		user = a.setUserData();
		
		a123.readSkillset(enemy, user);
	}
}
