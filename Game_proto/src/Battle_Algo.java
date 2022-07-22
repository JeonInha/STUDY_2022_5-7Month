import java.util.*;

class Skill {
	int type;
	String name;
	String result_critical;	
	String result_success;	
	String result_fail;	
	String result_fumble;
	int aim;
	
	public Skill(int type, String name, String result_critical, String result_success, String result_fail, String result_fumble, int aim) {
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

class Enemy {
	String Enemy_name;
	int ini_Var;
	List<String> item = new ArrayList<>();
	int life = 3;
	String Friendship_3;
	String Friendship_2;
	String Friendship_1;
	String Friendship_0;
}

public class Battle_Algo {
	// 아이디어 1: 난이도 조절:: 변수로 빼고 난이도를 조절하게 시키면 됨
	// 해야 할 것: 적에 따라 스킬 장착시키기
	//			적에 따라 결과 조절하기
	//			메소드 정리하기	

	int calcHit(int skillAim) {
		return 50 + skillAim;
	}
	
	int calcGetAway(int turn, int skillAim) {
		return (25 + (turn)*5 + skillAim);
		// 지금은 도망치기 어렵게 해놨음.
	}
	
	String enemy_Status(Enemy enemy) {
		if (enemy.ini_Var==3) {
			return enemy.Friendship_3;
		} else if (enemy.ini_Var==2) {
			return enemy.Friendship_2;
		} else if (enemy.ini_Var ==1) {
			return enemy.Friendship_1;
		} else {
			return enemy.Friendship_0;
		}
	}



	// 임시데이터: 유저
	String UserName = "영빈";
	int userLife = 5;
	List<Skill> useSkill = new ArrayList<>();
	

	public boolean battleLogic(Enemy enemy) {
		Random random = new Random();
		useSkill.add(new Skill(1, "몽둥이 때리기", "완전쎄게때렸당", "때렸당.", "빗나갔당", "몽둥이 놓쳤당. 공격당했당.", 20));
	//	useSkill.add(new Skill(2, "죽은 척 하기", "상대는 우리가 죽은 줄 아는 것 같다.", "상대가 긴가민가해한다.", "효과가 없었당", "상대가 화가 났당. 공격당했당.", 0));
		useSkill.add(new Skill(2, "숨기", "갈대숲 사이로 완벽히 몸을 숨겼다.", "갈대숲 사이로 몸을 반쯤 숙였다.", "숨지 못했다.", "달려드는 들개와 눈이 마주쳤다! 들개에게 정강이를 물렸다.", 40));
		
		boolean isGetAway = false;
		boolean isHappy = false;
		boolean isDead = false;
		
		// 조우 페이즈
		System.out.println("========================");
		System.out.println(enemy.Enemy_name + "와 마주쳤다.");
		System.out.println("========================");
		enemy.ini_Var = 2;
		enemy.life = 3;
		userLife = 3;
		// 배틀 페이즈
		for (int i = 0; i < 3; i++) {
			System.out.println("------------------------");
			System.out.println(String.valueOf(i+1)+"번 페이즈");
			
			// 좀비의 상태 출력
			System.out.println(enemy_Status(enemy));
			
			System.out.println("우리 체력: "+userLife);
			System.out.println("적의 체력: "+enemy.life);
			System.out.println(UserName + "은(는) 어떤 행동을 할까?");
			for (int j = 0; j < 2; j++) {
				System.out.print(String.valueOf(j+1)+". " + useSkill.get(j).name);
				System.out.println("(성공률: "+calcHit(useSkill.get(j).aim)+")");
			}
			System.out.println("3. 도망치기(확률: ??)");
			System.out.print("입력: ");
			int input = new Scanner(System.in).nextInt();
			
			if (input==1) {
				int calcHit = calcHit(useSkill.get(0).aim);
				int dice = (int) (random.nextDouble()*100);
				System.out.println("다이스: "+dice);
				if (dice>95) {
					System.out.println(useSkill.get(0).result_fumble);
					enemy.ini_Var -=1;
					userLife -=1;
				} else if (dice<5) {
					System.out.println(useSkill.get(0).result_critical);
					enemy.life -=2;
					enemy.ini_Var -=1;
				} else if (dice<calcHit) {
					System.out.println(useSkill.get(0).result_success);
					enemy.life -=1;
					enemy.ini_Var -=1;
				} else {
					System.out.println(useSkill.get(0).result_fail);
					enemy.ini_Var -=1;
				}
				
			} else if (input==2) {
				int calcHit = calcHit(useSkill.get(1).aim);
				int dice = (int) (random.nextDouble()*100);
				System.out.println("성공치: "+calcHit);
				System.out.println("다이스: "+dice);
				if (dice>101) {
					System.out.println(useSkill.get(1).result_fumble);
					enemy.ini_Var -=1;
				} else if (dice<5) {
					System.out.println(useSkill.get(1).result_critical);
					enemy.ini_Var +=2;
				} else if (dice<calcHit) {
					System.out.println(useSkill.get(1).result_success);
					enemy.ini_Var +=1;
				} else {
					System.out.println(useSkill.get(1).result_fail);
				}
				
			} else if (input==3) {
				System.out.println("<도망치기>");
				double getAwayDouble = calcGetAway(i, 0);
				double dice = random.nextDouble()*100;
				System.out.println("도주성공률: "+String.valueOf(getAwayDouble));
				System.out.println("다이스: "+String.valueOf(dice));
				if (getAwayDouble>=dice) {
					System.out.println("도주 성공");
					isGetAway = true;
					break;
				} else {
					System.out.println("도주 실패");
				}
			} else {
				System.out.println("잘못했서 ... 처음으로 가자.");
				i--;
			}
			
			// 상대의 행동 출력
			if (enemy.ini_Var<=1) {
				if ((random.nextDouble()*100)>80) {
					System.out.println("공격당했다. 아얏...");
					userLife -=1;
				} else {
					System.out.println("공격당했지만 다행히도 우리가 피했다.");
				}
			} else {
				System.out.println("상대는 상황을 보고 있다.");
			}
			
			// 특수종료 확인
			if (enemy.life<=0) {
				isDead = true;
				break;
			}
			if (enemy.ini_Var>=4) {
				isHappy = true;
				break;
			}
			if (userLife<=0) {
				enemy.ini_Var=-20;
			}
		}
		// 결과 페이즈
		System.out.println("========================");
		System.out.println("결과 출력");
		if (isGetAway) {
			System.out.println("도주에 성공했당~");
		} else if (isDead) {
			System.out.println("좀비가 죽었다~~ 좀비가 아이템을 떨어트렸당.");
			int indx = random.nextInt(enemy.item.size());
			System.out.println("떨어트린 아이템: "+enemy.item.get(indx));
			
		} else if (isHappy || enemy.ini_Var==3) {
			System.out.println("흥미를 잃은 좀비가 다른 쪽으로 가버렸당. 좀비가 떠난 자리에 물건이 남아있당.");
			int indx = random.nextInt(enemy.item.size());
			System.out.println("떨어트린 아이템: "+enemy.item.get(indx));
			
		} else if (enemy.ini_Var<=0) {
			System.out.println("좀비와 싸우다가 좀비에게 물렸당. 죽어버렸다 ...........");
			System.out.println("게임 오버");
			
		} else {
			System.out.println("좀비와 대치했지만 좀비를 죽이진 못했다.");
		}
		System.out.println("남은 HP: "+userLife);
		
		
		
		
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
		Enemy zombie = new Enemy();
			zombie.Enemy_name = "좀비";
			zombie.ini_Var = 1;
			zombie.item = Arrays.asList("썩은 고기", "건전지", "몽둥이");
			zombie.Friendship_3 = "좀비가 우리에게 흥미를 잃었다.";
			zombie.Friendship_2 = "좀비가 우리를 경계하고 있다.";
			zombie.Friendship_1 = "좀비가 우리를 물려고 한다.";
			zombie.Friendship_0 = "좀비가 우리를 죽일듯이 달려든다.";
			
		Enemy dog = new Enemy();
			dog.Enemy_name = "들개";
			dog.ini_Var = 2;
			dog.Friendship_3 = "들개가 나를 찾지 못하고 흥미를 잃었다.";
			dog.Friendship_2 = "들개가 나를 찾으려 킁킁거리며 다니고 있다.";
			dog.Friendship_1 = "들개가 나에게 위협적으로 짖고 있다.";
			dog.Friendship_0 = "들개가 나에게 달려든다.";
			
		Enemy army = new Enemy();
			army.Enemy_name = "탈영 군인";
			army.ini_Var = 2;
			army.item = Arrays.asList("육포", "연인의 사진", "열쇠");
			army.Friendship_3 = "군인이 우리의 말을 듣고 있다.";
			army.Friendship_2 = "군인이 우리를 경계하고 있다.";
			army.Friendship_1 = "군인이 우리에게 위협사격을 한다.";
			army.Friendship_0 = "군인이 우리를 죽일 작정으로 대응사격을 시도한다.";
			
			System.out.println("공격하기: 대미지를 줍니다. 상대의 전의를 높입니다.");
			System.out.println("행동하기: 여러 효과를 줍니다. 상대의 전의를 상실하게 할 수 있습니다.");
			System.out.println("전투는 3턴으로 이루어집니다.");
			
			
			al.battleLogic(dog);
		while (true) {
			al.battleLogic(zombie);
			al.battleLogic(army);
		}
	}
}
