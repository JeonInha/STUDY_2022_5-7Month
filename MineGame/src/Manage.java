import java.util.*;

public class Manage {
	private Random random=new Random();
	private int mineNum=10;
	private int x=9;
	private int y=9;
	private Mine[][] field=new Mine[x][y];
	//가로 9, 세로 9, 지뢰 10개 (12.3%)
	
	private int[] MineX= new int[mineNum];
	private int[] MineY= new int[mineNum];
	// 지뢰의 x, y 좌표
	
	private void setMineXY() {
		for(int i=1; i<=mineNum; i++) {
			MineX[i-1]= random.nextInt(9)+1;
			MineY[i-1]= random.nextInt(9)+1;
			for (int j=0; j<i-1; j++) {			// 중복방지
				if (MineX[i-1]==MineX[j]&&MineY[i-1]==MineY[j]) {
					i--;
				}
			}
		}
	}
	
	private void countArroundMineNum(int a, int b) {
		int count=0;
		for (int i=-1; i<2; i++) {
			for(int j=-1; j<2; j++) {
				if (a+i<0||a+j<0||a+i>y-1||a+j>x-1) continue;
				if (field[a+i][b+j].isMine()) {
					count++;
				}
			}
		}
		field[a][b].setArroundMineNum(count);
	}
	
	private void reset() {
		for (int i=0; i<y; i++) {
			for(int j=0; j<x; j++) {
				field[i][j]=new Mine(false, 0, 0);
			}
		}
	}
	
	private void setField() {
		reset();
		for (int i=0; i<y; i++) {
			for(int j=0; j<x; j++) {
				for (int k=0; k<mineNum; k++) {		// 지뢰 심기
					if (i==MineY[k]&&j==MineX[k]) field[i][j].setMine(true);
				}
				countArroundMineNum(i, j);		// 지뢰갯수 심기
			}
		}
	}
	
	private void printField() {
		for (int i=0; i<y; i++) {
			for(int j=0; j<x; j++) {
				if (field[i][j].isMine()) {
					System.out.print("| ★ ");
					continue;
				}
				System.out.printf("| %d ", field[i][j].getCellState());
			}
			System.out.print("|\n");
		}
	}
	
	public void manage() {
		setMineXY();
		setField();
		printField();
	}
	
	
}

	
