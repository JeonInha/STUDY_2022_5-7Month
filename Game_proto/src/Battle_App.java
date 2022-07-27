import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.*;

public class Battle_App extends JFrame {
	JPanel pnl = new JPanel();
	JPanel enemyBox = new JPanel();
	JPanel middleBox = new JPanel();
	JPanel userBox = new JPanel();
	JPanel footerBox = new JPanel();

	boolean isGetAway = false;
	boolean isHappy = false;
	boolean isDead = false;
	int phaseCountNum;

	List<Skill> useSkillList = new ArrayList<>();
	Map<Integer, JButton> useSkillBtnList = new HashMap<>();

	public void setUseSkillBtnList(List<Skill> useSkillList) {
		useSkillBtnList = new HashMap<>();
		for (int i = 0; i < useSkillList.size(); i++) {
			Skill skill = useSkillList.get(i);
			JButton btn = new JButton(i + ". " + skill.getName());
			useSkillBtnList.put(skill.getId(), btn);
		}
	}

	public void addBtnToPnl(Map<Integer, JButton> btnList, JPanel pnl) {
		for (Integer key : btnList.keySet()) {
			pnl.add(btnList.get(key));
		}
	}

	public void setPnl(JPanel pnl) {
		this.pnl = pnl;
	}

	public JPanel getPnl() {
		return pnl;
	}

