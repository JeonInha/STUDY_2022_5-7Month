import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class Main7_Split extends JFrame {
	
	public Main7_Split() {
		JPanel red = new JPanel();
		red.setBackground(Color.red);
		
		JPanel blue = new JPanel();
		blue.setBackground(Color.blue);
		
		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, red, blue);
		// HORIZONTAL_SPLIT : 세로구분
		// VERTICAL_SPLIT : 가로구분
		split.setDividerLocation(150);
		// 초기영역 차지하는 영역값
		
		add(split);
		// 화면영역을 구분해서 사용할 수 있도록 div로 쪼갬.
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}

	public static void main(String[] args) {
		new Main7_Split().setVisible(true);
	}
}
