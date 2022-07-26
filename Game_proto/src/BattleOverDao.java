import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.green.BusanUtil;

public class BattleOverDao {
	public static void main(String[] args) {
		BattleOverDao bt = new BattleOverDao();
		bt.getFriendResult(20);
		bt.getRunAwayResult(20);
		bt.getWinResult(20);
		bt.getNomalResult(20);
		bt.getLoseResult(20);
	}

	public void getFriendResult(int Enemy_id) {
		findFinal_Scripts(Enemy_id, "FriendScript");
	}

	public void getRunAwayResult(int Enemy_id) {
		findFinal_Scripts(Enemy_id, "RunAwayScript");
	}

	public void getWinResult(int Enemy_id) {
		findFinal_Scripts(Enemy_id, "WinScript");
	}
	
	public void getNomalResult(int Enemy_id) {
		findFinal_Scripts(Enemy_id, "NomalScript");
	}
	
	public void getLoseResult(int Enemy_id) {
		findFinal_Scripts(Enemy_id, "LoseScript");
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