	Battle_App(Enemy enemy, SaveInfo user) {
		Battle_Algo ba = new Battle_Algo();
		SkillImpl si = new SkillImpl();
		BattleOverDao bod = new BattleOverDao();

		phaseCountNum = 1;

		BoxLayout pnlLayout = new BoxLayout(pnl, BoxLayout.Y_AXIS);
		pnl.setLayout(pnlLayout);

		JPanel enemyBox = new JPanel();
		JPanel middleBox = new JPanel();
		JPanel userBox = new JPanel();
		JPanel footerBox = new JPanel();

		pnl.add(enemyBox);
		pnl.add(middleBox);
		pnl.add(userBox);
		pnl.add(footerBox);

		/////////////////// enemyBox
		JLabel enemyImg = new JLabel("[적 이미지]");
		enemyBox.add(enemyImg);
		Map<Integer, JLabel> enemyLifeImg = new HashMap<>();
		for (int i = 0; i < enemy.getLife(); i++) {
			JLabel a = new JLabel("♥");
			enemyLifeImg.put(i, a);
			enemyBox.add(a);
		}

		////////////////////// middleBox
		JLabel phaseCount = new JLabel(phaseCountNum + "턴    ");
		JLabel enemyStatus = new JLabel(ba.enemyStatus(enemy));
		middleBox.add(phaseCount);
		middleBox.add(enemyStatus);

		////////////////////// userBox
		Map<Integer, JLabel> userLifeImg = new HashMap<>();
		for (int i = 0; i < user.getHp(); i++) {
			JLabel a = new JLabel("♥");
			userLifeImg.put(i, a);
			userBox.add(a);
		}
		JLabel userImg = new JLabel("[유저 이미지]");
		userBox.add(userImg);

		///////////////////// footerBox

		// 행동 선택 / 버튼 패널 (A
		JPanel chooseAct = new JPanel();

		JButton attackBtn = new JButton("공격");
		JButton actionBtn = new JButton("행동");
		JButton runAwayBtn = new JButton("도망");
		chooseAct.add(attackBtn);
		chooseAct.add(actionBtn);
		chooseAct.add(runAwayBtn);

		// 스킬 선택 / 스킬 패널(B
		JPanel chooseSkill = new JPanel();

		JPanel skillBox = new JPanel();
		BoxLayout skillBoxLayout = new BoxLayout(skillBox, BoxLayout.Y_AXIS);
		skillBox.setLayout(skillBoxLayout);

		JButton backBtn = new JButton("뒤로가기");
		chooseSkill.add(skillBox);
		chooseSkill.add(backBtn);

		// 결과 출력 / 스킬 결과 패널 (C
		JPanel skillResult = new JPanel();
		BoxLayout skillResultLayout = new BoxLayout(skillResult, BoxLayout.Y_AXIS);
		skillResult.setLayout(skillResultLayout);

		JLabel focusUser = new JLabel("::우리의 공격::");
		JLabel printUserResult = new JLabel();
		JButton nextBtnC = new JButton("다음");

		skillResult.add(focusUser);
		skillResult.add(printUserResult);
		skillResult.add(nextBtnC);

		// 결과 출력 / 적 행동 결과 패널 (D
		JPanel enemyResult = new JPanel();
		BoxLayout enemyResultLayout = new BoxLayout(enemyResult, BoxLayout.Y_AXIS);
		enemyResult.setLayout(enemyResultLayout);

		JLabel focusEnemy = new JLabel("::적의 공격::");
		JLabel printEnemyResult = new JLabel();
		JButton nextBtnD = new JButton("다음");

		enemyResult.add(focusEnemy);
		enemyResult.add(printEnemyResult);
		enemyResult.add(nextBtnD);

		// 결과 출력 / 전투 결과 패널 (E
		JPanel battleResult = new JPanel();

		// footer cardLayout
		CardLayout card = new CardLayout();
		footerBox.setLayout(card);
		footerBox.add(chooseAct, "A");
		footerBox.add(chooseSkill, "B");
		footerBox.add(skillResult, "C");
		footerBox.add(enemyResult, "D");
		footerBox.add(battleResult, "E");
		card.show(footerBox, "A");

		////////////////////// ActionListener

		ActionListener chooseActAct = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton eBtn = (JButton) e.getSource();
				useSkillList = new ArrayList<>();
				skillBox.removeAll();

				if (eBtn.getText().equals("공격")) {
					useSkillList = si.getAttckSkillList(enemy.getId(), user.getInventory());
					useSkillList.addAll(si.getHeistSkillList(enemy.getId(), user.getInventory()));
					setUseSkillBtnList(useSkillList);

					addBtnToPnl(useSkillBtnList, skillBox);
					card.next(footerBox);

				} else if (eBtn.getText().equals("행동")) {
					useSkillList = si.getActionSkillList(enemy.getId(), user.getInventory());
					setUseSkillBtnList(useSkillList);

					addBtnToPnl(useSkillBtnList, skillBox);
					card.next(footerBox);
				} else if (eBtn.getText().equals("도망")) {
					Boolean isGetAway = ba.runAway(phaseCountNum, enemy);

					if (isGetAway) {
						printUserResult.setText("<html><p>도망치기를 시도했다.<br>. . .<br>도망에 성공했다!<p><html>");
						isGetAway = true;
						card.show(footerBox, "C");
					} else {
						printUserResult.setText("<html><p>도망치기를 시도했다.<br>. . .<br>도망에 실패했다!<p><html>");
						card.show(footerBox, "C");
					}
				}
			}
		};

		attackBtn.addActionListener(chooseActAct);
		actionBtn.addActionListener(chooseActAct);
		runAwayBtn.addActionListener(chooseActAct);

		ActionListener getBackPanelAct = new ActionListener() { // 뒤로가기 버튼
			@Override
			public void actionPerformed(ActionEvent arg0) {
				card.previous(footerBox);
			}
		};

		backBtn.addActionListener(getBackPanelAct);

		// C 다음으로 넘어가는 버튼::
		// TODO
		ActionListener nextBtnCact = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (enemy.getLife() <= 0) {
					isDead = true;
				}
				if (enemy.getIniVar() >= 4) {
					isHappy = true;
				}
				if (isDead || isHappy || isGetAway) {
					card.show(footerBox, "E");
				} else {
					card.show(footerBox, "D");
				}
			}
		};

		// D 다음으로 넘어가는 버튼::
		// TODO
		ActionListener nextBtnDact = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (user.getHp() <= 0 || phaseCountNum >= 3) {
					card.show(footerBox, "E");
				} else {
					phaseCountNum++;
					card.show(footerBox, "A");
				}
			}
		};
		
		nextBtnC.addActionListener(nextBtnCact);
		nextBtnD.addActionListener(nextBtnDact);

		//////////////////////////// etc

		add(pnl);
		setSize(800, 900);
	}

	public static void main(String[] args) {
		Battle_Algo ba = new Battle_Algo();
		SaveInfo user = ba.setUserData();
		Enemy_Dao ed = new Enemy_Dao();
		Enemy enemy = ed.selectRandomEnemy();

		new Battle_App(enemy, user).setVisible(true);

	}

}
