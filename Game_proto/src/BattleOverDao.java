import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.green.BusanUtil;

public class BattleOverDao {
	public static void main(String[] args) {
		BattleOverDao bt = new BattleOverDao();
		bt.getFinal_Friendship_0(20);
	}

	public void getFinal_Friendship_3(int Enemy_id) {
		findFinal_Scripts(Enemy_id, "Final_Friendship_3");
	}

	public void getFinal_Friendship_2(int Enemy_id) {
		findFinal_Scripts(Enemy_id, "Final_Friendship_2");
	}

	public void getFinal_Friendship_1(int Enemy_id) {
		findFinal_Scripts(Enemy_id, "Final_Friendship_1");
	}
	
	public void getFinal_Friendship_0(int Enemy_id) {
		findFinal_Scripts(Enemy_id, "Final_Friendship_0");
	}
	
	public void getFinal_Victory(int Enemy_id) {
		findFinal_Scripts(Enemy_id, "Final_Victory");
	}
	
	public void findFinal_Scripts(int Enemy_id, String find) {
		try (Connection conn = BusanUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM Busan.battleover");
				ResultSet rs = pstmt.executeQuery();) {
			while (rs.next()) {
				int getEnemy_id = rs.getInt("Enemy_id");
				if (Enemy_id == getEnemy_id) {
					String script = rs.getString(find);
					System.out.println(script);
					break;
				} else {
					continue;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
