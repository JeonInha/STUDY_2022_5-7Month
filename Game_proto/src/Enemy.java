import java.util.List;

class Enemy {
	int Enemy_id;
	String Enemy_name;
	int Enemy_life;
	List<String> Enemy_Drop_Item;
	int Enemy_IniVar;
	String Friendship_3_Script;
	String Friendship_2_Script;
	String Friendship_1_Script;
	String Friendship_0_Script;

	public Enemy(int enemy_id, String enemy_name, int enemy_life, List<String> enemy_Drop_Item, int enemy_IniVar,
			String friendship_3_Script, String friendship_2_Script, String friendship_1_Script,
			String friendship_0_Script) {
		super();
		Enemy_id = enemy_id;
		Enemy_name = enemy_name;
		Enemy_life = enemy_life;
		Enemy_Drop_Item = enemy_Drop_Item;
		Enemy_IniVar = enemy_IniVar;
		Friendship_3_Script = friendship_3_Script;
		Friendship_2_Script = friendship_2_Script;
		Friendship_1_Script = friendship_1_Script;
		Friendship_0_Script = friendship_0_Script;
	}

	public int getEnemy_id() {
		return Enemy_id;
	}

	public void setEnemy_id(int enemy_id) {
		Enemy_id = enemy_id;
	}

	public String getEnemy_name() {
		return Enemy_name;
	}

	public void setEnemy_name(String enemy_name) {
		Enemy_name = enemy_name;
	}

	public int getEnemy_life() {
		return Enemy_life;
	}

	public void setEnemy_life(int enemy_life) {
		Enemy_life = enemy_life;
	}

	public List<String> getEnemy_Drop_Item() {
		return Enemy_Drop_Item;
	}

	public void setEnemy_Drop_Item(List<String> enemy_Drop_Item) {
		Enemy_Drop_Item = enemy_Drop_Item;
	}

	public int getEnemy_IniVar() {
		return Enemy_IniVar;
	}

	public void setEnemy_IniVar(int enemy_IniVar) {
		Enemy_IniVar = enemy_IniVar;
	}

	public String getFriendship_3_Script() {
		return Friendship_3_Script;
	}

	public void setFriendship_3_Script(String friendship_3_Script) {
		Friendship_3_Script = friendship_3_Script;
	}

	public String getFriendship_2_Script() {
		return Friendship_2_Script;
	}

	public void setFriendship_2_Script(String friendship_2_Script) {
		Friendship_2_Script = friendship_2_Script;
	}

	public String getFriendship_1_Script() {
		return Friendship_1_Script;
	}

	public void setFriendship_1_Script(String friendship_1_Script) {
		Friendship_1_Script = friendship_1_Script;
	}

	public String getFriendship_0_Script() {
		return Friendship_0_Script;
	}

	public void setFriendship_0_Script(String friendship_0_Script) {
		Friendship_0_Script = friendship_0_Script;
	}

	@Override
	public String toString() {
		return "EnemyStat [Enemy_id=" + Enemy_id + ", Enemy_name=" + Enemy_name + ", Enemy_life=" + Enemy_life
				+ ", Enemy_Drop_Item=" + Enemy_Drop_Item.toString() + ", Enemy_IniVar=" + Enemy_IniVar + ", Friendship_3_Script="
				+ Friendship_3_Script + ", Friendship_2_Script=" + Friendship_2_Script + ", Friendship_1_Script="
				+ Friendship_1_Script + ", Friendship_0_Script=" + Friendship_0_Script + "]";
	}
}