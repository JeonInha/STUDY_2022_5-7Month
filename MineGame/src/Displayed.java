import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Map.Entry;

import javax.swing.*;

public class Displayed extends JFrame {
	private Random random = new Random();
	private int mineNum = 10;
	private int x = 9;
	private int y = 9;
	private Mine[][] field = new Mine[x][y];
	// 가로 9, 세로 9, 지뢰 10개 (12.3%)
	private int[] mineX = new int[mineNum];
	private int[] mineY = new int[mineNum];
	// 지뢰의 x, y 좌표

	////////////////////////////////////////////////

	private void setMineXY() { // 지뢰 10개 생성
		for (int i = 0; i < mineNum; i++) {
			mineX[i] = (random.nextInt(x));
			mineY[i] = (random.nextInt(y));
			for (int j = 0; j < i; j++) { // 중복방지
				if (mineX[i] == mineX[j] && mineY[i] == mineY[j]) {
					i--;
				}
			}
		}
	}

	private void countArroundMineNum(int a, int b) { // 주변 지뢰 숫자 세기
		int count = 0;
		for (int i = -1; i < 2; i++) {
			for (int j = -1; j < 2; j++) {
				try {
					if (field[i + a][j + b].isMine()) {
						count++;
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					// try-catch로 범위를 넘는 인덱스를 예외처리
				}
			}
		}
		field[a][b].setArroundMineNum(count);
	}

	private void reset() { // 필드 초기화
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				field[i][j] = new Mine(false, 0, 0);
			}
		}
	}

	private void setMineinField() { // 필드에 지뢰 심기
		reset();
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				for (int k = 0; k < mineNum; k++) {
					if (i == mineY[k] && j == mineX[k])
						field[i][j].setMine(true);
				}
			}
		}
	}

	private void setArroundMineNuminField() { // 필드에 주변 지뢰 숫자 심기
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				countArroundMineNum(i, j);
			}
		}
	}

	private void TestMineXY() {

		for (int i = 0; i < 9; i++) {
			mineX[8] = i;
			mineY[8] = i;
		}
		mineX[9] = 0;
		mineY[9] = 1;

		// mineX {0, 1, 2, 3, 4, 5, 6, 7, 8, 0}
		// mineY {0, 1, 2, 3, 4, 5, 6, 7, 8, 1}
	}

	private String cellStateToBLabel(Mine a) {
		if (a.getCellState() == 0)
			return " ";
		else if (a.getCellState() == 1)
			return "?";
		else if (a.getCellState() == 2)
			return "√";
		else if (a.getCellState() == 3)
			return Integer.toString(a.getArroundMineNum());
		else
			return null;

	}

//				if (field[i][j].getCellState() == 0) { // 셀 상태에 따라 표시
//					System.out.print("|   "); // 안 연 칸
//				} else if (field[i][j].getCellState() == 1) {
//					System.out.print("| ? "); // 물음표 메모
//				} else if (field[i][j].getCellState() == 2) {
//					System.out.print("| √ "); // 지뢰 표시
//				} else if (field[i][j].getCellState() == 3) { // 칸 열기
//					System.out.printf("| %d ", field[i][j].getArroundMineNum());
//				}

	Displayed() {

		setMineXY(); // 지뢰 생성
//		TestMineXY(); // 테스트지뢰
		setMineinField(); // 지뢰 심기
		setArroundMineNuminField(); // 근처의 지뢰 숫자 심기

		JPanel pnl = new JPanel(); // 전체 상자
		JPanel fieldBtns = new JPanel(); // 지뢰 필드
		JPanel top = new JPanel(); // top 상자: 나중에 추가
		BoxLayout pnlBox = new BoxLayout(pnl, BoxLayout.Y_AXIS); // top이랑 지뢰필드 세로로 쌓기

		//////////////////////////
		pnl.setLayout(pnlBox);

		pnl.add(top);
		pnl.add(fieldBtns);

		add(pnl);
		////////////////////////
		// top 파트
		JRadioButton open = new JRadioButton("칸 열기");
		JRadioButton check = new JRadioButton("지뢰 체크");
		JRadioButton memo = new JRadioButton("메모(? 표시)");
		ButtonGroup stateBtn = new ButtonGroup();
		JLabel winlose = new JLabel("지뢰찾기 게임 시작");

		stateBtn.add(open);
		stateBtn.add(check);
		stateBtn.add(memo);

		top.add(open);
		top.add(check);
		top.add(memo);
		top.add(winlose);

		open.setSelected(true); // open 버튼 미리 눌러져있도록

		// 지뢰와 버튼을 연결한 맵 제작
		Map<Mine, JButton> mineBtn = new HashMap<Mine, JButton>();

		///////////////////////// 지뢰 버튼 액션
		ActionListener mineBtnAct = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JButton btn = (JButton) e.getSource();

				for (Entry<Mine, JButton> entry : mineBtn.entrySet()) { // 엔트리 사용해서 전체를 관리
					if (entry.getValue().equals(e.getSource())) {
						Mine mine = entry.getKey();

						if (open.isSelected()) {// 지뢰칸의 셀 상황 먼저 변화시키고 (라디오버튼으로 if문 쓰기)
							mine.setCellState(3);
							btn.setEnabled(false); // 선택된 버튼 비활성화
						} else if (check.isSelected()) {
							mine.setCellState(2);
						} else if (memo.isSelected()) {
							mine.setCellState(1);
						}

						btn.setText(cellStateToBLabel(mine)); // 셀 상황 출력
						winlose.setText("지뢰찾기 게임중");
						
						
						
						// 0 밟았을 때 주위 여는 로직
						if (mine.getCellState() == 3 && mine.getArroundMineNum() == 0) {

							int co = 0;
							int ro = 0;
							for (int i = 0; i < y; i++) {
								for (int j = 0; j < x; j++) {
									if (field[i][j].equals(mine)) {	// 좌표 추출
										co = i;
										ro = j;
										break;
									}
								}
							}

							for (int i = -1; i < 2; i++) {
								for (int j = -1; j < 2; j++) {
									try {
										mineBtn.get(field[i + co][j + ro]).doClick();	// 자동 클릭해줌. 좀 느리긴한디
									} catch (ArrayIndexOutOfBoundsException exception) {
										// try-catch로 범위를 넘는 인덱스를 예외처리
									}
								}
							}
						}

						///// 패배 로직
						if (mine.isMine() && mine.getCellState() == 3) {
							for (int i = 0; i < mineNum; i++) {
								Mine minecell = field[mineY[i]][mineX[i]];
								mineBtn.get(minecell).setText("★");
								mineBtn.get(minecell).setEnabled(true);
								mineBtn.get(minecell).setBackground(Color.red);

							}
							winlose.setText("패배 ㅠ ㅠ");
						}

						///// 승리 로직
						int resultCount = 0;
						for (int i = 0; i < mineNum; i++) {
							if (field[mineY[i]][mineX[i]].isMine() && field[mineY[i]][mineX[i]].getCellState() == 2)
								resultCount++;
						}
						if (resultCount == mineNum) {
							winlose.setText("승리!!!!");
						}
					}
				}
			}
		};

		//////////////////////////////////////

		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				mineBtn.put(field[i][j], new JButton());
				fieldBtns.add(mineBtn.get(field[i][j]));
				mineBtn.get(field[i][j]).addActionListener(mineBtnAct);
			}
		}

		GridLayout grid = new GridLayout(x, y);
		fieldBtns.setLayout(grid);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
}
