import java.util.*;

class Skill123 {
	int type;
	String name;
	String result_critical;
	String result_success;
	String result_fail;
	String result_fumble;
	int aim;

	public Skill123(int type, String name, String result_critical, String result_success, String result_fail,
			String result_fumble, int aim) {
		super();
		this.type = type;
		this.name = name;
		this.result_critical = result_critical;
		this.result_success = result_success;
		this.result_fail = result_fail;
		this.result_fumble = result_fumble;
		this.aim = aim;
	}
}

public class Battle_Algo {
	// 아이디어 1: 난이도 조절:: 변수로 빼고 난이도를 조절하게 시키면 됨
	// 해야 할 것: 적에 따라 스킬 장착시키기
	// 적에 따라 결과 조절하기
	// 메소드 정리하기

	Random random = new Random();

	int calcHit(int skillAim) {
		return 50 + skillAim;
	}

	int calcGetAway(int turn, int skillAim) {
		return (25 + (turn) * 5 + skillAim);
		// 지금은 도망치기 어렵게 해놨음.
	}

	String enemyStatus(Enemy enemy) {
		if (enemy.Enemy_IniVar == 3) {
			return enemy.Friendship_3_Script;
		} else if (enemy.Enemy_IniVar == 2) {
			return enemy.Friendship_2_Script;
		} else if (enemy.Enemy_IniVar == 1) {
			return enemy.Friendship_1_Script;
		} else {
			return enemy.Friendship_0_Script;
		}
	}

	boolean runAway(int turn, Enemy enemy) {
		System.out.println("<도망치기>");
		double getAwayDouble = calcGetAway(turn, 0);
		double dice = random.nextDouble() * 100;
		System.out.println("도주성공률: " + String.valueOf(getAwayDouble));
		System.out.println("다이스: " + String.valueOf(dice));
		if (getAwayDouble >= dice) {
			System.out.println("도주 성공");
			return true;
		} else {
			System.out.println("도주 실패");
			return false;
		}
	}

	int enemyAction(Enemy enemy) {
		int userDamage = 0;
		int randomDice = (int) (random.nextDouble() * 100);
	
		if (enemy.Enemy_IniVar>3) {
			if (randomDice>96) {
				System.out.println("크리티컬! "+enemy.getEnemy_name()+"에게 세게 공격당했다.");
				userDamage = 2;
			} else if (randomDice>30){
				System.out.println(enemy.getEnemy_name()+"에게 공격당했다.");
				userDamage = 1;
			} else {
				System.out.println(enemy.getEnemy_name()+"의 공격을 피했다.");
			}
		} else if (enemy.Enemy_IniVar <= 1) {
			if (randomDice>50) {
				System.out.println(enemy.getEnemy_name()+"에게 공격당했다.");
				userDamage = 1;
			} else {
				System.out.println(enemy.getEnemy_name()+"의 공격을 피했다.");
			}
		} else {
			System.out.println(enemy.getEnemy_name()+"는 상황을 보고 있다.");
		}
		return userDamage;
	}

	int hitSkill(Enemy enemy, Skill skill) {
		int damage = 0;

		int calcHit = calcHit(skill.aim);
		int dice = (int) (random.nextDouble() * 100);
		System.out.println("다이스: " + dice);

		if (dice > 95) {
			System.out.println(skill.getFumbleScript());
			enemy.Enemy_IniVar -= 1;
		} else if (dice < 5) {
			System.out.println(skill.getCriticalScript());
			damage = 2;
		} else if (dice < calcHit) {
			System.out.println(skill.getSucessScript());
			damage = 1;
		} else {
			System.out.println(skill.getFailScript());
		}

		enemy.Enemy_IniVar -= 1;
		return damage;
	}

	int actionSkill(Enemy enemy, Skill skill) {
		int warning = 0;
		
		int calcHit = calcHit(skill.aim);
		int dice = (int) (random.nextDouble() * 100);
		System.out.println("성공치: " + calcHit);
		System.out.println("다이스: " + dice);
		
		if (dice > 95) {
			System.out.println(skill.getFumbleScript());
			warning -= 1;
		} else if (dice < 5) {
			System.out.println(skill.getCriticalScript());
			warning += 2;
		} else if (dice < calcHit) {
			System.out.println(skill.getSucessScript());
			warning += 1;
		} else {
			System.out.println(skill.getFailScript());
		}
		
		return warning;
	}

