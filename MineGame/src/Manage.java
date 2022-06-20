import java.util.*;

public class Manage {
	private Scanner sc = new Scanner(System.in);
	private Random random = new Random();
	private int mineNum = 10;
	private int x = 9;
	private int y = 9;
	private Mine[][] field = new Mine[x][y];
	// 가로 9, 세로 9, 지뢰 10개 (12.3%)

	private int[] mineX = new int[mineNum];
	private int[] mineY = new int[mineNum];
	// 지뢰의 x, y 좌표

	private void setMineXY() {
		for (int i = 0; i < mineNum; i++) {
			mineX[i] = (random.nextInt(9) + 1);
			mineY[i] = (random.nextInt(9) + 1);
			for (int j = 0; j < i; j++) { // 중복방지
				if (mineX[i] == mineX[j] && mineY[i] == mineY[j]) {
					i--;
				}
			}
		}
	}

	private void countArroundMineNum(int a, int b) {
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

	private void reset() {
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				field[i][j] = new Mine(false, 0, 0);
			}
		}
	}

	private void setMineinField() {
		reset();
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				for (int k = 0; k < mineNum; k++) {
					if (i + 1 == mineY[k] && j + 1 == mineX[k])
						field[i][j].setMine(true);
				}
			}
		}
	}

	private void setArroundMineNuminField() {
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				countArroundMineNum(i, j);
			}
		}
	}

	private void printField() {
		System.out.println("-------------------------------------");
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				if (field[i][j].isMine() && field[i][j].getCellState() == 3) {
					System.out.print("| ■ ");
					continue;
				}
				if (field[i][j].getCellState() == 0) {
					System.out.print("|   ");
				} else if (field[i][j].getCellState() == 1) {
					System.out.print("| ? ");
				} else if (field[i][j].getCellState() == 2) {
					System.out.print("| √ ");
				} else if (field[i][j].getCellState() == 3) {
					System.out.printf("| %d ", field[i][j].getArroundMineNum());
				}

			}
			System.out.printf("|  %d \n", i + 1);
			System.out.println("-------------------------------------");
		}
		System.out.println("  1   2   3   4   5   6   7   8   9 ");
	}

	public void manage() {
		setMineXY();
		setMineinField();
		setArroundMineNuminField();

		System.out.println("===============지뢰 찾기===============");
		System.out.println("===============게임 시작===============");

		while (true) {
			printField();
			System.out.print("열고자 하는 칸 번호 입력(세로 / 가로): ");
			try {
				int column = sc.nextInt();
				int row = sc.nextInt();
				field[column - 1][row - 1].setCellState(3);
				if (field[column - 1][row - 1].getCellState() == 3 && field[column - 1][row - 1].isMine()) {
					System.out.println("!!BANG!!");
					for (int i = 0; i < y; i++) {
						for (int j = 0; j < x; j++) {
							field[i][j].setCellState(3);
						}
					}
					printField();
					return;
				}

			} catch (Exception e) {
				System.out.println("잘못된 입력");
			}
		}
	}

}
