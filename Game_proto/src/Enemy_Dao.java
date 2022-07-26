import java.sql.*;
import java.util.*;

import kr.co.green.*;

public class Enemy_Dao {

	int Enemy_id;
	String Enemy_name;
	int Enemy_life;
	int Enemy_power;
	List<String> Enemy_Drop_Item;
	int Enemy_IniVar;
	String Friendship_3_Script;
	String Friendship_2_Script;
	String Friendship_1_Script;
	String Friendship_0_Script;

	public HashMap<Integer, Enemy> getEnemys() {

		HashMap<Integer, Enemy> EnemyMap = new HashMap<>();

		try (Connection conn = BusanUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM busan.enemystatus");
				ResultSet rs = pstmt.executeQuery();) {
			while (rs.next()) {
				Enemy_Drop_Item = new ArrayList<>();
				Enemy_id = rs.getInt("Enemy_id");
				Enemy_name = rs.getString("Enemy_name");
				Enemy_life = rs.getInt("Life");
				Enemy_power = rs.getInt("Enemy_power");
				String Item = rs.getString("Item");

				if (Item != null) {
					String[] ItemList = Item.split("/");
					for (String s : ItemList) {
						Enemy_Drop_Item.add(s);
					}
				} else {
					Enemy_Drop_Item = null;
				}
					Enemy_IniVar = rs.getInt("IniVar");
				Friendship_3_Script = rs.getString("Friendship_3_Script");
				Friendship_2_Script = rs.getString("Friendship_2_Script");
				Friendship_1_Script = rs.getString("Friendship_1_Script");
				Friendship_0_Script = rs.getString("Friendship_0_Script");

				EnemyMap.put(Enemy_id,
						new Enemy(Enemy_id, Enemy_name, Enemy_life, Enemy_power, Enemy_Drop_Item, Enemy_IniVar,
								Friendship_3_Script, Friendship_2_Script, Friendship_1_Script, Friendship_0_Script));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return EnemyMap;
	}

}