	int heistSkill(Enemy enemy, Skill skill) {
		int damage = 0;
		
		int calcHit = calcHit(skill.aim);
		int dice = (int) (random.nextDouble() * 100);
		System.out.println("성공치: " + calcHit);
		System.out.println("다이스: " + dice);
		
		if (dice > 95) {
			System.out.println(skill.getFumbleScript());
			enemy.Enemy_IniVar-=1;
		} else if (dice < 5) {
			System.out.println(skill.getCriticalScript());
			damage = enemy.Enemy_IniVar + 30; 
		} else if (dice < calcHit) {
			System.out.println(skill.getSucessScript());
			damage = enemy.Enemy_IniVar-1; 
		} else {
			System.out.println(skill.getFailScript());
		}
		return damage;
	}

	// 임시데이터: 유저
	String UserName = "영빈";
	int userLife = 5;

	public boolean battleLogic(Enemy enemy) {
		SkillImpl si = new SkillImpl();
		List<Skill> useSkill = si.readSkill();
		
		BattleOverDao bt = new BattleOverDao();
		boolean isGetAway = false;
		boolean isHappy = false;
		boolean isDead = false;

		// 조우 페이즈
		System.out.println("========================");
		System.out.println(enemy.Enemy_name + "와 마주쳤다.");
		System.out.println("========================");
		enemy.Enemy_IniVar = 2;
		enemy.Enemy_life = 3;
		userLife = 3;
		// 배틀 페이즈
		for (int i = 0; i < 3; i++) {
			System.out.println("------------------------");
			System.out.println(String.valueOf(i + 1) + "번 페이즈");

			// 좀비의 상태 출력
			System.out.println(enemyStatus(enemy));

			System.out.println("우리 체력: " + userLife);
			System.out.println("적의 체력: " + enemy.Enemy_life);
			System.out.println(UserName + "은(는) 어떤 행동을 할까?");
			for (int j = 0; j < useSkill.size(); j++) {
				System.out.print(String.valueOf(j + 1) + ". " + useSkill.get(j).name);
				System.out.println("(성공률: " + calcHit(useSkill.get(j).aim) + ")");
			}
			System.out.println(useSkill.size()+". 도망치기(확률: ??)");
			System.out.print("입력: ");
			int input = new Scanner(System.in).nextInt();

			if (input == 1) {
				enemy.Enemy_life -= hitSkill(enemy, useSkill.get(input));

			} else if (input == 2) {				
				enemy.Enemy_IniVar+= actionSkill(enemy, useSkill.get(input));

			} else if (input == 3) {
				isGetAway = runAway(i, enemy);
				if (isGetAway) break;
				
			} else {
				System.out.println("잘못했서 ... 처음으로 가자.");
				i--;
			}

			// 상대의 행동 출력
			System.out.println(enemy.Enemy_name+"의 공격!");
			userLife -= enemyAction(enemy);

			// 특수종료 확인
			if (enemy.Enemy_life <= 0) {
				isDead = true;
				break;
			}
			if (enemy.Enemy_IniVar >= 4) {
				isHappy = true;
				break;
			}
			if (userLife <= 0) {
				enemy.Enemy_IniVar = -20;
			}
		}
		// 결과 페이즈
		System.out.println("========================");
		System.out.println("결과 출력");

		if (isGetAway) {
			bt.getFinal_Friendship_0(enemy.getEnemy_id());
			
			
			
			
		} else if (isDead) {
			System.out.println("들개가 죽었다~~ 들개가 아이템을 떨어트렸당.");
			int indx = random.nextInt(enemy.Enemy_Drop_Item.size());
			System.out.println("떨어트린 아이템: " + enemy.Enemy_Drop_Item.get(indx));

		} else if (isHappy || enemy.Enemy_IniVar == 3) {
			System.out.println("흥미를 잃은 들개가 다른 쪽으로 가버렸당. 들개가 떠난 자리에 물건이 남아있당.");
			int indx = random.nextInt(enemy.Enemy_Drop_Item.size());
			System.out.println("떨어트린 아이템: " + enemy.Enemy_Drop_Item.get(indx));

		} else if (enemy.Enemy_IniVar <= 0) {
			System.out.println("들개와 싸우다가 목을 심하게 물렸당. 죽어버렸다 ...........");
			System.out.println("게임 오버");

		} else {
			System.out.println("들개와 대치했지만 죽이지는 못했다. 들개를 간신히 따돌렸다.");
		}
		System.out.println("남은 HP: " + userLife);

		// 이건 반복테스트할때 필요한거:: 지워도 됨
		System.out.println("전투 한번 더 하려면 1, 아니면 아무거나 입력");
		boolean result = false;
		String a = new Scanner(System.in).next();
		if (a.equals("1")) {
			result = true;
		}

		return result;
	}

	public static void main(String[] args) {
		Battle_Algo al = new Battle_Algo();
		Enemy_Dao ed = new Enemy_Dao();
		
		HashMap<Integer, Enemy> EnemyMap = ed.getEnemys();
		
		while (true) {
			al.battleLogic(EnemyMap.get(20));
		}
		
		
		
	}
}
